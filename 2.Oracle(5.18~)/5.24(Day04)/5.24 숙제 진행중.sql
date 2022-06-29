
--38
1) ��� �л��� ������ 4.5���� �������� �����ϼ���


2) ��� ������ �������ڸ� 100�� ������ �����ϼ���


3) ȭ�а� 2�г� �л��� ������ �����ϼ���


4) �������� ������ �����ϼ���




CREATE TABLE FACTORY (
    FNO NUMBER,
    FNAME VARCHAR2(50),
    LOC VARCHAR2(10),
    CONSTRAINT FACTORY_FNO_PK PRIMARY KEY(FNO)
);

CREATE TABLE GOODS (
    GNO NUMBER,
    GNAME VARCHAR2(50),
    PRI NUMBER,
    FNO NUMBER,
    CONSTRAINT GOODS_GNO_PK PRIMARY KEY(GNO),
    CONSTRAINT GOODS_FNO_FK FOREIGN KEY( REFERENCES FACTORY(FNO)
);           

CREATE TABLE PROD (
    PNO NUMBER,
    GNO NUMBER,
    PRICE NUMBER,
    PDATE DATE
    CONSTRAINT PROD_PNO_PK PRIMARY KEY PROD(PNO),
    CONSTRAINT PROD_GNO_FK FOREIGN KEY PROD(GNO)
);



/*
--40
1) ���� ������ ���� ���̺��� �����ϼ���.
FACTORY ���̺� - FNO NUMBER PK          : �����ȣ
                FNMAE VARCHAR2(50)      : �����̸�
                LOC VARCHAR2(10)        : ������ġ
                
GOODS ���̺� - GNO NUMBER PK            : ��ǰ��ȣ
              GNAME VARCHAR2(50)        : ��ǰ�̸�
              PRI NUMBER                : ��ǰ�ܰ�
              FNO NUMBER FK             : �����ȣ
              
   
              
              
              
PROD ���̺� - PNO NUMBER PK             : ��ǰ��ȣ
              GNO NUMBER FK             : ��ǰ��ȣ
              PRICE NUMBER              : ���ܰ�
              PDATE DATE                : ��������

2) ���� ������ ���� ���̺��� �����ϼ���.
PRODUCT ���̺� - PNO NUMBER PK              : ��ǰ��ȣ
                PNMAE VARCHAR2(50)          : ��ǰ�̸�
                PRI NUMBER                  : ��ǰ�ܰ�
PAYMENT ���̺� - MNO NUMBER PK              : ��ǥ��ȣ
                PDATE DATE NOT NULL         : �Ǹ�����
                CNAME VARCHAR2(50) NOT NULL : ����
                TOTAL NUMBER TOTAL > 0      : �Ѿ�
PAYMENT_DETAIL - MNO NUMBER PK FK           : ��ǥ��ȣ
                PNO NUMBER PK FK            : ��ǰ��ȣ
                AMOUNT NUMBER NOT NULL      : ����
                PRICE NUMBER NOT NULL       : �ܰ�
                TOTAL_PRICE NUMBER NOT NULL TOTAL_PRICE > 0 : �ݾ�
*/