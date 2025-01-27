package com.websarva.wings.android.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.websarva.wings.android.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnTogetherApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogetherTexts(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)

        )
        Text(
            text = stringResource(R.string.first_paragraph),
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.second_paragraph),
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun LearnTogetherImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Fit
    )
}

@Composable
fun LearnTogetherApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        LearnTogetherImage()
        LearnTogetherTexts()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        LearnTogetherApp()
    }
}