package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class abg implements f89 {
    public final /* synthetic */ int E = 0;
    public final Object F;

    public abg(h99 h99Var) {
        h99Var.getClass();
        this.F = h99Var;
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) throws InterruptedException, SocketTimeoutException {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                kie kieVar = v4eVar.e;
                fk0 fk0Var = (fk0) obj;
                if (((Boolean) fk0Var.w.getValue()).booleanValue()) {
                    m3 m3Var = h1e.F;
                    int iG = m3Var.g(100);
                    long jK = iG < 80 ? m3Var.k(2000L, 4001L) : iG < 95 ? m3Var.k(11000L, 15001L) : 90000L;
                    if (jK > 0) {
                        Thread.sleep(jK);
                    }
                }
                int iJ = fk0Var.j();
                if (iJ > 0) {
                    Thread.sleep(iJ);
                }
                int i2 = fk0Var.i();
                if (i2 > 0 && Math.random() * 100.0d < i2) {
                    throw new SocketTimeoutException(grc.u("Simulated request failure (", i2, "% rate)"));
                }
                int iK = fk0Var.k();
                if (iK <= 0 || !(kieVar.d instanceof hub) || Math.random() * 100.0d >= iK) {
                    return v4eVar.b(kieVar);
                }
                throw new SocketTimeoutException(grc.u("Simulated upload failure (", iK, "% rate)"));
            default:
                kie kieVar2 = v4eVar.e;
                tie tieVar = kieVar2.d;
                if (tieVar == null || kieVar2.c.a("Content-Encoding") != null || (tieVar instanceof hub)) {
                    return v4eVar.b(kieVar2);
                }
                try {
                    jie jieVarB = kieVar2.b();
                    jieVarB.d("Content-Encoding", "gzip");
                    jieVarB.e(kieVar2.b, new ee8(tieVar));
                    kieVar2 = new kie(jieVarB);
                } catch (Exception e) {
                    dch.I((h99) obj, 4, x44.X(g99.F, g99.G), qs7.R, e, 48);
                }
                return v4eVar.b(kieVar2);
        }
    }

    public abg(fk0 fk0Var) {
        this.F = fk0Var;
    }
}
