package com.mexiti.costogasolina

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mexiti.costogasolina", appContext.packageName)
    }

    @Test
    fun calculateTotalCost() {
        // Simula los valores de entrada para el cálculo del monto
        val pricePerLiter = 22.35
        val liters = 40.0
        val tip = 10.0
        val includeTip = true

        // Ejecuta el método que calcula el monto total
        val totalCost = calculateTotalCost(pricePerLiter, liters, includeTip, tip)

        // Verifica si el monto calculado es el esperado
        assertEquals("Expected total with tip", 904.0, totalCost, 0.001)
    }

    private fun calculateTotalCost(pricePerLiter: Double, liters: Double, includeTip: Boolean, tip: Double): Double {
        var totalCost = pricePerLiter * liters
        if (includeTip) {
            totalCost += tip
        }
        return totalCost
    }
}
