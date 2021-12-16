
The following are the syntax that illustrates how to use the DELETE statement:

    DELETE FROM table_name WHERE condition;  
---------------------------------------------------------
If we want to delete an employee whose emp_id is 107, we should use the DELETE statement with the WHERE clause. See the below query:

  DELETE FROM Employees WHERE emp_id=107;  
----------------------------------------------------------------
In the above output, we can see that after removing all rows, the Employees table will be empty. It means no records available in the selected table.
MySQL DELETE and LIMIT Clause

    DELETE FROM table_name  
    WHERE condition   
    ORDER BY colm1, colm2, ...  
    LIMIT row_count;  
-----------------------------------------------------
For example, the following query first sorts the employees according to their names alphabetically and deletes the first three employees from the table:

   DELETE FROM Employees ORDER BY name LIMIT 3;  

