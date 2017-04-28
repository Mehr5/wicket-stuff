package foo.bar;

import foo.bar.authenticationAssist.AuthenticationHomePage;
import foo.bar.authenticationAssist.AuthenticationSignOut;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;


public class Contacts extends WebPage {

    private static final long serialVersionUID = 2L;

    public Contacts (final PageParameters parameters) {
        add(new Link("HomePage") {
            @Override
            public void onClick() {
                setResponsePage(AuthenticationHomePage.class);
            }
        });
        add(new Link("Portfolio") {
            @Override
            public void onClick() {
                setResponsePage(Portfolio.class);
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
                Portfolio.class, "css/main.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                Portfolio.class, "css/normalize.css")));

        response.render(CssHeaderItem.forReference(new CssResourceReference(
                Portfolio.class, "css/responsive.css")));
    }
}