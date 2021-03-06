package me.vponomarenko.modular.navigation.leaderboard

import me.vponomarenko.modular.navigation.common.BaseNavigator

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

internal class Navigator : BaseNavigator(), LocalNavigation {
    override fun openLeader(name: String) {
        navController?.navigate(
            R.id.action_leaderboardFragment_to_leaderFragment,
            LeaderFragment.createBundle(name)
        )
    }
}