package com.google.android.gms.internal.measurement;

import defpackage.ayk;
import defpackage.cm4;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.qsk;
import defpackage.qyk;
import defpackage.rhk;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends n0 {
    private static final f0 zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private ayk zzg = qyk.g();

    static {
        f0 f0Var = new f0();
        zzc = f0Var;
        n0.i(f0.class, f0Var);
    }

    public static /* synthetic */ void r(f0 f0Var, int i) {
        f0Var.zze |= 1;
        f0Var.zzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(f0 f0Var, List list) {
        ayk aykVar = f0Var.zzg;
        if (!((qsk) aykVar).E) {
            f0Var.zzg = n0.h(aykVar);
        }
        l0.b(list, f0Var.zzg);
    }

    public static rhk u() {
        return (rhk) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new f0();
            case 2:
                return new rhk(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (f0.class) {
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

    public final long q(int i) {
        return ((qyk) this.zzg).b(i);
    }

    public final int t() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }
}
