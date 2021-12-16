MySQL INSERT Statement:


MySQL INSERT statement is used to store or add data in MySQL table within the database. We can perform insertion of records in two ways using a single query in MySQL:

    Insert record in a single row
    

Syntax:

The below is generic syntax of SQL INSERT INTO command to insert a single record in MySQL table:

    INSERT INTO table_name ( field1, field2,...fieldN )    
    VALUES    
    ( value1, value2,...valueN );    

Let us understand how INSERT statements work in MySQL with the help of multiple examples. First, create a table "People" in the database using the following command:

    CREATE TABLE People(  
        id int NOT NULL AUTO_INCREMENT,  
        name varchar(45) NOT NULL,  
        occupation varchar(35) NOT NULL,  
        age int,  
        PRIMARY KEY (id)  
    );  

 If we want to store single records for all fields, use the syntax as follows:

    INSERT INTO People (id, name, occupation, age)   
    VALUES (101, 'Peter', 'Engineer', 32);  
---------------------------------------------------------------------------
              Insert record in multiple rows

 2. If we want to store multiple records, use the following statements where we can either specify all field names or don't specify any field.

    INSERT INTO People VALUES  
    (102, 'Joseph', 'Developer', 30),  
    (103, 'Mike', 'Leader', 28),  
    (104, 'Stephen', 'Scientist', 45);  

 3. If we want to store records without giving all fields, we use the following partial field statements. In such case, it is mandatory to specify field names.

    INSERT INTO People (name, occupation)   
    VALUES ('Stephen', 'Scientist'), ('Bob', 'Actor');  
-----------------------------------------------------------------------------------------------

     We can use the below syntax to show the records of the People table:

     SELECT * FROM People;  
-----------------------------------------
Inserting Date in MySQL Table:



    INSERT INTO table_name (column_name, column_date) VALUES ('DATE: Manual Date', '2008-7-04');

alter table people add dob date
this will add dob column in people table
insert into people values(112,'rajeshri','dev',20,'2000-12-12')



