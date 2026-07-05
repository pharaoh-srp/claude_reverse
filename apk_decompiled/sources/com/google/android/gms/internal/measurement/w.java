package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.lhk;
import defpackage.mr9;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends n0 {
    private static final w zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        w wVar = new w();
        zzc = wVar;
        n0.i(w.class, wVar);
    }

    public static /* synthetic */ void q(w wVar, int i) {
        wVar.zze |= 1;
        wVar.zzf = i;
    }

    public static /* synthetic */ void r(w wVar, long j) {
        wVar.zze |= 2;
        wVar.zzg = j;
    }

    public static lhk t() {
        return (lhk) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new w();
            case 2:
                return new lhk(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (w.class) {
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
        return this.zzf;
    }

    public final long s() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zze & 2) != 0;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}
