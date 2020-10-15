package com.example.covidics.data

data class Andamento(val data: String) {
    var stato: String = "";
    var ricoverati_con_sintomi: Int = 0
    var terapia_intensiva: Int = 0
    var totale_ospedalizzati: Int = 0
    var isolamento_domiciliare: Int = 0
    var totale_positivi: Int = 0
    var variazione_totale_positivi: Int = 0
    var nuovi_positivi: Int = 0
    var dimessi_guariti: Int = 0
    var deceduti: Int = 0
    var casi_da_sospetto_diagnostico: Int = 0
    var casi_da_screening: Int = 0
    var totale_casi: Int = 0
    var tamponi: Int = 0
    var casi_testati: Int = 0
}