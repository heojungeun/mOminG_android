package com.example.moming

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SplashActivity: AppCompatActivity() {

    private val auth : FirebaseAuth = FirebaseAuth.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)

            if (auth.currentUser == null){//(auth.currentUser == null){
                startActivity(Intent(this, LoginActivity::class.java))
            }else{
                startActivity(Intent(this, Main2Activity::class.java))
            }

            finish()
        },DURATION)

    }

    companion object {
        private const val DURATION : Long = 3000
    }
}