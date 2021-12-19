Like:

>=Here are some examples showing different LIKE operators with '%' and '_' wildcards:
LIKE Operator 	Description
WHERE CustomerName LIKE 'a%' 	Finds any values that start with "a"
WHERE CustomerName LIKE '%a' 	Finds any values that end with "a"
WHERE CustomerName LIKE '%or%' 	Finds any values that have "or" in any position
WHERE CustomerName LIKE '_r%' 	Finds any values that have "r" in the second position
WHERE CustomerName LIKE 'a_%' 	Finds any values that start with "a" and are at least 2 characters in length
WHERE CustomerName LIKE 'a__%' 	Finds any values that start with "a" and are at least 3 characters in length
WHERE ContactName LIKE 'a%o' 	Finds any values that start with "a" and ends with "o"
--------------------------------------------------------------------------------------------------------
Q.The following SQL statement selects all customers with a CustomerName starting with "a":
>=  SELECT * FROM Customers
   WHERE CustomerName LIKE 'a%'; 
---------------------------------------------------------------------------------------------
Q.e following SQL statement selects all customers with a CustomerName ending with "a":
>= SELECT * FROM Customers
   WHERE CustomerName LIKE '%a'; 
------------------------------------------------------------------------------------------
Q.Select all records where the value of the City column starts with the letter "a".
>=select * from Customers where City like 'a%';
-----------------------------------------------------------------------------------------
QSelect all records where the value of the City column ends with the letter "a".
>= select *from Customers where CustomerName like '%a';
---------------------------------------------------------------------------
Qwrite a sql query to show records whose name starts with m and occupation ends with er
>=select * from people where name like 'm%' and occupation like '%er'
-----------------------------------------------------------------------------------------
Q.write a sql query to show records whose name starts with m or occupation ends with er
>=select * from people where name like 'm%' or occupation like '%er'


