package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = PlantAdapter(plants)
        binding.recyclerView.adapter = adapter

    }

    private val plants = listOf(
        Plant(
            "Роза",
            "Семейство Rosaceae",
            "Красный цвет листьев",
            "https://posadka-uhod.ru/wp-content/uploads/dacha/97e40692f291741d8125607235882552.jpg"
        ),
        Plant(
            "Кордилина",
            "Семейство агавовые",
            "Фиолетовый цвет листьев",
            "https://jn-home.ru/3_Vse_o_komnatnih_rasteniyah/Semeistva_komnatnih_rastenii/images/кордилина_агавовые.jpg"
        ),
        Plant(
            "Нерине",
            "Семейство амариллисовые",
            "Синий листьев",
            "https://vsegda-pomnim.com/uploads/posts/2022-04/1649663974_47-vsegda-pomnim-com-p-raznoobrazie-tsvetov-foto-55.jpg"
        ),
        Plant(
            "Фатсия",
            "Семейство аралиевые",
            "Черный цвет листьев",
            "https://vsegda-pomnim.com/uploads/posts/2022-04/1650407324_20-vsegda-pomnim-com-p-roskoshnii-buket-tsvetov-foto-20.jpg"
        ),
        Plant(
            "Калла",
            "Семейство ароидные",
            "Фиолетовый цвет листьев",
            "https://vsegda-pomnim.com/uploads/posts/2022-04/1650517454_134-vsegda-pomnim-com-p-krasivii-buket-tsvetov-foto-141.jpg"
        ),
        Plant(
            "Бальзамин",
            "Семейство бальзаминовые",
            "Желтый цвет листьев",
            "https://vsegda-pomnim.com/uploads/posts/2022-04/1649648021_8-vsegda-pomnim-com-p-tsveti-sirenevogo-tsveta-foto-8.jpg"
        ),
        Plant(
            "Гуцмания",
            "Семейство бромелиевые",
            "Голубой цвет листьев",
            "https://mykaleidoscope.ru/uploads/posts/2022-06/1655993902_20-mykaleidoscope-ru-p-buket-raznotsvetnikh-tsvetov-krasivo-foto-21.jpg"
        ),
        Plant(
            "Азалия",
            "Семейство вересковые",
            "Серый цвет листьев",
            "https://mykaleidoscope.ru/uploads/posts/2021-10/1635267668_21-mykaleidoscope-ru-p-shikarnie-tsveti-tsveti-24.jpg"
        ),
        Plant(
            "Клеродендрум",
            "Семейство вербеновые",
            "Фиолетовый цвет листьев",
            "https://vsegda-pomnim.com/uploads/posts/2022-04/1650516951_73-vsegda-pomnim-com-p-tsvetok-foto-74.jpg"
        ),
        Plant(
            "Пеларгония",
            "Семейство гераниевые",
            "Черный цвет листьев",
            "https://mykaleidoscope.ru/uploads/posts/2022-06/1656086949_16-mykaleidoscope-ru-p-krasivie-tsveti-gerberi-krasivo-foto-17.jpg"
        )
    )
}