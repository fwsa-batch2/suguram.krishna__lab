# DBMS CHEAT SHEET

## MySql Basics Comments:

### SHOW DATABASES

```
SHOW DATABASES;
```

| Database |
:--------------------:
| Learning |
| information_schema |
| library |
| mysql |
| performance_schema |
| sys |

6 rows in set (0.00 sec)

---

### CREATE DATABASE

```
CREATE DATABASE Pvr_Cinemas;
```

```
SHOW DATABASES;
```

| Database |
:--------------------:
| Learning |
| Pvr_Cinemas |
| information_schema |
| library |
| mysql |
| performance_schema |
| sys |

7 rows in set (0.01 sec)

---

### USE DATABASE

```
USE Pvr_Cinemas
```

Database changed

---

### SHOW TABLE

```
SHOW TABLES
```

Empty set (0.01 sec)

---

### CREATE TABLE

```
CREATE TABLE userdetails(User_Id int primary key auto_increment NOT NULL, Username varchar(20) NOT NULL, Email varchar(255) UNIQUE NOT NULL);
```

Query OK, 0 rows affected (0.05 sec)

```
SHOW TABLES
```

| Tables_in_Pvr_Cinemas |
:--------------------:
| userdetails |

1 row in set (0.01 sec)

---

### DESCRIBE TABLE

```
DESC userdetails
```

OR

```
DESCRIBE userdetail
```

|  Field   |     Type     | Null | Key | Default |     Extra      |
| :------: | :----------: | :--: | :-: | :-----: | :------------: |
| User_Id  |     int      |  NO  | PRI |  NULL   | auto_increment |
| Username | varchar(20)  |  NO  |     |  NULL   |                |
|  Email   | varchar(255) |  NO  | UNI |  NULL   |                |

3 rows in set (0.00 sec)

---

### INSERTING VALUES IN TABLE

```
INSERT INTO userdetails (Username,Email) values ('Suguram','abc@gmail.com');
```

OR

```
INSERT INTO userdetails (Username,Email) values ('SK','abcde@gmail.com'),('Ram', 'abcdef@gmail.com');
```

---

### SELECT STATEMENT (TO SHOW THE VALUES INSIDE THE TABLE)

```
SELECT * FROM userdetails;
```

THIS QUERY WILL SELECT ALL THE VALUES IN THE TABLE

| User_Id | Username |      Email       |
| :-----: | :------: | :--------------: |
|    1    | Suguram  |  abc@gmail.com   |
|    2    |   Sugu   |  abcd@gmail.com  |
|    3    |    SK    | abcde@gmail.com  |
|    4    |   Ram    | abcdef@gmail.com |

4 rows in set (0.00 sec)

---

### WHERE CLAUSE (TO SELECT THE VALUES OF THE SELECTED FIELD)

```
SELECT * FROM userdetails where Email = 'abcd@gmail.com';
```

| User_Id | Username |     Email      |
| :-----: | :------: | :------------: |
|    2    |   Sugu   | abcd@gmail.com |

1 row in set (0.00 sec)

---

### ALTER AND MODIFY TABLE

#### ALTER TABLE

```
ALTER TABLE userdetails ADD Phone_Number bigint;
```

Query OK, 0 rows affected (0.04 sec)

```
DESC userdetails;
```

|    Field     |     Type     | Null | Key | Default |     Extra      |
| :----------: | :----------: | :--: | :-: | :-----: | :------------: |
|   User_Id    |     int      |  NO  | PRI |  NULL   | auto_increment |
|   Username   | varchar(20)  |  NO  |     |  NULL   |                |
|    Email     | varchar(255) |  NO  | UNI |  NULL   |                |
| Phone_Number |    bigint    | YES  |     |  NULL   |                |

4 rows in set (0.01 sec)

---

#### MODIFIY TABLE

```
ALTER TABLE userdetails MODIFY COLUMN Username char(50);
```

```
DESC userdetails;
```

