package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g9f implements nmc {
    public final int E;
    public final List F;
    public Float G = null;
    public Float H = null;
    public v8f I = null;
    public v8f J = null;

    public g9f(int i, ArrayList arrayList) {
        this.E = i;
        this.F = arrayList;
    }

    public final int a() {
        return this.E;
    }

    public final void b(v8f v8fVar) {
        this.I = v8fVar;
    }

    public final void c(v8f v8fVar) {
        this.J = v8fVar;
    }

    @Override // defpackage.nmc
    public final boolean v() {
        return this.F.contains(this);
    }
}
