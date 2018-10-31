package com.example.sharedpreference_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = SharedpreferenceUtil.getData(applicationContext,"asdf")
        setListeners()
    }

    private fun setListeners(){
        saveButton.setOnClickListener {
            val value : String = editText.text.toString()
            SharedpreferenceUtil.saveData(applicationContext,"asdf",value)
            Toast.makeText(applicationContext, "성공적으로 저장되었습니다.",Toast.LENGTH_SHORT).show()
            editText.setText("")
        }

        loadButton.setOnClickListener {
            var value : String = SharedpreferenceUtil.getData(applicationContext,"asdf")
            textView.text = value
            Toast.makeText(applicationContext,"성공적으로 불러왔습니다",Toast.LENGTH_SHORT)
        }
    }

}

