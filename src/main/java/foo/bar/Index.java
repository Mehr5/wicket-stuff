package foo.bar;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;



public class Index extends WebPage {

    private static final long serialVersionUID = 2L;

    public Index (final PageParameters parameters) {
        // Add the simplest type of label
        add(new Label("message", "If you see this message wicket is properly configured and running"));

        // TODO Add your page's components here
    }
}

