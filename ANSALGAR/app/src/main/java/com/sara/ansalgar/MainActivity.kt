import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Llamamos a nuestra función de pantalla de inicio
            PantallaInicioAnsalgar()
        }
    }
}

@Composable
fun PantallaInicioAnsalgar() {
    // La "Column" organiza los elementos uno debajo de otro
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center, // Centra verticalmente
        horizontalAlignment = Alignment.CenterHorizontally // Centra horizontalmente
    ) {
        // Título de la empresa (Luego aquí podrás poner una imagen de logo)
        Text(
            text = "ANSALGAR",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A73E8) // Un azul industrial, por ejemplo
        )

        Text(
            text = "Puentes Grúa",
            fontSize = 18.sp,
            color = Color.Gray
        )

        // Espacio entre el texto y el botón
        Spacer(modifier = Modifier.height(50.dp))

        // Botón de Inicio
        Button(
            onClick = {
                /* Aquí programaremos que pase a la lista de empresas más adelante */
            },
            modifier = Modifier.fillMaxWidth(0.6f), // Que ocupe el 60% del ancho
            shape = MaterialTheme.shapes.medium
        ) {
            Text(text = "INICIO", fontSize = 18.sp)
        }
    }
}