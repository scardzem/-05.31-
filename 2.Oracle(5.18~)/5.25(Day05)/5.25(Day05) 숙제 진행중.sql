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
    AVR
) AS (
        SELECT SNO,
               SNAME,
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
               AVG(RESULT)
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
        AND B.SECTION='����'
);

SELECT * FROM C_P_ST_NAME;
COMMIT;       


--46
1) 4.5 ȯ�� ������ ���� ���� 3���� �л��� �˻��ϼ���.


2) �⸻��� ���� ����� ���� 3������ �˻��ϼ���.


3) �а���, �г⺰, �⸻��� ����� ���� 3������ �˻��ϼ���.(�а�, �г�, ������� �˻�)


4) �⸻��� ������ ���� ������ ����ϴ� ���� 3���� �˻��ϼ���.(�����̸�, �����, ������� �˻�)


5) �������� ���� �������� �л��� ���� �˻��ϼ���.


--48
<NATURAL JOIN�� USING ������ �̿��� ������ �� �� �����ϼ���.>
1) �۰� ������ �����ϴ� ������ �˻��ϼ���.


2) ������ 2������ ����� �̸� �����ϴ� ������ �˻��ϼ���.


3) ȭ�а� 1�г� �л��� �⸻��� ������ �˻��ϼ���.


4) �Ϲ�ȭ�� ������ �⸻��� ������ �˻��ϼ���.

--50
1) ������ ���� ���� �⵵ �λ� �޿��� �˻��ϼ���. (CASE, DECODE ���� �� ������ ��� ǥ��)
     �޿�          �λ���
   1000 ����   ->   15%
   1001~2000   ->   10%
   2001~3000   ->   5%
   3001~4000   ->   2%
   4000 �ʰ�   ->   ����


2) �л����� ��� ������ �˻��ϵ� ���� ������ �л��� ��� ������ 4.5������ ȯ���Ͽ� �˻��ϼ���.(DECODE ���� �̿�)