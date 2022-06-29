--42
--1) ���� ���� PAYMENT ���̺��� PDATE �÷��� INDEX�� �߰��ϼ���.
CREATE INDEX PAYMENT_PDATE_IDX
ON PAYMENT(PDATE);
COMMIT;

2) ���� ���� PAYMENT_DETAIL ���̺��� AMOUNT, PRICE �÷��� INDEX�� �߰��ϼ���.
SELECT * FROM PAYMENT_DETAIL;

CREATE INDEX PAYMENT_DETAIL_AMOUNT_IDX
ON PAYMENT_DETAIL(AMOUNT);

CREATE INDEX PAYMENT_DETAIL_PRICE_IDX
ON PAYMENT_DETAIL(PRICE);
COMMIT;

--44
1) �л��� ���� 4.5 �������� ȯ��� ������ �˻��� �� �ִ� �並 �����ϼ���.
CREATE OR REPLACE VIEW ST_NAVR(
    SNO,
    SNAME,
    MAJOR,
    AVR
) AS (
        SELECT SNO,
               SNAME,
               MAJOR,
               ROUND((AVR/4*4.5),1) AS AVR
            FROM STUDENT
);

SELECT * FROM ST_NAVR;

COMMIT;

2) �� ���� ��� ������ �˻��� �� �ִ� �並 �����ϼ���.
CREATE OR REPLACE VIEW COURSE_AVG(
    CNAME,
    CAVR
) AS (
        SELECT A.CNAME,
               ROUND((AVG(RESULT)),2)
            FROM COURSE A,
                 SCORE B
            WHERE A.CNO=B.CNO
            GROUP BY CNAME
);
SELECT * FROM COURSE_AVG;
COMMIT;
       



3) �� ����� �������� �̸��� �˻��� �� �ִ� �並 �����ϼ���.
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



4) �� ���� �⸻��� �� ���(A~F)������ �ش� �л� ������ �˻��� �� �ִ� �並 �����ϼ���.
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
        SELECT D.CNAME,
               A.SNO,
               A.SNAME,
               B.RESULT,
               C.GRADE

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


5) �����а� ������ ������ �����ϴ� �л��� ����� �˻��� �並 �����ϼ���.
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
        AND   B.SECTION='����'
);

SELECT * FROM C_P_ST_NAME;
COMMIT;       


--46
1) 4.5 ȯ�� ������ ���� ���� 3���� �л��� �˻��ϼ���.

SELECT ROWNUM
       SNO,
       SNAME,
       AVR
    FROM (
            SELECT SNO,
                   SNAME,
                   AVR/4*4.5 AS AVR 
                FROM STUDENT 
                ORDER BY AVR DESC, 
                         SNAME ASC
    )
    WHERE ROWNUM<=3;

SELECT * FROM COURSE;

2) �⸻��� ���� ����� ���� 3������ �˻��ϼ���.

SELECT ROWNUM,
       CNO,
       RESULT
    FROM (
           SELECT CNO,
                  AVG(RESULT) AS RESULT
                FROM SCORE
                GROUP BY CNO
                ORDER BY RESULT DESC
        ) 
    WHERE ROWNUM<=3;
    
    


3) �а���, �г⺰, �⸻��� ����� ���� 3������ �˻��ϼ���.(�а�, �г�, ������� �˻�)
SELECT ROWNUM,
       MAJOR,
       SYEAR,
       RESULT
    FROM (SELECT MAJOR,
                 SYEAR,
                 AVG(RESULT) AS RESULT
            FROM STUDENT A,
                 SCORE B
            WHERE A.SNO=B.SNO
            GROUP BY (MAJOR, SYEAR)
            ORDER BY RESULT DESC
)
    WHERE ROWNUM <= 3;


4) �⸻��� ������ ���� ������ ����ϴ� ���� 3���� �˻��ϼ���.(�����̸�, �����, ������� �˻�)

SELECT ROWNUM,
       A.CNAME,
       B.PNAME,
       C.RESULT
    FROM COURSE A,
         PROFESSOR B,
         (
         SELECT CNO,
                AVG(RESULT) AS RESULT
            FROM SCORE
            GROUP BY CNO
            ORDER BY RESULT DESC
         ) C
    WHERE A.PNO=B.PNO
    AND   A.CNO=C.CNO
    AND ROWNUM<=3;



