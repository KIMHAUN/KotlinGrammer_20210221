package kr.co.neoplus.kotlingrammer_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        변수로 => 정수를 담는 공간, JAVA : int num1;
        var num1 : Int

//        변수에 값 대입
        num1 = 10
        num1 = 20

//        상수로 => 정수를 답는 공간, JAVA : final int num2;
        val num2 : Int
        num2 = 10
        num2 = 20
//        num2 is value. can not change.

//        Int, Double, String, Boolean 자료형 자동 대입 예제

        val num3 = 30 // num3는 30, int니까 자동으로 int로 설정
        val num4 = 3.14 // num4는 3.14가 Double 이므로 알아서 Double로 설정
        val teacherName = "조경진" // String  자동 할당
        val isMale = true // Boolean 자동 할당

//        변수에 담긴 강사 이름 로그로 출력
        Log.d("강사이름", teacherName)

    }
}



























