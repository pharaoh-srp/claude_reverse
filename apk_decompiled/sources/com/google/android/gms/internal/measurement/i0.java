package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.wkk;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends n0 {
    private static final i0 zzc;
    private static volatile jzk zzd;
    private int zze;
    private String zzf = "";
    private dyk zzg = nzk.H;

    static {
        i0 i0Var = new i0();
        zzc = i0Var;
        n0.i(i0.class, i0Var);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (wkk.a[i - 1]) {
            case 1:
                return new i0();
            case 2:
                return new yck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", k0.class});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (i0.class) {
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

    public final String p() {
        return this.zzf;
    }

    public final dyk q() {
        return this.zzg;
    }
}
