package foo.bar;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;


public class About extends WebPage {

    private static final long serialVersionUID = 2L;

    public About (final PageParameters parameters) {

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