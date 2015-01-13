package net.gutefrage.helloscala

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val textView = findViewById(R.id.hello_world).asInstanceOf[TextView]
    textView.setText("Hello Scala")
  }

}