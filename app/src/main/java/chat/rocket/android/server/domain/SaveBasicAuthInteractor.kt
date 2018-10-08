package chat.rocket.android.server.domain

import chat.rocket.android.server.domain.model.BasicAuth
import javax.inject.Inject

class SaveBasicAuthInteractor @Inject constructor(val repository: BasicAuthRepository) {
    fun save(credentials: BasicAuth) = repository.save(credentials)
}