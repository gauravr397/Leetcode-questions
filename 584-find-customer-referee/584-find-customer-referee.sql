# Write your MySQL query statement below
Select name 
from Customer
where ifnull(referee_id,1) != 2;