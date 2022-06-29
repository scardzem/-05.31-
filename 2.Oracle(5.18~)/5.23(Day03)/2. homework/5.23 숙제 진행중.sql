--26

<단일 행 함수를 이용하세요>
1) 교수들이 부임한 달에 근무한 일수는 몇 일인지 검색하세요
SELECT * FROM PROFESSOR;

   SELECT PNO,
          PNAME,
          HIREDATE,
          LAST_DAY(HIREDATE),
          LAST_DAY(HIREDATE)-HIREDATE AS RESULT
            FROM PROFESSOR C;
       

2) 교수들의 오늘까지 근무한 주가 몇 주인지 검색하세요
SELECT PNO,
       PNAME,
       HIREDATE,
       TRUNC(((SYSDATE - HIREDATE )/7) , 1) WWEEK
FROM PROFESSOR;

3) 1991년에서 1995년 사이에 부임한 교수를 검색하세요
SELECT PNO,
       PNAME,
       HIREDATE
       FROM PROFESSOR
       WHERE HIREDATE BETWEEN TO_DATE('19911231','YYYY/MM/DD') AND TO_DATE('19950101','YYYY,MM/DD');
       
4) 학생들의 4.5 환산 평점을 검색하세요(단 소수 이하 둘째자리까지)
SELECT * FROM STUDENT;
SELECT SNO,
       SNAME,
       TO_CHAR((ROUND(((AVR/4)*4.5),2)),99.99)
       FROM STUDENT
       ORDER BY SNAME;

5) 사원들의 오늘까지 근무 기간이 몇 년 몇 개월 며칠인지 검색하세요----------------------------모름
SELECT * FROM EMP;
SELECT ENO,
       ENAME,
       SYSDATE,
       HDATE,
       SYSDATE,
       TRUNC(SYSDATE-HDATE)
    FROM EMP;

SELECT AVR FROM STUDENT;
--28

1) 학생의 평균 평점을 다음 형식에 따라 소수점 이하 2자리까지 검색하세요
'OOO 학생의 평균 평점은 O.OO입니다.'
SELECT * FROM STUDENT;
SELECT SNAME || ' 학생의 평균 평점은 ' || TO_CHAR((TRUNC(AVR,2)),'0.99') || ' 입니다.'
FROM STUDENT;

2) 교수의 부임일을 다음 형식으로 표현하세요
'OOO 교수의 부임일은 YYYY년 MM월 DD일입니다.'
SELECT
PNAME || ' 교수의 부임일은 ' || TO_CHAR(HIREDATE,'""YYYY"년 "MM"월 "DD"일 입니다."')
FROM PROFESSOR;

3) 교수중에 3월에 부임한 교수의 명단을 검색하세요
SELECT PNO,
       PNAME,
       HIREDATE
    FROM PROFESSOR
    WHERE TO_CHAR(HIREDATE,'MM')='03';

--30
SELECT * FROM COURSE;
1) 각 학과별 학생 수를 검색하세요
SELECT MAJOR,
       COUNT(*)
    FROM STUDENT
    GROUP BY MAJOR, SYEAR;


2) 화학과와 생물학과 학생 4.5 환산 평점의 평균을 각각 검색하세요
SELECT MAJOR,
       TO_CHAR((TRUNC((AVG(AVR)),4)),99.9999)
    FROM (SELECT MAJOR,
           TRUNC((AVR/4*4.5),2) AS AVR
            FROM STUDENT
            WHERE MAJOR='화학' 
            OR MAJOR='생물')
    GROUP BY MAJOR;


3) 부임일이 10년 이상 된 직급별(정교수, 조교수, 부교수) 교수의 수를 검색하세요

--여기부터 시간초과(5.23)------------------------------------------------------------------------

SELECT ORDERS,
       COUNT(*)
    FROM PROFESSOR
    WHERE MONTHS_BETWEEN(SYSDATE,HIREDATE)>=120
    GROUP BY ORDERS;



    

4) 과목명에 화학이 포함된 과목의 학점수 총합을 검색하세요
SELECT SUM(ST_NUM)
    FROM COURSE
    WHERE CNAME LIKE '%화학%';
       
       

5) 과목명에 화학이 포함된 과목의 학점 총합을 검색하세요 --4번과 동일한 문제

SELECT SUM(ST_NUM)
    FROM COURSE
    WHERE CNAME LIKE '%화학%';


6) 학과별 기말고사 평균을 성적순으로 검색하세요
SELECT AVG(RESULT),
       MAJOR
    FROM (
            SELECT A.SNO,
                   A.RESULT,
                   B.MAJOR
                FROM SCORE A,
                     STUDENT B
                WHERE A.SNO=B.SNO
        )
    GROUP BY MAJOR;

SELECT AVG(A.RESULT), ---------------------------------------------함수앞이 아니라 컬럼명 앞에 A. 붙여줘야한다. 몰랐네
       B.MAJOR
    FROM SCORE A,
         STUDENT B
    WHERE A.SNO=B.SNO
    GROUP BY B.MAJOR;
    
      


7) 30번 부서의 업무별 연봉의 평균을 검색하세요(소수점 두자리까지 표시)
SELECT * FROM EMP ORDER BY DNO ASC;

SELECT JOB,
        ROUND(AVG(SAL),2)
    FROM EMP
    WHERE DNO=30
    GROUP BY JOB;



8) 물리학과 학생 중에 학년별로 성적이 가장 우수한 학생의 평점을 검색하세요

SELECT A.SYEAR,
       A.SNAME,
       B.MAJOR,
       B.AVR
    FROM STUDENT A,
         (
         SELECT SYEAR,
               MAX(AVR) AS AVR,
               MAJOR
            FROM STUDENT
            WHERE MAJOR='물리'
            GROUP BY (SYEAR,MAJOR)
         ) B
    WHERE A.AVR=B.AVR
    AND A.SYEAR=B.SYEAR
    AND A.MAJOR='물리';





--32
1) 화학과를 제외하고 학과별로 학생들의 평점 평균을 검색하세요
SELECT MAJOR,
       ROUND(AVG(AVR),2)
    FROM STUDENT
    WHERE MAJOR!='화학'
    GROUP BY MAJOR;
    
SELECT MAJOR
     , ROUND(AVG(AVR), 2)
    FROM STUDENT
    GROUP BY MAJOR
    HAVING MAJOR != '화학';

2) 화학과를 제외한 각 학과별 평균 평점 중에 평점이 2.0 이상인 정보를 검색하세요
SELECT MAJOR,
       ROUND(AVG(AVR),2) AS AVR
    FROM STUDENT
    WHERE MAJOR!='화학'
    GROUP BY MAJOR
    HAVING ROUND(AVG(AVR),2)>=2;
       

3) 기말고사 평균이 60점 이상인 학생의 정보를 검색하세요
SELECT A.SNO,
       A.SNAME,
       A.SYEAR,
       ROUND(B.RESULT,2)
    FROM STUDENT A,
         (SELECT SNO,
                 AVG(RESULT) AS RESULT
            FROM SCORE
            GROUP BY SNO
            HAVING AVG(RESULT)>=60) B
    WHERE A.SNO=B.SNO;
    



4) 강의 학점이 3학점 이상인 교수의 정보를 검색하세요


5) 기말고사 평균 성적이 핵 화학과목보다 우수한 과목의 과목명과 담당 교수명을 검색하세요


6) 근무 중인 직원이 4명 이상인 부서를 검색하세요


7) 업무별 평균 연봉이 3000 이상인 업무를 검색하세요


8) 각 학과의 학년별 인원중 인원이 5명 이상인 학년을 검색하세요