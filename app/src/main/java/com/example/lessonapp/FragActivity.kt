package com.example.lessonapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.lessonapp.databinding.ActivityFragBinding
import com.example.lessonapp.viewmodel.MainViewModel

class FragActivity : AppCompatActivity() {

    private var appBarConfiguration: AppBarConfiguration? = null
    private var binding: ActivityFragBinding? = null

    private val model: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_frag)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration!!)

        binding?.fab?.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_frag)
        return navController.navigateUp(appBarConfiguration!!)
                || super.onSupportNavigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}