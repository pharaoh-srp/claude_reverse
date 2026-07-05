package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s6 {
    public static final iqb a;
    public static final iqb b;

    static {
        p6 p6Var = new p6(0);
        fqb fqbVar = fqb.E;
        a = gb9.L(tjf.b(fd9.h0(fqbVar, p6Var), true, new q6(0)), 10.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
        b = gb9.L(tjf.b(fd9.h0(fqbVar, new p6(1)), true, new q6(0)), MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 1);
    }

    public static final iqb a() {
        return b;
    }
}
