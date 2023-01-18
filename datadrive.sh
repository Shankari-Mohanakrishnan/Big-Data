#!/bin/bash

mysql -u root -p -e "create database shankari";
mysql --user='root' --password='saibaba' shankari << EOF
create table yone(data int (4),maxtemp int(4));
create table ytwo(data int (4),maxtemp int(4));
create table ythree(data int (4),maxtemp int(4));
commit;
EOF
