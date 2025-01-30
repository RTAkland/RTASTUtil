自用工具包

添加maven仓库

```kotlin
maven("https://repo.maven.rtast.cn/releases")
```

添加依赖

```kotlin
implementation("cn.rtast:rtast-util-all:1.0.0")  // all-in-boom
implementation("cn.rtast:rtast-util-binary:1.0.0")  // 对二进制操作有帮助的拓展函数
implementation("cn.rtast:rtast-util-http:1.0.0")  // 简单的Http工具类
implementation("cn.rtast:rtast-util-string:1.0.0")  // 内置了基本的Base64和使用gson来序列化反序列化json
```

> https://repo.maven.rtast.cn/#/releases/cn/rtast/rtast-util-all 这里查看所有的版本