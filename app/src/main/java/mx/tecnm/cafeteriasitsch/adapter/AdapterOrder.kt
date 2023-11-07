package mx.tecnm.cafeteriasitsch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.tecnm.cafeteriasitsch.R
import mx.tecnm.cafeteriasitsch.model.ModelOrder

class AdapterOrder(private var menuList: List<ModelOrder>) :
    RecyclerView.Adapter<AdapterOrder.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_order, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val menu: ModelOrder = menuList[position]

        holder.name.text = menu.nombre
        holder.order.text = menu.pedido
        holder.total.text = menu.total.toString()

        if (menu.entregado) {
            holder.status.text = "Entregado"
        } else {
            holder.status.text = "No entregado"
        }
    }

    override fun getItemCount(): Int {

        return menuList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView = itemView.findViewById(R.id.tvListOrderNameXML)
        var order: TextView = itemView.findViewById(R.id.tvListOrderOrderXML)
        var status: TextView = itemView.findViewById(R.id.tvListOrderStatusXML)
        var total: TextView = itemView.findViewById(R.id.tvListOrderTotalXML)
    }
}