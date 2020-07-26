package com.smartappworld.savynotes.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.smartappworld.savynotes.persistence.Note
import com.smartappworld.savynotes.repository.NoteRepository
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    val noteRepository: NoteRepository
) : ViewModel() {


    //Database Operations in view model


    // Method #1
    fun insert(note: Note) {
        noteRepository.insert(note)
    }

    // Method #2
    fun delete(note: Note) {
        noteRepository.delete(note)
    }

    // Method #3
    fun deleteById(id: Int) {
        noteRepository.deleteById(id)
    }

    // Method #4
    fun update(note: Note) {
        Log.e("DEBUG", "update is called in viewmodel")
        noteRepository.update(note)
    }

    // Method #5
    fun getAllNotes(): LiveData<List<Note>> {
        Log.e("DEBUG", "View model getallnotes")
        return noteRepository.getAllNotes()
    }

}