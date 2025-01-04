/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")

package cn.rtast.rutil.binary

import java.nio.ByteBuffer

/**
 * 在ByteBuffer中写入一个Boolean值
 */
fun ByteBuffer.putBoolean(value: Boolean) {
    put(if (value) 1.toByte() else 0.toByte())
}

/**
 * 从ByteBuffer中读取一个Boolean值
 */
fun ByteBuffer.getBoolean(): Boolean {
    return get() == 1.toByte()
}