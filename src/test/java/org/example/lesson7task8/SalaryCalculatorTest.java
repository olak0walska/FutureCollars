package org.example.lesson7task8;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @Test
    void shouldCalculateFullSalary() {
        WorkDayProvider workDayProviderMock = Mockito.mock(WorkDayProvider.class);
        Mockito.when(workDayProviderMock.getSalary(21)).thenReturn(4200d);

        WeekendWorkProvider weekendWorkProviderMock = Mockito.mock(WeekendWorkProvider.class);
        Mockito.when(weekendWorkProviderMock.getWeekendSalary(2)).thenReturn(600d);

        SalaryCalculator salaryCalculator = new SalaryCalculator(weekendWorkProviderMock, workDayProviderMock);

        double totalSalary = salaryCalculator.getSalary(21,2,400);

        assertEquals(5200,totalSalary);

    }
}
