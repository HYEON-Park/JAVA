SELECT title, view_count, post_date
FROM BUSU
WHERE (notice_dept, post_date) 
	IN (
		SELECT notice_dept, MAX(post_date)
		FROM BUSU
		GROUP BY notice_dept 
		);



-- 문제 9
- - postgreSQL 에서의 배열 연산자 

- - array_remove 사용해서 배열에서 값을 제거할 수 있음.

SELECT array_remove(participant, completion) AS return

FROM DINO;

