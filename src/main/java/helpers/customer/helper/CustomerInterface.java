package helpers.customer.helper;

import pojo.lombok.javafaker.customer.Customer;

import java.util.Date;

public interface CustomerInterface {
      Date CUSTOMER_DATE_OF_PROFILE_CREATION = new Date();
      Date CUSTOMER_DATE_OF_PROFILE_DEACTIVATION = new Date();

    Customer createCustomer();
}
