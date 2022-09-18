package com.metacoding.if_lecture06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //조건문을 사용하기 위해서는 비교 연산자와 논리 연산자를 이해해야 한다.
        //1. 비교 연산자 (<, >, >=, <=, ==, !=)
        //문자열도 비교연산자로 비교할 수 있다!
        var result = 1 > 2//비교연산자를 사용하면, result에 불린 값이 저장된다(참인지 아닌지)
        Log.d("compare","1 > 2 의 결과는 : ${result}")

        //2. 논리 연산자
        var x = 5

        var result1 = x < 8
        Log.d("compare","첫 번째 결과 : ${result1}")
        var result2 = x > 6
        Log.d("compare","두 번째 결과 : ${result2}")

        var logic1 = result1&&result2
        Log.d("compare","논리연산 && 결과 : ${logic1}")

        var logic2 = result1 || result2
        Log.d("compare","논리연산 || 결과 : ${logic2}")

        //3. 부정 연산자
        //비교한 결과값을 뒤집어준다.
        var logic3 = !result1
        Log.d("compare","논리연산 ! 결과 : ${logic3}")

        //if
        /*
        if(조건식){

        }
        if문은 이렇게 생겼다. 이 떄 조건식에는 보통 비교연산+논리연산이 들어가게 된다.
         */

        //when - 다른 언어에서는 switch라고 불린다.
        var month : Int
        month = 6
        when(month){//switch보다는 if문의 확장판이라고 보면 된다.
            //when문이 if문보다 가독성이 더 좋다!!
            3,4,5 ->{//코드 블럭 생략도 가능하다!
                Log.d("when","봄입니다")
            }

            in 6..8 -> {
                Log.d("when","여름입니다")
            }

            9,10,11->  Log.d("when","가을입니다")

            12,1,2->{
                Log.d("when","겨울입니다")
            }

        }
    }
}