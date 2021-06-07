package com.example.todomvvmbymyself.model

data class Todo(

    var contents : String,      // 할일 내용
    var isCompleted : Boolean , // 할일 완료 여부 (완료 시 -- 처리 및 텍스트 글자 red 컬러 적용)

)
