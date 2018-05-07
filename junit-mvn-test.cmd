REM Set environment and run JUnit
set CLASSPATH=d:\dev\project\Java\mvn-test\target\classes;%CLASSPATH%
set CLASSPATH=d:\dev\project\Java\mvn-test\target\test-classes;%CLASSPATH%
java -jar d:\dev\JUnit5\junit-platform-console-standalone-1.3.0-20180503.153417-7.jar --select-class org.abruenin.AppTest --classpath %CLASSPATH%