# Generic M2 repository helpers
M2_DIR=$(HOME)/.m2/repository
M2_DIR_PNO=$(M2_DIR)/com/piiano

# the sample applications and SDK
DEMO_APP_DIR 			:= demo_app
VAULT_CONNECTOR_DIR 	:= piiano_vault_connector
VAULT_ORM_CONNECTOR_DIR := piiano_vault_orm_connector
VAULT_SDK_DIR			:= piiano_vault_sdk

# JAR locations
SDK_JAR	:= $(M2_DIR)/org/openapitools/openapi-java-client/1.0/openapi-java-client-1.0-sources.jar
DEMO_APP_JAR := $(M2_DIR_PNO)/demo-app/0.0.1-SNAPSHOT/demo-app-0.0.1-SNAPSHOT.jar
ORM_CONNECTOR_JAR := $(M2_DIR_PNO)/piiano-vault-orm-connector/0.0.1-SNAPSHOT/piiano-vault-orm-connector-0.0.1-SNAPSHOT.jar
VAULT_CONNECTOR_JAR := $(M2_DIR_PNO)/piiano-vault-connector/0.0.1-SNAPSHOT/piiano-vault-connector-0.0.1-SNAPSHOT.jar

.PHONY: compile
compile: sdk demo_app vault_connector orm_connector 

############################
########### JARs ###########
############################
.PHONY: sdk
sdk: $(SDK_JAR)

.PHONY: demo_app
demo_app: $(DEMO_APP_JAR)

.PHONY: orm_connector
orm_connector: $(ORM_CONNECTOR_JAR)

.PHONY: vault_connector
vault_connector: $(VAULT_CONNECTOR_JAR)

$(SDK_JAR): 
	cd $(VAULT_SDK_DIR) && mvn install

$(DEMO_APP_JAR): 
	cd $(DEMO_APP_DIR) && mvn install

$(ORM_CONNECTOR_JAR):
	cd $(VAULT_ORM_CONNECTOR_DIR) && mvn install

$(VAULT_CONNECTOR_JAR):
	cd $(VAULT_CONNECTOR_DIR) && mvn install


.PHONY: clean
clean: 
	cd $(VAULT_SDK_DIR) && mvn clean
	cd $(DEMO_APP_DIR) && mvn clean
	cd $(VAULT_CONNECTOR_DIR) && mvn clean 
	cd $(VAULT_ORM_CONNECTOR_DIR) && mvn clean
	rm $(SDK_JAR) $(DEMO_APP_JAR) $(VAULT_CONNECTOR_JAR) $(ORM_CONNECTOR_JAR) 