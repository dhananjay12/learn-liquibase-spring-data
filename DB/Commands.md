## Download the required java connector here

MariaDB - https://mariadb.com/downloads/#connectors

## Command

db-changelog-x.x.xml are just incrementals updates.

https://docs.liquibase.com/workflows/database-setup-tutorials/mariadb.html

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password update
```