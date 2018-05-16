CREATE database market;

use market;

CREATE TABLE admin(
aid INT auto_increment PRIMARY KEY ,
username VARCHAR (30) NOT NULL ,
password VARCHAR (30) NOT NULL
);

CREATE TABLE user(
uid INT auto_increment PRIMARY KEY ,
username VARCHAR (30) NOT NULL ,
password VARCHAR (30) NOT NULL
);

CREATE TABLE category(
cid INT auto_increment PRIMARY KEY ,
cname VARCHAR (30) NOT NULL
);

CREATE TABLE goods(
gid INT auto_increment PRIMARY KEY ,
gname VARCHAR (100) NOT NULL ,
price DECIMAL(5,2) NOT NULL ,
brand VARCHAR (30) NOT NULL ,
inventory INT NOT NULL ,
cid INT NOT NULL,
image VARCHAR (100) NOT NULL ,
KEY cid(cid),
CONSTRAINT goods_category FOREIGN KEY (cid) REFERENCES category(cid) on delete cascade on update cascade
);

CREATE TABLE car(
carid INT auto_increment PRIMARY KEY ,
uid INT NOT NULL ,
total DECIMAL(10,2) ,
KEY uid(uid),
CONSTRAINT car_user FOREIGN KEY (uid) REFERENCES user(uid) on delete cascade on update cascade
);

CREATE TABLE carItems(
ciid INT auto_increment PRIMARY KEY ,
gid INT NULL NULL ,
carid INT NULL NULL ,
counts INT DEFAULT '1',
subTotal DECIMAL(10,2) NOT NULL ,
KEY gid(gid),
KEY carid(carid),
CONSTRAINT carItems_goods FOREIGN KEY (gid) REFERENCES goods(gid) on delete cascade on update cascade,
CONSTRAINT carItems_car FOREIGN KEY (carid) REFERENCES car(carid) on delete cascade on update cascade
);

CREATE TABLE orders(
oid VARCHAR(100) PRIMARY KEY ,
uid INT NOT NULL,
address VARCHAR (100) ,
createTime TIMESTAMP NOT NULL ,
total DECIMAL(10.2) ,
status INT DEFAULT 0,
KEY uid(uid),
CONSTRAINT orders_user FOREIGN KEY (uid) REFERENCES user(uid) on delete cascade on update cascade
);

CREATE TABLE ordersItems(
oiid INT auto_increment PRIMARY KEY ,
gid INT NOT NULL ,
oid VARCHAR(100) NOT NULL ,
counts INT NOT NULL ,
subTotal DECIMAL(10.2) NOT NULL ,
KEY gid(gid),
KEY oid(oid),
CONSTRAINT ordersItems_goods FOREIGN KEY (gid) REFERENCES goods(gid) on delete cascade on update cascade,
CONSTRAINT ordersItems_orders FOREIGN KEY (oid) REFERENCES orders(oid) on delete cascade on update cascade
);


INSERT INTO admin(username, password) VALUES ('张三', '123123');
INSERT INTO admin(username, password) VALUES ('李四', '123123');