package foo.bar.authenticationAssist;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class AuthenticationSignOut extends WebPage
{

    public AuthenticationSignOut(final PageParameters parameters)
    {
        getSession().invalidate();
    }
}