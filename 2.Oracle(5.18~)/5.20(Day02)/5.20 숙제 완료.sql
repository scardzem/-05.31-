---16
1) �۰� ������ �����ϴ� ������ �˻��Ѵ�
SELECT PNAME,
       SECTION
    FROM PROFESSOR
    WHERE PNAME = '�۰�';

2) ȭ�� ���� ������ �����ϴ� ������ ����� �˻��Ѵ�
SELECT A.CNAME,
       A.PNO,
       B.PNAME
    FROM (SELECT CNAME,
                 PNO
            FROM COURSE
            WHERE CNAME LIKE '%ȭ��') A,
                 PROFESSOR B
    WHERE A.PNO = B.PNO;

       
       


3) ������ 2������ ����� �̸� �����ϴ� ������ �˻��Ѵ�
SELECT A.PNAME,
       B.ST_NUM
    FROM PROFESSOR A,
         (SELECT ST_NUM,
                 PNO
            FROM COURSE
            WHERE ST_NUM = 2) B
    WHERE A.PNO(+)=B.PNO;
       

4) ȭ�а� ������ �����ϴ� ������ �˻��Ѵ�
SELECT A.SECTION,
       A.PNO,
       B.CNAME
    FROM PROFESSOR A,
         (SELECT PNO,
                 CNAME
                FROM COURSE) B
     WHERE A.PNO = B.PNO(+)
     AND SECTION = 'ȭ��';

5) ȭ�а� 1�г� �л��� �⸻��� ������ �˻��Ѵ�
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
    AND MAJOR = 'ȭ��';

6) �Ϲ�ȭ�� ������ �⸻��� ������ �˻��Ѵ�
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
    AND CNAME = '�Ϲ�ȭ��'
    ORDER BY SNO ASC;
        

7) ȭ�а� 1�г� �л��� �Ϲ�ȭ�� �⸻��� ������ �˻��Ѵ�
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
    AND MAJOR = 'ȭ��'
    AND CNAME = '�Ϲ�ȭ��';

8) ȭ�а� 1�г� �л��� �����ϴ� ������ �˻��Ѵ�
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
    AND   MAJOR = 'ȭ��'
    ORDER BY SNAME ASC;
SELECT * FROM SCGRADE;
9) ����ȭ�� ������ �������� F�� �л��� ����� �˻��Ѵ�
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
    AND CNAME='����ȭ��';

---18
1) �л��߿� ���������� �˻��Ѵ�
SELECT A.SNO,
       B.SNAME
FROM STUDENT A,
     STUDENT B
WHERE A.SNAME=B.SNAME
AND A.SNO!=B.SNO
ORDER BY SNAME ASC;

2) ��ü ���� ��ܰ� ������ ����ϴ� ������ �̸��� �а� ������ �˻��Ѵ�


SELECT A.PNO,
       A.PNAME,
       A.SECTION,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO = B.PNO(+)
    ORDER BY SECTION ASC;


3) �̹� �б� ��ϵ� ��� ����� ��� ������ ���� ������ �˻��Ѵ�
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
1) �۰� ������ �����ϴ� ������ �˻��Ѵ�
SELECT A.CNO,
       A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO
    AND PNAME='�۰�';

2) ȭ�� ���� ������ �����ϴ� ������ ����� �˻��Ѵ�
SELECT A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND CNAME LIKE '%ȭ��%';



3) ������ 2������ ����� �̸� �����ϴ� ������ �˻��Ѵ�
SELECT A.CNAME,
       A.ST_NUM,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND ST_NUM=2;

4) ȭ�а� ������ �����ϴ� ������ �˻��Ѵ�
SELECT A.CNAME,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+)
    AND SECTION = 'ȭ��';



5) ȭ�а� 1�г� �л��� �⸻��� ������ �˻��Ѵ�
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
    AND MAJOR = 'ȭ��'
    ORDER BY SNAME ASC, CNAME ASC;
    
6) �Ϲ�ȭ�� ������ �⸻��� ������ �˻��Ѵ�
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
    AND CNAME = '�Ϲ�ȭ��';

7) ȭ�а� 1�г� �л��� �Ϲ�ȭ�� �⸻��� ������ �˻��Ѵ�
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
    AND MAJOR = 'ȭ��'
    AND CNAME = '�Ϲ�ȭ��';

8) ȭ�а� 1�г� �л��� �����ϴ� ������ �˻��Ѵ�
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
    AND MAJOR = 'ȭ��'
    AND SYEAR = 1
    ORDER BY SNAME ASC, CNAME ASC;



---22
1) �� ������ ������ ��� ������ �������� �˻��϶�
SELECT A.CNO,
       A.CNAME,
       B.PNO,
       B.PNAME
    FROM COURSE A,
         PROFESSOR B
    WHERE A.PNO = B.PNO(+);

2) ȭ�а� �л��� �⸻��� ������ ��� �˻��϶�
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
    AND MAJOR = 'ȭ��'
    AND SYEAR = 1
    ORDER BY SNAME ASC;
    

3) ����ȭ�а��� �������� �⸻��� ���������� �˻��϶�
SELECT B.SNO,
       B.SNAME,
       A.CNAME,
       C.RESULT
    FROM COURSE A,
         STUDENT B,
         SCORE C
    WHERE A.CNO(+) = C.CNO
    AND B.SNO = C.SNO(+)
    AND CNAME = '����ȭ��'
    ORDER BY SNAME ASC;

4) ȭ�а� �л��� �����ϴ� ������ ����ϴ� ������ ����� �˻��϶�
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
    AND MAJOR = 'ȭ��');

    

5) ��� ������ ��ܰ� ��� ������ �˻��Ѵ�
SELECT A.PNO,
       A.PNAME,
       B.CNAME
    FROM PROFESSOR A,
         COURSE B
    WHERE A.PNO=B.PNO(+);


6) ��� ������ ��ܰ� ��� ������ �˻��Ѵ�(�� ��� ���� ���� �˻��Ѵ�)
    
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
