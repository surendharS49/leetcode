# Write your MySQL query statement below
select Visits.customer_id ,COUNT(Visits.visit_id) as count_no_trans from Visits 
left join Transactions using (visit_id) where  transactions.transaction_id is null group by 1;