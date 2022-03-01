# ASSESSMENT 

### FEATURE 1: STUDENT REGISTRATION

#### CREATE A DATABASE

```
CREATE DATABASE Assessment;
```
Query OK, 1 row affected (0.01 sec)

#### USING DATABASE

```
USE DATABASE
```
Database changed


#### CREATING TABLE NAMED students

```
CREATE TABLE students(id int primary key auto_increment,name varchar(100) not null,email varchar(100) not null,mobile_no bigint not null,password varchar(100) not null,gender char(1) not null,dob date,created_date timestamp not null default current_timestamp,unique (email),check ( gender in ('M','F'))); 
```
Query OK, 0 rows affected (0.05 sec)


#### CREATING TABLE NAMED student_class

```
CREATE TABLE student_class ( id int primary key auto_increment, student_id int not null, class int not null, status varchar(20) not null, foreign key (student_id) references students(id), check( class >= 1 and class <=12), check (status in ('ACTIVE','INACTIVE')) ); 
```
Query OK, 0 rows affected (0.05 sec)

#### DESCRIBING THE TABLE students

```
DESC students
```


| Field        | Type         | Null | Key | Default           | Extra             |
|:------------:|:------------:|:----:|:---:|:-----------------:|:-----------------:|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.01 sec)

#### DESCRIBING THE TABLE student_class

```
DESC student_class
```


| Field      | Type        | Null | Key | Default | Extra          |
|:----------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.01 sec)

#### INSERTING THE VALUES IN THE student TABLE

```
INSERT INTO students (name,email,mobile_no,password,gender,dob) VALUES ("Suguram","suguram@gmail.com",9876543211,"sugu_123","M","2002-04-10"),("Ram","ram@gmail.com",9876543212,"ram_123","M","2002-04-10"),("Sugu","sugu@gmail.com",9876543213,"sugu_123","M","2002-05-10"),("Sugurama","sugurama@gmail.com",9876543214,"sugurama_123","M","2002-06-10");
```

Query OK, 4 row affected (0.01 sec)

Records: 4  Duplicates: 0  Warnings: 0


### FEATURE 2: LISTING STUDENTS

SELECT * FROM students;


| id | name     | email              | mobile_no  | password     | gender | dob        | created_date        |
|:--:|:--------:|:------------------:|:----------:|:------------:|:------:|:----------:|:-------------------:|
|  1 | Suguram  | suguram@gmail.com  | 9876543211 | sugu_123     | M      | 2002-04-10 | 2022-03-01 17:29:55 |
|  3 | Ram      | ram@gmail.com      | 9876543212 | ram_123      | M      | 2002-04-10 | 2022-03-01 17:39:21 |
|  4 | Sugu     | sugu@gmail.com     | 9876543213 | sugu_123     | M      | 2002-05-10 | 2022-03-01 18:07:38 |
|  5 | Sugurama | sugurama@gmail.com | 9876543214 | sugurama_123 | M      | 2002-06-10 | 2022-03-01 18:07:38 |

4 rows in set (0.01 sec)
