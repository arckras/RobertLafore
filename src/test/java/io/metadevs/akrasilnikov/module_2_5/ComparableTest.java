package io.metadevs.akrasilnikov.module_2_5;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ComparableTest extends AbstractHiringSpecialists {
    @Test
    public void comparableTest() {
        hiringSpecialists();
        assertThat(companyBender.specialistByName("Bob").compareTo(companyBender.specialistByName("Bob"))).isEqualTo(0);
        assertThat(companyBender.specialistByName("Bob").compareTo(companyBender.specialistByName("Alice"))).isEqualTo(1);
        assertThat(companyBender.specialistByName("Bob").compareTo(companyBender.specialistByName("Ares"))).isEqualTo(1);
        assertThat(companyBender.specialistByName("Bob").compareTo(companyBender.specialistByName("Nika"))).isEqualTo(-1);
    }
}
