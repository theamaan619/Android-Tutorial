package com.example.designapp



import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle("Fragment Dialog")
            .setMessage("This is a DialogFragment.")
            .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
            .create()
    }
}
