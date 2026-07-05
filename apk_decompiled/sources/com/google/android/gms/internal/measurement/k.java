package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n0 {
    private static final k zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private dyk zzg = nzk.H;
    private boolean zzh;

    static {
        k kVar = new k();
        zzc = kVar;
        n0.i(k.class, kVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new k();
            case 2:
                return new yck(6);
            case 3:
                return new zzk(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", p.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (k.class) {
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

    public final String q() {
        return this.zzf;
    }
}
