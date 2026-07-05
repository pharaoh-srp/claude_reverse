package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n0 {
    private static final p zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        p pVar = new p();
        zzc = pVar;
        n0.i(p.class, pVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new p();
            case 2:
                return new yck(9);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (p.class) {
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
