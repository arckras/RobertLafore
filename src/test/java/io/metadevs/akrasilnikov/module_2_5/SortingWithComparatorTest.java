package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP.AbstractSpecialist;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortingWithComparatorTest extends AbstractHiringSpecialists {

    @Test
    public void comparatorTest() {
        hiringSpecialists();
        companyBender.getSpecialists().sort(AbstractSpecialist.NameComparator);
        for (int i = 0; i < companyBender.getSpecialists().size() - 1; i++) {
            AbstractSpecialist specialist1 = companyBender.getSpecialists().get(i);
            AbstractSpecialist specialist2 = companyBender.getSpecialists().get(i + 1);
            assertThat(specialist1.compareTo(specialist2)).isEqualTo(-1);
        }

        companyBender.getSpecialists().sort(AbstractSpecialist.AgeComparator);
        for (int i = 0; i < companyBender.getSpecialists().size() - 1; i++) {
            int age1 = companyBender.getSpecialists().get(i ).getAge();
            int age2 = companyBender.getSpecialists().get(i+1).getAge();
            assertThat((age1 <= age2)).isEqualTo(true);
        }
    }
}
