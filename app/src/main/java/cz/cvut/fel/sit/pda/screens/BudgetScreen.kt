package cz.cvut.fel.sit.pda.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import cz.cvut.fel.sit.pda.components.BasicAppBar
import cz.cvut.fel.sit.pda.components.GeldsBottomBar
import cz.cvut.fel.sit.pda.ui.theme.Purple40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BudgetScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            BasicAppBar(
                title = "Budget99",
                navController = navController,
                canNavigateBack = false,
                onNavigateBack = {}
            )
        },
        bottomBar = {
            GeldsBottomBar(navController)
        }
    ) { innerPadding ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding), color = Color(0xFF586481)) {
            Text(text = "Content BudgetScreen", modifier = Modifier.fillMaxSize())
        }
    }
}