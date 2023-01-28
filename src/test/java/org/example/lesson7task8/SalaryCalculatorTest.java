package org.example.lesson7task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
class SalaryCalculatorTest {

    @Test
    void ShouldCalculateBaseSalary() {
        //given
        BaseSalaryProvider baseSalaryProviderMock = Mockito.mock(BaseSalaryProvider.class);
        Mockito.when(baseSalaryProviderMock.getBaseSalary(WorkingDay.MondayToFriday)).thenReturn(23.0);
        SalaryCalculator salaryCalculator = new SalaryCalculator(baseSalaryProviderMock);

        //when
        double result = salaryCalculator.calculateBaseSalary(WorkingDay.MondayToFriday, 250);

        //then
        Assertions.assertEquals(5750, result);
    }
}