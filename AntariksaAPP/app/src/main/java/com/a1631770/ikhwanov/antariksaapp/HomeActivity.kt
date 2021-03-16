package com.a1631770.ikhwanov.antariksaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var rvPlanets: RecyclerView
    private var list: ArrayList<Planet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvPlanets = findViewById(R.id.rv_planets)
        rvPlanets.setHasFixedSize(true)

        list.addAll(PlanetsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.action_about -> {
                val intens = Intent(this@HomeActivity, AboutActivity::class.java)
                startActivity(intens)
            }
        }
    }

    private fun showSelectedPlanet(planet: Planet) {
        val pindah = Intent(this@HomeActivity, DetailActiviry::class.java)
        pindah.putExtra(DetailActiviry.EXTRA_NAME, planet.name)
        pindah.putExtra(DetailActiviry.EXTRA_DETAIL, planet.detail)
        pindah.putExtra(DetailActiviry.EXTRA_PHOTO, planet.photo)
        startActivity(pindah)
    }

    private fun showRecyclerList() {
        rvPlanets.layoutManager = LinearLayoutManager(this)
        val listPlanetAdapter = ListPlanetAdapter(list)
        rvPlanets.adapter = listPlanetAdapter

        listPlanetAdapter.setOnItemClickCallback(object : ListPlanetAdapter.OnItemClickCallbaack{
            override fun onItemClicked(data: Planet) {
                showSelectedPlanet(data)
            }
        })
    }
}