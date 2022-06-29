--02----------------------------------------------------------

--1)student ���̺� ������ �˻��ض�
DESC STUDENT;

--2)course ���̺� ������ �˻��ض�
DESC COURSE;

--3)professor ���̺� ������ �˻��ض�
DESC PROFESSOR;

--4)score ���̺� ������ �˻��ض�
DESC SCORE;

--5) ��� �л��� ������ �˻��ض�
SELECT *
    FROM STUDENT; 

--7) ��� ������ ������ �˻��ض�
SELECT *
    FROM COURSE;

--8) �⸻��� ���������� �˻��ض�
SELECT *
    FROM SCORE;

--9) �л����� �а��� �г��� �˻��ض�
SELECT MAJOR,
       SYEAR
    FROM STUDENT;

--10) �� ������ �̸��� ������ �˻��ض�
SELECT CNAME,
       ST_NUM
FROM COURSE;

--11) ��� ������ ������ �˻��ض�
SELECT ORDERS
    FROM PROFESSOR;


--04----------------------------------------------------------

--1) �� �л��� ������ �˻��϶�(������ ���)
SELECT SNO �й�,
       SNAME �̸�,
       AVR AS ����
FROM STUDENT;

--2) �� ������ �������� �˻��϶�(������ ���)
SELECT CNAME ����,
       ST_NUM AS ������
FROM COURSE;

--3) �� ������ ������ �˻��϶�(������ ���)
SELECT PNAME AS �̸�,
       ORDERS AS ����
FROM PROFESSOR;

--4) �޿��� 10%�λ����� �� ���� ���޵Ǵ� �޿��� �˻��϶�(������ ���)
SELECT GRADE �г�,
       (1.1*LOSAL) AS �����޿�,
       (1.1*HISAL) AS �ְ�޿�
    FROM SALGRADE;


--5) ���� �л��� ��� ������ 4.0�����̴�. �̸� 4.5�������� ȯ���ؼ� �˻��϶�(������ ���)
SELECT SNO �й�,
       SNAME �̸�,
       SEX ����,
       SYEAR �г�,
       MAJOR ����,
       ((AVR/4)*4.5) ���� 
FROM STUDENT;

--06----------------------------------------------------------


--1) '__�а��� __�л��� ���� ������ __�Դϴ�' ���·� �л��� ������ ����϶�
SELECT MAJOR || ' �а��� ' || SNAME || ' �л��� ���� ������ ' || AVR || ' �Դϴ�'
FROM STUDENT;                               --0�� �� ����, ������ �ϰ���� ************************

--2) '__������ __���� �����Դϴ�.' ���·� ������ ������ ����϶�
SELECT CNAME || ' ������ ' || ST_NUM || ' ���� �����Դϴ�'
FROM COURSE;

--3) '__������ __�а� �Ҽ��Դϴ�.' ���·� ������ ������ ����϶�
SELECT PNAME || ' ������ ' || SECTION || ' �а� �Ҽ��Դϴ�.'
FROM PROFESSOR;

--4) �б����� � �а��� �ִ��� �˻��Ѵ�(�л� ���̺� ������� �˻��Ѵ�)
SELECT DISTINCT MAJOR
FROM STUDENT;

--5) �б����� � �а��� �ִ��� �˻��Ѵ�(���� ���̺� ������� �˻��Ѵ�)
SELECT DISTINCT SECTION
FROM PROFESSOR;


--6) ������ ������ � �͵��� �ִ��� �˻��Ѵ�
SELECT DISTINCT ORDERS
FROM PROFESSOR;


--08----------------------------------------------------------


--1) ���������� �л��� �̸��� �˻��϶�
SELECT AVR,
       SNAME
FROM STUDENT
ORDER BY AVR DESC;
       

--2) �а��� ���������� �л��� ������ �˻��϶�
SELECT *
FROM STUDENT
ORDER BY MAJOR ASC, AVR DESC;

--3) �г⺰ ���������� �л��� ������ �˻��϶�
SELECT *
FROM STUDENT
ORDER BY SYEAR ASC, AVR DESC;

--4) �а��� �г⺰�� �л��� ������ ���������� �˻��϶�
SELECT *
FROM STUDENT
ORDER BY MAJOR ASC, SYEAR DESC;

--5) ���������� ���� �̸��� �˻��϶�
SELECT ST_NUM,
       CNAME
FROM COURSE
ORDER BY ST_NUM DESC, CNAME ASC;

--6) �� �а����� ������ ������ �˻��϶�
SELECT *
FROM PROFESSOR
ORDER BY SECTION ASC, PNAME ASC;

--7) �������� ������ ������ �˻��϶�
SELECT *
FROM PROFESSOR
ORDER BY ORDERS DESC;

