package ru.kmept.kormezhka

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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
        setContentView(R.layout.home)
        imageView = findViewById(R.id.home1)
        val home_tab = findViewById<View>(R.id.home_tab)
        val upload_tab = findViewById<View>(R.id.upload_tab)
        val scan_tab = findViewById<View>(R.id.scan_tab)
        val noti_tab = findViewById<View>(R.id.noti_tab)
        val profile_tab = findViewById<View>(R.id.profile_tab)
        upload_tab.setOnClickListener {
            switchFragment(FragmentSecond())
            /*currImage = if (currImage == home_green) home_gray else home_green
            imageView.setImageResource(currImage)*/
        }
        home_tab.setOnClickListener {
           switchFragment(FragmentFirst())
           /*currImage = if (currImage == home_green) home_green or noti_gray or profile_gray  else home_green
           imageView.setImageResource(currImage)*/
        }
        scan_tab.setOnClickListener {
            switchFragment(Scan())
            /*currImage = if (currImage == home_green) home_gray or noti_gray or profile_gray  else home_green
            imageView.setImageResource(currImage)*/
        }
        noti_tab.setOnClickListener {
            jopa(it)
            /*currImage = if (currImage == home_green) home_gray or noti_green or profile_gray else home_green
            imageView.setImageResource(currImage)*/
        }
        profile_tab.setOnClickListener {
            switchFragment(Profile())
            /*currImage = if (currImage == home_green) home_gray or profile_green or noti_gray else home_green
            imageView.setImageResource(currImage)*/
        }
    }
    fun switchFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.switcherFragment, fragment)
        transaction.commit()
    }
    fun jopa(view: View)
    {
        val intent = Intent(this@MainActivity, Akaunt::class.java)
        startActivity(intent)
    }

}