package com.example.proyectodivisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectodivisa.ui.theme.ProyectoDivisaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Programa la tarea cada hora
        WorkManagerUtils.scheduleHourlyTask(this)

        // Establece el contenido de la actividad usando Compose
        setContent {
            ProyectoDivisaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("WorkManager App")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hola, $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProyectoDivisaTheme {
        Greeting("WorkManager App")
    }
}