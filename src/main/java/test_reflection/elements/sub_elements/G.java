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
public abstract class G extends A<List<String>>{


    public static final List<String> DEFAULT = Arrays.asList();
    private static final Class<?> OPTION_TYPE = String.class;

    private String getAvailableValues() {
        return Arrays.toString(getAvailableJobs().stream().map(Object::toString).toArray());
    }
    
    public abstract List<String> getAvailableJobs();
    
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
                , Arrays.toString(getDefaultValue().stream().map(Object::toString).toArray()));
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public Function<String[], List<String>> getParsingFunction() {

        return new Function<String[], List<String>>() {

            @Override
            public List<String> apply(String[] input) {

                String[] jobs = input[0].split(",");
                return Arrays.asList(jobs).stream().map(Object::toString).collect(Collectors.toList());
                
            }};
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public List<String> getDefaultValue() {

        return DEFAULT;
        
    }
    
}
