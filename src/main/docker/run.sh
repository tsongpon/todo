#!/bin/sh
echo "********************************************************"
echo "Waiting for the database $DB_HOST to start  on port 3306"
echo "********************************************************"
sleep 1m
echo "********************************************************"
echo "Starting Todo Service"
echo "********************************************************"
java  -jar /usr/local/todo/@project.build.finalName@.jar
