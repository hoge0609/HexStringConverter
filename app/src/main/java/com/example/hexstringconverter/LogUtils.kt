package com.example.hexstringconverter

import android.util.Log

// ログユーティリティクラス
class LogUtils {
    companion object {
        // ログ出力レベル
        // [VERBOSE：2]、[DEBUG：3]、[INFO：4]、[WARN：5]、[ERROR：6]、[ASSERT：7]
        val logLevel: Int = Log.VERBOSE

        // ログ出力（VERBOSE）
        fun verboseLog(tag: String, msg: String) {
            if (logLevel <= Log.VERBOSE) {
                Log.v(tag, msg)
            }
        }

        // ログ出力（DEBUG）
        fun debugLog(tag: String, msg: String) {
            if (logLevel <= Log.DEBUG) {
                Log.d(tag, msg)
            }
        }

        // ログ出力（INFO）
        fun infoLog(tag: String, msg: String) {
            if (logLevel <= Log.INFO) {
                Log.i(tag, msg)
            }
        }

        // ログ出力（WARN）
        fun warnLog(tag: String, msg: String) {
            if (logLevel <= Log.WARN) {
                Log.w(tag, msg)
            }
        }

        // ログ出力（ERROR）
        fun errorLog(tag: String, msg: String) {
            if (logLevel <= Log.ERROR) {
                Log.e(tag, msg)
            }
        }

        // ログ出力（ASSERT）
        fun assertLog(tag: String, msg: String) {
            if (logLevel <= Log.ASSERT) {
                Log.e(tag, msg)
            }
        }
    }

}