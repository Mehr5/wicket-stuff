package foo.bar.authenticationAssist;

import foo.bar.HomePage;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

@AuthorizeInstantiation("USER")
public class AuthenticationHomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public AuthenticationHomePage(final PageParameters parameters) {



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
