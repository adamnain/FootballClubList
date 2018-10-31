package io.github.adamnain.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

class ProfileActivity : AppCompatActivity() {

    private lateinit var ivProfile: ImageView
    private lateinit var tvNama: TextView
    private lateinit var tvNim: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(16)

            ivProfile = imageView().lparams(width = dip(150), height = dip(150)) {
                gravity = Gravity.CENTER_HORIZONTAL
            }
            tvNama = textView {
                gravity = Gravity.CENTER
                topPadding = dip(8)
                textSize = 18f
            }
            tvNim = textView {
                topPadding = dip(10)
                gravity = Gravity.CENTER
                textSize = 14f
            }
        }

        tvNama.text = getString(R.string.nama_adam)
        tvNim.text = getString(R.string.nim_adam)
        Glide.with(this)
            .load(R.drawable.img_salam)
            .into(ivProfile)
    }
}
