# Write your MySQL query statement below
SELECT firstName ,lastName,City,State
FROM Person LEFT JOIN Address ON Person.personId = Address.PersonId
