package com.example.mygreetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mygreetingcard.ui.theme.MyGreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithText(
                        message = "Happy Birthday Sammy!",
                        from = "- Dean")

                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(
    modifier: Modifier = Modifier,
    message: String,
    from: String
){
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = modifier.padding(15.dp)
        )
        Text(
            text = from,
            fontSize = 15.sp,
            modifier = modifier.padding(10.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyGreetingCardTheme {
        BirthdayGreetingWithText(
            message = "Happy Birthday Sammy!",
            from = "- Dean"
        )
    }
}