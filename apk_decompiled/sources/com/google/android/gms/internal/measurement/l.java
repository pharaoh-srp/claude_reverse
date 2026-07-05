package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.kek;
import defpackage.mr9;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n0 {
    private static final l zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        l lVar = new l();
        zzc = lVar;
        n0.i(l.class, lVar);
    }

    public static /* synthetic */ void q(l lVar, String str) {
        str.getClass();
        lVar.zze |= 1;
        lVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new l();
            case 2:
                return new kek(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (l.class) {
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

    public final String r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return (this.zze & 2) != 0;
    }

    public final boolean v() {
        return (this.zze & 4) != 0;
    }

    public final boolean w() {
        return (this.zze & 8) != 0;
    }
}
