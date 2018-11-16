
1. 下载 tomcat

1. 解压

1. 复制/粘贴 Jenkins.war 到 tomcat/webapps 文件夹

1. 打开命令行
    - goto tomcat/bin 目录
    - make files executable： chmod +x *.sh

1. Start Tomcat: ./statrup.sh
    - (to shutdown tomcat: ./shutdown.sh)

1. verify is tomcat started：browser - http://localhost:8080

1. verify if Jenkins is running on tomcat ： http://localhost:8080/jenkins

1. To start Jenkins on a diff port
    - java -jar jenkins.war -- httpPort=9090