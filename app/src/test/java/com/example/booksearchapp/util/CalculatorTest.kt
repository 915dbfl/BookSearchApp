package com.example.booksearchapp.util

import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

@SmallTest
class CalculatorTest{
//    private val calculator = Calculator()
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        //각 테스트가 수행되기 직전에 실행되는 코드
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        //테스트 종료 직후에 실행되는 코드
        //ex) 데이터베이스를 닫는 작업
    }

    @Test
    fun `additional function test`() {
        //Given
        val x = 4
        val y = 2

        //When
        val result: Int = calculator.addition(x, y)

        //Then
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun `subtraction function test`() {
        //Given
        val x = 4
        val y = 2

        //When
        val result: Int = calculator.subtraction(x, y)

        //Then
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `multiplication function test`() {
        //Given
        val x = 4
        val y = 2

        //When
        val result: Int = calculator.multiplication(x, y)

        //Then
        assertThat(result).isEqualTo(8)
    }

    @Test
    fun `division function test`() {
        //Given
        val x = 4
        val y = 0

        //When
        val result = calculator.division(x, y)

        //Then
        assertThat(result).isEqualTo(null)
    }
}