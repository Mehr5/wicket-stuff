package foo.bar.authenticationAssist;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public final class SignIn extends WebPage
{

    public SignIn(final PageParameters parameters)
    {
        add(new SignInPanel("signInPanel"));
    }
}
