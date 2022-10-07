package com.example.sqlitecomroom.data

class UserRepository (private val userDao: UserDao) {

    val selectUsers = userDao.selectUsers()

    fun addUsers(usuario: Usuario){
        userDao.addUser(usuario)
    }
}