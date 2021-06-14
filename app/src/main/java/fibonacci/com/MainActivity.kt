package fibonacci.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var rvFibo = findViewById<RecyclerView>(R.id.rvFibo)
            rvFibo.layoutManager = LinearLayoutManager(baseContext)
            var numAdapter = NumbersRecyclerView(fibo(100))
            rvFibo.adapter = numAdapter
        }

    fun fibo(num:Int):List<BigInteger>{
        var result= MutableList<BigInteger>(num,{BigInteger.ZERO})
        var n1=BigInteger.ZERO
        var n2=BigInteger.ONE
        result[0]=n1
        result[1]=n2
        for (i in 1..num){
            var ans=n1+n2
            n1=n2
            n2=ans
            result[i-1]=n1
        }

     return result

    }
}


