package com.google.gson;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonIOException extends JsonParseException {
    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, Throwable th) {
        super(str, th);
    }

    public JsonIOException(Exception exc) {
        super(exc);
    }
}
