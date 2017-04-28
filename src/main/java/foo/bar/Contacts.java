package foo.bar;

import foo.bar.authenticationAssist.AuthenticationHomePage;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;


public class Contacts extends WebPage {

    private static final long serialVersionUID = 2L;

    public Contacts (final PageParameters parameters) {

    }

    @Override
    public void renderHead(IHeaderResponse response) {

        super.renderHead(response);

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                AuthenticationHomePage.class, "css/main.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                AuthenticationHomePage.class, "css/normalize.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                AuthenticationHomePage.class, "css/responsive.css")));
    }
}