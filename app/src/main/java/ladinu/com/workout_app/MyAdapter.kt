package ladinu.com.workout_app

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView


class MyAdapter(val data: MutableList<String>): RecyclerView.Adapter<CardViewHolder>() {

    override fun getItemCount(): Int  {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_layout, parent, false) as CardView
        return CardViewHolder(v)
    }

    override fun onBindViewHolder(cardViewHolder: CardViewHolder, position: Int) {
        val cv = cardViewHolder.cv.findViewById<CardView>(R.id.cardView)
        val d = data[position]
        val tv1 = cv.findViewById<TextView>(R.id.tView1)
        val tv2 = cv.findViewById<TextView>(R.id.tView2)
        tv1.setText("First $d")
        tv2.setText("Second $d")
    }
}

