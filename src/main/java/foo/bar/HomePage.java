package foo.bar;


import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.wicket.request.resource.CssResourceReference;


public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        // Add the simplest type of label
        add(new Label("message", "If you see this message wicket is properly configured and running"));

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
