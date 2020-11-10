# AcuityAdTest
This is a maven project built with Java and Selenium web driver based following page object model.

Project Structure
=================

Source Folder: src

Test folder: src/test

Test Scripts folder : src/test/seleniumtest

Page Objects of web elemnets: src/test/

Config properties path: src/com/acuity/framework/config

Hook path : src/test/seleniumtest/TestInitialize.java


Automated Scenarios:
Following scenarios have been automated:
- Home page Header should have following links named: Solutions, Insights, News, Company => file: HomeHeaderTest.java
- Validate the footer has the following clickable links: Contact us, Corporate Privacy policy, Terms & Conditions, Cookie Policy, Opt-out, Technology Privacy Policy, AODA => file : FooterLinkTest.java
- Checking the social media links at the right bottom corner of footer: Youtube, Twitter. LinkedIn, facebook, Instagram => SocialMediaLinkTest.java
- Submit the form of Contact us with all filled-up data => file: ContactUsTest.java


Test Reporting listener is not implemented.
 
