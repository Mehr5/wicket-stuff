package foo.bar.authenticationAssist;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

public final class SignIn extends WebPage
{

    public SignIn(final PageParameters parameters)
    {
        add(new SignInPanel("signInPanel"));
    }

    @Override
    public void renderHead(IHeaderResponse response) {

        super.renderHead(response);

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                HomePage.class, "css/main.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                HomePage.class, "css/normalize.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                HomePage.class, "css/responsive.css")));
    }
}

