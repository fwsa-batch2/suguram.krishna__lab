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

|    Field     |     Type     | Null | Key |      Default      |       Extra       |
| :----------: | :----------: | :--: | :-: | :---------------: | :---------------: |
|      id      |     int      |  NO  | PRI |       NULL        |  auto_increment   |
|     name     | varchar(100) |  NO  |     |       NULL        |                   |
|    email     | varchar(100) |  NO  | UNI |       NULL        |                   |
|  mobile_no   |    bigint    |  NO  |     |       NULL        |                   |
|   password   | varchar(100) |  NO  |     |       NULL        |                   |
|    gender    |   char(1)    |  NO  |     |       NULL        |                   |
|     dob      |     date     | YES  |     |       NULL        |                   |
| created_date |  timestamp   |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.01 sec)

#### DESCRIBING THE TABLE student_class

```
DESC student_class
```

|   Field    |    Type     | Null | Key | Default |     Extra      |
| :--------: | :---------: | :--: | :-: | :-----: | :------------: |
|     id     |     int     |  NO  | PRI |  NULL   | auto_increment |
| student_id |     int     |  NO  | MUL |  NULL   |                |
|   class    |     int     |  NO  |     |  NULL   |                |
|   status   | varchar(20) |  NO  |     |  NULL   |                |

4 rows in set (0.01 sec)

#### INSERTING THE VALUES IN THE student TABLE

```
INSERT INTO students (name,email,mobile_no,password,gender,dob) VALUES ("Suguram","suguram@gmail.com",9876543211,"sugu_123","M","2002-04-10"),("Ram","ram@gmail.com",9876543212,"ram_123","M","2002-04-10"),("Sugu","sugu@gmail.com",9876543213,"sugu_123","M","2002-05-10"),("Sugurama","sugurama@gmail.com",9876543214,"sugurama_123","M","2002-06-10");
```

Query OK, 4 row affected (0.01 sec)

Records: 4 Duplicates: 0 Warnings: 0

### FEATURE 2: LISTING STUDENT

```
SELECT * FROM students;
```

| id  |   name   |       email        | mobile_no  |   password   | gender |    dob     |    created_date     |
| :-: | :------: | :----------------: | :--------: | :----------: | :----: | :--------: | :-----------------: |
|  1  | Suguram  | suguram@gmail.com  | 9876543211 |   sugu_123   |   M    | 2002-04-10 | 2022-03-01 17:29:55 |
|  2  |   Ram    |   ram@gmail.com    | 9876543212 |   ram_123    |   M    | 2002-04-10 | 2022-03-01 17:39:21 |
|  3  |   Sugu   |   sugu@gmail.com   | 9876543213 |   sugu_123   |   M    | 2002-05-10 | 2022-03-01 18:07:38 |
|  4  | Sugurama | sugurama@gmail.com | 9876543214 | sugurama_123 |   M    | 2002-06-10 | 2022-03-01 18:07:38 |

4 rows in set (0.01 sec)

### FEATURE 3: LOOGING IN WITH THE EMAIL AND PASSWORD:

```
SELECT * FROM students WHERE (email="suguram@gmail.com" and password="sugu_123");
```

| id  |  name   |       email       | mobile_no  | password | gender |    dob     |    created_date     |
| :-: | :-----: | :---------------: | :--------: | :------: | :----: | :--------: | :-----------------: |
|  1  | Suguram | suguram@gmail.com | 9876543211 | sugu_123 |   M    | 2002-04-10 | 2022-03-01 17:29:55 |

1 row in set (0.00 sec)

### FEATURE 4: UPDATE PASSWORD

```
UPDATE students SET password="sugu_12" where id="1";
```

Query OK, 1 row affected (0.01 sec)

```
SELECT*FROM students WHERE (name="Suguram");
```

