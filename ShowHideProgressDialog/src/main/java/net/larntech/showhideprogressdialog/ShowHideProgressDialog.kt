package net.larntech.showhideprogressdialog

import android.app.ProgressDialog
import android.content.Context

object ShowHideProgressDialog {

    var progressBar: ProgressDialog? = null;

    fun show(show: Boolean,context: Context, message: String){

        if(!progressBar!!.isShowing) {
            progressBar = ProgressDialog(context)
            progressBar!!.setCancelable(true) //you can cancel it by pressing back button

            progressBar!!.setMessage(message)
            progressBar!!.setProgressStyle(ProgressDialog.STYLE_SPINNER)
            progressBar!!.progress = 0 //initially progress is 0

            progressBar!!.max = 100 //sets the maximum value 100

            progressBar!!.show() //displays the progress bar
        }

    }

    fun hide(){
        if(progressBar!!.isShowing){
            progressBar!!.dismiss()
        }
    }


}