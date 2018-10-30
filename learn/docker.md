### 容器生命周期管理

- [镜像删除](https://segmentfault.com/a/1190000004491286)

- [run](http://www.runoob.com/docker/docker-run-command.html)

  ```bash
  # 运行停止后自动删除
  --rm
  
  docker run -d -P --name static-site prakhar1989/static-site
  ```

- [start/stop/restart](http://www.runoob.com/docker/docker-start-stop-restart-command.html)

- [kill](http://www.runoob.com/docker/docker-kill-command.html)

- [rm](http://www.runoob.com/docker/docker-rm-command.html)

  ```bash
  # 删除镜像
  docker rm $(docker ps -a -q -f status=exited)
  
  # 或者
  docker container prune
  ```

- [pause/unpause](http://www.runoob.com/docker/docker-pause-unpause-command.html)

- [create](http://www.runoob.com/docker/docker-create-command.html)

- [exec](http://www.runoob.com/docker/docker-exec-command.html)

### 容器操作

- [ps](http://www.runoob.com/docker/docker-ps-command.html)
- [inspect](http://www.runoob.com/docker/docker-inspect-command.html)
- [top](http://www.runoob.com/docker/docker-top-command.html)
- [attach](http://www.runoob.com/docker/docker-attach-command.html)
- [events](http://www.runoob.com/docker/docker-events-command.html)
- [logs](http://www.runoob.com/docker/docker-logs-command.html)
- [wait](http://www.runoob.com/docker/docker-wait-command.html)
- [export](http://www.runoob.com/docker/docker-export-command.html)
- [port](http://www.runoob.com/docker/docker-port-command.html)

### 容器rootfs命令

- [commit](http://www.runoob.com/docker/docker-commit-command.html)
- [cp](http://www.runoob.com/docker/docker-cp-command.html)
- [diff](http://www.runoob.com/docker/docker-diff-command.html)

### 镜像仓库

- login

  ```bash
  # 登陆到Docker Hub
  docker login -u 用户名 -p 密码
  # 登出Docker Hub
  docker logout
  ```

- [pull](http://www.runoob.com/docker/docker-pull-command.html)

- push

  ```bash
  # 修改标签名称 对应仓库 标记本地镜像
  docker tag redis:4.0 dockermrz/testprivate:1.0
  
  # 推送镜像
  docker push dockermrz/testprivate:1.0
  ```

- [search](http://www.runoob.com/docker/docker-search-command.html)

### 本地镜像管理

- [images](http://www.runoob.com/docker/docker-images-command.html)

- rmi 删除本地一个或多少镜像

  ```bash
  # OPTIONS说明：
  -f :强制删除；
  --no-prune :不移除该镜像的过程镜像，默认移除；
  
  ```

- [tag](http://www.runoob.com/docker/docker-tag-command.html)

- [build](http://www.runoob.com/docker/docker-build-command.html)

- [history](http://www.runoob.com/docker/docker-history-command.html)

- [save](http://www.runoob.com/docker/docker-save-command.html)

- [import](http://www.runoob.com/docker/docker-import-command.html)

```bash
 docker image build --tag $DOCKERID/linux_tweet_app:1.0 .
```

- [远程镜像地址](https://cloud.docker.com/repository/docker/dockermrz/testprivate/general)

- [参照操作](https://www.souyunku.com/2017/12/31/Docker-dockerHub/#%E7%A7%81%E6%9C%89%E4%BB%93%E5%BA%93%E6%93%8D%E4%BD%9C)

- 
