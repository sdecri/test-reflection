/**
 * POIS_SCORE_TYPE.java
 */
package test_reflection.elements.sub_elements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Simone De Cristofaro
 * Feb 20, 2018
 */
public enum JOB {

    FILTER_FCD("filter-fcd")
    , BUILD_TRAJECTORIES("build-trajectories")
    , CATEGORIZE_TRAJECTORIES("categorize-trajectories")
    , OD_MATRICES("od-matrices")
    , MAP_MATCHING("map-matching")
    , MATCHED_SPEEDS("matched-speeds")
    , GENERAL_STATISTICS("general-statistics")
    , TRAJECTORIES_STATISTICS("trajectories-statistics")
    , REGIONAL_STATISTICS("regional-statistics")
    , DEVICE_STATISTICS("device-statistics")
    , POINT_TO_SEGMENT("point-to-segment")
    , SPEED_PATTERNS("speed-patterns")
    , TURN_PROBABILITIES("turn-probabilities")
    , MOST_USED_PATHS("most-used-paths")
    , VISUM_COMMON ("visum-common-output")
    ;
    
    private String value;

    /**
     * @param value
     */
    private JOB(String value) {
        this.value = value;
    }
    
    /**
     * @return the {@link JOB#value}
     */
    public String getValue() {
    
        return value;
    }


    public static JOB parse(String value) {
        if(value == null) throw new IllegalStateException("Null value passed to the method");
        
        JOB[] values = JOB.values();
        
        for (JOB runType : values) {
            if(value.equals(runType.getValue()))
                return runType;
        }
        
        throw new IllegalStateException(String.format("No valid value provided. Available values: %s", Arrays.toString(getValues().toArray())));

    }
    
    public static List<String> getValues() {
        
        return Arrays.asList(JOB.values()).stream()
        .map(JOB::getValue).collect(Collectors.toList());
        //.toArray(siye -> new String[siye]);
        
    }
    
    
}
