package com.example.sharedpreference_example

import android.content.Context
import android.content.SharedPreferences

//Util로 객체를 생성하지 않고 접근
object SharedpreferenceUtil{

    //Key를 이용해 저장한 값을 가져오기
    fun getData(context : Context, key : String) : String {
        //객체 생성
        val sharedPreferences : SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
        //key값에 해당하는 값을 가져옴. key에 해당하는 값이 없다면 지정된 기본값 리턴
        return sharedPreferences.getString(key,"")
    }

    //key,value형식으로 값을 저장하기
    fun saveData(context: Context, key: String, value : String){
        //객체 생성
        val sharedPreferences : SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
        //수정 작업을 할 수 있는 객체 생성
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        //값을 저장
        editor.putString(key, value)
        //적용
        editor.apply()
    }
}

