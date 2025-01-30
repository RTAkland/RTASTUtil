/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")

package cn.rtast.rutil.string

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

/**
 * 可变对象可以更改使用的Gson对象配置
 */
var rtastUtilGson: Gson = GsonBuilder()
    .setPrettyPrinting()
    .disableHtmlEscaping()
    .create()

/**
 * 将对象转换为json字符串
 */
fun Any.toJson(): String {
    return rtastUtilGson.toJson(this)
}

/**
 * 将json字符串转换为对象
 */
inline fun <reified T> String.fromJson(): T {
    return rtastUtilGson.fromJson(this, T::class.java)
}

/**
 * 将json字符串转换为数组对象
 */
inline fun <reified T> String.fromArrayJson(): T {
    return rtastUtilGson.fromJson(this, object : TypeToken<T>() {}.type)
}