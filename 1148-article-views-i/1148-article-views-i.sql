# Write your MySQL query statement below
select author_id as id
from Views
where author_id like viewer_id
group by author_id
order by author_id
