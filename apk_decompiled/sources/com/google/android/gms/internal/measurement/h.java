package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fek;
import defpackage.jzk;
import defpackage.kgh;
import defpackage.mfk;
import defpackage.mr9;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n0 {
    private static final h zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        h hVar = new h();
        zzc = hVar;
        n0.i(h.class, hVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new h();
            case 2:
                return new yck(4);
            case 3:
                mfk mfkVar = mfk.c;
                return new zzk(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", mfkVar, "zzg", mfkVar});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (h.class) {
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

    public final int q() {
        int iA = kgh.a(this.zzg);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int r() {
        int iA = kgh.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
