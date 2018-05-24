package my.demo.app6

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import my.demo.app6.model.Business

class BusinessSearchAdapter(
        val businesses: List<Business>
) : RecyclerView.Adapter<BusinessSearchAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent)
    override fun getItemCount() = businesses.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(businesses[position])
    }

    class ViewHolder(
            parent: ViewGroup
    ) : RecyclerView.ViewHolder(parent.inflate(R.layout.business_search_result)) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val name: TextView = itemView.findViewById(R.id.name)

        fun bind(business: Business) {
            name.text = business.name
            Glide.with(image.context).load(business.imageUrl).into(image)
        }
    }
}

private fun ViewGroup.inflate(@LayoutRes layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}
