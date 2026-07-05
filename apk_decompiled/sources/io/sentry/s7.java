package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends j7 {
    public static final io.sentry.protocol.h0 W = io.sentry.protocol.h0.CUSTOM;
    public String T;
    public io.sentry.protocol.h0 U;
    public r7 V;

    public s7(String str, io.sentry.protocol.h0 h0Var, String str2, r7 r7Var) {
        super(new io.sentry.protocol.w(), new m7(), str2, null);
        this.T = str;
        this.U = h0Var;
        a(r7Var);
        this.Q = p.g(null, r7Var == null ? null : r7Var.a, r7Var == null ? null : r7Var.b, r7Var == null ? null : r7Var.c);
    }

    public static s7 c(m mVar) {
        mVar.getClass();
        c cVar = (c) mVar.d;
        Double d = cVar.c;
        s7 s7Var = new s7((io.sentry.protocol.w) mVar.b, (m7) mVar.c, "default", (m7) null);
        s7Var.T = "<unlabeled transaction>";
        s7Var.V = null;
        s7Var.U = W;
        s7Var.Q = p.g(cVar, null, null, null);
        return s7Var;
    }

    public s7(String str, String str2) {
        this(str, io.sentry.protocol.h0.CUSTOM, str2, null);
    }
}
