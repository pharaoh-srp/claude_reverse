package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum b0 implements m2 {
    AUTO,
    ALL,
    ALL_BUT_FIRST,
    NONE;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((io.sentry.y) q3Var).A(toString().toLowerCase(Locale.ROOT));
    }
}
