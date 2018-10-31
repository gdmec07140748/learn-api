## PhpDocumentor使用

[安装](https://www.jianshu.com/p/93e84163b3b3)

[使用](https://oomusou.io/phpstorm/phpstorm-phpdoc/)

## 安装

-  pear install PhpDocumentor 命令行
-  

## 使用 

- -d 项目目录
- -t 结果目录

```bash
 phpdoc -d E:\project\jingfei\code\fundman-wework\include\api -t E:\project\jingfei\code\wx\bat\other\doc
```



## 修改

- E:\develop\phpstudy\PHPTutorial\tools\pear\pear\PhpDocumentor\phpDocumentor\Smarty-2.6.0\libs\Smarty_Compiler.class.php 

- _compile_custom_tag 参数不能是函数返回值问题

```php
 $_cache_attrs='';
 $arg_list = $this->_compile_arg_list('function', $tag_command, $attrs, $_cache_attrs);
```



- _compile_file 函数 preg_replace废弃问题

- ```php
  $source_content = preg_replace_callback(
      "!({$ldq})\*(.*?)\*({$rdq})!s",
      function($m) { 
          return  "'" . $m[1] . "*'" . 
              str_repeat("\n", substr_count($m[2], "\n")) . 
              "*'" .$m[3] . "'"; 
      },
      $source_content);
  ```

  E:\develop\phpstudy\PHPTutorial\tools\pear\data\PhpDocumentor\phpDocumentor\Converters\HTML

- 替换编码问题 （全部替换）

- 原来 iso-8859-1  

- 结果 utf-8

- 