package org.example.lesson7task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SaturdayBonusCalculatorTest {

    @Test
    void shouldCalculateBaseSalary() {
        //given
        SaturdayBonusProvider saturdayBonusProviderMock = Mockito.mock(SaturdayBonusProvider.class);
        Mockito.when(saturdayBonusProviderMock.getSaturdayBonus(WorkingDay.Saturday)).thenReturn(4.0);
        SaturdayBonusCalculator saturdayBonusCalculator = new SaturdayBonusCalculator(saturdayBonusProviderMock);

        //when
        double result = saturdayBonusCalculator.calculateSaturdayBonus(WorkingDay.Saturday, 300);

        //then
        Assertions.assertEquals(1200, result);
    }
}

