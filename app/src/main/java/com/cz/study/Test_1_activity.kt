package com.cz.study
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick
import com.cz.study.fragment.MyFragment2

class Test_1_activity : AppCompatActivity() {
    var TAG: String = "Test_1_activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
        ButterKnife.bind(this)
    }



    @OnClick(R.id.btn1)
    fun onClick(view: View) {
        Log.i(TAG,"onClick viewId=${view.id}")
        when(view.id) {
            R.id.btn1 -> {
                val myFragment2 = MyFragment2()
                getFragmentManager().beginTransaction().replace(R.id.linear_test1,myFragment2).commit()
                Toast.makeText(this,"test",Toast.LENGTH_SHORT).show()
            }
        }
    }

}