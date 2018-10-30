- 打包(.tar):

  - > tar -cvf Pro.tar /home/lin/Pro   #将/home/lin/Pro文件夹下的所有文件打包成Pro.tar

- [参考](https://www.cnblogs.com/eoiioe/archive/2008/09/20/1294681.html)

- 打解包(.tar.gz)

  - >  tar -cvzf firefox-3.0.3.tar.gz firefox       #将firefox文件夹打包为firefox-3.0.3.tar.gz
    >   tar -xvzf firefox-3.0.3.tar.gz

- 打解包(.tar.bz2)

  - >  tar -cvjf firefox-3.0.3.tar.bz2  firefox/    #将firefox文件夹打包为firefox-3.0.3.tar.bz2
    >  tar -xvjf firefox-3.0.3.tar.bz2

- 参数说明：

  - > c   创建新的档案文件。如果用户想备份一个目录或是一些文件，就要选择这个选项。
    > x   从档案文件中释放文件。
    > v   详细报告tar处理的文件信息。如无此选项，tar不报告文件信息。
    > z   用gzip来压缩/解压缩文件，加上该选项后可以将档案文件进行压缩，但还原时也一定要使用该选项进行解压缩。 
    > f   使用档案文件或设备，这个选项通常是必选的。

- 解压tar.gz和tar.bz2不同压缩文件的命令如下： 

  -  解压tar.gz文件

  - > tar -zxvf ×××.tar.gz　　
    
  - 2 解压tar.bz2文件

  - > tar -jxvf ×××.tar.bz2

- > -z ：是否同时具有 gzip 的属性？亦即是否需要用 gzip 压缩？ 
  > -j ：是否同时具有 bzip2 的属性？亦即是否需要用 bzip2 压缩？