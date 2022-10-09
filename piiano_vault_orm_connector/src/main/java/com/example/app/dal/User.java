package com.example.app.dal;

import com.piiano.connector.TokenizedStringType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(name = "TokenizedStringType", typeClass = TokenizedStringType.class)
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Type(type = "TokenizedStringType")
    @Column(name = "email_token")
    private String email;

    @Column(name = "country")
    private String country;
}
