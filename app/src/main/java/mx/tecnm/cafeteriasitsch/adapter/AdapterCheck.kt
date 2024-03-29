package mx.tecnm.cafeteriasitsch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.tecnm.cafeteriasitsch.R
import mx.tecnm.cafeteriasitsch.model.ModelMenu

class AdapterCheck(private val menuList: ArrayList<ModelMenu>) :
    RecyclerView.Adapter<AdapterCheck.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_check, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val menu: ModelMenu = menuList[position]

        holder.cantidad.text = menu.cantidad.toString()
        holder.nombre.text = menu.nombre
        holder.precio.text = menu.precio.toString()
        holder.total.text = menu.total.toString()
    }

    override fun getItemCount(): Int {

        return menuList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var cantidad: TextView = itemView.findViewById(R.id.tvListOrderOrderXML)
        var nombre: TextView = itemView.findViewById(R.id.tvListOrderStatusXML)
        var precio: TextView = itemView.findViewById(R.id.tvListOrderNameXML)
        var total: TextView = itemView.findViewById(R.id.tvListOrderTotalXML)
    }
}