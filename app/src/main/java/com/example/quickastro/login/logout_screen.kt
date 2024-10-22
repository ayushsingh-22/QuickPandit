package com.example.quickastro.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quickastro.R
import com.example.quickastro.ui.theme.lora_font


@Composable
fun logout (navController: NavController) {

    Card(modifier = Modifier.fillMaxSize()) {

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.pattern2),
                contentDescription = "Pattern Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(1050.dp)
                    .align(Alignment.BottomEnd)
                    .offset(x = 120.dp, y = 170.dp)
                    .alpha(0.1f)
            )

            Column(modifier = Modifier.offset(x = 35.dp, y = 310.dp)) {

                Text(
                    text = "Are you sure you want to log out?",
                    fontFamily = lora_font,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )

                Spacer(modifier = Modifier.size(35.dp))

                Row(modifier = Modifier.fillMaxWidth()
                    .offset(x = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){

                    Button(
                        onClick = { navController.navigate("home") },
                        modifier = Modifier.size(110.dp, 40.dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red)

                    ) {
                        Text("Yes",
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Normal,
                            fontSize = 18.sp)
                    }

                    Button(
                        onClick = {navController.navigate("profile") },
                        modifier = Modifier.size(110.dp, 40.dp)
                            .offset(x = (-100).dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Gray)
                    ) {
                        Text("Cancel",
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Normal,
                            fontSize = 18.sp)
                    }
                }
            }
        }
    }
}
