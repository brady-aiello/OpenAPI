package com.codingwithmitch.openapi.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "account_properties")
data class AccountProperties(
    @Expose
    @PrimaryKey(autoGenerate = false)
    var pk: Int,

    @Expose
    var email: String,

    @Expose
    var username: String
)