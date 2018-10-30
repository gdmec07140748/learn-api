# git 使用

1. [git无法pull仓库refusing to merge unrelated histories](https://blog.csdn.net/lindexi_gd/article/details/52554159)

1. 使用github
    - git clone git@github.com:michaelliao/bootstrap.git
    - [链接](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/00137628548491051ccfaef0ccb470894c858999603fedf000)

1. [提交文件到GitHub](https://www.jianshu.com/p/4f3151195ef0)

1. [GitHub error](https://www.jianshu.com/p/feb3a14c24ef)

1. 添加config
    - git config --global user.name "我的名字" 
    - git config --global user.email "我的邮箱"

1. 创建一个目录
2. 进入这个目录
3. git init
4. git add <file>可以多个文件
5. git commit -m "提交说明"
6. git status 随时掌握工作区的状态
7. git diff 查看修改的内容    
8. git reset --hard HEAD~ 回退到上一个版本
	- commit_id   回退到指定版本
9. git reflog  查看commit_id
10. git log  查看提交历史
    - git log --pretty=oneline  一行一条记录查看
11. git checkout -- <file>  丢弃工作区的内容,未提交到暂存区
12. git rest HEAD file	从暂存区回退出去 再执行 11 的命令

13. git rm <file>  把git版本里面的文件删除 再执行 5
14. git checkout -- <file>  从版本库里面恢复文件

15. git remote add origin https://github.com/gdmec07140748/learngit.git  关联远程仓库
   - git remote rm origin  远程仓库存在删除 origin是名字
16. git push -u origin master	提交代码
17. git push origin master   以后每次提交