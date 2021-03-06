CREATE TABLE XORDITEMS (
		ORDERLINEITEM_ID INTEGER NOT NULL,
		ORDERS_ID BIGINT NOT NULL,
		ORDERITEMS_ID BIGINT NOT NULL,
		SALESORDER_ID CHAR(30) NOT NULL,
		TOTALWEIGHT DECIMAL(20 , 3),
		WEIGHTYPE VARCHAR(20),
		HOTORDER VARCHAR(3),
		SOURCING_ID INTEGER,
		ORDSTATUS VARCHAR(3),
		ORDITEMSTATUS CHAR(1) NOT NULL,
		ESTIMATEDELIVERYDATE TIMESTAMP,
		BOLIDENTIFIER VARCHAR(50),
		MANIFESTIDENTIFIER VARCHAR(50),
		INVOICEIDENTIFIER  VARCHAR(50),
		OPTCOUNTER SMALLINT
	);

ALTER TABLE XORDITEMS ADD CONSTRAINT XORDITEMS_PK PRIMARY KEY (ORDERLINEITEM_ID, ORDERS_ID, ORDERITEMS_ID, SALESORDER_ID);

