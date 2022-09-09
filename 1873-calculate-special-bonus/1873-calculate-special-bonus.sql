# Write your MySQL query statement below
Select employee_id,Case when employee_id % 2 !=0 && name Not like 'M%' Then salary
Else 0 End As bonus
from Employees
Order by employee_id