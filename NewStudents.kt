package com.example.ybshafta5

class NewStudents: NewUser(){

    var student_number: Int = 0

    override fun newShowInfo() {
        println("NewName, NewSurname, NewAge: $user_name $user_surname $user_age")
    }

    override fun belong_class() {
        println("Bu metot, NewStudents class'ına aittir")
    }
}