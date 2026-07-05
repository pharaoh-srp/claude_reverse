package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class r extends n0 {
    private static final r zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        r rVar = new r();
        zzc = rVar;
        n0.i(r.class, rVar);
    }

    public static r r() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new r();
            case 2:
                return new yck(11);
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (r.class) {
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
        return this.zzi;
    }

    public final String s() {
        return this.zzg;
    }

    public final String t() {
        return this.zzf;
    }
}
