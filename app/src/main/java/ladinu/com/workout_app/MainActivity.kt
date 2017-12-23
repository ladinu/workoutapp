package ladinu.com.workout_app

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log


class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<ViewHolder>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("app", "1##############")

        mRecyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView?.setHasFixedSize(true)

        // use a linear layout manager
        mLayoutManager = GridLayoutManager(this, 3)
        mRecyclerView?.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        val data = (1..3).map { i -> "Hellqqqqqqqqqqqqqqqqqqqqqqqqqqqqo $i" }.toMutableList()
        mAdapter = MyAdapter(data)
        mRecyclerView?.setAdapter(mAdapter)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { v ->
            Log.i("app", "Clicked")
//            data.add("Added item")
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
