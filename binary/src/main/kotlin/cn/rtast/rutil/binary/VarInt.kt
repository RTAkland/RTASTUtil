/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/4
 */

@file:Suppress("unused")
@file:JvmName("BinaryVarInt")

package cn.rtast.rutil.binary

import java.io.DataInputStream
import java.io.DataOutputStream
import java.nio.ByteBuffer

/**
 * 从 [DataInputStream] 读取一个 VarInt
 */
fun DataInputStream.readVarInt(): Int {
    var value = 0
    var i = 0
    var b: Int
    while (this.read().also { b = it } != -1) {
        value = value or ((b and 0x7F) shl i * 7)
        if (b and 0x80 == 0) {
            return value
        }
        i++
    }
    return -1
}

/**
 * 向 [DataOutputStream] 写入一个 VarInt
 */
fun DataOutputStream.writeVarInt(value: Int) {
    var v = value
    while ((v and 0x7F.inv()) != 0) {
        this.write((v and 0x7F) or 0x80)
        v = v ushr 7
    }
    this.write(v)
}

/**
 * 从 [ByteBuffer] 读取一个 VarInt
 */
fun ByteBuffer.readVarInt(): Int {
    var value = 0
    var i = 0
    var b: Int
    while (true) {
        b = this.get().toInt() and 0xFF
        value = value or ((b and 0x7F) shl (i * 7))
        if (b and 0x80 == 0) {
            return value
        }
        i++
    }
}

/**
 * 向 [ByteBuffer] 写入一个 VarInt
 */
fun ByteBuffer.writeVarInt(value: Int) {
    var v = value
    while ((v and 0x7F.inv()) != 0) {
        this.put(((v and 0x7F) or 0x80).toByte())
        v = v ushr 7
    }
    this.put(v.toByte())
}