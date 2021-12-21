package com.example.recyclerviewexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var ytVideoAdapter: YtVideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()


    }


    private fun initRecyclerView() {

        ytVideoAdapter = YtVideoAdapter { vid ->
            openLink(vid.link)
        }

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ytVideoAdapter
        }

    }


    private fun openLink(link: String) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(browserIntent)

    }

    private fun addDataSource() {

        val dataSource = VideosDataSource.createDataSet()
        ytVideoAdapter.setList(dataSource)

    }


}