|    Field     |     Type     | Null | Key | Default |     Extra      |
| :----------: | :----------: | :--: | :-: | :-----: | :------------: |
|   User_Id    |     int      |  NO  | PRI |  NULL   | auto_increment |
|   Username   |   char(50)   | YES  |     |  NULL   |                |
|    Email     | varchar(255) |  NO  | UNI |  NULL   |                |
| Phone_Number |    bigint    | YES  |     |  NULL   |                |

4 rows in set (0.01 sec)

```
SELECT * FROM userdetails;
```

| User_Id | Username |          Email          | Phone_Number |
| :-----: | :------: | :---------------------: | :----------: |
|    1    | Suguram  |      abc@gmail.com      |     NULL     |
|    2    |   Sugu   | abcd@gmediumintmail.com |     NULL     |
|    3    |    SK    |     abcde@gmail.com     |     NULL     |
|    4    |   Ram    |    abcdef@gmail.com     |     NULL     |

4 rows in set (0.00 sec)

---

### ADDING AUTO_INCREMENT TO EXISTING COLUMN

```
ALTER TABLE userdetails ADD Secondary_Id int;
```

Query OK, 0 rows affected (0.04 sec)

```
DESC userdetails;
```

|    Field     |     Type     | Null | Key | Default |     Extra      |
| :----------: | :----------: | :--: | :-: | :-----: | :------------: |
|   User_Id    |     int      |  NO  | PRI |  NULL   | auto_increment |
|   Username   |   char(50)   | YES  |     |  NULL   |                |
|    Email     | varchar(255) |  NO  | UNI |  NULL   |                |
| Phone_Number |    bigint    | YES  |     |  NULL   |                |
| Secondary_Id |     int      | YES  |     |  NULL   |                |


```
ALTER TABLE Userdetails MODIFY Secondary_Id int AUTO_INCREMENT;
```

Query OK, 0 rows affected (0.04 sec)

```
DESC userdetails;
```

|    Field     |     Type     | Null | Key | Default |     Extra      |
| :----------: | :----------: | :--: | :-: | :-----: | :------------: |
|   User_Id    |     int      |  NO  | PRI |  NULL   | auto_increment |
|   Username   |   char(50)   | YES  |     |  NULL   |                |
|    Email     | varchar(255) |  NO  | UNI |  NULL   |                |
| Phone_Number |    bigint    | YES  |     |  NULL   |                |
| Secondary_Id |     int      | YES  |     |  NULL   |                |

---

### UPDATE TABLE

```
UPDATE userdetails SET Phone_Number = 987654321 where User_Id=1;
```

Query OK, 1 row affected (0.01 sec)

Rows matched: 1 Changed: 1 Warnings: 0

```
SELECT * FROM userdetails;
```

| User_Id | Username |      Email       | Phone_Number |
| :-----: | :------: | :--------------: | :----------: |
|    1    | Suguram  |  abc@gmail.com   |  987654321   |
|    2    |   Sugu   |  abcd@gmail.com  |     NULL     |
|    3    |    SK    | abcde@gmail.com  |     NULL     |
|    4    |   Ram    | abcdef@gmail.com |     NULL     |

4 rows in set (0.01 sec)

---

### DELETE TABLE

```
DELETE FROM userdetails WHERE Username = 'SK';
```

Query OK, 1 row affected (0.01 sec)

```
SELECT * FROM userdetails;
```

| User_Id | Username |      Email       | Phone_Number |
| :-----: | :------: | :--------------: | :----------: |
|    1    | Suguram  |  abc@gmail.com   |  987654321   |
|    2    |   Sugu   |  abcd@gmail.com  |     NULL     |
|    4    |   Ram    | abcdef@gmail.com |     NULL     |

3 rows in set (0.00 sec)

---

### TRUNCATE TABLE

##### DELETES ALL THE VALUES INSIDE THE TABLE BUT WONT DELETE THE FIELDS WE CREATED

```
TRUNCATE TABLE userdetails;
```

Query OK, 0 rows affected (0.06 sec)

```
SELECT * FROM userdetails;
```

