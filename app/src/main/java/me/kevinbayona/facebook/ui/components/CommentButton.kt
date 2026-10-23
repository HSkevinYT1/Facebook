package me.kevinbayona.facebook.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.kevinbayona.facebook.ui.theme.FacebookTheme

@Composable
fun CommentButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val contentColor = MaterialTheme.colorScheme.onSurfaceVariant

    Row(
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.ChatBubbleOutline,
            contentDescription = "Comentar",
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "Comentar",
            style = MaterialTheme.typography.bodyMedium,
            color = contentColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CommentButtonPreview() {
    FacebookTheme {
        CommentButton()
    }
}
