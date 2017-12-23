package ladinu.com.workout_app

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView


class MyAdapter(val myData: MutableList<String>) : RecyclerView.Adapter<ViewHolder>() {
    override fun getItemCount(): Int  = myData.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
                .inflate(R.layout.card_layout, parent, false) as CardView
        Log.d("app", "1##############")
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        Log.d("app", "2##############")
        val cv = holder!!.v.findViewById<CardView>(R.id.cardView)
        val d = myData[position]
        val tv1 = cv.findViewById<TextView>(R.id.tView1)
        val tv2 = cv.findViewById<TextView>(R.id.tView2)
        tv1.setText(d)
    }
}

