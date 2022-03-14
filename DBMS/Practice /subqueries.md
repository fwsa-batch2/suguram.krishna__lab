## SUB-QUERIES

### CREATING A DATABASE NAMED SUB QUERIES

```
SHOW DATABASES;
```

|:---------:|
Academy
Assessment
JoinPractise
Learning
Pvr_Cinemas
indexes
information_schema
library
mysql
performance_schema
sys

```
CREATE DATABASE SubQueries;
```

|:---------:|
Academy
Assessment
JoinPractise
Learning
Pvr_Cinemas
SubQueries
indexes
information_schema
library
mysql
performance_schema
sys

### USING THE SUBQUERIES TABLE AND CREATING A TABLE

```
USE SubQueries;
```

```
CREATE TABLE students (roll_no int PRIMARY KEY NOT NULL AUTO_INCREMENT, name varchar(20) NOT NULL, age int(2) NOT NULL, email_id varchar(50) NOT NULL UNIQUE, marks int NOT NULL);
```

```
SHOW TABLES;
```

students

```
DESC students
```

|  Field   |    Type     | Null | Key | Default |     Extra      |
| :------: | :---------: | :--: | :-: | :-----: | :------------: |
| roll_no  |     int     |  NO  | PRI |  NULL   | auto_increment |
|   name   | varchar(20) |  NO  |     |  NULL   |                |
|   age    |     int     |  NO  |     |  NULL   |                |
| email_id | varchar(50) |  NO  | UNI |  NULL   |                |
|  marks   |     int     |  NO  |     |  NULL   |                |

### INSERTING THE VALUES IN THE TABLE

```
INSERT INTO students (name,age,email_id,marks) VALUES ("Suguram", 19, "suguram@gmail.com",96),("Venkat", 18, "venkat@gmail.com",92),("Keerthana", 20, "keerthana@gmail.com",98),("Vaishnavi", 18, "vp@gmail.com",89),("Pavan", 19, "pavan@gmail.com",85),("Meenu", 18, "meenu@gmail.com",99),("VijayAntony", 20, "vja@gmail.com",75);
```

```
SELECT*FROM students;
```

| roll_no | name        | age | email_id            | marks |
|:-------:|:-----------:||:--:|:-------------------:|:-----:|
|       1 | Suguram     |  19 | suguram@gmail.com   |    96 |
|       2 | Venkat      |  18 | venkat@gmail.com    |    92 |
|       3 | Keerthana   |  20 | keerthana@gmail.com |    98 |
|       4 | Vaishnavi   |  18 | vp@gmail.com        |    89 |
|       5 | Pavan       |  19 | pavan@gmail.com     |    85 |
|       6 | Meenu       |  18 | meenu@gmail.com     |    99 |
|       7 | VijayAntony |  20 | vja@gmail.com       |    75 |


### GETTING THE NAME AND EMAIL ID USING SUB QUERIES

```
SELECT name, email_id FROM students WHERE marks in (SELECT marks FROM students
WHERE marks<90);
```

| name        | email_id        |
|:-----------:|:---------------:|
| Vaishnavi   | vp@gmail.com    |
| Pavan       | pavan@gmail.com |
| VijayAntony | vja@gmail.com   |


### GETTING THE DETAILS OF THE STUDENTS WHOSE MARKS IS GREATER THAN THE AVG MARK USING SUB QUERIES

```
SELECT AVG(marks) FROM students;
```

| AVG(marks) |
|:----------:|
|    90.5714 |


```
SELECT roll_no, name, age, email_id,  FROM students where marks > (SELECT AVG(marks) FROM students);
```


| roll_no | name      | age | email_id            | marks |
|:-------:|:---------:|:---:|:-------------------:|:-----:|
|       1 | Suguram   |  19 | suguram@gmail.com   |    96 |
|       2 | Venkat    |  18 | venkat@gmail.com    |    92 |
|       3 | Keerthana |  20 | keerthana@gmail.com |    98 |
|       6 | Meenu     |  18 | meenu@gmail.com     |    99 |



### INSERTING THE VALUE USING SUBQUERY 

#### SUBQUERY IN INSERTING IS USED TO INSERT THE VALUE FROM ONE TABLE TO THE ANOTHEER

```
INSERT INTO Basic_Details SELECT roll_no,name, age, email_id FROM students WHERE roll_no IN (SELECT roll_no FROM students);
```

```
SELECT*FROM Basic_Details;
```


| roll_no | name        | age | email_id            |
|:-------:|:-----------:|:---:|:-------------------:|
|       1 | Suguram     |  19 | suguram@gmail.com   |
|       2 | Venkat      |  18 | venkat@gmail.com    |
|       3 | Keerthana   |  20 | keerthana@gmail.com |
|       4 | Vaishnavi   |  18 | vp@gmail.com        |
|       5 | Pavan       |  19 | pavan@gmail.com     |
|       6 | Meenu       |  18 | meenu@gmail.com     |
|       7 | VijayAntony |  20 | vja@gmail.com       |


### DELETING USING THE SUBQUERIES

```
DELETE FROM Basic_Details WHERE email_id in (SELECT email_id FROM students WHERE email_id = "vja@gmail.com");
```

Query OK, 1 row affected (0.01 sec)

```
SELECT*FROM Basic_Details;
```

| roll_no | name      | age | email_id            |
|:-------:|:---------:|:---:|:-------------------:|
|       1 | Suguram   |  19 | suguram@gmail.com   |
|       2 | Venkat    |  18 | venkat@gmail.com    |
|       3 | Keerthana |  20 | keerthana@gmail.com |
|       4 | Vaishnavi |  18 | vp@gmail.com        |
|       5 | Pavan     |  19 | pavan@gmail.com     |
|       6 | Meenu     |  18 | meenu@gmail.com     |

### UPDATING USING SUB QUERY

```
UPDATE Basic_Details set age=20 where name in (select name from students WHERE name = "Pavan");
```

```
SELECT*FROM Basic_Details;
```


| roll_no | name      | age | email_id            |
|:-------:|:---------:|:---:|:-------------------:|
|       1 | Suguram   |  19 | suguram@gmail.com   |
|       2 | Venkat    |  18 | venkat@gmail.com    |
|       3 | Keerthana |  20 | keerthana@gmail.com |
|       4 | Vaishnavi |  18 | vp@gmail.com        |
|       5 | Pavan     |  20 | pavan@gmail.com     |
|       6 | Meenu     |  18 | meenu@gmail.com     |


