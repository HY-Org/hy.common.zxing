call mvn install:install-file -Dfile=hy.common.zxing.jar                              -DpomFile=./src/main/resources/META-INF/maven/cn.openapis/hy.common.zxing/pom.xml
call mvn install:install-file -Dfile=hy.common.zxing-sources.jar -Dclassifier=sources -DpomFile=./src/main/resources/META-INF/maven/cn.openapis/hy.common.zxing/pom.xml

call mvn deploy:deploy-file   -Dfile=hy.common.zxing.jar                              -DpomFile=./src/main/resources/META-INF/maven/cn.openapis/hy.common.zxing/pom.xml -DrepositoryId=thirdparty -Durl=http://HY-ZhengWei:8081/repository/thirdparty
call mvn deploy:deploy-file   -Dfile=hy.common.zxing-sources.jar -Dclassifier=sources -DpomFile=./src/main/resources/META-INF/maven/cn.openapis/hy.common.zxing/pom.xml -DrepositoryId=thirdparty -Durl=http://HY-ZhengWei:8081/repository/thirdparty

pause
