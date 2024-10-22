import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.quickastro.R
import kotlinx.coroutines.delay

@Composable
fun splashScreen(navController: NavHostController) {

    val scale = remember { Animatable(0f) }
    val rotation = remember { Animatable(0f) }

    LaunchedEffect(true) {
        // Scale animation
        scale.animateTo(
            targetValue = 0.5f,
            animationSpec = tween(
                durationMillis = 500,
                easing = { OvershootInterpolator(2f).getInterpolation(it) }
            )
        )

        // Rotation animation
        rotation.animateTo(
            targetValue = 360f,  // 360 degrees for a complete spin
            animationSpec = tween(durationMillis = 500)
        )

        delay(500)
        navController.navigate("home")
    }

    // Box with scaled and rotated image
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .scale(scale.value)      // Apply scale animation
                .rotate(rotation.value)  // Apply rotation animation
        )
    }
}
