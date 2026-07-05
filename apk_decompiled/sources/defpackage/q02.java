package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class q02 {
    public static final qnc a;
    public static final qnc b;
    public static final qnc c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;

    static {
        float f2 = knk.h;
        float f3 = knk.i;
        a = new qnc(24.0f, 8.0f, 24.0f, 8.0f);
        b = new qnc(16.0f, 8.0f, 24.0f, 8.0f);
        c = new qnc(12.0f, 8.0f, 12.0f, 8.0f);
        gb9.c(12.0f, 8.0f, 16.0f, 8.0f);
        d = 58.0f;
        lsc lscVar = vad.a;
        e = ((Boolean) lscVar.getValue()).booleanValue() ? 36.0f : 40.0f;
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        f = 18.0f;
        ((Boolean) lscVar.getValue()).getClass();
        g = csg.b;
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
        ((Boolean) lscVar.getValue()).getClass();
    }

    public static n02 a(long j, long j2, long j3, long j4, ld4 ld4Var, int i) {
        n02 n02Var;
        long j5 = (i & 4) != 0 ? d54.h : j3;
        long j6 = (i & 8) != 0 ? d54.h : j4;
        n54 n54Var = ((gwa) ((e18) ld4Var).j(jwa.a)).a;
        n02 n02Var2 = n54Var.W;
        if (n02Var2 == null) {
            n02 n02Var3 = new n02(p54.c(n54Var, mpk.c), p54.c(n54Var, mpk.i), d54.b(mpk.e, p54.c(n54Var, mpk.d)), d54.b(mpk.g, p54.c(n54Var, mpk.f)));
            n54Var.W = n02Var3;
            n02Var = n02Var3;
        } else {
            n02Var = n02Var2;
        }
        return n02Var.a(j, j2, j5, j6);
    }

    public static s02 b(int i) {
        int i2 = i & 1;
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float f3 = i2 != 0 ? 0.0f : 2.0f;
        if ((i & 2) == 0) {
            f2 = 1.0f;
        }
        return new s02(f3, f2, mpk.h);
    }

    public static n02 c(n54 n54Var) {
        n02 n02Var = n54Var.Y;
        if (n02Var != null) {
            return n02Var;
        }
        long j = d54.g;
        n02 n02Var2 = new n02(j, p54.c(n54Var, o54.P), j, d54.b(qwj.h(), p54.c(n54Var, qwj.g())));
        n54Var.Y = n02Var2;
        return n02Var2;
    }

    public static n02 d(long j, long j2, long j3, ld4 ld4Var, int i) {
        if ((i & 1) != 0) {
            j = d54.h;
        }
        long j4 = j;
        long j5 = d54.h;
        return c(((gwa) ((e18) ld4Var).j(jwa.a)).a).a(j4, j2, j5, (i & 8) != 0 ? j5 : j3);
    }
}
