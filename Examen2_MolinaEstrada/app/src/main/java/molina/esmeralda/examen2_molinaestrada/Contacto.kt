package molina.esmeralda.examen2_molinaestrada

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

data class Contacto(
    val id: Int,
    val name: String,
    val surname: String,
    val company: String,
    val email: String,
    val phone: String,
    val color: Int
)


object ContactManager {
    private val contacts = mutableListOf(
        Contacto(1, "Esmeralda", "Molina", "Salud Pública", "lucia.peña@mail.com", "(644) 555 5555", Color.BLUE)
    )

    fun addContact(contact: Contacto) {
        contacts.add(contact)
    }

    fun removeContact(id: Int) {
        contacts.removeAll { it.id == id }
    }

    fun getContacts(): List<Contacto> {
        return contacts
    }
}