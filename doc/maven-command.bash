#打包语法:mvn package -PprofileID -DskipTests
#@ package   --周期只进行到package阶段
#@ -P        --指定要激活的profile(可选，不指定时激活默认active的profile）
#@ profileID --在pom的project.build.profiles.profile.id节点定义的ID
#@ -D        --指定系统变量（可选）
#@ skipTests --跳过测试(完整版为maven.test.skip=true,既跳过测试,也跳过测试代码的编译.也可以在pom里定义surefire插件并配置该参数）

#打包示范（生产环境）
mvn clean package -Pprod -DskipTests

#----------------------------------------------------------------------#

#测试语法:mvn test -Dtest=MyFirstTest
#@ test        --周期只进行到test阶段
#@ -D          --指定系统变量(可选),不指定时,对所有类名符合规则的测试类进行test
#@ MyFirstTest --指定测试类类名

#测试示范(全部测试)
mvn test

#----------------------------------------------------------------------#

#运行
mvn clean install tomcat7:run -Pdev

#部署
mvn clean install tomcat7:deploy -Pprod
