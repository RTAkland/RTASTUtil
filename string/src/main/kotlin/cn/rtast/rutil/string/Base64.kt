/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")

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