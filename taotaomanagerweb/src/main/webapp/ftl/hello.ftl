${hello}   //普通取值

${val!"我是默认值"}  //为NULL的时候的默认值


//循环 和 日期类型的处理
<#list  stulist as stu>
    序号：${stu_index}  编号：${stu.id}  名字：${stu.name} 年龄： ${stu.age}  生日：${stu.birthday?string("yyyy-MM-dd HH:mm:ss")}
</#list>

//对象取值
单个学生信息
${student.id}
${student.name}
${student.age}
${student.birthday?string("yyyy-MM-dd HH:mm:ss")}

//判断
<#if student.id==10>
我是第10号学生
<#else>
${student.id}
</#if>

//判断NULL值
<#if  hello??>
Student已经有值了，${student.name}
<#else >
Student是空的
</#if>

//导入模板
include标签测试：尖括号内 #include 后面追加需要导入的文件名称