# Build Docker Image
 - 生成jar：mvn clean package
 - 构建镜像：mvn docker:build
 
# 创建网络
docker network create ms-sailfish 
 
# 启动容器
docker run -d  --name ms-register-center -p 8761:8761 ms-sailfish/register-center-server:v0.0.1

# 启动容器集成网络
docker run -d  --name ms-register-center --network ms-sailfish -p 8761:8761 ms-sailfish/register-center-server:v0.0.1
 
  
