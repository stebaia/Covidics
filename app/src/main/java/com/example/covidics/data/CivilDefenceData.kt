package com.example.covidics.data

data class CivilDefenceData(
    val casi_da_screening: Any,
    val casi_da_sospetto_diagnostico: Any,
    val casi_testati: Int,
    val `data`: String,
    val deceduti: Int,
    val dimessi_guariti: Int,
    val isolamento_domiciliare: Int,
    val note: Any,
    val nuovi_positivi: Int,
    val ricoverati_con_sintomi: Int,
    val stato: String,
    val tamponi: Int,
    val terapia_intensiva: Int,
    val totale_casi: Int,
    val totale_ospedalizzati: Int,
    val totale_positivi: Int,
    val variazione_totale_positivi: Int
)