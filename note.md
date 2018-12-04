 # git总结
 ### 1.配置用户名
 ##### git config --global user.name "你的用户名"
 ### 2.配置邮箱 
 #####  git config --global user.email "你的邮箱" 
 ### 3.编码配置
 #####   避免git gui中的中文乱码
 #####   git config --global gui.encoding utf-8
 #####   避免 git status显示的中文文件名乱码
 #####   git config --global core.quotepath off 
 ### 4.git常用命令
 ##### git init 创建本地仓库 
 ##### git add  添加到暂存区 
 ##### git commit -m "描述" 提交到本地仓库 
 ##### git status 检查工作区文件状态 
 ##### git log  查看提交committed 
 ##### git reset --hard committid  版本回退 
 ##### git branch 查看分支 
 ##### git checkout -b dev 创建并切换到dev分支 
 ##### 切换分支：git checkout 分支名 
 ##### 拉取: git pull 
 ##### 提交: git push -u origin master 
 ##### 分支合并: git merge branchname
 ### 5.关联 
 #### git remote add origin  "远程仓库地址"
 #### 第一次向远程仓库推送 git push -u -f origin  master 
 ##### 以后提交到远程 git push   origin  master
 ## -----------------------------------------------------
 # 电商项目-需求分析
 ## 核心-购买
 ### 一、用户模块
 #### 登录
 #### 注册
 #### 忘记密码
 #### 获取用户信息
 #### 修改密码
 #### 登出
 ### 二、商品模块
 #### 后台
 #### 添加商品
 #### 修改商品
 #### 删除商品
 #### 商品上下架
 #### 查看商品
 #### 前台（门户）
 #### 搜索商品
 #### 查看商品详情
 ### 三、类别模块
 #### 添加类别
 #### 修改类别
 #### 删除类别
 #### 查看类别
 #### 查看子类
 #### 查看后代类别
 ### 四、购物车模块
 #### 添加到购物车
 #### 修改购物车中某个商品的数量
 #### 删除购物车商品
 #### 全选/取消全选
 #### 单选/取消单选
 #### 查看购物车中商品数量
 ### 五、地址模块
 #### 添加地址
 #### 修改地址
 #### 删除地址
 #### 查看地址
 ### 六、订单模块
 #### 前台
 ##### 下订单
 ##### 订单列表
 ##### 取消订单
 ##### 订单详情
 #### 后台
 ##### 订单列表
 ##### 订单详情
 ##### 发货
 ### 七、支付模块
 #### 支付宝支付
 #### 支付
 #### 支付回调
 #### 查看支付状态
 ### 八、线上部署
 #### 阿里云部署
 #### ------------------------------------------
 # 数据库表设计
 ### 创建数据库
 ```
 create database ilearshopping;
 use ilearshopping;
 ```
 ### 用户表
 ```
 create table neuedu_user(
 `id` int(11) not null auto_increment comment '用户id',
 `username` varchar(50) not null comment '用户名',
 `password` varchar(50) not null comment '密码',
 `email` varchar(50) not null comment '邮箱',
 `phone` varchar(11) not null comment '联系方式',
 `question` varchar(100) not null comment '密保问题',
 `answer` varchar(100) not null comment '答案',
 `role` int(4) not null default 0 comment '用户角色',
 `create_time` datetime comment '创建时间',
 `update_time` datetime comment '修改时间',
 PRIMARY KEY(`id`),
 UNIQUE KEY `user_name_index`(`username`) USING BTREE
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8
 ```
 ### 类别表
 ```
 create table neuedu_category(
 `id` int(11) not null auto_increment comment '类别id',
 `parent_id` int(11) not null default 0 comment '父类id',
 `name` varchar(50) not null comment '类别名称',
 `status` int(4) default 1 comment '类别状态1：正常2：废弃',
 `create_time` datetime comment '创建时间',
 `update_time` datetime comment '修改时间',
 PRIMARY KEY(`id`)
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8
 ```
 ### 商品表
 ```
 create table neuedu_product(
 `id` int(11) not null auto_increment comment '商品id',
 `category_id` int(11) not null comment '类别id',
 `name` varchar(100) not null comment '商品名称',
 `datail` text comment '商品详情',
 `subtitle` varchar(200) comment '商品副标题',
 `main_image` varchar(100) comment '商品主图',
 `sub_image` varchar(200) comment '商品子图',
 `price` decimal(20,2) not null comment '商品价格',
 `stock` int(11) comment '库存',
 `status` int(6) default 1 comment '商品状态1在售2下架3删除',
 `create_time` datetime comment '创建时间',
 `update_time` datetime comment '修改时间',
 PRIMARY KEY(`id`)
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8
 ```
 
 ### 购物车
 ```
 create table neuedu_cart(
 `id` int(11) not null auto_increment comment '购物车id',
 `user_id` int(11) not null comment '用户id',
 `product_id` int(11) not null comment '商品id',
 `quantity` int(11) not null comment '购买数量',
 `checked` int(4) default 1 comment '1选中 0未选中',
 `create_time` datetime comment '创建时间',
 `update_time` datetime comment '修改时间',
 PRIMARY KEY(`id`),
 KEY `user_id_index`(`user_id`) USING BTREE
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8
```
