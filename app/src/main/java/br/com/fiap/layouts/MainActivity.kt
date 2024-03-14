package br.com.fiap.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 1")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 2")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 3")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.background(Color.Magenta).fillMaxHeight()
        ) {
            Text(text = "FIAP")
            Text(text = "ANDROID")
            Text(text = "ANDROID STUDIO")
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(400.dp).background(Color.Gray).fillMaxWidth()
            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 4")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 5")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 6")
                }
                Column() {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 7")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 8")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 9")
                    }
                }
            }
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.background(Color.Blue).fillMaxWidth(),

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 10")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 11")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 12")
                }
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}