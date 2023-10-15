package sheridan.ahmad.assignment2final.ui.theme.flowerList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sheridan.ahmad.assignment2final.Domain.Flower
import coil.compose.AsyncImage
import java.util.Locale
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


@Composable
fun ListBody(
    FlowerList: List<Flower>,
    modifier: Modifier
){
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp, horizontal = 16.dp
        ), modifier = modifier


    ){
        items(FlowerList){ flower ->
            flowerListItem(flower)

        }
    }
}

@Composable
fun flowerListItem(flower:Flower){
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ){
            AsyncImage(
                model = "file:///android_asset/images/flowers/${flower.image}",
                contentDescription = "${flower.label} ${flower.id}"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = flower.label.capitalize(Locale.CANADA),
                        fontSize = 28.sp
                    )
//                    Text(
//                        text = flower.id,
//                        fontSize = 28.sp
//                    )


                }

            }
        }
    }
}



@Composable
fun FlowerListItem(flower: Flower) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        var expanded by remember{ mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            AsyncImage(
                model = "file:///android_asset/images/flowers/${flower.image}",
                contentDescription = "${flower.label} ${flower.id}"
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = flower.label.capitalize(Locale.CANADA),
                        fontSize = 28.sp
                    )

                    Text(
                        text = if (expanded) "Collapse" else "Expand",
                        fontSize = 16.sp,
                        modifier = Modifier.clickable { expanded = !expanded }
                    )
                }

                if (expanded) {
                    Text(text = flower.description, fontSize = 16.sp)
                }
            }
        }
    }
}



