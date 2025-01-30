/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")
@file:JvmName("BinaryByteBuffer")

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

/**
 * 直接使用拓展属性的getter/setter来取出/放入
 * Boolean类型的数据
 */
var ByteBuffer.boolean
    get() = this.getBoolean()
    set(value) {
        putBoolean(value)
    }

/**
 * 兼容Java的取出Boolean
 */
fun getBoolean(buffer: ByteBuffer): Boolean {
    return buffer.getBoolean()
}

/**
 * 兼容Java的放入Boolean
 */
fun putBoolean(buffer: ByteBuffer, value: Boolean) {
    buffer.putBoolean(value)
}