package com.bee_studio_mobile.app.ws.security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//cette classe a pour but de lire
// les informations directement via le application.proprerties
@ComponentScan
public class AppProperties {

    @Autowired
    private Environment env;

    public String getTokenSecret(){
        return env.getProperty("tokenSecret");
    }


}
