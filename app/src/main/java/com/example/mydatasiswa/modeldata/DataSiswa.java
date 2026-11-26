package com.example.mydatasiswa.modeldata;

import kotlinx.serialization.Serializable;

public class DataSiswa {
}
@Serializable
data class DataSiswa(
        val id : Int,
        val nama : String,
        val alamat : String,
        val telpon : String
)