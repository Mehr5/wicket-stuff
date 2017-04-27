package foo.bar.authentication;

import foo.bar.HomePage;
import org.apache.wicket.Page;
import org.apache.wicket.RestartResponseAtInterceptPageException;
import org.apache.wicket.Session;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.component.IRequestableComponent;

/**
 * Forms example.
 *
 * @author Jonathan Locke
 */
public final class SignInApplication extends HomePage {
    /**
     * Constructor.
     */
    public SignInApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<? extends Page> getHomePage() {
        return Home.class;
    }

    /**
     * @see org.apache.wicket.protocol.http.WebApplication#newSession(Request, Response)
     */
    @Override
    public Session newSession(Request request, Response response) {
        return new SignInSession(request);
    }


    @Override
    protected void init() {
        super.init();


        getSecuritySettings().setAuthorizationStrategy(new IAuthorizationStrategy.AllowAllAuthorizationStrategy() {
            @Override
            public <T extends IRequestableComponent> boolean isInstantiationAuthorized(
                    Class<T> componentClass) {

                if (AuthenticatedWebPage.class.isAssignableFrom(componentClass)) {
                    if (((SignInSession) Session.get()).isSignedIn()) {
                        return true;
                    }


                    throw new RestartResponseAtInterceptPageException(SignIn.class);
                }

                return true;
            }
        });
    }
}
