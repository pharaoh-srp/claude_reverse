package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class js9 extends iuj {
    public final hs9 k;
    public final h99 l;

    public js9(hs9 hs9Var, h99 h99Var) {
        h99Var.getClass();
        this.k = hs9Var;
        this.l = h99Var;
    }

    @Override // defpackage.iuj
    public final long y() {
        Object hreVar;
        try {
            hreVar = Long.valueOf(this.k.a());
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            ((rl) this.l).M(4, x44.X(g99.F, g99.G), qs7.X, thA, true, nm6.E);
        }
        if (jre.a(hreVar) != null) {
            hreVar = Long.valueOf(System.currentTimeMillis());
        }
        return ((Number) hreVar).longValue();
    }
}
