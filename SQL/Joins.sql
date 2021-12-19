Q.MySQL JOINS

MySQL JOINS are used with SELECT statement. It is used to retrieve data from multiple tables. It is performed whenever you need to fetch records from two or more tables.

There are three types of MySQL joins:

    MySQL INNER JOIN (or sometimes called simple join)
    MySQL LEFT OUTER JOIN (or sometimes called LEFT JOIN)
    MySQL RIGHT OUTER JOIN (or sometimes called RIGHT JOIN)
------------------------------------------------------------------------------------------
MySQL inner JOIN(Simple Join)
>=The MySQL INNER JOIN is to return all rows from multiple table where thoin condition is satisfied .it is the most common type of join.
  Syntax:
            SELECT coloumn 
             FROM table1
             INNER JOIN table2
              ON table1.column=table.coloumn
                OrderID 	CustomerID 	EmployeeID 	OrderDate 	ShipperID
                  10308 	2               	7 	1996-09-18 	3
                  10309 	37               	3 	1996-09-19 	1
                  10310 	77 	                8 	1996-09-20 	2

And a selection from the "Customers" table:
CustomerID 	CustomerName 	                       ContactName 	   Address 	                 City 	     PostalCode 	Country
1	       Alfreds Futterkiste 	                Maria Anders 	Obere Str. 57 	                 Berlin 	12209    	Germany
2 	      Ana Trujillo Emparedados y helados 	Ana Trujillo 	 Avda. de la Constitución 2222 	México D.F. 	05021 	         Mexico
3 	      Antonio Moreno Taquería 	                Antonio Moreno 	   Mataderos 2312 	        México D.F. 	05023    	Mexico	

>=SELECT Orders.OrderID, Customers.CustomerName
    FROM Orders
   INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID; 
>=SELECT Orders.OrderID, Customers.CustomerName, Shippers.ShipperName
   FROM ((Orders
   INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID)
   INNER JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID);
---------------------------------------------------------------------------------------------------------------------------
MySQL Left Outer Join
>=

    SELECT  officers.officer_name, officers.address, students.course_name  
    FROM officers  
    LEFT JOIN students  
    ON officers.officer_id = students.student_id;  
-----------------------------------------------------------------------------------
MySQL Right Outer Join
>=select students.student_id, students.student_name,students.course_name,marks.marks
from students right outer join marks
on students.student_id = marks.student_id


>=    SELECT officers.officer_name, officers.address, students.course_name, students.student_name  
    FROM officers  
    RIGHT JOIN students  
    ON officers.officer_id = students.student_id;  




