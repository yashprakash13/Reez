package com.regency.app.reez.db.model

import java.util.*

data class TeamModel(
    val id: Long,
    val name: String,
    val dateCreated  : Date,
    val participants : List<UserModel>,
    val display_pic : String = ""
)