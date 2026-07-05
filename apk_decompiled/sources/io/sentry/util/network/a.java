package io.sentry.util.network;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    JSON_TRUNCATED("JSON_TRUNCATED"),
    TEXT_TRUNCATED("TEXT_TRUNCATED"),
    INVALID_JSON("INVALID_JSON"),
    BODY_PARSE_ERROR("BODY_PARSE_ERROR");

    private final String value;

    a(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
