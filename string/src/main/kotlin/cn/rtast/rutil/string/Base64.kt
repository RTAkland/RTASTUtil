/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")
@file:JvmName("Base64Util")

package cn.rtast.rutil.string

import java.util.*

/**
 * 将字符串编码成base64字符串
 */
fun String.encodeToBase64(): String {
    return Base64.getEncoder().encodeToString(this.toByteArray(Charsets.UTF_8))
}

/**
 * 将ByteArray编码成base64字符串
 */
fun ByteArray.encodeToBase64(): String {
    return Base64.getEncoder().encodeToString(this)
}

/**
 * 将base64字符串解码成字符串
 */
fun String.decodeToString(): String {
    return String(Base64.getDecoder().decode(this), Charsets.UTF_8)
}

/**
 * 将base64字符串解码成ByteArray
 */
fun String.decodeToByteArray(): ByteArray {
    return Base64.getDecoder().decode(this)
}

fun encodeToBase64(string: String): String {
    return string.encodeToBase64()
}

fun decodeToBase64(string: String): String {
    return string.decodeToString()
}

fun encodeToBase64(bytes: ByteArray): String {
    return bytes.encodeToBase64()
}

fun decodeToBase64(bytes: ByteArray): String {
    return bytes.decodeToString()
}

fun decodeToByteArray(string: String): ByteArray {
    return string.decodeToByteArray()
}