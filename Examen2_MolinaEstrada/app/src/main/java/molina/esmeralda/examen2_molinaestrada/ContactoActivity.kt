package molina.esmeralda.examen2_molinaestrada

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ContactoActivity : AppCompatActivity() {
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.lv_contactos)
        val btnAgregar: Button = findViewById(R.id.btn_agregarContacto)

        contactAdapter = ContactAdapter(this, ContactManager.getContacts())
        listView.adapter = contactAdapter

        btnAgregar.setOnClickListener {
            startActivity(Intent(this, AgregarContactoActivity::class.java))
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            val contact = ContactManager.getContacts()[position]
            val intent = Intent(this, DetalleContactoActivity::class.java).apply {
                putExtra("contact_id", contact.id)
            }
            startActivity(intent)
        }
    }
}