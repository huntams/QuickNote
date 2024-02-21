package com.example.three_lines.domain

import com.example.three_lines.domain.model.Note
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val notesRepository: NotesRepository,
) {
    suspend fun execute(note: Note) {
        notesRepository.deleteNote(note)
    }
}