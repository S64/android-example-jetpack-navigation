package jp.s64.android.prototype.myechoapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navHost = supportFragmentManager
                .findFragmentById(R.id.navHost) as NavHostFragment

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        NavigationUI.setupActionBarWithNavController(this, navHost.navController)
        NavigationUI.setupWithNavController(bottomNavigation, navHost.navController)
    }

    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, navHost.navController) || super.onOptionsItemSelected(item)
    }
    */

    override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
        //return NavigationUI.navigateUp(drawer, navHost.navController) || super.onSupportNavigateUp()
    }

}
