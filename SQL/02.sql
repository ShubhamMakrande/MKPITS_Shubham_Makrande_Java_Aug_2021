Q2.In this example, we add a new column "cus_age" in the existing table "cus_tbl".
--------------------------------------------------------
create table cus_tbl(custid int,custname varchar(20))
Use the following query to do this:
------------------------------------------
    ALTER TABLE cus_tbl  
    ADD cus_age varchar(40) NOT NULL;  
------------------------------------------
2) Add multiple columns in the table

Syntax:

     alter table table_name  
     add new_column_name column_definition  
     [ FIRST | AFTER column_name ],  
    ADD new_column_name column_definition  
    [ FIRST | AFTER column_name ],  
---------------------------------------