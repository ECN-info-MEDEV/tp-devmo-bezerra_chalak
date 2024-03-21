package com.example.projetmedev

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@Composable
fun JoaForCareApp(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = JoaForCareScreen.valueOf(
        backStackEntry?.destination?.route ?: JoaForCareScreen.Login.name
    )
    Scaffold(
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = JoaForCareScreen.Login.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = JoaForCareScreen.Login.name) {

            }
            composable(route = JoaForCareScreen.Home.name) {
            }

        }

    }
}


enum class JoaForCareScreen(@StringRes val title: Int) {
    Login(title = R.string.login),
    Home(title = R.string.home)
}