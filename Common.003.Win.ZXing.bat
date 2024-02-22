

del /Q hy.common.zxing.jar
del /Q hy.common.zxing-sources.jar


call mvn clean package -Dmaven.test.skip=true
cd .\target\classes

rd /s/q .\org\hy\common\zxing\junit


jar cvfm hy.common.zxing.jar META-INF/MANIFEST.MF META-INF org com

copy hy.common.zxing.jar ..\..
del /q hy.common.zxing.jar
cd ..\..





cd .\src\main\java
xcopy /S ..\resources\* .
jar cvfm hy.common.zxing-sources.jar META-INF\MANIFEST.MF META-INF org com
copy hy.common.zxing-sources.jar ..\..\..
del /Q hy.common.zxing-sources.jar
rd /s/q META-INF
cd ..\..\..

pause