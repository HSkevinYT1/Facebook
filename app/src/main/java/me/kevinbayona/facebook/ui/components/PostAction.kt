package me.kevinbayona.facebook.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.kevinbayona.facebook.ui.theme.FacebookTheme

@Composable
fun PostAction(){
    Row(
        modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        LikeButton()
        CommentButton()
        ShareButton()
    }
}
@Preview(showBackground = true)
@Composable
fun PostActionPreview() {
    FacebookTheme {
        PostAction()
    }
}
