package com.example.todomvvmbymyself.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.todomvvmbymyself.model.Todo

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val TAG: String = "ViewModel : "

    /**
     * LiveData = 읽기 전용
     * MutableLiveData = 추가수정삭제 가능
     */
    // Todo 객체를 포함하는 List 형태의 MutableLiveData
    var todos : MutableLiveData<List<Todo>>


    /** 추가할 Text
    1. 추가 버튼 누를 시에 EditText 의 입력된 Text 가 newTodo 에 할당됨
    2. 할당된 Text가 MainViewModel 의  insert 함수를 통해 viewModelScope(ViewModel 비동기 처리를 통해 처리됨)
     */
    var newTodo: String? = null

    // 초창기 초기화
    // 데이터 전체 추출 하여 할당
    // todos = getAll()
    init {
        // 일반 비어있는 초기화
        todos = MutableLiveData<List<Todo>>()
    }
    // Create
    // suspend : 난 무조건 코루틴 안에서 비동기로 처리되어야 한다
    fun insert(todo: String) {
        Log.e(TAG,"할일 : $todo")

    }



    // Read : 데이터 전체 추출
//    fun getAll(): MutableLiveData<List<Todo>> {
//        return db.todoDao().getAll()
//    }
    // Update
    // Delete
}