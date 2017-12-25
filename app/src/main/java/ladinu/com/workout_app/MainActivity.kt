package ladinu.com.workout_app

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.util.TypedValue
import java.util.*


class MainActivity : AppCompatActivity() {

    private var mRecyvlerView: RecyclerView? = null

    fun dp2px(dp: Float): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val model = ViewModelProviders.of(this).get(ViewModel::class.java)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Log.d("app", "clicked")
            model.addItem("Foo")
        }

        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)
        recyclerView.addItemDecoration(SpaceDecorator(dp2px(4.0f)))
        val layoutManager = GridLayoutManager(this, 3)
        recyclerView.setLayoutManager(layoutManager);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(false)

        val d = LinkedList<String>()
        val adapter = MyAdapter(d)
        recyclerView.setAdapter(adapter)
        mRecyvlerView = recyclerView

        model.data.observe(this, android.arch.lifecycle.Observer { data ->
            d.clear()
            d.addAll(data!!)
            adapter.notifyDataSetChanged()
        })

    }
}
