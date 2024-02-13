package com.mexiti.costogasolina

import org.junit.Test
import org.junit.Assert.*

class GasolinaUnitTest {
    @Test
    fun testCalculoGasolina_sinPropina() {
        val precioLitro = 22.35
        val litros = 40.0
        val total = calcularMonto(precioLitro, litros, darPropina = false, propina = 0.0)
        assertEquals("$894.00", total)
    }

    @Test
    fun testCalculoGasolina_conPropina() {
        val precioLitro = 22.35
        val litros = 40.0
        val propina = 10.0
        val total = calcularMonto(precioLitro, litros, darPropina = true, propina = propina)
        assertEquals("$904.00", total)
    }
}
