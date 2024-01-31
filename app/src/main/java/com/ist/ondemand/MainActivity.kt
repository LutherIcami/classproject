package com.ist.ondemand

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SearchView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ist.ondemand.common.DemandApp
import com.ist.ondemand.presentation.ui.theme.OnDemandTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var searchView: SearchView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use setContent for Compose UI
        setContent {
            OnDemandTheme {
                DemandApp()
            }
        }

        // Use setContentView for traditional XML-based UI
        setContentView(R.layout.activity_main)

        searchView = findViewById(R.id.searchView)

        // Set a listener to respond to query changes
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle the submission of the search query
                // Perform your search operation here
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle changes in the search query text
                // You can use this to dynamically filter your data
                return true
            }
        })
    }
}
