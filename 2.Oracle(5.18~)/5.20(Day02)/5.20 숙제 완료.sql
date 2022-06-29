---16
1) 송강 교수가 강의하는 과목을 검색한다
SELECT PNAME,
       SECTION
    FROM PROFESSOR
    WHERE PNAME = '송강';

2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT A.CNAME,
       A.PNO,
       B.PNAME
    FROM (SELECT CNAME,
                 PNO
            FROM COURSE
            WHERE CNAME LIKE '%화학') A,
                 PROFESSOR B
    WHERE A.PNO = B.PNO;

       
       


3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT A.PNAME,
       B.ST_NUM
    FROM PROFESSOR A,
         (SELECT ST_NUM,
                 PNO
            FROM COURSE
            WHERE ST_NUM = 2) B
    WHERE A.PNO(+)=B.PNO;
       

4) 화학과 교수가 강의하는 과목을 검색한다
SELECT A.SECTION,
       A.PNO,
       B.CNAME
    FROM PROFESSOR A,
         (SELECT PNO,
                 CNAME
                FROM COURSE) B
     WHERE A.PNO = B.PNO(+)
     AND SECTION = '화학';

5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT * FROM SCORE;
SELECT * FROM COURSE;
SELECT * FROM STUDENT;

SELECT A.RESULT,
       B.SNO,
       B.SYEAR,
       B.SNAME,
       B.MAJOR
    FROM SCORE A,
         (SELECT SNO,
                 SNAME,
                 SYEAR,
                 MAJOR
            FROM STUDENT) B
    WHERE A.SNO = B.SNO
    AND SYEAR = 1
    AND MAJOR = '화학';

6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT * FROM COURSE;
SELECT * FROM SCORE;
FROM 
SELECT A.CNO,
       A.CNAME,
       B.RESULT,
       C.SNO,
       C.SNAME,
       C.SYEAR
    FROM COURSE A,
         SCORE B,
         STUDENT C
    WHERE A.CNO = B.CNO
    AND B.SNO=C.SNO
    AND CNAME = '일반화학'
    ORDER BY SNO ASC;
        

7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT * FROM STUDENT;

SELECT A.SNO,
       A.SNAME,
       A.SYEAR,
       A.MAJOR,
       B.RESULT,
       C.CNAME
    FROM STUDENT A,
         SCORE B,
         COURSE C
    WHERE A.SNO = B.SNO
    AND C.CNO = B.CNO
    AND SYEAR =1
    AND MAJOR = '화학'
    AND CNAME = '일반화학';

8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT A.SNO,
       A.SNAME,
       A.SYEAR,
       A.MAJOR,
       C.CNAME
    FROM STUDENT A,
         SCORE B,
         COURSE C
    WHERE A.SNO = B.SNO
    AND   B.CNO = C.CNO
    AND   SYEAR = 1
    AND   MAJOR = '화학'
    ORDER BY SNAME ASC;
SELECT * FROM SCGRADE;
9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT A.SNO,
       A.SNAME,
       A.AVR,
       C.CNAME,
       D.GRADE,
       D.HISCORE,
       D.LOSCORE
    FROM STUDENT A,
         SCORE B,
         COURSE C,
         SCGRADE D
    WHERE A.SNO = B.SNO
    AND B.CNO = C.CNO
    AND GRADE='F'
    AND CNAME='유기화학';

---18
1) 학생중에 동명이인을 검색한다
SELECT A.SNO,
       B.SNAME
FROM STUDENT A,
     STUDENT B
WHERE A.SNAME=B.SNAME
AND A.SNO!=B.SNO
ORDER BY SNAME ASC;

2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다


SELECT A.PNO,
       A.PNAME,
       A.SECTION,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO = B.PNO(+)
    ORDER BY SECTION ASC;


3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT A.CNO,
       A.CNAME,
       A.ST_NUM,
       A.PNO,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    ORDER BY ST_NUM ASC;
    

---20
1) 송강 교수가 강의하는 과목을 검색한다
SELECT A.CNO,
       A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO
    AND PNAME='송강';

2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND CNAME LIKE '%화학%';



3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT A.CNAME,
       A.ST_NUM,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND ST_NUM=2;

4) 화학과 교수가 강의하는 과목을 검색한다
SELECT A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND SECTION = '화학';



5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT A.SNO,
       A.SNAME,
       A.MAJOR,
       A.SYEAR,
       B.RESULT,
       C.CNAME
    FROM STUDENT A,
         SCORE B,
         COURSE C
    WHERE A.SNO = B.SNO(+)
    AND B.CNO = C.CNO
    AND SYEAR = 1
    AND MAJOR = '화학'
    ORDER BY SNAME ASC, CNAME ASC;
    
6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT A.CNO,
       A.CNAME,
       C.SNO,
       C.SNAME,
       B.RESULT
    FROM COURSE A,
         SCORE B,
         STUDENT C
    WHERE A.CNO = B.CNO(+)
    AND B.SNO(+) = C.SNO
    AND CNAME = '일반화학';

7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT A.SNO,
       A.SNAME,
       A.MAJOR,
       A.SYEAR,
       C.CNAME,
       B.RESULT
    FROM STUDENT A,
         SCORE B,
         COURSE C
    WHERE A.SNO = B.SNO
    AND B.CNO = C.CNO
    AND SYEAR = 1
    AND MAJOR = '화학'
    AND CNAME = '일반화학';

8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT A.SNO,
       A.SNAME,
       A.SYEAR,
       A.MAJOR,
       C.CNAME
    FROM STUDENT A,
         SCORE B,
         COURSE C
    WHERE A.SNO = B.SNO(+)
    AND   B.CNO = C.CNO(+)
    AND MAJOR = '화학'
    AND SYEAR = 1
    ORDER BY SNAME ASC, CNAME ASC;



---22
1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT A.CNO,
       A.CNAME,
       B.PNO,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+);

2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT A.CNO,
       A.CNAME,
       C.MAJOR,
       B.SNO,
       C.SNAME,
       B.RESULT
    FROM COURSE A,
         STUDENT C,
         SCORE B
    WHERE A.CNO = B.CNO
    AND B.SNO(+) = C.SNO
    AND MAJOR = '화학'
    AND SYEAR = 1
    ORDER BY SNAME ASC;
    

3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT B.SNO,
       B.SNAME,
       A.CNAME,
       C.RESULT
    FROM COURSE A,
         STUDENT B,
         SCORE C
    WHERE A.CNO(+) = C.CNO
    AND B.SNO = C.SNO(+)
    AND CNAME = '유기화학'
    ORDER BY SNAME ASC;

4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT DISTINCT PNAME
       FROM (SELECT A.SNO,
       A.SNAME,
       A.SYEAR,
       A.MAJOR,
       B.CNAME,
       C.PNO,
       C.PNAME
    FROM STUDENT A,
         COURSE B,
         PROFESSOR C,
         SCORE D
    WHERE A.SNO = D.SNO
    AND D.CNO = B.CNO
    AND C.PNO = B.PNO
    AND MAJOR = '화학');

    

5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT A.PNO,
       A.PNAME,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO=B.PNO(+);


6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
    
SELECT A.PNO,
       A.PNAME,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO = B.PNO(+)
UNION 
SELECT A.PNO,
       A.PNAME,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO(+) = B.PNO;
