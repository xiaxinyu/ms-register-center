# Build Docker Image
 - 生成jar：mvn clean package
 - 构建镜像：mvn docker:build
 
# 启动容器
docker run -d  --name ms-register-center -p 8761:8761 ms-sailfish/ms-register-center:v0.0.1
 
  
