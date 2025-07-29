package comtest;

public sealed class SealedPaymentExample permits UPI, Card, Cash {}

 final class UPI extends SealedPaymentExample {}
final class Card extends SealedPaymentExample {}
final class Cash extends SealedPaymentExample {}

