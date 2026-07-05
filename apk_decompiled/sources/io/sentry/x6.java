package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum x6 implements m2 {
    SESSION,
    BUFFER;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A(name().toLowerCase(Locale.ROOT));
    }
}
