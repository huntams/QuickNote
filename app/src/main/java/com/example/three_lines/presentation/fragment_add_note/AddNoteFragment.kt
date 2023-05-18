package com.example.three_lines.presentation.fragment_add_note

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.three_lines.R
import com.example.three_lines.databinding.FragmentAddNoteBinding
import com.example.three_lines.presentation.list.NotesListViewModel

class AddNoteFragment : Fragment(R.layout.fragment_add_note) {
    private val viewModel by viewModels<NotesListViewModel>()
    private val binding by viewBinding(FragmentAddNoteBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            toolbar.setNavigationOnClickListener {
                findNavController().popBackStack()
            }
            floatingActionButton.setOnClickListener {
                viewModel.onAddClicked(editTextNote.text.toString())
                findNavController().popBackStack()
            }
        }
    }
}