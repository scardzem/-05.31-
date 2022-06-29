SELECT SNAME || '학생의 학점은 ' || AVR || '입니다.'
    FROM STUDENT;
    
--숫자나 특수문자, 빈 칸이 포함된 별칭을 붙일 때 ""사용
SELECT SAL * 1.1 AS "10% 인상된 급여"
    FROM EMP;
    
--INNER JOIN
--EMP들의 사원의 사원번호, 사원이름, 부서번호, 부서명, 지역 출력
SELECT A.ENO, 
       A.ENAME,
       A.DNO,
       B.DNAME,
       B.LOC
    FROM EMP A
    INNER JOIN DEPT B
            ON A.DNO = B.DNO;
            
--명확하지 컬럼 오류
--공통된 컬럼을 조회할 때는 어느 테이블의 데이터를 사용할 것인지 명시
SELECT ENO, 
       ENAME,
       DNO,
       DNAME,
       LOC
    FROM EMP A
    INNER JOIN DEPT B
            ON A.DNO = B.DNO;

--INNER JOIN 두 번째 방식
--EMP들의 사원의 사원번호, 사원이름, 부서번호, 부서명, 지역 출력
SELECT A.ENO AS ENO,
       A.ENAME AS ENAME,
       A.DNO AS DNO,
       B.DNAME AS DNAME,
       B.LOC AS LOC
    FROM EMP A,
         DEPT B
    WHERE A.DNO = B.DNO;

--각 과목에 할당된 과목번호, 과목명, 교수번호, 교수이름 출력(course, professor 테이블 사용)
SELECT A.CNO,
       A.CNAME,
       A.PNO,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO;
    
SELECT A.CNO,
       A.CNAME,
       A.PNO,
       B.PNAME
    FROM COURSE A
    JOIN PROFESSOR B
      ON A.PNO = B.PNO;
      
--광주에서 근무하는 사원의 사원번호, 사원이름, 부서번호, 부서이름, 위치 출력
SELECT A.ENO
     , A.ENAME
     , A.DNO
     , B.DNAME
     , B.LOC
     FROM EMP A
        , DEPT B
    WHERE A.DNO = B.DNO
       AND B.LOC = '광주';
       
SELECT A.ENO
     , A.ENAME
     , A.DNO
     , B.DNAME
     , B.LOC
    FROM EMP A
    JOIN DEPT B
      ON A.DNO = B.DNO
     AND B.LOC = '광주';
     
--비등가조인
--사원의 10%인상급여의 등급 출력(사원번호, 사원이름, 인상된 급여, 급여등급) : emp, salgrade 테이블 사용
SELECT A.ENO
     , A.ENAME
     , A.SAL * 1.1 AS SAL
     , B.GRADE
     FROM EMP A,
          SALGRADE B
    WHERE A.SAL * 1.1 BETWEEN B.LOSAL AND B.HISAL;
    
SELECT A.ENO
     , A.ENAME
     , A.SAL * 1.1 AS SAL
     , B.GRADE
     FROM EMP A,
          SALGRADE B
    WHERE A.SAL * 1.1 >= B.LOSAL 
      AND A.SAL * 1.1 <= B.HISAL;
      
SELECT A.ENO
     , A.ENAME
     , A.SAL * 1.1 AS SAL
     , B.GRADE
     FROM EMP A
     JOIN SALGRADE B
       ON A.SAL * 1.1 BETWEEN B.LOSAL AND B.HISAL;

--CROSS JOIN
--JOIN을 할 때는 JOIN조건을 명시해야됨
SELECT A.ENO
     , A.ENAME
     , A.DNO
     , B.DNAME
    FROM EMP A
       , DEPT B;
       
--EMP테이블에서 사원번호, 사원이름, 사수번호, 사수이름 출력(셀프조인 사용)
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
       , EMP B
    WHERE A.MGR = B.ENO;
    
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
    JOIN EMP B
      ON A.MGR = B.ENO;
      
--OUTER JOIN
--사수가 존재하지 않는 사원도 포함해서 사원번호, 사원이름, 사수번호, 사수이름 표출
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
       , EMP B
    WHERE A.MGR = B.ENO(+);
    
SELECT A.ENO
     , A.ENAME
     , A.MGR
     , B.ENO
     , B.ENAME
    FROM EMP A
    LEFT OUTER JOIN EMP B
      ON A.MGR = B.ENO;
--EMP A
--ENO   ENAME    MGR 
--0001  안영희    null
--9999  고기천    null
--1003  양선호    0201
--EMP B
--ENO   ENAME
--0001  안영희
--9999  고기천
--1003  양선호
--A와 B 교집합
--A.MGR과 B.ENO이 같은 값
--A와 B 차집합
--A.MGR과 B.ENO이 같지 않은 값
SELECT * FROM EMP;

--B와 A 차집합
--B.ENO = 0001
--A.MGR 비교
--김연아의 데이터
--0301 김연아
--B.ENO = 0201
--0301 김연아
--B.ENO = 0202
--0301 김연아

--소속부서원이 없는 부서 포함하여 부서번호, 부서이름, 사원이름 표출
SELECT A.DNO
     , A.DNAME
     , B.ENAME
     , B.ENO
    FROM DEPT A
       , EMP B
    WHERE A.DNO(+) = B.DNO;
    
