package com.example.rvproject_3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.rvproject_3.R
import com.example.rvproject_3.databinding.ItemRvBinding
import com.example.rvproject_3.models.Images

class RvAdapter(var context: Context, var list: ArrayList<Images> = ArrayList()): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBinding(images: Images){
            itemRvBinding.imageView.setImageResource(images.image)
            itemRvBinding.textView.text = images.imageName

            val anim = AnimationUtils.loadAnimation(context, R.anim.rv_animation)
            itemRvBinding.root.startAnimation(anim)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBinding(list[position])
    }
}