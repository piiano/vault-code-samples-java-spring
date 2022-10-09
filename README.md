# Vault Java/Spring Code Samples

To compile all demos run: `make` at the top level

This repo contains the following projects:

1. `demo_app` - Java/Spring/Hibernate project without Vault demonstrating a simple application with users being save in MySQL. 
[Run](/demo_app) this project.

2. `piiano_vault_connector` - Java/Spring/Hibernate project utilizing the Vault to store the emails, keeping tokenized versions in the MySQL.
[Run](/piiano_vault_connector) this project.
 
    :construction: This project is work in progress 

3. `piiano_vault_orm_connector` - Java/Spring/Hibernate project similar to the piiano vault connector with the difference of demonstrating 
automtic interception of requests at the ORM level. [Run](/piiano_vault_orm_connector) this project.

   :warning: This project is both work in progress and experimental. ORM level attachment will likely change as this project evolves. 

4. `piiano_vault_sdk` - Vault Java SDK using an open api wrapper. This is a prerequisite for the piiano based connectors. 

