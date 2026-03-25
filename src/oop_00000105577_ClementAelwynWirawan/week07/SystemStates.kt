package oop_00000105577_ClementAelwynWirawan.week07

enum class AppState {
    STARTING,
    RUNNING,
    STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}