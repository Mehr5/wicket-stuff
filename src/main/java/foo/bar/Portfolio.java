package foo.bar;

import foo.bar.authenticationAssist.AuthenticationHomePage;
import foo.bar.authenticationAssist.AuthenticationSignOut;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;


public class Portfolio extends WebPage {

    private static final long serialVersionUID = 2L;

    public Portfolio (final PageParameters parameters) {

        add(new Link("About") {
            @Override
            public void onClick() {
                setResponsePage(About.class);
            }
        });
        add(new Link("Contacts") {
            @Override
            public void onClick() {
                setResponsePage(Contacts.class);
            }
        });
        add(new Link("SignOut") {
            @Override
            public void onClick() {
                setResponsePage(AuthenticationSignOut.class);
            }
        });

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