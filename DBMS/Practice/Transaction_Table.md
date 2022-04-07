```
USE Academy
```
Database changed

```
SHOW TABLES;
```


| Tables_in_Academy |
|:-----------------:|
| Batch_courses     |
| Batch_users       |
| Batches           |
| Courses           |
| Users             |

5 rows in set (0.01 sec)

```
SHOW FULL TABLES TABLE_TYPE = "BASE";
```

```
SHOW TABLES;
```


| Tables_in_Academy |
|:-----------------:|
| Batch_courses     |
| Batch_users       |
| Batches           |
| Courses           |
| Users             |


```
SELECT*FROM Batches;
```


| id | name   |
|:-----------:|
|  1 | Batch1 |
|  2 | Batch2 |


```
SELECT Courses.id, Users.id AS Username, Batches.name AS Batchname FROM Users JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id;
```


| id | Username | Batchname |
|:--:|:--------:|:---------:|
|  1 |        1 | Batch1    |
|  2 |        2 | Batch2    |



```
SELECT Courses.id, Users.name AS Username, Batches.name AS Batchname FROM Users JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id;
```

| id | Username | Batchname |
|:--:|:--------:|:---------:|
|  1 | Surya    | Batch1    |
|  2 | Dhaya    | Batch2    |



```
SELECT*FROM Users;
```


| id | name  |
|:--:|:-----:|
|  1 | Surya |
|  2 | Dhaya |


```
INSERT INTO Users (name) VALUES ("Suguram"),("Venkat"),("Pavan");
```

```
SELECT*FROM Courses;
```

| id | name |
|:--:|:----:|
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |


```
SELECT*FROM Users;
```


| id | name    |
|:--:|:-------:|
|  1 | Surya   |
|  2 | Dhaya   |
|  3 | Suguram |
|  4 | Venkat  |
|  5 | Pavan   |


```
INSERT INTO Batches VALUES (3,"Batch1"), (4,"Batch2"),(5,"Batch1");
```

```
INSERT INTO Courses Values (4,"HTML"),(5,"HTML");
```

```
SELECT*FROM Courses;
```

| id | name |
|:--:|:----:|
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |
|  4 | HTML |
|  5 | HTML |


```
SELECT Courses.id AS Course_Id,Courses.name AS Courses_name, Users.name AS Username, Users.id AS Username, Batches.name AS Batchname,Batches.id AS Batch_Id FROM Users JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id WHERE 
Courses.name="HTML" AND Batches.name="Batch1";
```


| Course_Id | Courses_name | Username | Username | Batchname | Batch_Id |
|:---------:|:------------:|:--------:|:--------:|:---------:|:--------:|
|         1 | HTML         | Surya    |        1 | Batch1    |        1 |
|         5 | HTML         | Pavan    |        5 | Batch1    |        5 |


```
SELECT*FROM Users;
```

| id | name    |
|:--:|::-------|
|  1 | Surya   |
|  2 | Dhaya   |
|  3 | Suguram |
|  4 | Venkat  |
|  5 | Pavan   |

```
SELECT*FROM Batches;
```

| id | name   |
|:--:|:------:|
|  1 | Batch1 |
|  2 | Batch2 |
|  3 | Batch1 |
|  4 | Batch2 |
|  5 | Batch1 |


```
SELECT*FROM Courses;;
```

| id | name |
|:--:|:----:|
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |
|  4 | HTML |
|  5 | HTML |



```
SELECT Courses.id AS Course_Id,Courses.name AS Courses_name, Users.name AS User_name, Users.id AS User_id, Batches.name AS Batch_name,Batches.id AS Batch_Id FROM User
s JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id WHERE Courses.name="HTML" AND Batches.name="Batch1";
```


| Course_Id | Courses_name | User_name | User_id | Batch_name | Batch_Id |
|:---------:|:------------:|:---------:|:-------:|:----------:|:--------:|
|         1 | HTML         | Surya     |       1 | Batch1     |        1 |
|         5 | HTML         | Pavan     |       5 | Batch1     |        5 |


```
SELECT Courses.id AS Course_Id,Courses.name AS Courses_name, Users.name AS User_name, Users.id AS User_id, Batches.name AS Batch_name,Batches.id AS Batch_Id FROM Users JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id WHERE Courses.name="HTML" AND Batches.name="Batch2";
```

| Course_Id | Courses_name | User_name | User_id | Batch_name | Batch_Id |
|:---------:|:------------:|:---------:|:-------:|:----------:|:--------:|
|         4 | HTML         | Venkat    |       4 | Batch2     |        4 |


```
SELECT Courses.id AS Course_Id,Courses.name AS Courses_name, Users.name AS User_name, Users.id AS User_id, Batches.name AS Batch_name,Batches.id AS Batch_Id FROM Users JOIN Batches ON Users.id=Batches.id JOIN Courses ON Users.id=Courses.id WHERE Courses.name="CSS" AND Batches.name="Batch2";
```


| Course_Id | Courses_name | User_name | User_id | Batch_name | Batch_Id |
|:---------:|:------------:|:---------:|:-------:|:----------:|:--------:|
|         2 | CSS          | Dhaya     |       2 | Batch2     |        2 |


```
SELECT*FROM Users;
```

| id | name    |
|:--:|:-------:|
|  1 | Surya   |
|  2 | Dhaya   |
|  3 | Suguram |
|  4 | Venkat  |
|  5 | Pavan   |


```
INSERT INTO Users Values (6,"Surya");
```


```
INSERT INTO Batches Values (6,"Batch1");
```

```
INSERT INTO Courses Values (6,"CSS");
```

```
SELECT Courses.id, Courses.name, Batches.id, Batches.name, Users.id, Users.name FROM Courses INNER JOIN Batches on Courses.id = Batches.id inner join Users on Users.id = Batches.id;
```


| id | name | id | name   | id | name    |
|:--:|:----:|:--:|:-----:|:--:|--------:|
|  1 | HTML |  1 | Batch1 |  1 | Surya   |
|  2 | CSS  |  2 | Batch2 |  2 | Dhaya   |
|  3 | JS   |  3 | Batch1 |  3 | Suguram |
|  4 | HTML |  4 | Batch2 |  4 | Venkat  |
|  5 | HTML |  5 | Batch1 |  5 | Pavan   |
|  6 | CSS  |  6 | Batch1 |  6 | Surya   |
+----+------+----+--------+----+---------+
6 rows in set (0.00 sec)
