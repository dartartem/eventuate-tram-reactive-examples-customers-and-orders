package io.eventuate.examples.tram.ordersandcustomers.customers.domain.events;

public class CustomerCreditReservedEvent extends AbstractCustomerOrderEvent {

  public CustomerCreditReservedEvent() {
  }

  public CustomerCreditReservedEvent(String orderId) {
    super(orderId);
  }
}
