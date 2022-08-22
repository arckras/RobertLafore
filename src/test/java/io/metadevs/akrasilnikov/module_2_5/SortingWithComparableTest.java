package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP.AbstractSpecialist;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.assertj.core.api.Assertions.assertThat;

public class SortingWithComparableTest extends AbstractHiringSpecialists {

    @Test
    public void sortingWithComparableTest() {
        hiringSpecialists();
        Collections.sort(companyBender.getSpecialists());
        for (int i = 0; i < companyBender.getSpecialists().size() - 1; i++) {
            AbstractSpecialist specialist1 = companyBender.getSpecialists().get(i);
            AbstractSpecialist specialist2 = companyBender.getSpecialists().get(i + 1);
            assertThat(specialist1.compareTo(specialist2)).isEqualTo(-1);
        }
    }
}
