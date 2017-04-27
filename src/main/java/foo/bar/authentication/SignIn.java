package foo.bar.authentication;

import foo.bar.HomePage;
import org.apache.wicket.examples.WicketExamplePage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.value.ValueMap;


public final class SignIn extends HomePage{

    public SignIn()
    {
        super();

        add(new FeedbackPanel("feedback"));


        add(new SignInForm("signInForm"));
    }


    public final class SignInForm extends Form<Void>
    {
        private static final String USERNAME = "username";
        private static final String PASSWORD = "password";


        private final ValueMap properties = new ValueMap();

        public SignInForm(final String id)
        {
            super(id);


            add(new TextField<>(USERNAME, new PropertyModel<String>(properties, USERNAME)));
            add(new PasswordTextField(PASSWORD, new PropertyModel<String>(properties, PASSWORD)));
        }


        @Override
        public final void onSubmit()
        {

            SignInSession session = getMySession();


            if (session.signIn(getUsername(), getPassword()))
            {
                continueToOriginalDestination();
                setResponsePage(getApplication().getHomePage());
            }
            else
            {

                String errmsg = getString("loginError", null, "Unable to sign you in");


                error(errmsg);
            }
        }

        private String getPassword()
        {
            return properties.getString(PASSWORD);
        }


        private String getUsername()
        {
            return properties.getString(USERNAME);
        }


        private SignInSession getMySession()
        {
            return (SignInSession)getSession();
        }
    }
}