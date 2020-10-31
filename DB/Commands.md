## Download the required java connector here

MariaDB - https://mariadb.com/downloads/#connectors

## Command

db-changelog-x.x.xml are just incrementals updates.

https://docs.liquibase.com/workflows/database-setup-tutorials/mariadb.html

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password update
```

## Rollback

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password rollbackCount 1
```

### Tag

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password tag before_adding_gender_and_mobile
```

### Rollback to a Tag

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password rollback before_adding_gender_and_mobile
```

### Rollback to Date

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password rollbackToDate 2020-10-31T10:37:39
```

## SQL Scripts

### Update scripts

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password --outputFile=update.sql updateSQL
```

### Rollback scripts

```
liquibase --driver=org.mariadb.jdbc.Driver --classpath=./mariadb-java-client-2.7.0.jar --url="jdbc:mariadb://localhost:3306/employee_app" --changeLogFile=db-changelog.xml --username=backend --password=password --outputFile=rollback.sql futureRollbackSQL
```

## Best Practices

* Never change an existing changeset and update
* One change per changeset so that you can rollback easily
