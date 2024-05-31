package com.oybekdev.news.presentation.onboarding.nvgraph

sealed class Route(
    val route:String
){
    object OnBoardingScreen:Route(route = "onBoardingScreen")
    object HomeScreen:Route(route = "HomeScreen")
    object SearchScreen:Route(route = "SearchScreen")
    object BookmarkScreen:Route(route = "BookmarkScreen")
    object DetailScreen:Route(route = "DetailScreen")
    object AppStartNavigation:Route(route = "AppStartNavigation")
    object NewsNavigation:Route(route = "NewsNavigation")
    object NewsNavigationScreen:Route(route = "NewsNavigationScreen")
}