| id  |  name   |       email       | mobile_no  | password | gender |    dob     |    created_date     |
| :-: | :-----: | :---------------: | :--------: | :------: | :----: | :--------: | :-----------------: |
|  1  | Suguram | suguram@gmail.com | 9876543211 | sugu_12  |   M    | 2002-04-10 | 2022-03-01 17:29:55 |

1 row in set (0.01 sec)

### FEATURE 5: ENROLLING STUDENT INTO CLASS:

```
INSERT INTO student_class (student_id,class,status) VALUES (1,5,"ACTIVE"),(2,5,"ACTIVE"),(3,5,"ACTIVE"),(4,6,"ACTIVE");
```

Query OK, 4 rows affected (0.01 sec)
Records: 4 Duplicates: 0 Warnings: 0

```
SELECT*FROM student_class;
```

| id  | student_id | class | status |
| :-: | :--------: | :---: | :----: |
|  1  |     1      |   5   | ACTIVE |
|  2  |     2      |   5   | ACTIVE |
|  3  |     3      |   5   | ACTIVE |
|  4  |     4      |   6   | ACTIVE |

4 rows in set (0.00 sec)

### FEATURE 6: FINDING STUDENTS FROM CLASS 5

```
SELECT*FROM student_class WHERE (class=5);
```

| id  | student_id | class | status |
| :-: | :--------: | :---: | :----: |
|  1  |     1      |   5   | ACTIVE |
|  2  |     2      |   5   | ACTIVE |
|  3  |     3      |   5   | ACTIVE |

3 rows in set (0.00 sec)

### FEATURE 7: UPDATING CLASS 5 TO CLASS 6

```
UPDATE student_class SET class ="6" WHERE class ="5";
```

Query OK, 3 rows affected (0.00 sec)
Rows matched: 3 Changed: 3 Warnings: 0

```
SELECT*FROM student_class;
```

| id  | student_id | class | status |
| :-: | :--------: | :---: | :----: |
|  1  |     1      |   6   | ACTIVE |
|  2  |     2      |   6   | ACTIVE |
|  3  |     3      |   6   | ACTIVE |
|  4  |     4      |   6   | ACTIVE |

4 rows in set (0.00 sec)

### FEATURE 8: WITHDRAWING THE STUDENT

```
DELETE FROM student_class where id=4;
```

Query OK, 1 row affected (0.00 sec)

```
SELECT*FROM student_class;
```

| id  | student_id | class | status |
| :-: | :--------: | :---: | :----: |
|  1  |     1      |   6   | ACTIVE |
|  2  |     2      |   6   | ACTIVE |
|  3  |     3      |   6   | ACTIVE |

### FEATURE 9: GETTING STUDENTS WHO DIDN'T UPDATE THE DOB :

```
SELECT*FROM students WHERE dob is NULL;
```

Empty set (0.00 sec)

### FEATURE 10: STUDENTS WHO ARE ACTIVE:

```
SELECT COUNT(*) FROM student_class WHERE status="ACTIVE";
```

| COUNT(*) |
| :-------: |
|     3     |

1 row in set (0.01 sec)

### FEATURE 11: STUDENTS WHO ARE ACTIVE BY CLASS;

```
SELECT COUNT(*)FROM student_class WHERE status = "ACTIVE" GROUP BY class;
```

| COUNT(*) |
| :-------: |
|     3     |

1 row in set (0.00 sec)

### FEATURE 12: TOTAL NUMBER OF STUDENTS ACTIVELY LEARNING LESS THAN 5 STUDENTS IN EACH CLASS:

```
SELECT COUNT(*),class FROM student_class WHERE status = "ACTIVE" GROUP BY class having count(*)<5;
```

| COUNT(*) | class |
| :-------: | ----: |
|     3     |     6 |

1 row in set (0.00 sec)

### FEATURE 13: DISPLAYING THE STUDENT AND CLASS USING INNER JOIN

SELECT * FROM students INNER JOIN student_class on students.id = student_class.id;

