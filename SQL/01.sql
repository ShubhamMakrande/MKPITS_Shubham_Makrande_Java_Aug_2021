Q1.create a table name "employee_table" in the database "employeedb" using the following statement:
---------------------------------------------------------------
create table employee(id int,name varchar(20))
insert into employee(id) values(12)
--------------------------------------------
create table emp1 (id int ,name varchar(20) not null)
insert into emp1 (id) values(13) 
-------------------------------------
auto_increment (this will automatically increment the value)
create table emp3(id int not null auto_increment,name varchar(20),primary key(id))
insert into emp3 (name ) values('amit')
insert into emp3 (name ) values('amitabh')
insert into emp3  values(2,'amit') (error will come here because of duplicate id)
---------------------------------------------------------------------------
create table employee_table(  
        id int not null auto_increment,  
        name varchar(45) not null,  
        occupation varchar(35) not null,  
        age int not null,  
        primary key (id)  

