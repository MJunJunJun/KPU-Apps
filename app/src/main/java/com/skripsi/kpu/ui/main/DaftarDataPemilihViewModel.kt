package com.skripsi.kpu.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.skripsi.kpu.database.DataPemilih
import com.skripsi.kpu.repository.DataPemilihRepository

// ViewModel yang digunakan untuk DaftarDataPemilih.
class DaftarDataPemilihViewModel(application: Application) : ViewModel() {

    // Membuat instance dari DataPemilihRepository.
    private val mDataPemilihRepository: DataPemilihRepository = DataPemilihRepository(application)

    // Fungsi untuk mendapatkan LiveData yang berisi daftar DataPemilih dari Repository.
    // LiveData ini akan ter-update secara otomatis ketika ada perubahan data di database.
    fun getAllDataPemilih(): LiveData<List<DataPemilih>> = mDataPemilihRepository.getAllDataPemilih()
}
