package com.example.level2

import android.app.TaskStackBuilder.create
import android.content.ContentResolver
import android.content.IntentFilter.create
import android.provider.ContactsContract
import android.database.Cursor
import android.database.Observable
import android.hardware.HardwareBuffer.create
import android.media.MediaPlayer.create
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.level2.adapter.ItemAdapter
import com.example.level2.utils.ContactsListViewModel
import com.example.level2.databinding.ActivityMainBinding
import com.example.level2.model.ContactData
import kotlinx.coroutines.flow.launchIn
import java.net.URI.create

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ContactsListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // learn how observe live data and later same with state flow
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = viewModel.contactsLiveData.value.let { ItemAdapter(it) }

    }
}