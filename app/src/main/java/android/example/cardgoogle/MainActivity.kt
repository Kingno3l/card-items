import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.example.cardgoogle.ui.theme.CardGoogleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardContent()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardGoogleTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            CardContent()
        }
    }
}

@Composable
fun CardContent() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Calendar",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Released 2 days ago",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                BoxWithConstraints(
                    modifier = Modifier
                        .background(Color.Green)
                        .padding(5.dp)
                ) {
                    Text(
                        text = "Bug Fixes",
                        style = MaterialTheme.typography.body2,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
                Box(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .padding(5.dp)
                ) {
                    Text(
                        text = "New Features",
                        style = MaterialTheme.typography.body2,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
            }
            Divider(modifier = Modifier.padding(vertical = 30.dp))

            Column(
                modifier = Modifier
            ) {
                Text(
                    text = "Contacts",
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Released 2 days ago",
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.Yellow)
                            .padding(5.dp)
                    ) {
                        Text(
                            text = "New Features",
                            style = MaterialTheme.typography.body2,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterStart)
                        )
                    }
                }
            }
        }
    }
}
