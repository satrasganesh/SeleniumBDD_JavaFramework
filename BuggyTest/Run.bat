@ECHO OFF
cd /d %cd%\BuggyTest
call mvn clean test

pause >nul