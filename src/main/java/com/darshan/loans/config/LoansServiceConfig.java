package com.darshan.loans.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author Darshan M N
 */
@Configuration
//prefix will indicate that every property name in the accounts MS is starts from `loans`
@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
@ToString
public class LoansServiceConfig {

    /**
     * Note: The naming convention should match the property name in the properties file
     * eg: msg is same as in the account ms property file field
     * <p>
     * there is a property called build-version in accounts ms however in this file we defined it as
     * buildVersion because spring is smart enough to remove the special character and have it like below
     */
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;

}
