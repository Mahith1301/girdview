package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

internal class gridadapter (private val applist:List<model>, private val context:Context):

    BaseAdapter(){

            private var layoutInflater:LayoutInflater? =null
            lateinit var appName:TextView;
            lateinit var appImage:ImageView;

    override fun getCount(): Int {
       return applist.size
    }

    override fun getItem(position: Int): Any ?{
       return null
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // val -> immutable var ->mutable
        var convertView=convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        if (convertView == null) {
            // on below line we are passing the model layout file
            // which we have to inflate for each item of grid view.
            convertView = layoutInflater!!.inflate(R.layout.item_layout, null)
        }

        //!! -> non null assertion operation
        //taken from item layout
        appName=convertView!!.findViewById(R.id.apptextview)
        appImage=convertView!!.findViewById(R.id.appimage)

        //setting image and text from applist which is given from main
        appName.setText(applist.get(position).appname)
        appImage.setImageResource(applist.get(position).appimage)


        return  convertView

    }

}