package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gridview:GridView=findViewById(R.id.GV)
        //creating list of applist which is
        var applist:List<model>
        applist=ArrayList<model>()

        //adding name and image to applist
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)


        //connecting applist with adapter
        val gridadapter=gridadapter(applist=applist,this@MainActivity)
        //connecting gridview(main layout) and adapter
        gridview.adapter=gridadapter;

        gridview.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            //(parent, view, position, id)
            // inside on click method we are simply displaying
            // a toast message with course name.

            Toast.makeText(
                applicationContext, applist[position].appname + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}