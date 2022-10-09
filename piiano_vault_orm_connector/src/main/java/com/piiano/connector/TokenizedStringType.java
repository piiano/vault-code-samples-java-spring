package com.piiano.connector;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;
import java.util.UUID;

public class TokenizedStringType implements UserType {

	@Override
	public int[] sqlTypes() {
		return new int[] { Types.VARCHAR };
	}

	@Override
	public Class<String> returnedClass() {
		return String.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		return Objects.equals(x, y);
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		return x != null ? x.hashCode() : 0;
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		Object deepCopy = deepCopy(value);
		if ((deepCopy instanceof Serializable)) {
			return (Serializable) deepCopy;
		}
		return null;
	}

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return deepCopy(cached);
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return deepCopy(original);
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		if (rs.wasNull()) {
			return null;
		}
		String token = rs.getString(names[0]);
		return PiianoVaultConnector.detokenize(token);
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		if (value != null) {
			String email = (String) value;
			UUID id = PiianoVaultConnector.createObject(email);
			String token = PiianoVaultConnector.tokenize(id);
			st.setString(index, token);
		} else {
			st.setString(index, null);
		}
	}
}