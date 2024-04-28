/* Write your PL/SQL query statement below */
SELECT * FROM cinema WHERE MOD(id,2)=1 AND 
description <> 'boring' ORDER BY rating DESC;

