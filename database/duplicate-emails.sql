# Write your MySQL query statement belowse
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email)>1