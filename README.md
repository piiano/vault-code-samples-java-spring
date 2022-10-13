# Piiano Vault Java/Spring Code Samples

## Background
Piiano Vault is the secure home for sensitive personal data. It allows you to safely store sensitive personal data in your own cloud environment with
automated compliance controls.
Vault is deployed within your own architecture, next to other DBs used by the applications, and should be used to store the most critical sensitive personal data, such as credit cards and bank account numbers, names, emails, national IDs (e.g. SSN), phone numbers, etc.
The main benefits are:
- Field level encryption, including key rotation
- Searchability is allowed over the encrypted data
- Full audit log for all data accesses
- Granular access controls
- Easy masking and tokenization of data
- Out of the box privacy compliance functionality

More details can be found [on our website](https://piiano.com/pii-data-privacy-vault/) and on the [developers portal](https://piiano.com/docs/).

## Usage

To compile all demos run: `make` at the top level

This repo contains the following projects:

1. `demo_app` - A standard Java/Spring/Hibernate project demonstrating a simple application with users being stored in MySQL. 
[Run](/demo_app/README.md) this project.

2. `piiano_vault_connector` - The same project utilizing Piiano Vault to store the emails, keeping tokenized versions in the MySQL.
[Run](/piiano_vault_connector/README.md) this project.
 
    :construction: This project is work in progress 

3. `piiano_vault_orm_connector` - Java/Spring/Hibernate project similar to the Piiano Vault connector with the difference of demonstrating 
automatic interception of requests at the ORM level. [Run](/piiano_vault_orm_connector/README.md) this project.

    :warning: This project is both work in progress and experimental. ORM level attachment will likely change as this project evolves. 

4. `piiano_vault_sdk` - Vault Java SDK using an open API wrapper. This is a prerequisite for the Piiano based connectors. 

