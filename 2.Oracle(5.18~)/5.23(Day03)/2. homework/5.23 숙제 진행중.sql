--26

<���� �� �Լ��� �̿��ϼ���>
1) �������� ������ �޿� �ٹ��� �ϼ��� �� ������ �˻��ϼ���
SELECT * FROM PROFESSOR;

   SELECT PNO,
          PNAME,
          HIREDATE,
          LAST_DAY(HIREDATE),
          LAST_DAY(HIREDATE)-HIREDATE AS RESULT
            FROM PROFESSOR C;
       

2) �������� ���ñ��� �ٹ��� �ְ� �� ������ �˻��ϼ���
SELECT PNO,
       PNAME,
       HIREDATE,
       TRUNC(((SYSDATE - HIREDATE )/7) , 1) WWEEK
FROM PROFESSOR;

3) 1991�⿡�� 1995�� ���̿� ������ ������ �˻��ϼ���
SELECT PNO,
       PNAME,
       HIREDATE
       FROM PROFESSOR
       WHERE HIREDATE BETWEEN TO_DATE('19911231','YYYY/MM/DD') AND TO_DATE('19950101','YYYY,MM/DD');
       
4) �л����� 4.5 ȯ�� ������ �˻��ϼ���(�� �Ҽ� ���� ��°�ڸ�����)
SELECT * FROM STUDENT;
SELECT SNO,
       SNAME,
       TO_CHAR((ROUND(((AVR/4)*4.5),2)),99.99)
       FROM STUDENT
       ORDER BY SNAME;

5) ������� ���ñ��� �ٹ� �Ⱓ�� �� �� �� ���� ��ĥ���� �˻��ϼ���----------------------------��
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

1) �л��� ��� ������ ���� ���Ŀ� ���� �Ҽ��� ���� 2�ڸ����� �˻��ϼ���
'OOO �л��� ��� ������ O.OO�Դϴ�.'
SELECT * FROM STUDENT;
SELECT SNAME || ' �л��� ��� ������ ' || TO_CHAR((TRUNC(AVR,2)),'0.99') || ' �Դϴ�.'
FROM STUDENT;

2) ������ �������� ���� �������� ǥ���ϼ���
'OOO ������ �������� YYYY�� MM�� DD���Դϴ�.'
SELECT
PNAME || ' ������ �������� ' || TO_CHAR(HIREDATE,'""YYYY"�� "MM"�� "DD"�� �Դϴ�."')
FROM PROFESSOR;

3) �����߿� 3���� ������ ������ ����� �˻��ϼ���
SELECT PNO,
       PNAME,
       HIREDATE
    FROM PROFESSOR
    WHERE TO_CHAR(HIREDATE,'MM')='03';

--30
SELECT * FROM COURSE;
1) �� �а��� �л� ���� �˻��ϼ���
SELECT MAJOR,
       COUNT(*)
    FROM STUDENT
    GROUP BY MAJOR, SYEAR;


2) ȭ�а��� �����а� �л� 4.5 ȯ�� ������ ����� ���� �˻��ϼ���
SELECT MAJOR,
       TO_CHAR((TRUNC((AVG(AVR)),4)),99.9999)
    FROM (SELECT MAJOR,
           TRUNC((AVR/4*4.5),2) AS AVR
            FROM STUDENT
            WHERE MAJOR='ȭ��' 
            OR MAJOR='����')
    GROUP BY MAJOR;


3) �������� 10�� �̻� �� ���޺�(������, ������, �α���) ������ ���� �˻��ϼ���

--������� �ð��ʰ�(5.23)------------------------------------------------------------------------

SELECT ORDERS,
       COUNT(*)
    FROM PROFESSOR
    WHERE MONTHS_BETWEEN(SYSDATE,HIREDATE)>=120
    GROUP BY ORDERS;



    

4) ����� ȭ���� ���Ե� ������ ������ ������ �˻��ϼ���
SELECT SUM(ST_NUM)
    FROM COURSE
    WHERE CNAME LIKE '%ȭ��%';
       
       

5) ����� ȭ���� ���Ե� ������ ���� ������ �˻��ϼ��� --4���� ������ ����

SELECT SUM(ST_NUM)
    FROM COURSE
    WHERE CNAME LIKE '%ȭ��%';


6) �а��� �⸻��� ����� ���������� �˻��ϼ���
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

SELECT AVG(A.RESULT), ---------------------------------------------�Լ����� �ƴ϶� �÷��� �տ� A. �ٿ�����Ѵ�. ������
       B.MAJOR
    FROM SCORE A,
         STUDENT B
    WHERE A.SNO=B.SNO
    GROUP BY B.MAJOR;
    
      


7) 30�� �μ��� ������ ������ ����� �˻��ϼ���(�Ҽ��� ���ڸ����� ǥ��)
SELECT * FROM EMP ORDER BY DNO ASC;

SELECT JOB,
        ROUND(AVG(SAL),2)
    FROM EMP
    WHERE DNO=30
    GROUP BY JOB;



8) �����а� �л� �߿� �г⺰�� ������ ���� ����� �л��� ������ �˻��ϼ���

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
            WHERE MAJOR='����'
            GROUP BY (SYEAR,MAJOR)
         ) B
    WHERE A.AVR=B.AVR
    AND A.SYEAR=B.SYEAR
    AND A.MAJOR='����';





--32
1) ȭ�а��� �����ϰ� �а����� �л����� ���� ����� �˻��ϼ���
SELECT MAJOR,
       ROUND(AVG(AVR),2)
    FROM STUDENT
    WHERE MAJOR!='ȭ��'
    GROUP BY MAJOR;
    
SELECT MAJOR
     , ROUND(AVG(AVR), 2)
    FROM STUDENT
    GROUP BY MAJOR
    HAVING MAJOR != 'ȭ��';

2) ȭ�а��� ������ �� �а��� ��� ���� �߿� ������ 2.0 �̻��� ������ �˻��ϼ���
SELECT MAJOR,
       ROUND(AVG(AVR),2) AS AVR
    FROM STUDENT
    WHERE MAJOR!='ȭ��'
    GROUP BY MAJOR
    HAVING ROUND(AVG(AVR),2)>=2;
       

3) �⸻��� ����� 60�� �̻��� �л��� ������ �˻��ϼ���
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
    



4) ���� ������ 3���� �̻��� ������ ������ �˻��ϼ���


5) �⸻��� ��� ������ �� ȭ�а��񺸴� ����� ������ ������ ��� �������� �˻��ϼ���


6) �ٹ� ���� ������ 4�� �̻��� �μ��� �˻��ϼ���


7) ������ ��� ������ 3000 �̻��� ������ �˻��ϼ���


8) �� �а��� �г⺰ �ο��� �ο��� 5�� �̻��� �г��� �˻��ϼ���