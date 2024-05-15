package com.muratcangzm.flavormap.navigation

import kotlinx.serialization.Serializable

sealed class Screen {

    @Serializable
    object HomeScreen : Screen()
    @Serializable
    object DisplayScreen: Screen()

}