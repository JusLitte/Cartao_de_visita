package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlanoDeFundo()
                    Cabecalho()
                    Rodape()
                    Contato()
                }
            }
        }
    }
}
@Composable
fun PlanoDeFundo() {

    Image(
        painter = painterResource(id = R.drawable.imgbackground),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Cabecalho()

}
@Composable
fun Contato(caminhoImagem: Int, textoContato: String){
    Row {
        Image(
            painter = painterResource(id = R.drawable.icon_de_lua),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Text(text = "Tell: (11)967683292",
            fontSize = 30.sp,
            color = Color.White
            )
    }
    
}
@Composable
fun Rodape(){
    Column(
        modifier = Modifier.padding(start = 30.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Contato(caminhoImagem = R.drawable.emial)
        Contato()
        Contato()
    }    
}


@Composable
fun Cabecalho() {
    val modifierImg = Modifier
        .size(75.dp)
        .padding(top = 10.dp)

    Column(
        modifier = Modifier.size(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.icon_de_lua),
            contentDescription = null,
            modifier = modifierImg
        )
        Text(
            text = "Jonas Freitas",
            fontSize = 30.sp,
            color = Color.White
        )
        Text(
            text = "Designer",
            fontSize = 20.sp,
            color = Color.White
        )
        Column(


        ) {

        }
    }
}
