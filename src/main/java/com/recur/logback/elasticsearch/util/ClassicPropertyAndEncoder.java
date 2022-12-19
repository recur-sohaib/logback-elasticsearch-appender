package com.recur.logback.elasticsearch.util;

import com.recur.logback.elasticsearch.config.Property;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.PatternLayoutBase;

public class ClassicPropertyAndEncoder extends AbstractPropertyAndEncoder<ILoggingEvent> {

    public ClassicPropertyAndEncoder(Property property, Context context) {
        super(property, context);
    }

    @Override
    protected PatternLayoutBase<ILoggingEvent> getLayout() {
        return new PatternLayout();
    }
}
