Q4. In the Example ,we modify the coloumn cus_surname to be a data type of vaechae(50) and force the column to allow Null values
------------------------------------------------------------------
Use h following query to this do this.

Alter Table cus_tbl
modify cus_surname varchar(50)null,
---------------------------------------------
Drop column in table 

Syntax:
alter table table_name
drop column cloumn_namel
------------------------------------
Let's take an example to drop the column name"cus_address"from the table"cus_tbl".

alter table cus_tbl
Drop COLUMN cus_address;
-----------------------------------------
5) RENAME column in table
ALter Table table_name 
CHANGE COLUMN old_name new_name
column_defination
[FIRST| AFTER column_name] 
-----------------------------------------------------
In this Example,we will change the column name"cus_surname"to "cus_title"

Use the follwing query to do this;

ALTER TABLE cus_tbl
CHANGE COLUMN cus_surname cus_title
varchar(20) NOT NULL;
------------------------------
6)RENMAE table
Syntax:
            ALTER TABLE table_name
            RENAME TO new_table_name;
Example:
               In this Exmaple the table name cus_tbl is renamed as cus_table.
                ALTER TABLE cus_tbl
                 RENAME TO cus_table;
--------------------------------------------------------------
7) DROP Table 
     DROP TABLE table_name;
  EXMAPLE;
                  DROP TABLE cus_table;

