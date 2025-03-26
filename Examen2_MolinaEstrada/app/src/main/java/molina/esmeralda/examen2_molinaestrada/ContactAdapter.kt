package molina.esmeralda.examen2_molinaestrada

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView

class ContactAdapter(context: Context, private val contacts: List<Contacto>) : ArrayAdapter<Contacto>(context, 0, contacts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)

        val contact = contacts[position]
        val nameText: TextView = view.findViewById(R.id.tv_Nombre)
        val companyText: TextView = view.findViewById(R.id.tv_Empresa)
        val deleteButton: ImageButton = view.findViewById(R.id.btn_Eliminar)

        nameText.text = "${contact.name} ${contact.surname}"
        companyText.text = contact.company

        deleteButton.setOnClickListener {
            ContactManager.removeContact(contact.id)
            notifyDataSetChanged()
        }
        return view
    }
}