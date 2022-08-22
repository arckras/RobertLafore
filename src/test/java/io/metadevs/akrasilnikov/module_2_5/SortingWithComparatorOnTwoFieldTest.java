package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP.AbstractSpecialist;
import org.junit.jupiter.api.Test;

public class SortingWithComparatorOnTwoFieldTest extends AbstractHiringSpecialists {

    @Test
    public void comparatorTest() {
        hiringSpecialists();
        System.out.print("\nТест сортировки по двум полям(возраст затем имя) через Comparator (SortingWithComparatorOnTwoFieldTest)");
        companyBender.printSpecialists();
        companyBender.getSpecialists().sort(AbstractSpecialist.AgeComparator.thenComparing(AbstractSpecialist.NameComparator));
        companyBender.printSpecialists();
        System.out.println("Конец теста\n");
    }
}

