package scan.gowins.com.cn.kotlintest

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var content:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        content = findViewById(R.id.content) as TextView?
        content?.setText("欢迎使用Kotlin")
        var param: ViewGroup.LayoutParams? = content?.layoutParams
    }
}
