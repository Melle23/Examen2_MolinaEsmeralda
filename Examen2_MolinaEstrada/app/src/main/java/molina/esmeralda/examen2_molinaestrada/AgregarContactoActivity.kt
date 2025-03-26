package molina.esmeralda.examen2_molinaestrada

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AgregarContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_contacto)

        val btnGuardar: Button = findViewById(R.id.btn_Guardar)
        btnGuardar.setOnClickListener {
            val nombre = findViewById<EditText>(R.id.et_nombre).text.toString()
            val apellidos = findViewById<EditText>(R.id.et_apellidos).text.toString()
            val telefono = findViewById<EditText>(R.id.et_telefono).text.toString()
            val email = findViewById<EditText>(R.id.et_email).text.toString()
            val id = ContactManager.getContacts().size + 1
            val color = Color.RED

            ContactManager.addContact(Contacto(id, nombre, apellidos, "", email, telefono, color))
            finish()
        }
    }
}