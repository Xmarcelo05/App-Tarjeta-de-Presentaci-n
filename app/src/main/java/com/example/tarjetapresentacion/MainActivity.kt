package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme{
                TarjetaPresentacion()
            }
        }
    }
}

@Preview
@Composable
fun TarjetaPresentacion() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9CE9DE)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(top = 150.dp)
                .padding(bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(100.dp)

        ) {
            Box(
                modifier = Modifier
                    .height(220.dp)
                    .width(300.dp)
                    .background(Color(0xFF9CE9DE))
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Image(
                        painter = painterResource(R.drawable.android_logo),
                        contentDescription = "Logo de Android",
                        modifier = Modifier.size(120.dp).background(Color(0xFF022D36))
                    )
                    Text(
                        text = "Marcelo Bravo",

                        fontSize = 40.sp,
                        color = Color(0xFF022D36),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Text(
                        text = "Estudiante de 6to semestre de Software",

                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF008000),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }

            }

            Box(
                modifier = Modifier
                    .height(300.dp)
                    .width(300.dp)
                    .background(Color(0xFF021119))
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){

                }


            }
        }
    }
}
