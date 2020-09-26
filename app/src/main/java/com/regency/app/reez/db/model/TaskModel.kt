package com.regency.app.reez.db.model

import java.util.*

data class TaskModel (
    val id : Long,
    val title : String,
    val maker : String,
    val addDate: Date,
    val deadline : Date? = null,
    val isComplete : Boolean =  false,
    val participants : List<UserModel> = emptyList()
)
