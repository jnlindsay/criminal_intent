package com.example.criminalintent

import android.app.Application

/* initialise repository;
    access application lifecycle information */
class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}