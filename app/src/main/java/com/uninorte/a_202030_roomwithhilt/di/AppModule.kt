package com.uninorte.a_202030_roomwithhilt.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.uninorte.a_202030_roomwithhilt.db.EntryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton
// https://medium.com/swlh/mvvm-with-hilt-rxjava-3-retrofit-room-live-data-and-view-binding-8da9bb1004bf
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        EntryDatabase::class.java,
        "RUNNING_DATABASE_NAME"
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(db: EntryDatabase) = db.getRunDao()
}
