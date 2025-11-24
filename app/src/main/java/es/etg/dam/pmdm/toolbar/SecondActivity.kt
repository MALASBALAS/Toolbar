package es.etg.dam.pmdm.toolbar

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_two)
        val toolbar = findViewById<Toolbar>(R.id.toolbar_two)

        toolbar.setTitle("Segunda")

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.id_navegar){
            navegar();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private fun navegar() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
