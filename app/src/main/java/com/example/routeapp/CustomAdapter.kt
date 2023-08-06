import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.routeapp.R
import com.example.routeapp.itemViewModel

class CustomAdapter(private val mList: List<itemViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.courses_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.courseImg.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.coursetitle.text = ItemsViewModel.title
        holder.coursehrs.text = ItemsViewModel.hours

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val courseImg: ImageView = itemView.findViewById(R.id.courseImage)
        val coursetitle: TextView = itemView.findViewById(R.id.courseTitle)
        val coursehrs: TextView = itemView.findViewById(R.id.courseHours)
    }
}
