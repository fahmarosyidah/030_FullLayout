package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column (
        modifier = Modifier
            .padding(18.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Fahma Rosyidah",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Box1()

        Spacer(modifier = Modifier.padding(10.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(15.dp))

        Box2()
    }
}

@Composable
fun Box1(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Cyan)
    ){
        Column (
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Rain",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Composable
fun Lokasi(){
    Text(
        text = "21°C",
        fontWeight = FontWeight.Bold,
        fontSize = 64.sp
    )
    Row (){
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(
            text = "Yogyakarta",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        text = "Kasihan, Kabupaten Bantul, \nDaerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray
    )
}

@Composable
fun Box2(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Cyan)
            .padding(20.dp),

    ){
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Isi Column pertama
                Text(
                    text = "Humidity",
                )
                Text(
                    text = "98%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.padding(30.dp))
                Text(
                    text = "Sunrise",
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "05.00 AM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Isi Column kedua
                Text(
                    text = "UV Index",
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "9/10",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(30.dp))
                Text(
                    text = "Sunset",
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "05.40 PM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        HomeScreen()
    }
}