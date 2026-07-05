package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.wkk;
import defpackage.yck;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends n0 {
    private static final h0 zzc;
    private static volatile jzk zzd;
    private dyk zze = nzk.H;

    static {
        h0 h0Var = new h0();
        zzc = h0Var;
        n0.i(h0.class, h0Var);
    }

    public static h0 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (wkk.a[i - 1]) {
            case 1:
                return new h0();
            case 2:
                return new yck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", i0.class});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (h0.class) {
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
        return this.zze.size();
    }

    public final List r() {
        return this.zze;
    }
}
