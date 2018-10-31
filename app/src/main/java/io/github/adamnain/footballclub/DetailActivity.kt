package io.github.adamnain.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    private var nameClub : String = ""
    private var descClub : String = ""

    private lateinit var tvNameCLub: TextView
    private lateinit var tvDescCLub: TextView
    private lateinit var ivClub: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(16)

            ivClub = imageView().lparams(width = dip(150), height = dip(150)) {
                gravity = Gravity.CENTER_HORIZONTAL
            }
            tvNameCLub = textView {
                gravity = Gravity.CENTER
                topPadding = dip(8)
                textSize = 18f
            }
            tvDescCLub = textView {
                topPadding = dip(10)
                gravity = Gravity.CENTER
                textSize = 14f
            }
        }

        nameClub = intent.getStringExtra("name")
        descClub = intent.getStringExtra("desc")

        tvNameCLub.text = nameClub
        tvDescCLub.text = descClub
        Glide.with(this)
            .load(intent.getIntExtra("image",0))
            .into(ivClub)
    }

}
