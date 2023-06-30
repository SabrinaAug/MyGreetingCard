package com.example.mygreetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.muffin_birthday)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = "Happy Birthday Sam!", from ="- Dean")
    }
}
@Composable
fun BirthdayGreetingWithText(
    modifier: Modifier = Modifier,
    message: String,
    from: String
){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = modifier
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
        Text(
            text = from,
            fontSize = 25.sp,
            modifier = modifier
                .wrapContentWidth(align = Alignment.End)
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithImagePreview() {
    MyGreetingCardTheme {
        BirthdayGreetingWithImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text)
        )
    }
}