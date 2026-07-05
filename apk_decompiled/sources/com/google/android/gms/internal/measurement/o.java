package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n0 {
    private static final o zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    static {
        o oVar = new o();
        zzc = oVar;
        n0.i(o.class, oVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new o();
            case 2:
                return new yck(8);
            case 3:
                return new zzk(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (o.class) {
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
}
