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
 ##### it init 创建本地仓库 
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
 #### 第一次向远程仓库推送 git push -u -f origin  master 
 ##### 以后提交到远程 git push   origin  master




