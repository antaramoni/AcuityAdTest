Feature: Validate Home page should have link Solutions, Insights, News, Company

  Scenario: Heades have clickable header label
    Given I request to Home page of AcuityAd site
    Then I see four clickable header link Solutions, Insights, News, Company
