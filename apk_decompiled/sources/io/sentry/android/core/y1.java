package io.sentry.android.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final Integer a;
    public final Boolean b;

    public y1(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return io.sentry.p.h(this.a, y1Var.a) && io.sentry.p.h(this.b, y1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
