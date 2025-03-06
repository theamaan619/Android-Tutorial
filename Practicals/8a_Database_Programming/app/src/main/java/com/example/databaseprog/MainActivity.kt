package com.example.databaseprog

import com.example.databaseprog.DatabaseHelper
import com.example.databaseprog.R

import android.database.Cursor
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dbHelper: DatabaseHelper
    private lateinit var etId: EditText
    private lateinit var etName: EditText
    private lateinit var etAge: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnUpdate: Button
    private lateinit var btnDelete: Button
    private lateinit var btnView: Button
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = DatabaseHelper(this)

        etId = findViewById(R.id.etId)
        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        btnAdd = findViewById(R.id.btnAdd)
        btnUpdate = findViewById(R.id.btnUpdate)
        btnDelete = findViewById(R.id.btnDelete)
        btnView = findViewById(R.id.btnView)
        listView = findViewById(R.id.listView)

        btnAdd.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toIntOrNull() ?: 0

            if (dbHelper.insertStudent(name, age)) {
                Toast.makeText(this, "Student Added", Toast.LENGTH_SHORT).show()
                loadData()
            } else {
                Toast.makeText(this, "Insert Failed", Toast.LENGTH_SHORT).show()
            }
        }

        btnUpdate.setOnClickListener {
            val id = etId.text.toString().toIntOrNull() ?: return@setOnClickListener
            val name = etName.text.toString()
            val age = etAge.text.toString().toIntOrNull() ?: 0

            if (dbHelper.updateStudent(id, name, age)) {
                Toast.makeText(this, "Student Updated", Toast.LENGTH_SHORT).show()
                loadData()
            } else {
                Toast.makeText(this, "Update Failed", Toast.LENGTH_SHORT).show()
            }
        }

        btnDelete.setOnClickListener {
            val id = etId.text.toString().toIntOrNull() ?: return@setOnClickListener

            if (dbHelper.deleteStudent(id)) {
                Toast.makeText(this, "Student Deleted", Toast.LENGTH_SHORT).show()
                loadData()
            } else {
                Toast.makeText(this, "Delete Failed", Toast.LENGTH_SHORT).show()
            }
        }

        btnView.setOnClickListener { loadData() }

        loadData()
    }

    private fun loadData() {
        val cursor: Cursor = dbHelper.getAllStudents()
        val students = mutableListOf<String>()

        while (cursor.moveToNext()) {
            val id = cursor.getInt(0)
            val name = cursor.getString(1)
            val age = cursor.getInt(2)
            students.add("ID: $id  Name: $name  Age: $age")
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, students)
        listView.adapter = adapter
    }
}
