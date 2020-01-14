public interface IPaymentCard extends Iscan {
    public String getCardNumber();

    public String getExpiryDate();

    public int getSecurityNumber();
}
