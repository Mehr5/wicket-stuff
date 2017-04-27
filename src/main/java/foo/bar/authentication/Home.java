package foo.bar.authentication;


import foo.bar.HomePage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Home extends HomePage implements AuthenticatedWebPage{

    public Home(PageParameters parameters) {
        super(parameters);
    }

}
