# Write your MySQL query statement below
select
W2.ID
from
Weather w1
inner join
Weather w2
    on w1.recordDate = DATE_ADD(w2.recordDate , interval -1 day)
    and w2.Temperature > w1 .Temperature ;
    