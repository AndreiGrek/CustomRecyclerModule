package com.example.customrecyclermodule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(
    private val listOfItems: MutableList<String>,
    private val onClick: (itemName: String) -> Unit = {}
) :
    RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CustomViewHolder(
            inflater.inflate(
                R.layout.recycler_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        bindTest(holder, position)
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }

    private fun bindTest(holder: CustomViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.recycler_item).text = listOfItems[position]

        holder.itemView.setOnClickListener {
            onClick.invoke(listOfItems[position])
        }
    }

    fun updateItemList(updatedList: List<String>) {
        listOfItems.clear()
        listOfItems.addAll(updatedList)
        notifyDataSetChanged()
    }

    fun addNewItemToList(item: String) {
        listOfItems.add(item)
        notifyDataSetChanged()
    }
}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
