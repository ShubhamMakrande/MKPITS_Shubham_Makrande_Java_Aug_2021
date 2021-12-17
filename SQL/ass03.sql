13 Nov
Q2.3 Write a query to display the columns in a specific order like order date, salesman id, order number and purchase amount from for all the orders

>=create table orders(order_no int not null AUTO_INCREMENT,purch_amt float,order_date int ,customer_id int,salesman_id int, primary key(order_no));
>=select order_no,purch_amt,order_date,customer_id ,salesman_id from orders
---------------------------------------------------------------------------------------------------------------------------------------------------------
Q3.4 From the following table, write a SQL query to find the unique salespeople ID. Return salesman_id.
orders
ord_no      purch_amt   ord_date    customer_id  salesman_id
----------  ----------  ----------  -----------  -----------
70001       150.5       2012-10-05  3005         5002
70009       270.65      2012-09-10  3001         5005
70002       65.26       2012-10-05  3002         5001
70004       110.5       2012-08-17  3009         5003
70007       948.5       2012-09-10  3005         5002
70005       2400.6      2012-07-27  3007         5001
70008       5760        2012-09-10  3002         5001



answer 
SELECT DISTINCT salesman_id
FROM orders;
------------------------------------------------
5 From the following table, write a SQL query to find the salespeople who lives in the City of 'Paris'. Return salesperson's name, city. 
salesperson
salesman_id |    name    |   city   | commission 
-------------+------------+----------+------------
        5001 | James Hoog | New York |       0.15
        5002 | Nail Knite | Paris    |       0.13
        5005 | Pit Alex   | London   |       0.11
        5006 | Mc Lyon    | Paris    |       0.14
        5007 | Paul Adam  | Rome     |       0.13
        5003 | Lauson Hen | San Jose |       0.12

answer
SELECT name,city
FROM salesman
WHERE city='Paris';
----------------------------------------------------------------------------
12 From the following table, write a SQL query to find the Nobel Prize winners in 'Chemistry' between the years 1965 to 1975. Begin and end values are included. Return year, subject, winner, and country
YEAR SUBJECT                   WINNER                                        COUNTRY                CATEGORY
---- ------------------------- --------------------------------------------- ------------------------- ------------
1970 Physics                   Hannes Alfven                                 Sweden                 Scientist
1970 Physics                   Louis Neel                                    France                 Scientist
1970 Chemistry                 Luis Federico Leloir                          France                 Scientist
1970 Physiology                Ulf von Euler                                 Sweden                 Scientist
1970 Physiology                Bernard Katz                                  Germany                Scientist
1970 Literature                Aleksandr Solzhenitsyn                        Russia                 Linguist
1970 Economics                 Paul Samuelson                                USA                    Economist
1970 Physiology                Julius Axelrod                                USA                    Scientist
1971 Physics                   Dennis Gabor                                  Hungary                Scientist
1971 Chemistry                 Gerhard Herzberg                              Germany                Scientist
1971 Peace                     Willy Brandt                                  Germany                Chancellor
1971 Literature                Pablo Neruda                                  Chile                  Linguist
1971 Economics                 Simon Kuznets                                 Russia                 Economist
1978 Peace                     Anwar al-Sadat                                Egypt                  President
1978 Peace                     Menachem Begin                                Israel                 Prime Minister
1987 Chemistry                 Donald J. Cram                                USA                    Scientist
1987 Chemistry                 Jean-Marie Lehn                               France                 Scientist
1987 Physiology                Susumu Tonegawa                               Japan                  Scientist
1994 Economics                 Reinhard Selten                               Germany                Economist
1994 Peace                     Yitzhak Rabin                                 Israel                 Prime Minister
1987 Physics                   Johannes Georg Bednorz                        Germany                Scientist
1987 Literature                Joseph Brodsky                                Russia                 Linguist
1987 Economics                 Robert Solow                                  USA                    Economist
1994 Literature                Kenzaburo Oe                                  Japan                  Linguist

answer
SELECT year, subject, winner, country
  FROM nobel_win
 WHERE subject = 'Chemistry'
   AND year>=1965 AND year<=1975;

--------------------------------------------------------------------------------------------
13 Write a SQL query to show all details of the Prime Ministerial winners after 1972 of Menachem Begin and Yitzhak Rabin.
answer
SELECT * FROM nobel_win
 WHERE year >1972
  AND winner IN ('Menachem Begin',
                  'Yitzhak Rabin');

----------------------------------------------------------------------------

14 From the following table, write a SQL query to find the details of the winners whose first name matches with the string 'Louis'. Return year, subject, winner, country, and category.    
answer 
SELECT *
 FROM nobel_win 
   WHERE winner LIKE 'Louis %';
