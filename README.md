自用工具包

添加maven仓库

```kotlin
maven("https://maven.rtast.cn/releases")
```

添加依赖

```kotlin
implementation("cn.rtast:rtast-util-all:0.0.1")  // all-in-boom
implementation("cn.rtast:rtast-util-binary:0.0.1")  // 对二进制操作有帮助的拓展函数
implementation("cn.rtast:rtast-util-http:0.0.1")  // 简单的Http工具类
implementation("cn.rtast:rtast-util-string:0.0.1")  // 内置了基本的Base64和使用gson来序列化反序列化json
```

> https://maven.rtast.cn/#/releases/cn/rtast/rtast-util-all 这里查看所有的版本