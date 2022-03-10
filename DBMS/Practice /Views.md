### CHECKING THE TABELS IN THE DATABASE

```
SHOW TABLES;
```


| Tables_in_Learning |
|:------------------:|
| Batch1             |
| Batch2             |
| StudentsDetails    |


### FETCHING THE VALUES FROM Batch1

```
SELECT*FROM Batch1;
```

| Emo_Id | Name    | Gender | DOB  |
|:------:|:-------:|:------:|:----:|
|      1 | Yusuf   | M      | 1999 |
|      2 | Dhaya   | M      | 2000 |
|      3 | Revathi | F      | 1999 |
|      4 | Ananya  | F      | 2000 |
|      5 | Sulai   | M      | 2000 |

5 rows in set (0.00 sec)


### CREATING VIEWS

```
CREATE VIEW name_and_dob AS SELECT Name, DOB FROM Batch1 WHERE DOB = 2000;
```

### CHECKING WHETHER VIEW IS CREATED

```
SHOW TABLES;
```

| Tables_in_Learning |
|:------------------:|
| Batch1             |
| Batch2             |
| StudentsDetails    |
| name_and_dob       |

### FETCHING THE VALUES IN VIEWS

```
SELECT * FROM name_and_dob;
```


| Name   | DOB  |
|:------:|:----:|
| Dhaya  | 2000 |
| Ananya | 2000 |
| Sulai  | 2000 |


### UPDATING THE VALUES IN THE VIEWS

```
CREATE OR REPLACE VIEW name_and_dob AS SELECT Name, DOB FROM Batch2 WHERE DOB < 2004;
```

### FETCHING THE VALUES FROM THE UPDATED VIEWS TABLE

```
SELECT * FROM name_and_dob;
```


| Name        | DOB  |
|:------------------:|
| Suguram     | 2002 |
| Jerusheya   | 2002 |
| Keerthana   | 2001 |
| Vaishnavi_P | 2003 |
| Deepak      | 2002 |
| Musaraf     | 2001 |
| Prasanna    | 2000 |
| Pavan       | 2003 |
| Riyas       | 2003 |




### RENAMING A VIEW TABLE 

```
RENAME TABLE name_and_dob TO ViewsPractice;
```

### CHECKING WHETHER THE TABLE IS RENAMED 

```
SHOW TABLES;
```

| Tables_in_Learning |
|:------------------:|
| Batch1             |
| Batch2             |
| StudentsDetails    |
| ViewsPractice      |


### INSERTING THE VALUES INTO THE VIEW TABLES

```
INSERT INTO ViewsPractice VALUES ("Abisha", 2003);
```

```
SELECT * FROM ViewsPractice;
```


| Name        | DOB  |
|:------------------:|
| Suguram     | 2002 |
| Jerusheya   | 2002 |
| Keerthana   | 2001 |
| Vaishnavi_P | 2003 |
| Deepak      | 2002 |
| Musaraf     | 2001 |
| Prasanna    | 2000 |
| Pavan       | 2003 |
| Riyas       | 2003 |
| Abisha      | 2003 |

### DELETING A ROW

```
DELETE FROM ViewsPractice WHERE Name = "Pavan";
```

```
SELECT * FROM ViewsPractice;
```

| Name        | DOB  |
|:------------------:|
| Suguram     | 2002 |
| Jerusheya   | 2002 |
| Keerthana   | 2001 |
| Vaishnavi_P | 2003 |
| Deepak      | 2002 |
| Musaraf     | 2001 |
| Prasanna    | 2000 |
| Riyas       | 2003 |
| Abisha      | 2003 |


### DROPING VIEW

```
DROP VIEW ViewsPractice;
```

```
SELECT* FROM ViewsPractice;
```

ERROR 1146 (42S02): Table 'Learning.ViewsPractice' doesn't exist


### MULTIPLE VIEWS

```
CREATE VIEW MultipleViews AS SELECT Batch1.Name AS Batch1_Name, Batch1.DOB AS Batch1_DOB, Batch2.Name AS Batch2_Name, Batch2.DOB AS Batch2_DOB FROM Batch1, Batch2 WHERE Batch1.DOB = Batch2.DOB;
```

```
SELECT*FROM MultipleViews;
```

| Batch1_Name | Batch1_DOB | Batch2_Name | Batch2_DOB |
|:-----------:|:----------:|:-----------:|:----------:|
| Aravind     |       2000 | Prasanna    |       2000 |
| Sulai       |       2000 | Prasanna    |       2000 |
| Ananya      |       2000 | Prasanna    |       2000 |
| Dhaya       |       2000 | Prasanna    |       2000 |

