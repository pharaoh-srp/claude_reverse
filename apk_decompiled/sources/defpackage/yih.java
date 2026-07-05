package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class yih {
    public final cbf a;
    public dfh b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final tk5 f;
    public final wwb g;

    public yih(String str, long j, cbf cbfVar) {
        this.a = cbfVar;
        this.b = new dfh(new efh(str, mwa.u(str.length(), j), null, null, null, null, 60), null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = mpk.P(bool);
        this.d = mpk.P(new efh(str, j, null, null, null, null, 60));
        this.e = mpk.P(bool);
        this.f = new tk5(29, this);
        this.g = new wwb(0, new n60[16]);
    }

    public static final void a(yih yihVar, k6e k6eVar, boolean z, cgh cghVar) {
        efh efhVarD = yihVar.d();
        if (((wwb) yihVar.b.a().F).G == 0 && kkh.c(efhVarD.H, yihVar.b.H)) {
            if (x44.r(efhVarD.I, yihVar.b.I) && x44.r(efhVarD.J, yihVar.b.K) && x44.r(efhVarD.E, yihVar.b.J)) {
                return;
            }
            efh efhVarD2 = yihVar.d();
            String string = yihVar.b.F.toString();
            dfh dfhVar = yihVar.b;
            long j = dfhVar.H;
            kkh kkhVar = dfhVar.I;
            yihVar.i(efhVarD2, new efh(string, j, kkhVar, dfhVar.K, cpk.d(kkhVar, dfhVar.J), null, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((wwb) yihVar.b.a().F).G != 0;
        String string2 = yihVar.b.F.toString();
        dfh dfhVar2 = yihVar.b;
        long j2 = dfhVar2.H;
        kkh kkhVar2 = dfhVar2.I;
        efh efhVar = new efh(string2, j2, kkhVar2, dfhVar2.K, cpk.d(kkhVar2, dfhVar2.J), null, 32);
        if (k6eVar == null) {
            if (z3 && z) {
                z2 = true;
            }
            yihVar.i(efhVarD, efhVar, z2);
            yihVar.e(efhVarD, efhVar, yihVar.b.a(), cghVar);
            return;
        }
        dfh dfhVar3 = new dfh(efhVar, yihVar.b.a(), null, 8);
        nwb nwbVar = k6eVar.a;
        int i = ((wwb) dfhVar3.a().F).G;
        euc eucVar = dfhVar3.F;
        if (i == 1) {
            eh2 eh2Var = (eh2) ((wwb) dfhVar3.a().F).E[0];
            long jM = mwa.m(eh2Var.d(), eh2Var.c());
            if (kkh.e(jM) != 0) {
                int i2 = (int) (jM >> 32);
                int i3 = (int) (jM & 4294967295L);
                if (((Boolean) ((bz7) nwbVar.getValue()).invoke(eucVar.subSequence(i2, i3).toString())).booleanValue()) {
                    dfhVar3.c(i2, i3, "");
                }
            }
        }
        boolean zD0 = isg.d0(eucVar, efhVar);
        boolean z4 = !zD0;
        boolean zC = kkh.c(dfhVar3.H, efhVar.H);
        boolean z5 = !zC;
        if (zD0 && zC) {
            yihVar.i(efhVarD, dfh.g(dfhVar3, 0L, efhVar.I, 13), z);
        } else {
            yihVar.h(dfhVar3, z4, z5);
        }
        yihVar.e(efhVarD, yihVar.d(), dfhVar3.a(), cghVar);
    }

    public final void b(dfh dfhVar) {
        boolean z = ((wwb) dfhVar.a().F).G > 0;
        boolean zC = true ^ kkh.c(dfhVar.H, this.b.H);
        if (z) {
            e(d(), dfh.g(dfhVar, 0L, null, 15), dfhVar.a(), cgh.F);
        }
        h(dfhVar, z, zC);
    }

    public final void c() {
        this.c.setValue(Boolean.FALSE);
        f(false);
    }

    public final efh d() {
        return (efh) this.d.getValue();
    }

    public final void e(efh efhVar, efh efhVar2, nyj nyjVar, cgh cghVar) {
        int iOrdinal = cghVar.ordinal();
        cbf cbfVar = this.a;
        if (iOrdinal == 0) {
            mqk.j(cbfVar, efhVar, efhVar2, nyjVar, true);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                mqk.j(cbfVar, efhVar, efhVar2, nyjVar, false);
                return;
            } else {
                mr9.b();
                return;
            }
        }
        ((lsc) cbfVar.G).setValue(null);
        zdi zdiVar = (zdi) cbfVar.F;
        zdiVar.b.clear();
        zdiVar.c.clear();
    }

    public final void f(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final dfh g() {
        lsc lscVar = this.c;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            if (((Boolean) lscVar.getValue()).booleanValue()) {
                e39.c("TextFieldState does not support concurrent or nested editing.");
            }
            lscVar.setValue(Boolean.TRUE);
            return new dfh(d(), null, null, 14);
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public final void h(dfh dfhVar, boolean z, boolean z2) {
        efh efhVarG = dfh.g(this.b, 0L, null, 15);
        if (z) {
            this.b = new dfh(new efh(dfhVar.F.toString(), dfhVar.H, null, null, null, null, 60), null, null, 14);
        } else if (z2) {
            dfh dfhVar2 = this.b;
            long j = dfhVar.H;
            int i = kkh.c;
            dfhVar2.f(mwa.m((int) (j >> 32), (int) (j & 4294967295L)));
        }
        if (z || z2 || !x44.r(efhVarG.I, dfhVar.I)) {
            this.b.e(null);
        }
        i(efhVarG, dfh.g(this.b, 0L, null, 15), true);
    }

    public final void i(efh efhVar, efh efhVar2, boolean z) {
        this.d.setValue(efhVar2);
        wwb wwbVar = this.g;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            n60 n60Var = (n60) objArr[i2];
            boolean z2 = (!z || isg.d0(efhVar.G, efhVar2) || efhVar.I == null) ? false : true;
            eb1 eb1Var = n60Var.a;
            long j = efhVar.H;
            kkh kkhVar = efhVar.I;
            long j2 = efhVar2.H;
            kkh kkhVar2 = efhVar2.I;
            if (z2) {
                eb1Var.g().restartInput((View) eb1Var.a);
            } else if (!kkh.c(j, j2) || !x44.r(kkhVar, kkhVar2)) {
                eb1Var.g().updateSelection((View) eb1Var.a, kkh.g(j2), kkh.f(j2), kkhVar2 != null ? kkh.g(kkhVar2.a) : -1, kkhVar2 != null ? kkh.f(kkhVar2.a) : -1);
            }
        }
        f(false);
    }

    public final String toString() {
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            return "TextFieldState(selection=" + ((Object) kkh.i(d().H)) + ", text=\"" + ((Object) d().G) + "\")";
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yih(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        int length = str.length();
        this(str, mwa.m(length, length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yih(String str, long j) {
        lm6 lm6Var = lm6.E;
        this(str, j, new cbf((blh) null, new zdi(lm6Var, lm6Var, 100)));
    }
}
