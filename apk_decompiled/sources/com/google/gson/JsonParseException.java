package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public class JsonParseException extends RuntimeException {
    public JsonParseException(RuntimeException runtimeException) {
        super("Unable to parse json into type ViewEventView", runtimeException);
    }
}
