import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class Product {

    PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private float price;

    public void setPrice(float price) {
        propertyChangeSupport.firePropertyChange("price_change", this.price, price);
        this.price = price;
    }

    public void addCustomerInterested(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

}

class User implements PropertyChangeListener {

    private final String email;

    public User(String email) {
        this.email = email;
    }

    // simple method to send email
    private void sendEmailToUser(String content) {
        System.out.println("====================");
        System.out.println("Email to: " + email);
        System.out.println("You received a email with " + content);
        System.out.println("====================");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        sendEmailToUser("The product has changed his value. New price: " + evt.getNewValue());
    }
}

class ShopJavaObserverExample {

    public static void main(String[] args) {
        User user = new User("ianguuima@gmail.com");
        Product product = new Product();

        product.addCustomerInterested(user);
        product.setPrice(50);
    }

}