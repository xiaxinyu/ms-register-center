# 启动容器
docker run -d  --name nacos  -e mode=standalone -p 8761:8848 nacos/nacos-server

# 登录
http://localhost:8761/nacos/index.html

用户名和密码：nacos/nacos
 
  
