#java:8-jre是指docker上官方提供的java镜像，版本号是8.也就是jdk1.8；
FROM java:8-jre
#MAINTAINER 指作者信息
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

#ADD指将应用jar包复制到/app/中
ADD ./target/account-service.jar /app/
#执行命令 java -jar  -Xmx200m /app/account-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

#声称容器将暴露6000端口
EXPOSE 6000