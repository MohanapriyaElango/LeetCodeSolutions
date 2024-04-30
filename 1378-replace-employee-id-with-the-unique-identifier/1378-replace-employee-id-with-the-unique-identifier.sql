/* Write your PL/SQL query statement below */
SELECT u.unique_id as unique_id, e.name as name
FROM Employees e 
LEFT JOIN EmployeeUNI u
ON e.id=u.id;