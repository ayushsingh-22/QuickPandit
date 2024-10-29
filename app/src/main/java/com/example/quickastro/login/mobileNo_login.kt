package com.example.quickastro.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.quickastro.R
import com.example.quickastro.ui.theme.hindi_font
import com.example.quickastro.ui.theme.lora_font

@Composable
fun mobile_login(navController: NavHostController) {
    Card(modifier = Modifier.fillMaxSize()) {
        var mobileNumber by remember { mutableStateOf("") }

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.pattern2),
                contentDescription = "Pattern Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(650.dp)
                    .offset(x = (-150).dp, y = (-250).dp)
                    .alpha(0.1f)
            )

            Column(Modifier.offset(x = 140.dp, y = 73.dp)) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Login Logo",
                    modifier = Modifier.size(75.dp)
                )

                Text(
                    text = "Log in",
                    fontFamily = lora_font,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.offset(x = (-20).dp, y = 40.dp)
                )

                Column(modifier = Modifier.offset(x = (-105).dp, y = 98.dp)) {
                    Text(
                        text = "Mobile Number",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )

                    OutlinedTextField(
                        value = mobileNumber,
                        singleLine = true,
                        onValueChange = { mobileNumber = it },
                        label = { Text("Enter mobile number") },
                        modifier = Modifier.clip(RectangleShape),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        )

                    )

                    Spacer(Modifier.height(10.dp))

                    Button(
                        onClick = { navController.navigate("otp") },
                        modifier = Modifier.size(280.dp, 40.dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red)
                    ) {
                        Text("Send OTP",
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Normal,
                            fontSize = 16.sp)
                    }

                    Spacer(Modifier.height(20.dp))

                    Button(
                        onClick = { navController.navigate("email") },
                        modifier = Modifier.size(280.dp, 40.dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red)
                    ) {
                        Row(modifier = Modifier.offset( y=2.dp)) {

                            Image(
                                painter = painterResource(R.drawable.img_1),
                                contentDescription = "Pattern Background",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(Modifier.width(9.dp))
                            Text(
                                text = "Continue With Email",
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Normal,
                                fontSize = 15.sp,
                            )
                        }

                    }

                    Spacer(Modifier.height(20.dp))

                    Text(
                        text = "Don't have an account?",
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        fontSize = 18.sp,
                        modifier = Modifier.clickable {}
                    )
                }
            }

            Box(modifier = Modifier.fillMaxSize()) {

                Box(){

                    Image(
                        painter = painterResource(R.drawable.pattern2),
                        contentDescription = "Pattern Background",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(14450.dp)
                            .offset(x = (90).dp, y = (310).dp)
                            .alpha(0.1f)
                    )

                    Image(
                        painter = painterResource(R.drawable.pandit),
                        contentDescription = "Pattern Background",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .size(300.dp)
                            .offset(x = (105).dp, y = (505).dp)
                    )

                    Text(
                        text = "पूजा पाठ हो या अनुष्ठान,\n" +
                                "पंडित मिलना हुआ आसान।",
                        fontFamily = hindi_font,
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp,
                        modifier = Modifier.offset(x = 30.dp, y = 580.dp)
                    )
                }
            }
        }


    }
}