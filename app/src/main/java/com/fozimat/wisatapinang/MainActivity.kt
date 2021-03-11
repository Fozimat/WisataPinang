package com.fozimat.wisatapinang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.fozimat.wisatapinang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Wisata> = arrayListOf()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showRecyclerList()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showRecyclerList() {
        binding.rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        binding.rvWisata.adapter = listWisataAdapter

        listWisataAdapter.setOnItemClickCallback(object : ListWisataAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Wisata) {

            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}