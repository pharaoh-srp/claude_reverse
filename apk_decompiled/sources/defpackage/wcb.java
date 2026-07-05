package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class wcb {
    public static final float a = v40.h;
    public static final qnc b;
    public static final qnc c;

    static {
        lsc lscVar = vad.a;
        ((Boolean) lscVar.getValue()).getClass();
        gb9.a(12.0f, 2.0f);
        gb9.d(12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
        if (((Boolean) lscVar.getValue()).booleanValue()) {
            gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
        } else {
            new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        qnc qncVar = ldb.a;
        b = new qnc(12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
        c = ((Boolean) lscVar.getValue()).booleanValue() ? new qnc(16.0f, 12.0f, 10.0f, 12.0f) : new qnc(12.0f, 12.0f, 12.0f, 12.0f);
        gb9.a(MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f);
    }

    public static ycb a(n54 n54Var) {
        ycb ycbVar = n54Var.i0;
        if (ycbVar != null) {
            return ycbVar;
        }
        ycb ycbVar2 = new ycb(p54.c(n54Var, vsj.k()), p54.c(n54Var, vsj.l()), p54.c(n54Var, vsj.m()), d54.b(vsj.f(), p54.c(n54Var, vsj.e())), d54.b(vsj.h(), p54.c(n54Var, vsj.g())), d54.b(vsj.j(), p54.c(n54Var, vsj.i())));
        n54Var.i0 = ycbVar2;
        return ycbVar2;
    }

    public static ycb b(ld4 ld4Var) {
        return a(((gwa) ((e18) ld4Var).j(jwa.a)).a);
    }

    public static ycb c(long j, long j2, long j3, ld4 ld4Var, int i) {
        long j4 = (i & 1) != 0 ? d54.h : j;
        long j5 = (i & 4) != 0 ? d54.h : j3;
        long j6 = d54.h;
        return a(((gwa) ((e18) ld4Var).j(jwa.a)).a).b(j4, j2, j5, j6, j6, j6);
    }
}
