package com.example.customrecyclermodule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @param listOfItems is the list of elements that we want to display in the recycler.
 * By default, an empty list is passed to the constructor.
 * @param onClick is lambda that specifies the action when clicked. By default is Unit.
 * @param item is view of single element in recycler. By default it is simple TextView.
 */
class CustomRecyclerAdapter(
    private val listOfItems: MutableList<String> = mutableListOf(),
    private val onClick: (itemName: String) -> Unit = {},
    private val item: Int = R.layout.recycler_item
) :
    RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CustomViewHolder(
            inflater.inflate(
                item,
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

    /**
     * The function updates the recycler by passing a list with elements to it.
     */
    fun updateItemList(updatedList: List<String>) {
        listOfItems.clear()
        listOfItems.addAll(updatedList)
        notifyDataSetChanged()
    }

    /**
     * The function adds a new element to the recycler.
     */
    fun addNewItemToList(item: String) {
        listOfItems.add(item)
        notifyDataSetChanged()
    }
}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