5) �������� ���� �������� �л��� ���� �˻��ϼ���.
SELECT PNAME,
       COUNT(SNO)
    FROM (
            SELECT A.PNAME,
                   B.SNO
                FROM PROFESSOR A,
                     STUDENT B
                WHERE A.SECTION = B.MAJOR
        )
    GROUP BY PNAME;


    


--48
<NATURAL JOIN�� USING ������ �̿��� ������ �� �� �����ϼ���.>
1) �۰� ������ �����ϴ� ������ �˻��ϼ���.
SELECT CNAME,
       PNAME
    FROM PROFESSOR
    NATURAL JOIN COURSE
    WHERE PNAME = '�۰�';

SELECT CNAME,
       PNAME
    FROM PROFESSOR 
    JOIN COURSE USING(PNO)
    WHERE PNAME='�۰�';

2) ������ 2������ ����� �̸� �����ϴ� ������ �˻��ϼ���.
SELECT CNAME,
       ST_NUM,
       PNAME
    FROM COURSE
    NATURAL JOIN PROFESSOR
    WHERE ST_NUM=2;
    
SELECT CNAME,
       ST_NUM,
       PNAME
    FROM COURSE
    JOIN PROFESSOR USING(PNO)
    WHERE ST_NUM=2;


3) ȭ�а� 1�г� �л��� �⸻��� ������ �˻��ϼ���.
SELECT MAJOR,
       SYEAR,
       SNO,
       SNAME,
       RESULT
    FROM STUDENT
    NATURAL JOIN SCORE
    WHERE MAJOR='ȭ��'
    AND SYEAR=1
    ORDER BY RESULT DESC;

SELECT MAJOR,
       SYEAR,
       SNO,
       SNAME,
       RESULT
    FROM STUDENT
    JOIN SCORE USING(SNO)
    WHERE MAJOR='ȭ��'
    AND SYEAR=1
    ORDER BY RESULT DESC;

4) �Ϲ�ȭ�� ������ �⸻��� ������ �˻��ϼ���.

SELECT CNO,
       CNAME,
       RESULT
    FROM COURSE
    NATURAL JOIN SCORE
    WHERE CNAME='�Ϲ�ȭ��1'
    ORDER BY RESULT DESC;


SELECT CNO,
       CNAME,
       RESULT
    FROM COURSE
    JOIN SCORE USING(CNO)
    WHERE CNAME='�Ϲ�ȭ��1'
    ORDER BY RESULT DESC;


--50
1) ������ ���� ���� �⵵ �λ� �޿��� �˻��ϼ���. (CASE, DECODE ���� �� ������ ��� ǥ��)
     �޿�          �λ���
   1000 ����   ->   15%
   1001~2000   ->   10%
   2001~3000   ->   5%
   3001~4000   ->   2%
   4000 �ʰ�   ->   ����

SELECT ENO,
       ENAME,
       SAL,
       CASE     WHEN SAL<=1000 THEN SAL*1.15
                WHEN SAL<=2000 THEN SAL*1.1
                WHEN SAL<=3000 THEN SAL*1.05
                WHEN SAL<=4000 THEN SAL*1.02
                ELSE SAL*1.0 
            END AS NSAL
        FROM EMP;

SELECT ENO,
       ENAME,
       SAL,
       DECODE(CEIL(SAL/1000), 1, SAL*1.15, 2, SAL*1.1, 3, SAL*1.05, 4, SAL*1.02, SAL) AS UPSAL
       FROM EMP;


2) �л����� ��� ������ �˻��ϵ� ���� ������ �л��� ��� ������ 4.5������ ȯ���Ͽ� �˻��ϼ���.(DECODE ���� �̿�)
   
SELECT SNO,
       SNAME,
       DECODE(SUBSTR(SNAME,1,2),'�縶',AVR/4*4.5,AVR) AS AVR
       FROM STUDENT
       ORDER BY SNAME;
       