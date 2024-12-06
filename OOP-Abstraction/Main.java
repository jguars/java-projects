abstract class AbstractButtonClass {
    String caption;

    public void SetCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }
}
interface ButtonPress {
    void buttonPress();
}

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Sending " + this.message
                + " to " + this.sendTo);
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class ForwardButtonClass extends AbstractButtonClass implements ButtonPress {
    String forwardTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Forwarding " + this.message
                + " to " + this.forwardTo);
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Main {
    public static void main(String[] args) {
        SendButtonClass sendbutton = new SendButtonClass();
        sendbutton.SetCaption("Send");
        sendbutton.setSendTo("user@example.com");
        sendbutton.setMessage("You have been successfully registered!");
        sendbutton.buttonPress();

        System.out.println("----------------------");

        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.SetCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World!");
        forwardButton.buttonPress();
    }
}