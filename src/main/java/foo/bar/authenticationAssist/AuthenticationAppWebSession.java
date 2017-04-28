package foo.bar.authenticationAssist;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;


public class AuthenticationAppWebSession extends AuthenticatedWebSession
{

    public AuthenticationAppWebSession(Request request)
    {
        super(request);
    }


    @Override
    public boolean authenticate(final String username, final String password)
    {
        final String WICKET = "WICKET";

        return WICKET.equals(username) && WICKET.equals(password);
    }


    @Override
    public Roles getRoles()
    {
        if (isSignedIn())
        {

            return new Roles(Roles.USER);
        }
        return null;
    }
}
