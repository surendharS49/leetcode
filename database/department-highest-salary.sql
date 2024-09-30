# Write your MySQL query statement below
Select Department.name as department,
Employee.name as Employee 
,
Salary from Employee
join Department
on Department.id=Employee.departmentId
where Employee.Salary=(
    select max(salary) from Employee
     where Employee.departmentId = Department.id
);
