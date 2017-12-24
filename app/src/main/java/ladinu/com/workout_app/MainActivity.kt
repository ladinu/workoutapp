package ladinu.com.workout_app

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import java.util.*


class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("app", "1##############")

        mRecyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView!!.setHasFixedSize(false)

        // specify an adapter (see also next example)
        val d = (1..3).map { i -> "Hellqqqqqqqqqqqqqqqqqqqqqqqqqqqqo $i" }.toMutableList()
        val data = LinkedList<String>(d)
        val adapter = MyAdapter(data)
        mRecyclerView!!.setAdapter(adapter)
        // use a linear layout manager
        val layoutManager = GridLayoutManager(this, 3)
        mRecyclerView!!.setLayoutManager(layoutManager);


        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { v ->
            Log.i("app", "Clicked")
            data.addLast("Added iten")
            adapter.notifyItemInserted(data.size - 1)
        }

//        val intent = Intent(AlarmClock.ACTION_SET_TIMER)
//                .putExtra(AlarmClock.EXTRA_MESSAGE, "Hello timer message")
//                .putExtra(AlarmClock.EXTRA_LENGTH, 10)
//
//        if (intent.resolveActivity(packageManager) != null){
//            startActivity(intent)
//        }
    }
}
