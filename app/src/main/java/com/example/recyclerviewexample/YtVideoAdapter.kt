package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewexample.model.YtVideo
import kotlinx.android.synthetic.main.item_video.view.*

class YtVideoAdapter(
    private val onItemClicked: (YtVideo) -> Unit
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<YtVideo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return YtVideoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is YtVideoViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class YtVideoViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val videoTitle = itemView.title
        private val videoThumbnail = itemView.thumbnail

        fun bind(video: YtVideo, onItemClicked: (YtVideo) -> Unit) {

            videoTitle.text = video.title

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(video.thumbnailUrl)
                .into(videoThumbnail)

            itemView.setOnClickListener {
                onItemClicked(video)
            }

        }

    }

    fun setList(list: List<YtVideo>) {
        this.items = list
    }


}