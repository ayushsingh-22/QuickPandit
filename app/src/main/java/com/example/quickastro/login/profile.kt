package com.example.quickastro.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quickastro.R
import com.example.quickastro.ui.theme.lora_font

@Preview(showBackground = true)
@Composable
fun profile(navController: NavController) {

    var first_name by remember { mutableStateOf("") }
    var last_name by remember { mutableStateOf("") }
    var contact_number by remember { mutableStateOf("") }

    Card(modifier = Modifier.fillMaxSize()) {

        Box(modifier = Modifier.fillMaxSize()){

            Text(text = "Your Profile",
                fontFamily = lora_font,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = colorResource(R.color.black),
                modifier = Modifier.offset(x = 125.dp, y = 73.dp)
               )

            Image(
                painter = painterResource(R.drawable.pandit),
                contentDescription = "Placeholder Image",
                modifier = Modifier.size(100.dp)
                    .offset(x = 135.dp, y = 110.dp)
                    .clip(CircleShape)
                    .border(1.dp, colorResource(R.color.black), CircleShape)
            )

            Column(modifier = Modifier.offset(x = 25.dp, y = 230.dp)){

                Text(
                    text = "First Name",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )

                OutlinedTextField(
                    value = first_name,
                    singleLine = true,
                    onValueChange = { first_name = it },
                    label = { Text("Enter detail") },
                    modifier = Modifier.clip(RectangleShape)
                )

                Spacer(modifier = Modifier.size(20.dp))

                Text(
                    text = "Last Name",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )

                OutlinedTextField(
                    value = last_name,
                    singleLine = true,
                    onValueChange = { last_name = it },
                    label = { Text("Enter detail") },
                    modifier = Modifier.clip(RectangleShape)
                )

                Spacer(modifier = Modifier.size(20.dp))

                Text(
                    text = "Contact Number",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )

                OutlinedTextField(
                    value = contact_number ,
                    singleLine = true,
                    onValueChange = { contact_number = it },
                    label = { Text("Enter detail") },
                    modifier = Modifier.clip(RectangleShape)
                )

                Spacer(modifier = Modifier.size(20.dp))

                Button(
                    onClick = { navController.navigate("update_profile") },
                    modifier = Modifier.size(280.dp, 40.dp),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.Red)
                ) {
                    Text("Save",
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        fontSize = 18.sp)
                }

            }

            Image(
                painter = painterResource(R.drawable.pattern2),
                contentDescription = "Pattern Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(15550.dp)
                    .alpha(0.1f)
                    .offset(x = 90.dp, y = 190.dp)
            )
        }
    }
    
}