// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import com.twilio.type.Twiml;

public class Calling {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("AC62dc0906c1d953cd08db13db668bbfc3");
    public static final String AUTH_TOKEN = System.getenv("ee2b05992a35f0d309f03dc77c1a1b17");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber("+6138319086"),
                new com.twilio.type.PhoneNumber("+19896822151"),
                new com.twilio.type.Twiml("<Response><Say>Ahoy, World!</Say></Response>"))
            .create();

        System.out.println(call.getSid());
    }
}