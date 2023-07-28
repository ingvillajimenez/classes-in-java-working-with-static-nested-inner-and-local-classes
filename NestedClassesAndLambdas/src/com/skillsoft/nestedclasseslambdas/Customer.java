package com.skillsoft.nestedclasseslambdas;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

    private final long id;
    private final String name;
    private final String contactInfo;

    private String validPhoneNumber;
    private String validEmailAddress;

    public Customer(long id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

//    public static void validateCustomer() {
        // can define local classes within static methods, but those local classes cannot access the member variable of the outer class
    // local classes defined within static methods can only access the static variables of the outer class
    public void validateCustomer() {

//        Logger log = Logger.getLogger(Customer.class.getName()); // local variable (Effectively Final)
        final Logger log = Logger.getLogger(Customer.class.getName()); // local variable (Explicitly Final)

        class ContactValidator { // local class
            // local classes cannot be defined using access modifiers
//        public class ContactValidator { // Modifier 'public' not allowed here
//        private class ContactValidator { // Modifier 'private' not allowed here
//        protected class ContactValidator { // Modifier 'protected' not allowed here

//            private static String staticVariable = "some static variable"; // inner classes cannot have static declarations

            void populatePhoneNumber() {
                Pattern pattern = Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}");
                Matcher phoneMatcher = pattern.matcher(contactInfo); // local class accesses the member variable of the outer class

                if (phoneMatcher.find()) {
                    validPhoneNumber = phoneMatcher.group(); // local class accesses the member variable of the outer class

                    log.info("Valid phone number found: " + validPhoneNumber); // accessing local variable log
                } else {
                    log.warning("No valid phone number found for: " + name); // accessing local variable log
                }
            }

            void populateEmailAddress() {

                Pattern pattern = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
                Matcher emailMatcher = pattern.matcher(contactInfo); // local class accesses the member variable of the outer class

                if (emailMatcher.find()) {
                    validEmailAddress = emailMatcher.group(); // local class accesses the member variable of the outer class

                    log.info("Valid email address found: " + validEmailAddress); // accessing local variable log
                } else {
                    log.warning("No valid email address found for: " + name); // accessing local variable log
                }
            }
        }

        ContactValidator contactValidator = new ContactValidator();

        contactValidator.populatePhoneNumber();
        contactValidator.populateEmailAddress();
    }

//    ContactValidator contactValidatorMemberVariable = new ContactValidator(); // Cannot resolve symbol 'ContactValidator'
//
//    public void validateCustomer2() {
//        ContactValidator contactValidator = new ContactValidator(); // Cannot resolve symbol 'ContactValidator'
//
//        contactValidator.populatePhoneNumber(); // Cannot resolve method 'populatePhoneNumber()'
//        contactValidator.pouplateEmailAddress(); // Cannot resolve method 'populateEmailAddress()'
//    }

    @Override
    public String toString() {
        return String.format("ID: %d, name: %s, phone: %s, email: %s",
                id, name, validPhoneNumber, validEmailAddress);
    }
}

// 555-555-5555
// Valid phone number
