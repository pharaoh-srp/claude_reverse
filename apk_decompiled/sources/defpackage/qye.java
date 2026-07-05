package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qye implements mye {
    public static final long j;
    public static final long k;
    public final dze a;
    public final k99 b;
    public final rxe c;
    public uye d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;

    static {
        lz1 lz1Var = uh6.F;
        j = uh6.g(v40.Q(1, zh6.MINUTES));
        k = uh6.g(v40.Q(90, zh6.SECONDS));
    }

    public qye(dze dzeVar, k99 k99Var, rxe rxeVar) {
        this.a = dzeVar;
        this.b = k99Var;
        this.c = rxeVar;
    }

    public final void a(lj5 lj5Var, bz7 bz7Var, hi5 hi5Var, sxe sxeVar, Map map, long j2, uye uyeVar) {
        long j3 = k;
        k99 k99Var = this.b;
        if (j2 <= j3) {
            csg.D(k99Var, lj5Var, bz7Var, hi5Var, 1, new pye(this, uyeVar, lj5Var, map, sxeVar, j2)).k();
            return;
        }
        ((rl) k99Var.t()).M(4, x44.X(g99.E, g99.G), uxe.U, null, false, null);
    }
}
