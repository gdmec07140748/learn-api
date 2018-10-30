## go 学习

### 第一

- [搭建](https://www.cnblogs.com/yin5th/p/9604573.html)

- 学习 在线
  - [入门](https://gobyexample.com/)
  - [GO 语言简介（上）— 语法](https://coolshell.cn/articles/8460.html)
  - [GO 语言简介（下）— 特性](https://coolshell.cn/articles/8489.html)
  - [Effective Go](https://golang.org/doc/effective_go.html)

- 书籍
  - [入门 The Go Programming Language](https://book.douban.com/subject/26337545/)

- 视频
  - [Go Concurrency Patterns](https://www.youtube.com/watch?v=f6kdp27TYZs)
  - [Advanced Go Concurrency Patter](https://www.youtube.com/watch?v=QDDwwePbDtw&feature=youtu.be)

- 编译

  - ```bash
    g = 编译器：将源代码编译为项目代码（程序文本）
    l = 链接器：将项目代码链接到可执行的二进制文件（机器代码）
    
    flags:
    -I 针对包的目录搜索
    -d 打印声明信息
    -e 不限制错误打印的个数
    -f 打印栈结构
    -h 发生错误时进入恐慌（panic）状态
    -o 指定输出文件名 // 详见第3.4节
    -S 打印产生的汇编代码
    -V 打印编译器版本 // 详见第2.3节
    -u 禁止使用 unsafe 包中的代码
    -w 打印归类后的语法解析树
    -x 打印 lex tokens
    ```

- 环境变量
  - **$GOROOT** 表示 Go 在你的电脑上的安装位置，它的值一般都是 `$HOME/go`，当然，你也可以安装在别的地方。
  - **$GOARCH** 表示目标机器的处理器架构，它的值可以是 386、amd64 或 arm。
  - **$GOOS** 表示目标机器的操作系统，它的值可以是 darwin、freebsd、linux 或 windows。
  - **$GOBIN** 表示编译器和链接器的安装位置，默认是 `$GOROOT/bin`，如果你使用的是 Go 1.0.3 及以后的版本，一般情况下你可以将它的值设置为空，Go 将会使用前面提到的默认值。



