package com.smartappworld.savynotes.di

import android.app.Application
import androidx.room.Room
import com.google.firebase.database.FirebaseDatabase
import com.smartappworld.savynotes.persistence.LoginDao
import com.smartappworld.savynotes.persistence.NoteDao
import com.smartappworld.savynotes.persistence.NoteDatabase
import com.smartappworld.savynotes.repository.NoteRepository
import com.smartappworld.savynotes.session.SessionManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


//Provide all the app level dependency here
@Module
class AppModule {


    // Method #1
    @Singleton
    @Provides
    fun providesAppDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(app, NoteDatabase::class.java, "note_database").build()
    }

    // Method #2
    @Singleton
    @Provides
    fun providesNoteDao(db: NoteDatabase): NoteDao {
        return db.noteDao()
    }

    // Method #3
    @Provides
    fun providesRepository(noteDao: NoteDao): NoteRepository {
        return NoteRepository(noteDao)
    }

    // Method #4
    @Singleton
    @Provides
    fun providesFirebaseDatabse(): FirebaseDatabase {
        return FirebaseDatabase.getInstance()
    }

    // Method #5
    @Provides
    fun providesSessionManager(loginDao: LoginDao): SessionManager {
        return SessionManager(loginDao)
    }

    // Method #6
    @Singleton
    @Provides
    fun providesLoginDao(db: NoteDatabase): LoginDao {
        return db.loginDao()
    }
}