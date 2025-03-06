package com.example.designapp


import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireContext())
        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_dialog, null)
        dialog.setContentView(view)

        val editText = view.findViewById<EditText>(R.id.dialogEditText)
        val submitButton = view.findViewById<Button>(R.id.submitDialogButton)

        submitButton.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(requireContext(), "You entered: $inputText", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        return dialog
    }
}
