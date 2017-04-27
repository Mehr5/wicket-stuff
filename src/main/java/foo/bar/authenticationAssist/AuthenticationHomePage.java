package foo.bar.authenticationAssist;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

@AuthorizeInstantiation("USER")
public class AuthenticationHomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public AuthenticationHomePage(final PageParameters parameters) {

        add(new Label("message", new Model<String>("Welcome to java-assist")));

    }
}
