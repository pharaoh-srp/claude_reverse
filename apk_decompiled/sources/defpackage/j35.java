package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j35 implements sij {
    public static final Set K = mp0.Z0(new Integer[]{0, -1});
    public final k99 E;
    public final zp3 F;
    public final c07 G;
    public final cbf H;
    public final h99 I;
    public final n78 J;

    public j35(k99 k99Var, zp3 zp3Var, t4c t4cVar, cbf cbfVar, h99 h99Var) {
        n78 n78Var = new n78(23, new h35(k99Var, 0));
        this.E = k99Var;
        this.F = zp3Var;
        this.G = t4cVar;
        this.H = cbfVar;
        this.I = h99Var;
        this.J = n78Var;
    }

    @Override // defpackage.sij
    public final void J0(ArrayList arrayList) {
        gbf feature = this.E.getFeature("tracing");
        if (feature != null) {
            feature.b(um6.E, new i35(arrayList, 0, this));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
