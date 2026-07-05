package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum t5 implements m2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A(name().toLowerCase(Locale.ROOT));
    }
}
