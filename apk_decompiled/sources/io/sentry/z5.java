package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum z5 implements m2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    z5(int i) {
        this.severityNumber = i;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A(name().toLowerCase(Locale.ROOT));
    }
}
