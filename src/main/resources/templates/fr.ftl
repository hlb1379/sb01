<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
  呵呵，fr
<hr/>
${name}
<hr/>
${user}
  <hr/>
${user.name}
  <hr/>
${user.age}
  <hr/>
${user.dog}
  <hr/>
${user.dog.name}
  <hr/>
<#list list as us>
    ${us.name}----
    ${us.age}----
    ${us.dog.name}
<hr/>

    <#if us.name="张三">
    abc
    </#if>
</#list>
<hr/>
  <#if name="张三">
  啦啦啦
  </#if>
<hr/>
  <#if name="张三">
  啦啦啦
  <#elseif name="李晨">
  李晨
  <#else>
  不知道
  </#if>
<hr/>
<#if number=23>
    23
<#elseif number=12>
    12
<#elseif number=520>
    520
<#else >
    5201314
</#if>
<hr/>
${sdfffsa!"我是默认值"}

</body>
</html>
