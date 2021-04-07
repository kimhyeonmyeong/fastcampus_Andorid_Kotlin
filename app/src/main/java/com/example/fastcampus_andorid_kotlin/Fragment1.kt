package com.example.fastcampus_andorid_kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment1: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 프레그먼트가 인터페이스를 처음으로 그릴 때 호출됩니다.
        // inflater : View를 그려주는 역할입니다.
        // container : 부모뷰

        Log.d("Life_cycle", "F onCreateView")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

}