package com.subocol.mastercrash.aggregators;

import com.subocol.mastercrash.models.data.UserData;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class UserAggregator implements ArgumentsAggregator {
    @Override
    public UserData aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) {
        return new UserData(accessor.getInteger(0),
                accessor.getString(1),
                accessor.getString(2));
    }
}

