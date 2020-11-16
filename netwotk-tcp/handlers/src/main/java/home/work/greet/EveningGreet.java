package home.work.greet;

import home.work.net.Greetable;

public class EveningGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return "Good evening, " + userName;
    }
}