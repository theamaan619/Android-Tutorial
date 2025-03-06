package com.example.designapp


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handle Alert Dialog Button
        findViewById<Button>(R.id.showAlertDialogButton).setOnClickListener {
            showAlertDialog()
        }

        // Handle Custom Dialog Button
        findViewById<Button>(R.id.showCustomDialogButton).setOnClickListener {
            showCustomDialog()
        }

        // Handle DialogFragment Button
        findViewById<Button>(R.id.showDialogFragmentButton).setOnClickListener {
            showDialogFragment()
        }
    }

    // Inflate Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    // Handle Menu Clicks
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_settings -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_about -> {
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Alert Dialog Function
    private fun showAlertDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit Confirmation")
        builder.setMessage("Are you sure you want to exit?")
        builder.setPositiveButton("Yes") { dialog, _ -> finish() }
        builder.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
        builder.create().show()
    }

    // Custom Dialog Function
    private fun showCustomDialog() {
        val dialog = CustomDialogFragment()
        dialog.show(supportFragmentManager, "CustomDialog")
    }

    // Dialog Fragment Function
    private fun showDialogFragment() {
        val dialog = MyDialogFragment()
        dialog.show(supportFragmentManager, "MyDialog")
    }
}
