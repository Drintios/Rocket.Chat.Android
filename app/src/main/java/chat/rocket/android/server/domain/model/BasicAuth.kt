package chat.rocket.android.server.domain.model

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class BasicAuth(
    val serverUrl: String,
    val userName: String,
    val password: String
)