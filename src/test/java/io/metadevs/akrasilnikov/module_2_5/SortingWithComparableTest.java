package io.metadevs.akrasilnikov.module_2_5;

import org.junit.jupiter.api.Test;
import java.util.Collections;

public class SortingWithComparableTest extends AbstractHiringSpecialists {

    @Test
    public void sortingWithComparableTest() {
        hiringSpecialists();
        companyBender.printSpecialists();
        Collections.sort(companyBender.getSpecialists());
        companyBender.printSpecialists();
    }
}
