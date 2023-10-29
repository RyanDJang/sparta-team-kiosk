package main.domain.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductIdTest {

    @Test
    @DisplayName("증가된 id값을 반환합니다.")
    void getIncrementedId() {
        Assertions.assertEquals(ProductId.getIncrementedId(), 1);
    }
}