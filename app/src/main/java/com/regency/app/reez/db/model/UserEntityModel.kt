package com.regency.app.reez.db.model

/**
 * User model for storing in remote db, and passing around in functions
 */
data class UserEntityModel(
    val id : Long,
    val name : String,
    val email : String,

    val pfp : String = ""
) {
    companion object{
        fun from(userModel : UserModel) : UserEntityModel{
            return UserEntityModel(
                userModel.id,
                userModel.name,
                userModel.email,
                userModel.pfp
            )
        }
    }
}