package org.hcjf.layers.query;

/**
 * This kind of evaluator is used to reduce the query.
 * @author Javier Quiroga.
 * @email javier.quiroga@sitrack.com
 */
public final class TrueEvaluator implements Evaluator {

    /**
     * Every time return true.
     * @param object Object of the data collection.
     * @param dataSource Data source
     * @param consumer Consumer
     * @param parameters Evaluation parameters
     * @return
     */
    @Override
    public boolean evaluate(Object object, Query.DataSource dataSource, Query.Consumer consumer, Object... parameters) {
        return true;
    }

}