INSERT INTO EMP (
    ENO,
    ENAME,
    DNO
) VALUES (
    '9998',
    '고기천',
    '60'
);

--담당교수가 없는 과목을 포함하여 과목번호, 과목이름, 교수번호, 교수이름 출력
SELECT A.CNO
     , A.CNAME
     , A.PNO
     , B.PNAME
    FROM COURSE A
        , PROFESSOR B
    WHERE A.PNO = B.PNO(+);
    
SELECT A.CNO
     , A.CNAME
     , A.PNO
     , B.PNAME
    FROM COURSE A
    LEFT OUTER JOIN PROFESSOR B
                 ON A.PNO = B.PNO;
                 
--단일 행 서브쿼리
SELECT SAL 
    FROM EMP
    WHERE ENAME = '손하늘';

--손하늘의 급여보다 높은 급여를 받는 사원 조회
SELECT A.ENO
     , A.ENAME
     , A.SAL
     FROM EMP A
     WHERE A.SAL >= (SELECT SAL 
                        FROM EMP
                        WHERE ENAME = '손하늘');

--송강 교수보다 고용일이 더 빠른 교수번호, 교수이름, 고용일 조회
SELECT A.PNO
     , A.PNAME
     , A.HIREDATE
    FROM PROFESSOR A
    WHERE A.HIREDATE < (SELECT B.HIREDATE
                           FROM PROFESSOR B
                           WHERE PNAME = '송강');
                           
SELECT A.PNO
     , A.PNAME
     , A.HIREDATE
    FROM PROFESSOR A
       , (SELECT HIREDATE
            FROM PROFESSOR
            WHERE PNAME = '송강') B
    WHERE A.HIREDATE < B.HIREDATE;
    
--다중 행 서브쿼리
SELECT AVR
    FROM STUDENT
    WHERE SNAME = '노육';
    
--노육학생과 학점이 같은 학생의 학번, 학생이름, 학점 조회(IN연산자 사용)
SELECT A.SNO
     , A.SNAME
     , A.AVR
    FROM STUDENT A
    WHERE A.AVR IN (SELECT B.AVR
                      FROM STUDENT B
                      WHERE B.SNAME = '노육');
                      
SELECT A.SNO
     , A.SNAME
     , A.AVR
    FROM STUDENT A
       , (SELECT AVR
            FROM STUDENT 
            WHERE SNAME = '노육') B
    WHERE A.AVR IN B.AVR;

--다중 열 서브쿼리
--기말고사 성적이 95점 이상인 학번, 과목번호, 과목명, 기말고사성적 조회 서브쿼리
SELECT C.SNO
     , C.CNO
     , D.CNAME
     , C.RESULT
    FROM SCORE C
       , COURSE D
    WHERE C.CNO = D.CNO
       AND C.RESULT >= 95;

--기말고사 성적이 95점 이상인 학생의 학번, 학생이름, 과목번호, 과목명, 성적 조회
SELECT A.SNO
     , A.SNAME
     , B.CNO
     , B.CNAME
     , B.RESULT
    FROM STUDENT A
       , (
            SELECT C.SNO
             , C.CNO
             , D.CNAME
             , C.RESULT
            FROM SCORE C
               , COURSE D
            WHERE C.CNO = D.CNO
               AND C.RESULT >= 95
         ) B
    WHERE A.SNO = B.SNO
    ORDER BY SNO, CNO;

SELECT A.SNO
     , A.SNAME
     , B.CNO
     , B.CNAME
     , C.RESULT
    FROM STUDENT A
       , COURSE B
       , SCORE C
    WHERE A.SNO = C.SNO
      AND B.CNO = C.CNO
      AND C.RESULT >= 95
      ORDER BY SNO, CNO ;
      
--집합연산자
--UNION ALL을 이용하여 1999/12/31 이후에 고용된 교수번호, 교수이름, 고용일자, 사원번호, 사원이름, 고용일자 출력
SELECT PNO AS 사원번호
     , PNAME AS 사원이름
     , HIREDATE AS 고용일자
    FROM PROFESSOR
    WHERE HIREDATE > '1999/12/31'
UNION ALL
SELECT ENO
     , ENAME
     , HDATE
    FROM EMP
    WHERE HDATE > '1999/12/31';

--MINUS연산자
--사원중에 제갈씨면서 지원업무를 하지 않는 사원의 사원번호, 사원이름, 업무 조회
SELECT ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE ENAME LIKE '제갈%'
MINUS
SELECT ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE JOB = '지원';

SELECT ENO
     , ENAME
     , JOB
    FROM EMP
    WHERE ENAME LIKE '제갈%'
      AND JOB != '지원';
      
--INTERSECT 연산자
--INTERSECT 연산자를 이용해서 물리, 화학과인 학생중 학점이 3.0이상인 학번, 학생이름, 학과이름, 학점 조회
SELECT SNO
     , SNAME
     , MAJOR
     , AVR
    FROM STUDENT
    WHERE MAJOR IN ('물리', '화학')
INTERSECT
SELECT SNO
     , SNAME
     , MAJOR
     , AVR
    FROM STUDENT
    WHERE AVR >= 3.0;
    
SELECT SNO
     , SNAME
     , MAJOR
     , AVR
    FROM STUDENT
    WHERE MAJOR IN ('물리', '화학')
      AND AVR >= 3.0;