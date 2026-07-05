package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xoj extends afk {
    public final bp0 F;
    public final bp0 G;
    public long H;

    public xoj(umk umkVar) {
        super(umkVar);
        this.G = new bp0(0);
        this.F = new bp0(0);
    }

    public final void O0(long j) {
        xxk xxkVarS0 = M0().S0(false);
        bp0 bp0Var = this.F;
        for (String str : (xo0) bp0Var.keySet()) {
            R0(str, j - ((Long) bp0Var.get(str)).longValue(), xxkVarS0);
        }
        if (!bp0Var.isEmpty()) {
            Q0(j - this.H, xxkVarS0);
        }
        S0(j);
    }

    public final void P0(long j, String str) {
        if (str == null || str.length() == 0) {
            b0().J.b("Ad unit id must be a non-empty string");
        } else {
            O().T0(new guj(this, str, j, 1));
        }
    }

    public final void Q0(long j, xxk xxkVar) {
        if (xxkVar == null) {
            b0().R.b("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            b0().R.c("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        h1l.n1(xxkVar, bundle, true);
        L0().p1("am", "_xa", bundle);
    }

    public final void R0(String str, long j, xxk xxkVar) {
        if (xxkVar == null) {
            b0().R.b("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            b0().R.c("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        h1l.n1(xxkVar, bundle, true);
        L0().p1("am", "_xu", bundle);
    }

    public final void S0(long j) {
        bp0 bp0Var = this.F;
        Iterator it = ((xo0) bp0Var.keySet()).iterator();
        while (it.hasNext()) {
            bp0Var.put((String) it.next(), Long.valueOf(j));
        }
        if (bp0Var.isEmpty()) {
            return;
        }
        this.H = j;
    }

    public final void T0(long j, String str) {
        if (str == null || str.length() == 0) {
            b0().J.b("Ad unit id must be a non-empty string");
        } else {
            O().T0(new guj(this, str, j, 0));
        }
    }
}
