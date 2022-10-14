package com.wemomo.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wemomo.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstCompose()
        }
    }
}

@Composable
fun FirstCompose() {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        User()
        User()
        User()
        User()
    }
}

@Composable
fun User() {
    Row {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Text(text = "Android", modifier = Modifier.fillMaxWidth())
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstCompose()
}