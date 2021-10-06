package com.example.hexstringconverter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hexstringconverter.databinding.ActivityMainBinding

// メインアクティビティクラス
class MainActivity : AppCompatActivity() {
    // タグ
    private val tag: String = this::class.java.simpleName
    // ビューバインディング
    private lateinit var binding: ActivityMainBinding

    // アクティビティ作成
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LogUtils.verboseLog(tag, "onCreate")

        // WORDテキストビュー初期化
        binding.textViewWord.setText("---")
        // LONGWORDテキストビュー初期化
        binding.textViewLongWord.setText("---")
    }

    // アクティビティ破棄
    override fun onDestroy() {
        super.onDestroy()
        LogUtils.verboseLog(tag, "onDestroy")
    }

    // アクティビティ再開
    override fun onResume() {
        super.onResume()
        LogUtils.verboseLog(tag, "onResume")
    }

    // アクティビティ停止
    override fun onPause() {
        super.onPause()
        LogUtils.verboseLog(tag, "onPause")
    }

    // 「変換」ボタンクリックイベント
    fun onClickButton_convert(view: View) {
        LogUtils.verboseLog(tag, "onClickButton_convert")

        var inputText: String = ""
        var wordStr: String = ""
        var longWordStr: String = ""

        try {
            // WORDテキストビュー初期化
            binding.textViewWord.setText("---")
            // LONGWORDテキストビュー初期化
            binding.textViewLongWord.setText("---")

            // 入力テキスト取得
            inputText = binding.editTextInput.text.toString()
            // 文字数チェック
            if (inputText.length < 1) {
                return
            }

            // WORDテキストに変換
            wordStr = Integer.parseUnsignedInt(inputText, 16).toShort().toString()
            LogUtils.verboseLog(tag, ("wordStr = " + wordStr))
            binding.textViewWord.setText(wordStr)

            // LONGWORDテキストビューに変換
            longWordStr = Integer.parseUnsignedInt(inputText, 16).toString()
            LogUtils.verboseLog(tag, ("longWordStr = " + longWordStr))
            binding.textViewLongWord.setText(longWordStr)
        } catch (e: Exception) {
            LogUtils.errorLog(tag, ("onClickButton_convert::" + e.message))
        }
    }

    // 「終了」ボタンクリックイベント
    fun onClickButton_close(view: View) {
        LogUtils.verboseLog(tag, "onClickButton_close")
        // アプリ終了
        finish()
        moveTaskToBack(true)
    }

}