package com.example.todomvvmbymyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.todomvvmbymyself.databinding.ActivityMainBinding
import com.example.todomvvmbymyself.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG: String = "MainActivity : "


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        // 라이브 데이터 때문에 하는 것. = live data 의 라이프사이클 인식을 위해서
        binding.lifecycleOwner = this

        // 뷰모델 선언 - AndroidViewModel 사용 할 경우 viewmodel 객체 설정
        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = mainViewModel // 뷰모델 연결

    }

    fun btnClick(view : View){
        Toast.makeText(this,"Button Click", Toast.LENGTH_SHORT).show()
    }

}