/**
 * Created by Helen on 11/10/2016.
 */
public class GuitarSpec {
    private static Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public static Builder getBuilder() {
        return  builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if(builder != otherSpec.builder)
            return false;
        if(isSpecified() && (!model.equalsIgnoreCase(otherSpec.model)))
            return false;
        if(type!= otherSpec.type)
            return false;
        //if(numStrings != otherSpec.numStrings)
            //return false;
        if(backWood != otherSpec.backWood)
            return false;
        return topWood == otherSpec.topWood;
    }
    private boolean isSpecified() {
        return  (model != null) && (!model.equals(""));
    }
}