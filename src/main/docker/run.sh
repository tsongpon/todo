#!/bin/sh
echo "********************************************************"
echo "Waiting for the database to start  on port 3306"
echo "********************************************************"
while ! nc -z database 3306; do sleep 3; done
echo "********************************************************"
echo "Starting Todo Service"
echo "********************************************************"
java  -jar /usr/local/todo/@project.build.finalName@.jar
