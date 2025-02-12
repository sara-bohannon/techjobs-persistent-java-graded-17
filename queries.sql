--Part 1
--id int, not null, primary key
--employer varchar(255), null
--name varchar(255), null
--skills varchar(255), null

--Part 2

SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;
--Part 4
SELECT skill.*
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY skill.name ASC;


