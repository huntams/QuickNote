package com.example.three_lines.domain

import com.example.three_lines.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    fun getNotes(): Flow<List<Note>>
    fun filterNotes(data: String): Flow<List<Note>>
    suspend fun addNote(text: String, uri: ByteArray)

    suspend fun deleteNote(note: Note)

}