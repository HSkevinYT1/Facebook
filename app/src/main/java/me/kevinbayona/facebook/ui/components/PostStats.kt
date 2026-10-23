package me.kevinbayona.facebook.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.kevinbayona.facebook.ui.theme.FacebookTheme

@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesCount: String = "125",
    commentsCount: String = "42 comentarios",
    sharesCount: String = "10 compartidos",
    onLikesClick: () -> Unit = {},
    onCommentsClick: () -> Unit = {},
    onSharesClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Sección izquierda: Icono de Me gusta + cantidad
        Row(
            modifier = Modifier.clickable(onClick = onLikesClick),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(18.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = "Me gusta",
                    tint = Color.White,
                    modifier = Modifier.size(11.dp)
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = likesCount,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Sección derecha: Comentarios y Compartidos
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = commentsCount,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.clickable(onClick = onCommentsClick)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "•",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = sharesCount,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.clickable(onClick = onSharesClick)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    FacebookTheme {
        PostStats()
    }
}
