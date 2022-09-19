# SpringBoot学习笔记——核心功能

1. 配置文件

   - properties：同以前的用法

   - yaml：

     - 基本语法：

       - key： value；kv之间有空格
       - 大小写敏感
       - 缩进不允许使用tab，只允许空格
       - 缩进的空格数不重要，只要相同层级的元素左对齐即可
       - "#"表示注释
       - 字符串无需加引号，' ' / " "表示字符串内容会被  转义 / 不转义

     - 数据类型：

       - 字面量：单个的，不可再分的。date、boolean、string、number、null

       ```yaml
       k: v
       ```

       - 对象：键值对的集合。map、hash、set、object

       ```yaml
       行内写法:   k: {k1: v1, k2: v2, k3: v3}
       # 或
       k:
         k1: v1
         k2: v2
         k3: v3
       ```

       - 数组：一次按次序排列的值。array、list、queue

       ```yaml
       行内写法:   k: [v1, v2, v3]
       # 或
       k:
         - v1
         - v2
         - v3
       ```

       

       - 

   - 

2. 