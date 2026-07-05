package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.wkk;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends n0 {
    private static final j0 zzc;
    private static volatile jzk zzd;
    private int zze;
    private dyk zzf = nzk.H;
    private h0 zzg;

    static {
        j0 j0Var = new j0();
        zzc = j0Var;
        n0.i(j0.class, j0Var);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (wkk.a[i - 1]) {
            case 1:
                return new j0();
            case 2:
                return new yck(18);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", k0.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (j0.class) {
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

    public final h0 p() {
        h0 h0Var = this.zzg;
        return h0Var == null ? h0.q() : h0Var;
    }

    public final dyk r() {
        return this.zzf;
    }
}
