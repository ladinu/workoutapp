package ladinu.com.workout_app

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.TextView

class ViewHolder: RecyclerView.ViewHolder {
    var x: CardView? = null
    constructor(v: CardView): super(v) {
        x = v
    }
}