| id  |  name   |       email       | mobile_no  | password | gender |    dob     |    created_date     | id  | student_id | class | status |
| :-: | :-----: | :---------------: | :--------: | :------: | :----: | :--------: | :-----------------: | :-: | :--------: | :---: | :----: |
|  1  | Suguram | suguram@gmail.com | 9876543211 | sugu_12  |   M    | 2002-04-10 | 2022-03-01 17:29:55 |  1  |     1      |   6   | ACTIVE |
|  2  |   Ram   |   ram@gmail.com   | 9876543212 | ram_123  |   M    | 2002-04-10 | 2022-03-01 17:39:21 |  2  |     2      |   6   | ACTIVE |
|  3  |  Sugu   |  sugu@gmail.com   | 9876543213 | sugu_123 |   M    | 2002-05-10 | 2022-03-01 18:07:38 |  3  |     3      |   6   | ACTIVE |

3 rows in set (0.00 sec)

### FEATURE 14: DISPLAYING THE GIVEN INPUT USING JOINS

```
SELECT * FROM students INNER JOIN student_class on students.id = student_class.id WHERE student_class.class=6;
```

| id  |  name   |       email       | mobile_no  | password | gender |    dob     |    created_date     | id  | student_id | class | status |
| :-: | :-----: | :---------------: | :--------: | :------: | :----: | :--------: | :-----------------: | :-: | :--------: | :---: | :----: |
|  1  | Suguram | suguram@gmail.com | 9876543211 | sugu_12  |   M    | 2002-04-10 | 2022-03-01 17:29:55 |  1  |     1      |   6   | ACTIVE |
|  2  |   Ram   |   ram@gmail.com   | 9876543212 | ram_123  |   M    | 2002-04-10 | 2022-03-01 17:39:21 |  2  |     2      |   6   | ACTIVE |
|  3  |  Sugu   |  sugu@gmail.com   | 9876543213 | sugu_123 |   M    | 2002-05-10 | 2022-03-01 18:07:38 |  3  |     3      |   6   | ACTIVE |

3 rows in set (0.01 sec)

### FEATURE 15: FINDING THE GIVEN MAIL ID USING THE JOIN:

```
SELECT student_id,name,email,class FROM student_class INNER JOIN students on students.id= student_class.id WHERE students.email = "suguram@gmail.com";
```

| student_id |  name   |       email       | class |
| :--------: | :-----: | :---------------: | :---: |
|     1      | Suguram | suguram@gmail.com |   6   |

1 row in set (0.00 sec)

### FEATURE 16: STUDENTS WHO ARE NOT ENROLLED IN THE CLASS:

```
SELECT * FROM students WHERE id NOT IN (SELECT student_id FROM student_class);
```

| id  |   name   |        email        | mobile_no  |   password   | gender |    dob     |    created_date     |
| :-: | :------: | :-----------------: | :--------: | :----------: | :----: | :--------: | :-----------------: |
|  4  | Sugurama | sugurama@gmail.com  | 9876543214 | sugurama_123 |   M    | 2002-06-10 | 2022-03-01 18:07:38 |
|  5  | Sugumar  |  sugumar@gmail.com  | 9876543215 | sugumar_123  |   M    | 2002-04-10 | 2022-03-02 20:33:26 |
|  6  | Karkuvel | karukuvel@gmail.com | 9876543216 | karkuvel_123 |   M    | 2002-04-09 | 2022-03-02 20:33:26 |

3 rows in set (0.00 sec)

### FEATURE 17: SELECTING NAME AND CLASS WITH LEFT JOIN:
```
SELECT name,class FROM students LEFT JOIN student_class ON students.id = student_class.student_id;
```

| name     | class |
|:--------:|:-----:|
| Suguram  |     6 |
| Ram      |     6 |
| Sugu     |     6 |
| Sugurama |  NULL |
| Sugumar  |  NULL |
| Karkuvel |  NULL |

6 rows in set (0.00 sec)
