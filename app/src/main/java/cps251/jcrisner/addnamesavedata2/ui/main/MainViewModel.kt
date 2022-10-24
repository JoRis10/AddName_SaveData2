package cps251.jcrisner.addnamesavedata2.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var nameList = MutableLiveData<String>("")
    var userInput = MutableLiveData<String>()

    fun setList(){
        if(userInput.value != ""){
            nameList.value += userInput.value + "\n"
        }
    }

}