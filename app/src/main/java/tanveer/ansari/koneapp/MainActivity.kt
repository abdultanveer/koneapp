package tanveer.ansari.koneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                    myCommposable()
                }
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

@Preview(showBackground = true,
    )
@Composable
fun GreetingPreview() {
    KoneappTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "abdul")
    }
}