package id.kuliah.konekdatabase


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fakultaslist.view.*

class RVAdapterFakultas(private val context: Context, private val arrayList: ArrayList<fakultas>) : RecyclerView.Adapter<RVAdapterFakultas.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.fakultaslist,parent,false))
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.IdList.text = arrayList?.get(position)?.id.toString()
        holder.view.KdList.text = "Kd : "+arrayList?.get(position)?.kd_fakultas
        holder.view.namafakList.text = "Namafak : "+arrayList?.get(position)?.namafak

        holder.view.cvList.setOnClickListener {

            val i = Intent(context,mgfakultas::class.java)
            i.putExtra("editmode","1")
            i.putExtra("id",arrayList?.get(position)?.id)
            i.putExtra("kode fakultas",arrayList?.get(position)?.kd_fakultas)
            i.putExtra("nama fakultas",arrayList?.get(position)?.namafak)
            context.startActivity(i)

        }
    }
    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}