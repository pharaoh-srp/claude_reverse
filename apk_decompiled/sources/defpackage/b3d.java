package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class b3d implements cz5 {
    public boolean E;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b3d b3dVar, c3d c3dVar) {
        b3dVar.getClass();
        if (c3dVar instanceof yrb) {
            ((yrb) c3dVar).B(b3dVar.E);
        }
    }

    public static void j(b3d b3dVar, c3d c3dVar, long j) {
        b3dVar.getClass();
        a(b3dVar, c3dVar);
        c3dVar.Z(y69.d(j, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, null);
    }

    public static void k(b3d b3dVar, c3d c3dVar, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (b3dVar.d() == fu9.E || b3dVar.e() == 0) {
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d(j, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, null);
        } else {
            int iE = (b3dVar.e() - c3dVar.E) - ((int) (j >> 32));
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, null);
        }
    }

    public static void l(b3d b3dVar, c3d c3dVar, int i, int i2, bz7 bz7Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = d3d.b;
            bz7Var = j06.j0;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (b3dVar.d() == fu9.E || b3dVar.e() == 0) {
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d(j, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, bz7Var);
        } else {
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d((((long) ((b3dVar.e() - c3dVar.E) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, bz7Var);
        }
    }

    public static void m(b3d b3dVar, c3d c3dVar, long j) {
        int i = d3d.b;
        j06 j06Var = j06.j0;
        if (b3dVar.d() == fu9.E || b3dVar.e() == 0) {
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d(j, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, j06Var);
        } else {
            int iE = (b3dVar.e() - c3dVar.E) - ((int) (j >> 32));
            a(b3dVar, c3dVar);
            c3dVar.Z(y69.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iE) << 32), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, j06Var);
        }
    }

    public static void n(b3d b3dVar, c3d c3dVar, int i, int i2, bz7 bz7Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = d3d.b;
            bz7Var = j06.j0;
        }
        b3dVar.getClass();
        a(b3dVar, c3dVar);
        c3dVar.Z(y69.d((((long) i2) & 4294967295L) | (((long) i) << 32), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, bz7Var);
    }

    public static void o(b3d b3dVar, c3d c3dVar, long j, r80 r80Var, int i) {
        bz7 bz7Var = r80Var;
        if ((i & 4) != 0) {
            int i2 = d3d.b;
            bz7Var = j06.j0;
        }
        b3dVar.getClass();
        a(b3dVar, c3dVar);
        c3dVar.Z(y69.d(j, c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, bz7Var);
    }

    public float b(uo8 uo8Var) {
        return Float.NaN;
    }

    public abstract cu9 c();

    public abstract fu9 d();

    public abstract int e();

    public final void f(c3d c3dVar, int i, int i2, float f) {
        a(this, c3dVar);
        c3dVar.Z(y69.d((((long) i2) & 4294967295L) | (((long) i) << 32), c3dVar.I), f, null);
    }
}
