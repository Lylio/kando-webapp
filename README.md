![](https://github.com/Lylio/image-repo/blob/master/logos/java.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/angular.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/postgres.png?raw=true)
# Kando
## Built with Spring Boot, Angular and PostgreSQL.

### Description
Basic Kanban app as an example for demonstrating launching multi-container apps with the 
`docker-composer up` command.<br>

#### Docker Launch
1. `docker-compose up`
2. Navigate to http://localhost:4200

#### Postgres Database Interrogation (Terminal)
1. `psql -p 5431 -d kanban -U kanban -h localhost`
2. Password is `kanban`
3. `psql` to log into Postgres shell
4. `\list` list databases
5. `\connect kanban` connect to kanban database
6. `\dt` lists tables in kanban database
7. `SELECT * FROM kanban;` lists all the user-created kanbans
8. `SELECT * FROM task;` lists all user created-tasks across all kanbans
9. `\quit` exit Postgres shell

#### Postgres Database Interrogation (pgAdmin4)
1. Ensure pgAdmin4 is running (click elephant icon)
2. Navigate to `127.0.0.1:43095` and click 'Add New Server'
3. General tab: Name = Kando
4. Connection tab: 
Host = localhost
Port = 5431
Maintenance database = kanban
Username = kanban
Password = kanban
5. Click on top-left Query Tool (arrow on a database) to open SQL panel
6. Try running a query, e.g. SELECT * FROM task;
