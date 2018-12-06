
- [快捷键参考](https://github.com/judasn/IntelliJ-IDEA-Tutorial/blob/master/keymap-introduce.md)

- 生成Get/Set方法快捷键 alt+insert

- 输出 System.out.println  - sout

- 关闭项目 
    - 菜单（File）--》 关闭项目(close project)

-  切换窗口： Alt + 数字     

- 查找快捷键 ： Ctrl + Shist + A

- 最近打开文件： Ctrl + E

- 修改
    - 最近打开修改的文件： Ctrl + Shift + E

    - 跳转到上次修改的地方： Ctrl + Shift + Backspace（《--）

- 浏览
    - 回退 Ctrl + Alt + 左箭头
    - 前进 Ctrl + Alt + 右箭头    

- 书签 Bookmarks
    - 添加书签 F11
    -         Ctrl + Shift + 数字
    - 跳转书签 Ctrl + 数字
    - 展示书签 Shift + F11


- 收藏  add to favorates
    - 收藏文件 Alt + Shit + F （可以建收藏文件夹） 
    - 光标放在函数名称上可以收藏该函数

- 插件 plugins
    - 安装  （搜索 - 安装 - 重启）
    - Emacs 使用
    - vim 使用
    - ctrl + Shift + o 再按 想要跳转的字母
    - 配置 keymap

- 跳转到文件区 Alt + 1 （上下左右，enter 打开文件）
    - 编辑区 esc

- 搜索

    - 函数名搜索 ctrl + n

    - 全局函数名搜索 ctrl + Shift + Alt + n

    - 文件搜索 ctrl + Shift + n

    - 字符串搜索 ctrl + Shift + f

- 格式化代码  ctrl + Alt + l

- 代码小助手
    - 代码移动 move caret to line 
    - 选中所有符号 ctrl + Shift + Alt + j
    
    - 配置自己的代码 Live Templates (点击 + ， 输入 ， 点击 Define 设置语言)
    ```java
    // psfi
        public static final int $var1$ = $var2$;
    // psfs
        public static final String $var1$ = $var2$;
    // ps
        private String $var1$;
    // psc 
    /**
     * $var1$
     */
    private String $var2$;

    $END$
    // pi    
        private int $var1$;

    ```

    - postfix
        - 100.fori
        - sout
        - name.field
        - user.return
        - user.nn

    - alt + enter
        - 自动创建函数
        - list splace
        - 字符串 format 或 build
        - 实现接口
        - 单词拼写
        - 导包

- 重构
    - 修改名称 Shift + F6
    - 函数参数 ctrl + F6

- 抽取
    - 变量 ctrl + Alt + v
    - 静态变量             
    - 成员变量
    - 方法参数 ctrl + Alt + p （成员变量变方法参数）
    - 函数 ctrl + Alt + m

- git 
    - Annotate 寻找代码修改轨迹 
    - 所有改动的地方 previous change  -- ctrl + Alt + Shift + 向上箭头
    - 撤销 所有 ctrl + Alt + z

- local history 

- 关联一切
    - spring -》 File - Project Structure - Facets - 点击 + - 
    - 数据库 - 连接数据库 - 修改语句 - 修改表名 - 重构

- 调试    