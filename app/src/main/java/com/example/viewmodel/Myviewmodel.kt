package com.example.viewmodel

import androidx.lifecycle.ViewModel

class Myviewmodel : ViewModel(){
    var count:Int=0
    fun increment(){
        count++
    }
}