
Q3.In this example, we add two new columns "cus_address", and cus_salary in the existing table "cus_tbl".
 cus_address is added after cus_surname column and cus_salary is added after cus_age column.
-------------------------------------------------------------


alter table cus_tbl add cus_surname varchar(20),add cus_salary int

    ALTER TABLE cus_tbl  
    ADD cus_address varchar(100) NOT NULL  
    AFTER cus_surname

mysql alter table 3
-------------------------------------------
See the recently added columns:

    Select * from cus_tbl;  
------------------------------------------------------
mysql alter table 4
3) MODIFY column in the table

The MODIFY command is used to change the column definition of the table.

Syntax:

    alter table table_name  
    modify column_name column_definition  
    [ FIRST | AFTER column_name ];  