--8) �� �а����� ������ ������ �������� ������ �˻��϶�
SELECT *
FROM PROFESSOR
ORDER BY SECTION ASC, HIREDATE DESC;


--10----------------------------------------------------------


--1) ȭ�а� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE MAJOR='ȭ��';

--2) ������ 2.0 �̸��� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE AVR<2.0;

--3) ���� �л��� ������ �˻��϶�
SELECT SNAME,
       AVR
FROM STUDENT
WHERE SNAME='����';

--4) ������ ����� �˻��϶�
SELECT PNAME,
       ORDERS
FROM PROFESSOR
WHERE ORDERS='������';

--5) ȭ�а� �Ҽ� ������ ����� �˻��϶�
SELECT PNAME,
       SECTION
FROM PROFESSOR
WHERE SECTION='ȭ��';

--6) �۰� ������ ������ �˻��϶�
SELECT *
FROM PROFESSOR
WHERE PNAME='�۰�';

--7) �г⺰�� ȭ�а� �л��� ������ �˻��϶�
SELECT MAJOR,
       SYEAR,
       SNAME,
       AVR
FROM STUDENT
ORDER BY SYEAR ASC, MAJOR ASC, SNAME ASC;
       

--8) 2000�� ������ ������ ������ ������ �����ϼ����� �˻��϶�
SELECT *
FROM PROFESSOR
WHERE HIREDATE<'00/01/01'
ORDER BY HIREDATE DESC;


--9) ��� ������ ���� ������ ������ �˻��϶�
SELECT SECTION,
       PNAME,
       ORDERS
FROM PROFESSOR
WHERE ORDERS IN('������','�α���')
ORDER BY SECTION ASC, PNAME ASC;


--12----------------------------------------------------------


--1) �������� ������, �Ŀ��� �л��� �˻��϶�
SELECT * 
FROM STUDENT
WHERE MAJOR IN('����', '����', '�Ŀ�')
ORDER BY SNAME;


--2) ȭ�а��� �ƴ� �л��߿� 1�г� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE SYEAR=1 
AND MAJOR IN('����', '����', '����', '�Ŀ�')
ORDER BY SNAME;

--3) �����а� 3�г� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE MAJOR='����'
AND SYEAR=3;

--4) ������ 2.0���� 3.0������ �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE AVR BETWEEN 2 AND 3;

SELECT *
FROM STUDENT
WHERE 2<=AVR
AND AVR<=3;



--5) ������ �������� ���� �����߿� ������ 3������ ������ �˻��϶�
SELECT *
FROM COURSE
WHERE PNO IS NULL;
       
       

--6) ȭ�а� ���õ� ������ ������ 2���� ������ ������ �˻��϶�
SELECT *
FROM COURSE
WHERE ST_NUM<=2
AND CNAME LIKE '%ȭ��%';



--7) ȭ�а� �������� �˻��϶�
SELECT *
FROM PROFESSOR
WHERE SECTION='ȭ��'
AND ORDERS='������';




--8) �����а� �л��߿� ���� �縶���� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE MAJOR='����'
AND SNAME LIKE '�縶%';

--9) �������� 1995�� ������ �������� �˻��϶�
SELECT *
FROM PROFESSOR
WHERE HIREDATE<'95/01/01';

--10) ���� �̸��� ���� 1������ ������ �˻��϶�
SELECT *
FROM PROFESSOR
WHERE PNAME LIKE '__';


--14----------------------------------------------------------


--1) ������ 3.0���� 4.0������ �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE AVR BETWEEN 3 AND 4;

--2) 1994�⿡�� 1995����� ������ ������ ����� �˻��϶�


SELECT PNAME,
       HIREDATE
FROM PROFESSOR
WHERE HIREDATE BETWEEN '94/01/01' AND '94/12/31';

--3) ȭ�а��� �����а�, �����а� �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE MAJOR IN ('ȭ��', '����', '����');

--4) �������� �������� �˻��϶�
SELECT *
FROM PROFESSOR
WHERE ORDERS IN('������','������')
ORDER BY ORDERS;

--5) �������� 1����, 2������ ������ �˻��϶�
SELECT *
FROM COURSE
WHERE ST_NUM IN (1,2)
ORDER BY CNAME;

--6) 1, 2�г� �л� �߿� ������ 2.0���� 3.0������ �л��� �˻��϶�
SELECT *
FROM STUDENT
WHERE SYEAR IN(1,2)
AND AVR BETWEEN 2 AND 3
ORDER BY SYEAR;

--7) ȭ��, �����а� �л� �� 1, 2 �г� �л��� ���������� �˻��϶�
SELECT *
FROM STUDENT
WHERE MAJOR IN ('ȭ��', '����')
AND SYEAR IN(1,2)
ORDER BY AVR DESC;





