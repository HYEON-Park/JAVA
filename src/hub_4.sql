SELECT  NAME, 
    CASE WHEN ABSENT >= 4  THEN 'F등급' 
	     WHEN SCORE >= 90 THEN 'A등급'
         WHEN SCORE >= 80 AND SCORE < 90  THEN 'B등급'
         WHEN SCORE >= 70 AND SCORE < 80  THEN 'C등급'
         WHEN SCORE >= 60 AND SCORE < 70  THEN 'D등급'
         
            ELSE 'F등급'
    END AS '등급'
FROM   TEST