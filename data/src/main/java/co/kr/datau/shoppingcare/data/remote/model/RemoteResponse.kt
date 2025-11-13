package co.kr.datau.shoppingcare.data.remote.model

import co.kr.datau.shoppingcare.core.model.Remote

data class Response(
    val id: Int,
    val name: String,
    val date: String
) {
    fun toDomain(): Remote {
        return Remote(
            id = id,
            name = name,
            date = date
        )
    }
}