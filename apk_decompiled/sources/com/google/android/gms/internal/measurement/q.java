package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n0 {
    private static final q zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        q qVar = new q();
        zzc = qVar;
        n0.i(q.class, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new q();
            case 2:
                return new yck(10);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (q.class) {
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

    public final String r() {
        return this.zzg;
    }
}
