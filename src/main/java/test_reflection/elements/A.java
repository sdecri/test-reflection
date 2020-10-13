/**
 * A.java
 */
package test_reflection.elements;

import org.apache.commons.cli.Option;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 * @param <T> 
 */
public abstract class A<T> implements I<T> {

    protected boolean isRequired;
    
    /**
     * 
     */
    public A() {
        
    }


    public Option createOption() {
        
            return Option.builder()
                    .longOpt(getLongOpt())
                    .hasArg(hasArg())
                    .desc(getDescsriptionWithDefaultValue())
                    .type(getOptionType())
                    .required(false)
                    .build();
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public boolean isValid(T value) {
    
        return true;
        
    }
    
    /**
    * {@inheritDoc}
    */
    @Override
    public boolean hasArg() {
    
        return true;
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public T getDefaultValue() {
    
        return null;
        
    }
    
    public String getDescsriptionWithDefaultValue() {
        
        String description = getDescription();
        StringBuilder sb = new StringBuilder(description);
        if(getFormattedDefault() != null) {
            if(!description.endsWith("."))
                sb.append(".");
            sb.append(" Default: ").append(getFormattedDefault());
        }
        else if(getDefaultValue() != null) {
            if(!description.endsWith("."))
                sb.append(".");
            sb.append(" Default: ").append(getDefaultValue());
        }
        return sb.toString();
    }
    
    public String getFormattedDefault() {
        return null;
    }
    
}
