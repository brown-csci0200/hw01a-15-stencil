package sol;

import src.FuncList;
import src.IFuncList;

/**
 * Class representing Rainfall data
 */
public class Rainfall {

    /**
     * Field representing the rainfall data readings
     */
    private IFuncList<Integer> data;

    /**
     * Constructor for a Rainfall
     *
     * @param data  the list of rainfall data readings
     */
    public Rainfall(IFuncList<Integer> data) {
        this.data = data;
    }

    /**
     * Method to compute the average rainfall according to these rules:
     *   - Only readings before the first -999 are considered
     *   - Negative readings are discarded
     * Assumes that there is at least one non-negative number before -999 in the data
     *
     * @return  The average rainfall for the relevant readings in the data
     */
    public double getAverage() {
        // TODO: fill out this method!
        return 0.0;
    }
}
