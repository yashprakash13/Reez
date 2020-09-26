package com.regency.app.reez.db.model

/**
 * The model for having every info about the user - used for displaying in Profile pages(team and
 * user ). NOT stored in remote db.
 */
data class UserModel(
    val id : Long,
    val name : String,
    val email : String,

    val pfp : String = "",
    val team : List<TeamModel> = emptyList()
)