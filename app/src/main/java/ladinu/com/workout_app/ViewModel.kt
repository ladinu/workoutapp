package ladinu.com.workout_app

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.util.Log
import java.util.*

class ViewModel(app: Application) : AndroidViewModel(app) {
    private val state = LinkedList<String>()

    val data: MutableLiveData<LinkedList<String>> = MutableLiveData()

    init {
        state.add("Initial item")
        data.value = state
    }

    fun addItem(item: String)  {
        Log.d("app", "---------------")
        state.addLast(item)
        data.value = state
    }
}