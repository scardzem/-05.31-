--42
--1) 어제 만든 PAYMENT 테이블의 PDATE 컬럼에 INDEX를 추가하세요.
CREATE INDEX PAYMENT_PDATE_IDX
ON PAYMENT(PDATE);
COMMIT;

2) 어제 만든 PAYMENT_DETAIL 테이블의 AMOUNT, PRICE 컬럼에 INDEX를 추가하세요.
SELECT * FROM PAYMENT_DETAIL;

CREATE INDEX PAYMENT_DETAIL_AMOUNT_IDX
ON PAYMENT_DETAIL(AMOUNT);

CREATE INDEX PAYMENT_DETAIL_PRICE_IDX
ON PAYMENT_DETAIL(PRICE);
COMMIT;

--44
1) 학생의 학점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW ST_NAVR(
    SNO,
    SNAME,
    AVR
) AS (
        SELECT SNO,
               SNAME,
               ROUND((AVR/4*4.5),1) AS AVR
            FROM STUDENT
);

SELECT * FROM ST_NAVR;

COMMIT;

2) 각 과목별 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW COURSE_AVG(
    CNAME,
    CAVR
) AS (
        SELECT A.CNAME,
               AVG(RESULT)
            FROM COURSE A,
                 SCORE B
            WHERE A.CNO=B.CNO
            GROUP BY CNAME
);
SELECT * FROM COURSE_AVG;
COMMIT;
       



3) 각 사원과 관리자의 이름을 검색할 수 있는 뷰를 생성하세요.
SELECT * FROM EMP;
CREATE OR REPLACE VIEW MGR_NAMEVW(
    ENO,
    ENAME,
    MGR,
    MGRNAME
) AS (
        SELECT A.ENO,
               A.ENAME,
               A.MGR,
               B.ENAME AS MGRNAME
            FROM EMP A,
                 EMP B
            WHERE A.MGR=B.ENO(+)
);
SELECT * FROM MGR_NAMEVW;



4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
SELECT * FROM SCGRADE;
SELECT * FROM SCORE;
SELECT * FROM STUDENT;    

CREATE OR REPLACE VIEW C_ST_GRADE(
    CNAME,
    SNO,
    SNAME,
    RESULT,
    GRADE
) AS (
        SELECT A.SNO,
               A.SNAME,
               B.RESULT,
               C.GRADE,
               D.CNAME
            FROM STUDENT A,
                 SCORE B,
                 SCGRADE C,
                 COURSE D
            WHERE A.SNO=B.SNO
            AND B.RESULT BETWEEN C.LOSCORE AND C.HISCORE
           AND B.CNO=D.CNO
);
COMMIT;
SELECT * FROM C_ST_GRADE;


5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW C_P_ST_NAME(
    SECTION,
    CNAME,
    PNAME,
    SNAME,
    SNO
) AS (
        SELECT 
           B.SECTION,
           A.CNAME,
           B.PNAME,
           C.SNAME,
           C.SNO
        FROM COURSE A,
             PROFESSOR B,
             STUDENT C
        WHERE A.PNO=B.PNO
        AND   B.SECTION=C.MAJOR
        AND B.SECTION='물리'
);

SELECT * FROM C_P_ST_NAME;
COMMIT;       


--46
1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.


2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.


3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.(학과, 학년, 평균점수 검색)


4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.(교수이름, 과목명, 평균점수 검색)


5) 교수별로 현재 수강중인 학생의 수를 검색하세요.


--48
<NATURAL JOIN과 USING 구문을 이용한 쿼리를 두 개 생성하세요.>
1) 송강 교수가 강의하는 과목을 검색하세요.


2) 학점이 2학점인 과목과 이를 강의하는 교수를 검색하세요.


3) 화학과 1학년 학생의 기말고사 성적을 검색하세요.


4) 일반화학 과목의 기말고사 점수를 검색하세요.

--50
1) 다음과 같이 다음 년도 인상 급여를 검색하세요. (CASE, DECODE 구문 두 가지로 모두 표현)
     급여          인상폭
   1000 이하   ->   15%
   1001~2000   ->   10%
   2001~3000   ->   5%
   3001~4000   ->   2%
   4000 초과   ->   동결


2) 학생들의 평균 학점을 검색하되 성이 제갈인 학생의 평균 학점은 4.5점으로 환산하여 검색하세요.(DECODE 구문 이용)