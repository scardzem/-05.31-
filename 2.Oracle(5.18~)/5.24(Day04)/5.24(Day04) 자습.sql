CREATE TABLE JANG(
    J_ENO NUMBER PRIMARY KEY,
    J_ENAME VARCHAR(20),
    J_SAL NUMBER(10),
    J_DNO VARCHAR2(10)
);



ALTER TABLE JANG
    ADD DNAME VARCHAR2(30);

ALTER TABLE JANG
    RENAME COLUMN DNAME TO J_DNAME;

INSERT INTO JANG(
    J_ENO,
    J_ENAME,
    J_SAL,
    J_DNO,
    J_DNAME
    )
 SELECT
    A.ENO,
    A.ENAME,
    A.SAL,
    A.DNO,
    B.DNAME
    FROM EMP A,
         DEPT B
    WHERE A.DNO=B.DNO;
COMMIT;

SELECT * FROM JANG;
ROLLBACK;

ALTER TABLE JANG
    ADD J_LOC VARCHAR2(20);


--J_LOC �÷� �߰��ϸ� NULL������ �ԷµǴµ� ������Ʈ �Ϸ��� SELECT������ ���������� ���;ߵȴ�.
--�ذ��� �ȵż� ���-MERGE��� �����췯 �Ҷ� �� �Ἥ �ؾߵȴٰ���
--�Ʒ��� ������Ʈ ������� ������� Ǯ���ذ�

UPDATE JANG
SET J_LOC=NULL;

UPDATE (
        SELECT A.LOC,
               B.J_LOC
        FROM DEPT A,
             JANG B
        WHERE A.DNO = B.J_DNO
        ) C
    SET C.J_LOC=C.LOC;


