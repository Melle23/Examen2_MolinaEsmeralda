package molina.esmeralda.examen2_molinaestrada

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LlamadaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamar)

        val btnColgar: Button = findViewById(R.id.btnColgar)
        btnColgar.setOnClickListener {
            val intent = Intent(this, ContactAdapter::class.java )
            startActivity(intent)
        }
    }
}
