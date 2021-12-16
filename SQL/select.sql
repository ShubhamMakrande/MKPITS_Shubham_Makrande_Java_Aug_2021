MySQL SELECT Statement:

Let us understand how SELECT command works in MySQL with the help of various examples. Suppose we have a table named employee_detail that contains the following data:

MySQL SELECT Statement

1. If we want to retrieve a single column from the table, we need to execute the below query:

     SELECT Name FROM employee_detail;  
---------------------------------------------------------------------------------------------------
We will get the below output where we can see only one column records.
MySQL SELECT Statement

2. If we want to query multiple columns from the table, we need to execute the below query:

    SELECT Name, Email, City FROM employee_detail;  
----------------------------------------------------------------------------------------------------
We will get the below output where we can see the name, email, and city of employees.
MySQL SELECT Statement

3. If we want to fetch data from all columns of the table, we need to use all column's names with the select statement. Specifying all column names is not convenient to the user, so MySQL uses an asterisk (*) to retrieve all column data as follows:

    SELECT * FROM employee_detail;  



