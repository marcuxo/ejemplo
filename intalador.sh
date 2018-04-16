#!/bin/bash
echo Creado por Marco Urrutia
echo se intalara apache
yum install httpd
yum systemctl start httpd.service
sleep 1s
exit

