# Write your MySQL query statement below
select Product.product_name,
Sales.year, 
Sales.price from Product join sales on Product.Product_id=Sales.Product_id;