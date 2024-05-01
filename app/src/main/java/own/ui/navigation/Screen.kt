package own.ac.aber.dcs.cs39440.maze_solver.ui.navigation

import own.ac.aber.dcs.cs39440.maze_solver.R

/**
 * Class that represents one screen
 */
sealed class Screen(
    val label: Int
) {
    object Maze : Screen(
        label = R.string.maze
    )

    object Settings : Screen(
        label = R.string.settings
    )
}