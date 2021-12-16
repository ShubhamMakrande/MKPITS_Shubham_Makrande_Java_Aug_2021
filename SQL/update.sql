MySQL UPDATE Query
Syntax

Following is a generic syntax of UPDATE command to modify data into the MySQL table:

    UPDATE table_name     
    SET column_name1 = new-value1,   
            column_name2=new-value2, ...    
    [WHERE Clause]  
----------------------------------------------------
Update Single Column

create table trainer(id int auto_increment not null, email varchar(50), course_name varchar(20), primary key)
This query will update the email id of Java course with the new id as follows:

    UPDATE trainer    
    SET email = 'mike@tutorialandexamples.com'    
    WHERE course_name = 'Java';  

After successful execution, we will verify the table using the below statement:

    SELECT * FROM trainer;    
------------------------------------------------------------
Update Multiple Columns

The UPDATE statement can also be used to update multiple columns by specifying a comma-separated list of columns. Suppose we have a table as below:
MySQL UPDATE Query

This statement explains will update the name and occupation whose id = 105 in the People table as follows:

    UPDATE People  
    SET name = 'Mary', occupation = 'Content Writer'  
    WHERE id = 105;  
--------------------------------------

UPDATE Statement to Replace String

We can also use the UPDATE statement in MySQL to change the string name in the particular column. The following example updates the domain parts of emails of Android course:

    UPDATE Trainer  
    SET email = REPLACE(email,'@gmail.com','@mkpits.com')  
    WHERE course_name = 'php';  