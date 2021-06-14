package fibonacci.com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRecyclerView(var numsList: List<BigInteger>): RecyclerView.Adapter<NumsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers,parent,false)
    return NumsViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {
        holder.tvNum.text= numsList.get(position).toString()
    }

    override fun getItemCount(): Int {
       return numsList.size
    }
}

class NumsViewHolder(var itemView: View):RecyclerView.ViewHolder(itemView){
   var tvNum=itemView.findViewById<TextView>(R.id.tvNum)
}

