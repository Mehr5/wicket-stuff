package foo.bar;

import foo.bar.authenticationAssist.AuthenticationAppWebSession;
import foo.bar.authenticationAssist.AuthenticationHomePage;
import foo.bar.authenticationAssist.SignIn;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.resource.CssUrlReplacer;

public class WicketApplication extends AuthenticatedWebApplication {


    @Override
    public Class<AuthenticationHomePage> getHomePage()
    {
        return AuthenticationHomePage.class;
    }

    @Override
    protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
        return AuthenticationAppWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return SignIn.class;
    }


    @Override
    public void init()
    {
        super.init();
        getResourceSettings().setCssCompressor(new CssUrlReplacer());
    }

}


