package com.google.android.gms.internal.measurement;

import defpackage.ayk;
import defpackage.cm4;
import defpackage.dyk;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qhk;
import defpackage.qsk;
import defpackage.qyk;
import defpackage.zzk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n0 {
    private static final e0 zzc;
    private static volatile jzk zzd;
    private ayk zze = qyk.g();
    private ayk zzf = qyk.g();
    private dyk zzg;
    private dyk zzh;

    static {
        e0 e0Var = new e0();
        zzc = e0Var;
        n0.i(e0.class, e0Var);
    }

    public e0() {
        nzk nzkVar = nzk.H;
        this.zzg = nzkVar;
        this.zzh = nzkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A(e0 e0Var, Iterable iterable) {
        ayk aykVar = e0Var.zze;
        if (!((qsk) aykVar).E) {
            e0Var.zze = n0.h(aykVar);
        }
        l0.b(iterable, e0Var.zze);
    }

    public static qhk B() {
        return (qhk) zzc.k();
    }

    public static e0 D() {
        return zzc;
    }

    public static void q(e0 e0Var) {
        e0Var.zzg = nzk.H;
    }

    public static void r(e0 e0Var, ArrayList arrayList) {
        dyk dykVar = e0Var.zzg;
        if (!((qsk) dykVar).E) {
            e0Var.zzg = n0.g(dykVar);
        }
        l0.b(arrayList, e0Var.zzg);
    }

    public static void t(e0 e0Var) {
        e0Var.zzf = qyk.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(e0 e0Var, List list) {
        ayk aykVar = e0Var.zzf;
        if (!((qsk) aykVar).E) {
            e0Var.zzf = n0.h(aykVar);
        }
        l0.b(list, e0Var.zzf);
    }

    public static void w(e0 e0Var) {
        e0Var.zzh = nzk.H;
    }

    public static void x(e0 e0Var, Iterable iterable) {
        dyk dykVar = e0Var.zzh;
        if (!((qsk) dykVar).E) {
            e0Var.zzh = n0.g(dykVar);
        }
        l0.b(iterable, e0Var.zzh);
    }

    public static void z(e0 e0Var) {
        e0Var.zze = qyk.g();
    }

    public final dyk E() {
        return this.zzg;
    }

    public final List F() {
        return this.zzf;
    }

    public final dyk G() {
        return this.zzh;
    }

    public final List H() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new e0();
            case 2:
                return new qhk();
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", w.class, "zzh", f0.class});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (e0.class) {
                    try {
                        cm4Var = zzd;
                        if (cm4Var == null) {
                            cm4Var = new cm4();
                            zzd = cm4Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cm4Var;
            case 6:
                return (byte) 1;
            default:
                mr9.x();
            case 7:
                return null;
        }
    }

    public final int p() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int v() {
        return this.zzh.size();
    }

    public final int y() {
        return this.zze.size();
    }
}
