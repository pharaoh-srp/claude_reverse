package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class r7 {
    public final Boolean a;
    public final Double b;
    public final Double c;
    public final Boolean d;
    public final Double e;

    public r7(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.a = bool;
        this.b = d;
        this.c = d2;
        this.d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.e = d3;
    }

    public r7(Boolean bool, Double d) {
        this(bool, d, null, Boolean.FALSE, null);
    }
}
