package me.kevinbayona.facebook.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.kevinbayona.facebook.ui.components.PostHeader
import me.kevinbayona.facebook.ui.theme.FacebookTheme

@Preview(showSystemUi = true)
@Composable
fun FeedScreen() {
    FacebookTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                PostHeader(
                    userName = "Kevin Bayona",
                    postTime = "Hace 5 min"
                )
            }
        }
    }
}
