package tanveer.ansari.koneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import tanveer.ansari.koneapp.ui.theme.KoneappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoneappTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = stringResource(R.string.wishes),
                        from = stringResource(R.string.wisher)
                    )                }
            }
        }
    }
}

@Composable
fun myCommposable(){
    Column {
        GreetingText("kone elevators", from = "android")
        GreetingText("happy birthday", from = "abdul")
    }

}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column {
        Text(
            //modifier = Modifier.background(color = Color.Green),
                    text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
        Text(
            fontSize = 36.sp,
            text = from
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String) {
    Box {
        val image = painterResource(R.drawable.androidpart)
        Image(
            alpha = 0.5F,
                    painter = image,
            contentDescription = null
        )
        GreetingText(message, from)
    }

}



@Preview(showBackground = true,
    )
@Composable
fun GreetingPreview() {
    KoneappTheme {
        GreetingImage(
            message = "Happy Birthday Sam!",
            from = "From Emma"
        )    }
}