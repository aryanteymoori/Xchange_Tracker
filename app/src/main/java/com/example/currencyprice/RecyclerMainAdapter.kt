package com.example.currencyprice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.currencyprice.databinding.RecyclerMainItemBinding
import com.example.currencyprice.remote.dataModel.ContentModel
import java.text.DecimalFormat


class RecyclerMainAdapter(
    private val allData:ArrayList<ContentModel>
):RecyclerView.Adapter<RecyclerMainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        return MainViewHolder(
            RecyclerMainItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,false
            )
        )

    }

    override fun getItemCount(): Int = allData.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.setData(allData[position])
    }

    inner class MainViewHolder(
        private val binding:RecyclerMainItemBinding
    ):ViewHolder(binding.root){

        fun formatPriceWithCommas(price: Int): String {
            val formatter = DecimalFormat("#,###")
            return formatter.format(price)
        }

        fun setData(data : ContentModel){
            binding.txtLabel.text = data.label
            binding.txtPrice.text = formatPriceWithCommas((data.price / 10))
        }

    }

}