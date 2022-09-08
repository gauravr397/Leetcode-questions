# Write your MySQL query statement below
Select name As Customers
from Customers
where id NOT IN(Select customerId from Orders); 