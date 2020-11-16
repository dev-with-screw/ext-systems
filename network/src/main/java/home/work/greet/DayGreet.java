package home.work.greet;

import home.work.net.Greetable;

public class DayGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return "Good day, " + userName;
    }
}