SELECT b.BOOK_ID, a.AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
from BOOK b 
inner join author a 
on b.author_id=a.author_id
where b.category="경제"
order by b.PUBLISHED_DATE asc;

