package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public enum d1 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    d1(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
