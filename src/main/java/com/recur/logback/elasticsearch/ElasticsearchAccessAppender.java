package com.recur.logback.elasticsearch;

import java.io.IOException;

import com.recur.logback.elasticsearch.config.Settings;

import ch.qos.logback.access.spi.IAccessEvent;

public class ElasticsearchAccessAppender extends AbstractElasticsearchAppender<IAccessEvent> {

    public ElasticsearchAccessAppender() {
    }

    public ElasticsearchAccessAppender(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendInternal(IAccessEvent eventObject) {
        eventObject.prepareForDeferredProcessing();
        publishEvent(eventObject);
    }

    protected AccessElasticsearchPublisher buildElasticsearchPublisher() throws IOException {
        return new AccessElasticsearchPublisher(getContext(), errorReporter, settings, elasticsearchProperties, headers);
    }


}
