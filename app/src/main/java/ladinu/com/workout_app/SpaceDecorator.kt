package ladinu.com.workout_app

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class SpaceDecorator(val spaceDp: Int): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.set(spaceDp, spaceDp, 0, 0)
    }
}
