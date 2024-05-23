package com.muratcangzm.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.muratcangzm.ui.Colour.HomeBackground

@Composable
fun HomeScreen() {

    Surface(modifier = Modifier.fillMaxSize(),
        color = HomeBackground ) {



    }
}


@Preview
@Composable
private fun HomeScreenPreview() {

    HomeScreen()

}