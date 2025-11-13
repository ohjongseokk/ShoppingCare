package co.kr.datau.shoppingcare.domain.repository

import co.kr.datau.shoppingcare.core.model.Remote

interface RemoteRepository {
    suspend fun getRemote(): Remote
}