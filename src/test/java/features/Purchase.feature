Feature: Selecting product and add to basket.

  @LoginPage @Login
  Scenario: Login Case
    Given Batu is on Home Page
    When click "Giris Yap" card in the top right
    Then check Login Page
    When click Login Button

  @HomePage @Product @Filtering
  Scenario: Product Selecting And Filtering Case
    Given Batu is on Home Page
    When click "Bluz" when hover the "Kadin" category, select "siyah" color and click product
    When after select "medium" size, add product to basket and go to basket
    Then check product name "Bluz"
    Then check product size "Beden: M"
    Then check product number "Sepetim (1 Ürün)"
    Then click purchase button










