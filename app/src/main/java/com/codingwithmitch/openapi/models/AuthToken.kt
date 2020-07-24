package com.codingwithmitch.openapi.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(
    tableName = "auth_token",
    foreignKeys = [
        ForeignKey(
            entity = AccountProperties::class,
            parentColumns = ["pk"],
            childColumns = ["account_pk"],
            onDelete = CASCADE
        )
    ]
)
data class AuthToken(
    @PrimaryKey
    var account_pk: Int? = -1,

    @Expose
    var token: String? = null
)