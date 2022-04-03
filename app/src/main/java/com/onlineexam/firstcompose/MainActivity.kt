package com.onlineexam.firstcompose

import android.graphics.Paint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.scaleMatrix
import com.onlineexam.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeTheme {

                //BoxExample()
                BoxImage()


                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background) {
//
//                }

//                Column(modifier = Modifier
//                    .fillMaxSize()
//                    .background(color = Color.Red),
//                    verticalArrangement = Arrangement.SpaceAround,
//                    horizontalAlignment = Alignment.CenterHorizontally
//
//                ){
//
//                    Row(modifier = Modifier
//                        .background(color = Color.Green)
//                        .fillMaxWidth()
//                        .padding(2.dp),
//                        horizontalArrangement = Arrangement.SpaceAround
//
//                    ) {
//                        Greeting("Android")
//                        Greeting(name = "hjh")
//                        Greeting(name = "hjhjh")
//                    }
//
//                    Row(modifier = Modifier
//                        .background(color = Color.Green)
//                        .fillMaxWidth()
//                        .padding(2.dp),
//                        horizontalArrangement = Arrangement.SpaceAround
//
//                    ) {
//                        Greeting("Android")
//                        Greeting(name = "hjh")
//                        Greeting(name = "hjhjh")
//                    }
//
//                    Row(modifier = Modifier
//                        .background(color = Color.Green)
//                        .fillMaxWidth()
//                        .padding(2.dp),
//                        horizontalArrangement = Arrangement.SpaceAround
//
//                    ) {
//                        Greeting("Android")
//                        Greeting(name = "hjh")
//                        Greeting(name = "hjhjh")
//                    }
//
//                }


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Red,
        fontSize = 10.sp,
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .background(color = Color.Yellow)
            .border(2.dp, color = Color.Green)
            .padding(10.dp)

    )
}


@Composable
fun BoxExample() {

    Box(modifier = Modifier
        .background(color = Color.Yellow)
        .fillMaxSize()
    ) {

        Text(text = "top start",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.TopStart)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )

        Text(text = "top center",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.TopCenter)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "top end",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.TopEnd)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )

        Text(text = "middle start",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.CenterStart)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "center center",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.Center)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "center end",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.CenterEnd)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "bottom start",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.BottomStart)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "bottom center",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.BottomCenter)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


        Text(text = "bottom end",
            modifier = Modifier
                .background(color = Color.Red)
                .align(Alignment.BottomEnd)
                .padding(8.dp),
            style = MaterialTheme.typography.h5
        )


    }

}


@Composable
fun BoxImage() {

    val context= LocalContext.current

    Box(modifier = Modifier
        .background(color = Color.Red)
        .fillMaxWidth()
        .padding(10.dp)) {
        Image(painter = painterResource(id = R.drawable.pic7), contentDescription = "demo",
            modifier = Modifier
                .fillMaxWidth(10f)
                .align(Alignment.TopStart)
                .padding(0.dp, 0.dp, 0.dp, 100.dp)

        )

        Text(text = "cute panda",
            style = MaterialTheme.typography.h4,
            color = Color.Yellow,
            modifier = Modifier
                .padding(5.dp)
                .align(Alignment.BottomStart)
        )

        Button(
            onClick = { },
            colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent,
                contentColor = Color.Yellow),

            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.TopEnd)
                .border(1.dp, color = Color.White, CircleShape),
            shape = CircleShape

        ) {
            Text(text = "Add to cart")

        }


        IconButton(onClick = { Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show() }) {
            Icon(Icons.Filled.Refresh, contentDescription ="refreshed button" )
        }



    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeTheme {
        BoxImage()
    }


}