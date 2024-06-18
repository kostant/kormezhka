package ru.kmept.kormezhka

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val home_green = R.drawable.home
    private val home_gray = R.drawable.home_gray
    private val edit1 = R.drawable.edit
    private val noti_gray = R.drawable.notification
    private val noti_green = R.drawable.noti_green
    private val profile_gray = R.drawable.profile
    private val profile_green = R.drawable.profile_green
    private var currImage = home_green
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        switchFragment(main_screen())
        setContentView(R.layout.home)
        imageView = findViewById(R.id.homeImageView)
        val home_tab = findViewById<View>(R.id.home_tab)
        val upload_tab = findViewById<View>(R.id.upload_tab)
        val scan_tab = findViewById<View>(R.id.scan_tab)
        val noti_tab = findViewById<View>(R.id.noti_tab)
        val profile_tab = findViewById<View>(R.id.profile_tab)
        upload_tab.setOnClickListener {
            switchFragment(FragmentSecond())
            updateTabs(1)
        }
        home_tab.setOnClickListener {
           switchFragment(main_screen())
            updateTabs(0)
        }
        scan_tab.setOnClickListener {
            val intent = Intent(this@MainActivity, searchclass::class.java)
            startActivity(intent)
            switchFragment(Scan())
            updateTabs(2)
        }
        noti_tab.setOnClickListener {
            switchFragment(Noti())
            updateTabs(3)
        }
        profile_tab.setOnClickListener {
            switchFragment(Profile())
            updateTabs(4)
        }
    }
    fun switchFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.switcherFragment, fragment)
        transaction.commit()
    }
    fun updateTabs(position: Int){
        if(position==0){//home
            val homeImageView: ImageView = findViewById(R.id.homeImageView)
            homeImageView.setImageResource(R.drawable.home)
            val homeText: TextView=findViewById(R.id.home_text)
            homeText.setTextColor(parseColor("#1FCC79"))
        }
        else{
            val homeImageView: ImageView = findViewById(R.id.homeImageView)
            homeImageView.setImageResource(R.drawable.home_gray)
            val homeText: TextView=findViewById(R.id.home_text)
            homeText.setTextColor(parseColor("#9FA5C0"))
        }
        if(position==1){//upload
            val uploadImageView: ImageView = findViewById(R.id.uploadImageView)
            uploadImageView.setImageResource(R.drawable.edit)
            val uploadText: TextView=findViewById(R.id.upload_text)
            uploadText.setTextColor(parseColor("#1FCC79"))
        }
        else{
            val uploadImageView: ImageView = findViewById(R.id.uploadImageView)
            uploadImageView.setImageResource(R.drawable.edit)
            val uploadText: TextView=findViewById(R.id.upload_text)
            uploadText.setTextColor(parseColor("#9FA5C0"))
        }
        if(position==2){//scan
            val scanText: TextView=findViewById(R.id.scan_text)
            scanText.setTextColor(parseColor("#1FCC79"))
        }
        else{
            val scanText: TextView=findViewById(R.id.scan_text)
            scanText.setTextColor(parseColor("#9FA5C0"))
        }
        if(position==3){//noti
            val notiImageView: ImageView = findViewById(R.id.notiImageView)
            notiImageView.setImageResource(R.drawable.noti_green)
            val notiText: TextView=findViewById(R.id.noti_text)
            notiText.setTextColor(parseColor("#1FCC79"))
        }
        else{
            val notiImageView: ImageView = findViewById(R.id.notiImageView)
            notiImageView.setImageResource(R.drawable.notification)
            val notiText: TextView=findViewById(R.id.noti_text)
            notiText.setTextColor(parseColor("#9FA5C0"))
        }
        if(position==4){//profile
            val profileImageView: ImageView = findViewById(R.id.profileImageView)
            profileImageView.setImageResource(R.drawable.profile_green)
            val profileText: TextView=findViewById(R.id.profile_text)
            profileText.setTextColor(parseColor("#1FCC79"))
        }
        else{
            val profileImageView: ImageView = findViewById(R.id.profileImageView)
            profileImageView.setImageResource(R.drawable.profile)
            val profileText: TextView=findViewById(R.id.profile_text)
            profileText.setTextColor(parseColor("#9FA5C0"))
        }
    }


}
