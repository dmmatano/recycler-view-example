package com.example.recyclerviewexample

import com.example.recyclerviewexample.model.YtVideo

class VideosDataSource {


    companion object{

        fun createDataSet():ArrayList<YtVideo>{
            val list=ArrayList<YtVideo>()
            list.add(
                YtVideo("Bad Luck Gamblers - Devil's Lucky Dice (official)",
                    "https://img.youtube.com/vi/K10_mjmfLTE/default.jpg",
                    "https://www.youtube.com/watch?v=K10_mjmfLTE"
                )
            )
            list.add(
                YtVideo("Deftones - Change (In The House Of Flies) [Official Music Video]",
                    "https://img.youtube.com/vi/WPpDyIJdasg/default.jpg",
                    "https://www.youtube.com/watch?v=WPpDyIJdasg"
                )
            )
            list.add(
                YtVideo("System Of A Down - Sugar (Official HD Video)",
                    "https://img.youtube.com/vi/5vBGOrI6yBk/default.jpg",
                    "https://www.youtube.com/watch?v=5vBGOrI6yBk"
                )
            )
            list.add(
                YtVideo("Bad Luck Gamblers - 8% (official)",
                    "https://img.youtube.com/vi/RHT_GTw8KEw/default.jpg",
                    "https://www.youtube.com/watch?v=RHT_GTw8KEw"
                )
            )
            list.add(
                YtVideo("Ponto Nulo no Céu - Clarão [CLIPE OFICIAL]",
                    "https://img.youtube.com/vi/jPjUjVVRxeA/default.jpg",
                    "https://www.youtube.com/watch?v=jPjUjVVRxeA"
                )
            )
            list.add(
                YtVideo("GLORIA - A ARTE DE FAZER INIMIGOS (HD)",
                    "https://img.youtube.com/vi/XP8W_tnmkxs/default.jpg",
                    "https://www.youtube.com/watch?v=XP8W_tnmkxs"
                )
            )


            return list
        }


    }


}

