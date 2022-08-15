package me.yoon.codestyleshare

class MemberService(
    private val name: String,
    private val age: Int,
) {
    fun hello() {
        println("hello")
    }

    fun bye() {
        println("bye")
    }
}
