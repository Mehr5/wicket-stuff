package foo.bar.authenticationAssist;

import foo.bar.Contacts;
import foo.bar.Portfolio;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

@AuthorizeInstantiation("USER")
public class AuthenticationHomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public AuthenticationHomePage(final PageParameters parameters) {

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
