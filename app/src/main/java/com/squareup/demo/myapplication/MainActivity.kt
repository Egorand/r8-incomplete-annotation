package com.squareup.demo.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.google.gson.GsonBuilder
import com.squareup.wire.protos.person.Person
import com.squareup.wire.WireTypeAdapterFactory



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = """
            |{
            |  "name": "Joe",
            |  "id": 1,
            |  "email": "joe@squareup.com"
            |}
            |""".trimMargin()
        val gson = GsonBuilder()
            .registerTypeAdapterFactory(WireTypeAdapterFactory())
            .disableHtmlEscaping()
            .create()
        val person = gson.fromJson(json, Person::class.java)

        val text = findViewById<TextView>(R.id.text)
        text.text = person.toString()
    }
}