Empty set (0.00 sec)

```
DESC userdetails;
```

|    Field     |     Type     | Null | Key | Default |     Extra      |
| :----------: | :----------: | :--: | :-: | :-----: | :------------: |
|   User_Id    |     int      |  NO  | PRI |  NULL   | auto_increment |
|   Username   |   char(50)   | YES  |     |  NULL   |                |
|    Email     | varchar(255) |  NO  | UNI |  NULL   |                |
| Phone_Number |    bigint    | YES  |     |  NULL   |                |

4 rows in set (0.00 sec)

---

### DROP TABLE AND DATABASE

#### COMPLETELY DELETES THE TABLE OR DATABASE

```
DROP TABLE userdetails
```

Query OK, 0 rows affected (0.03 sec)

```
SHOW TABLES;
```

Empty set (0.01 sec)

```
DROP DATABASE Pvr_Cinemas;
```

Query OK, 0 rows affected (0.01 sec)

```
SHOW DATABASES;
```

|      Database      |
| :----------------: |
|      Learning      |
| information_schema |
|      library       |
|       mysql        |
| performance_schema |
|        sys         |

6 rows in set (0.01 sec)

---

#### CONSTRAINTS

##### MOSTLY USED CONSTRAINTS

- NOT NULL
- UNIQUE
- PRIMARY KEY
- FOREGIN KEY
- CHECK
- DEFAULT


### NOT NULL

```
SHOW DATABASES;
```

| Database           |
|:------------------:|
| JoinPractise       |
| Learning           |
| Pvr_Cinemas        |
| information_schema |
| library            |
| mysql              |
| performance_schema |
| sys                |

8 rows in set (0.00 sec)

```
USE Pvr_Cinemas
```
Database changed

```
SHOW TABLES
```


| Tables_in_Pvr_Cinemas |
|:---------------------:|
| User_Details          |

1 row in set (0.00 sec)

```
SELECT*FROM User_Details;
```

| User_Id | Name    | Email_Id          |
|:-------:|:-------:|:-----------------:|
|       1 | Suguram | suguram@gmail.com |
|       2 | Ram     | ram@gmail.com     |
|       3 | Sugu    | sugu@gmail.com    |

3 rows in set (0.00 sec)

```
ALTER TABLE User_Details ADD Phone_Number bigint NOT NULL ;
```

```
DESC User_Details;
```


| Field        | Type        | Null | Key | Default | Extra          |
|:------------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| User_Id      | int         | NO   | PRI | NULL    | auto_increment |
| Name         | varchar(20) | NO   | UNI | NULL    |                |
| Email_Id     | varchar(40) | YES  | UNI | NULL    |                |
| Phone_Number | bigint      | NO   |     | NULL    |                |


4 rows in set (0.00 sec)

---


### UNIQUE

```
ALTER TABLE User_Details DROP COLUMN Phone_Number
```

```
DESC User_Details;
```

| Field        | Type        | Null | Key | Default | Extra          |
|:------------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| User_Id      | int         | NO   | PRI | NULL    | auto_increment |
| Name         | varchar(20) | NO   | UNI | NULL    |                |
| Email_Id     | varchar(50) | YES  | UNI | NULL    |                |

4 rows in set (0.00 sec)

ADDING THE UNIQUE KEY
```
ALTER TABLE User_Details ADD Phone_Number bigint UNIQUE;
```

Query OK, 0 rows affected (0.16 sec)

```
DESC User_Details;
```

| Field        | Type         | Null | Key | Default | Extra          |
|:------------:|:------------:|:----:|:---:|:-------:|:--------------:|
| User_Id      | int          | NO   | PRI | NULL    | auto_increment |
| Name         | varchar(20)  | NO   | UNI | NULL    |                |
| Email_Id     | varchar(50)  | YES  | UNI | NULL    |                |
| User_Address | varchar(255) | YES  | UNI | NULL    |                |
| Phone_Number | bigint       | YES  | UNI | NULL    |                |

5 rows in set (0.00 sec)

