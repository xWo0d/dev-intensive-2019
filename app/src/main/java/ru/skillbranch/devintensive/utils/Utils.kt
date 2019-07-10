package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {

        fullName?.takeIf { !it.isBlank() }?.let {
            val parts: List<String>? = fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)
            return firstName to lastName
        }

        return null to null
    }

    fun transliteration(payload: String, divider: String = " "): String {
        return payload
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return "$firstName $lastName"
    }
}