package com.betterprojectsfaster.talks.openj9memory.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.betterprojectsfaster.talks.openj9memory.web.rest.TestUtil;

public class ProductOrderTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ProductOrder.class);
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.setId(1L);
        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.setId(productOrder1.getId());
        assertThat(productOrder1).isEqualTo(productOrder2);
        productOrder2.setId(2L);
        assertThat(productOrder1).isNotEqualTo(productOrder2);
        productOrder1.setId(null);
        assertThat(productOrder1).isNotEqualTo(productOrder2);
    }
}
