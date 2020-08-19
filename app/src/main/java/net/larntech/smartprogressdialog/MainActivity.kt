package net.larntech.smartprogressdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import net.larntech.showhideprogressdialog.ShowHideProgressDialog

class MainActivity : AppCompatActivity() {
    var  showProgressDialog: Button? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showProgressDialog = findViewById(R.id.btnShowProgressDialog);

        showProgressDialog!!.setOnClickListener {
            showHideDialog();
        }

    }




    fun showHideDialog(){


        val message = "Processing request ...";

        ShowHideProgressDialog.show(this,message); //show dialog
        Handler().postDelayed(Runnable {
            ShowHideProgressDialog.hide() //hide progress after 5 seconds
        },5000);

    }

}


