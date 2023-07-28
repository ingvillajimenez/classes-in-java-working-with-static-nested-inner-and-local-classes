package com.skillsoft.nestedclasseslambdas;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

    private final long id;
    private final String name;
    private final String contactInfo;

    private final ContactValidator contactValidator;

    private String validPhoneNumber;
    private String validEmailAddress;

    { // instance initialization block
        Logger log = Logger.getLogger(Customer.class.getName());

        class USContactValidator implements ContactValidator { // local class

            public void populateValidPhoneNumber() {
                Pattern pattern = Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}");
                Matcher phoneMatcher = pattern.matcher(contactInfo);

                if (phoneMatcher.find()) {
                    validPhoneNumber = phoneMatcher.group();

                    log.info("Valid phone number found: " + validPhoneNumber);
                } else {
                    log.warning("No valid phone number found for: " + name);
                }
            }

            public void populateValidEmailAddress() {

                Pattern pattern = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
                Matcher emailMatcher = pattern.matcher(contactInfo);

                if (emailMatcher.find()) {
                    validEmailAddress = emailMatcher.group();

                    log.info("Valid email address found: " + validEmailAddress);
                } else {
                    log.warning("No valid email address found for: " + name);
                }
            }
        }

        contactValidator = new USContactValidator();

    }

    public Customer(long id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;

        contactValidator.populateValidPhoneNumber();
        contactValidator.populateValidEmailAddress();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, name: %s, phone: %s, email: %s",
                id, name, validPhoneNumber, validEmailAddress);
    }
}

// 555-555-5555
// Valid phone number
