/**
 * C.java
 */
package test_reflection.elements.sub_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import test_reflection.elements.A;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 */
public abstract class F extends A<Set<JOB>>{


    public static final Set<JOB> DEFAULT = new HashSet<>(Arrays.asList());
    private static final Class<?> OPTION_TYPE = String.class;

    private String getAvailableValues() {
        return Arrays.toString(getAvailableJobs().stream().map(JOB::getValue).toArray());
    }
    
    public abstract List<JOB> getAvailableJobs();
    
    /**
    * {@inheritDoc}
    */
    @Override
    public Class<?> getOptionType() {

        return OPTION_TYPE;
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public String getDescription() {

        return String.format("Chain of jobs to run (comma separated). Available values: %s. Default: %s" , getAvailableValues()
                , Arrays.toString(getDefaultValue().stream().map(JOB::getValue).toArray()));
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public Function<String[], Set<JOB>> getParsingFunction() {

        return new Function<String[], Set<JOB>>() {

            @Override
            public Set<JOB> apply(String[] input) {

                String[] jobs = input[0].split(",");
                return Arrays.asList(jobs).stream().map(JOB::parse).collect(Collectors.toSet());
                
            }};
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public Set<JOB> getDefaultValue() {

        return DEFAULT;
        
    }
    
}
