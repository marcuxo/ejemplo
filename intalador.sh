#!/bin/bash
echo Creado por Marco Urrutia
echo se intalara apache
yum install httpd
yum systemctl start httpd.service
yum install php
systemctl restart httpd.service
yum install wget
wget http://dev.mysql.com/get/mysql57-community-release-el7-7.noarch.rpm
yum install mysql57-community-release-el7-7.noarch.rpm
yum install mysql-community-server
service mysql start
service mysql status
mysql --version
echo Gracias Por instalar L.A.M.P
sleep 1s
exit

