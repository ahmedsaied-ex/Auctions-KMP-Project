package com.example.auction_kmp_project.presentation.navigation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.auction_kmp_project.helpers.FontSizes.font12
import com.example.auction_kmp_project.ui.theme.PrimaryBlueColor
import com.example.auction_kmp_project.ui.theme.readexProFontFamily
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun BottomNavBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar(
        containerColor = Color(0xffEBE9F1),
    ) {
        bottomNavItems.forEach { item ->
            val isSelected = currentRoute == item.route.route
            NavigationBarItem(
//               ,
                icon = {
                    Icon(
                        painter = painterResource(
                            if (isSelected) item.iconActive else item.iconInActive
                        ),
                        contentDescription = item.label,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        item.label, style = if (isSelected) {
                            TextStyle(
                                fontFamily = readexProFontFamily(),
                                fontWeight = FontWeight.Medium,
                                color = PrimaryBlueColor,
                                fontSize = font12
                            )
                        } else {
                            TextStyle(
                                fontFamily = readexProFontFamily(),
                                fontWeight = FontWeight.Light,
                                color = PrimaryBlueColor,
                                fontSize = font12
                            )
                        }
                    )
                },

                selected = isSelected,
                onClick = {
                    if (!isSelected) {
                        navController.navigate(item.route.route) {
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color(0xE6E0DDEA) // This is the selected item's background
                ),

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    val navController = rememberNavController()
    BottomNavBar(navController = navController)
}