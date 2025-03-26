package molina.esmeralda.examen2_molinaestrada

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val contactId = intent.getIntExtra("contact_id", -1)
        val contact = ContactManager.getContacts().find { it.id == contactId }

        if (contact != null) {
            findViewById<TextView>(R.id.txtNombre).text = "${contact.name} ${contact.surname}"
            findViewById<TextView>(R.id.txtCargo).text = contact.company
            findViewById<TextView>(R.id.txtCorreo).text = contact.email
            findViewById<TextView>(R.id.txtTelefono).text = contact.phone

            val btnLlamar: Button = findViewById(R.id.btnLlamar)
            btnLlamar.text = "Llamar a ${contact.name}"
            btnLlamar.setOnClickListener {
                val intent = Intent(this, LlamadaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}