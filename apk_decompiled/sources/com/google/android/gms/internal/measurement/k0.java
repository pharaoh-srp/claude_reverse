package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.fsh;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qdk;
import defpackage.wkk;
import defpackage.yck;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends n0 {
    private static final k0 zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private dyk zzg = nzk.H;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        k0 k0Var = new k0();
        zzc = k0Var;
        n0.i(k0.class, k0Var);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (wkk.a[i - 1]) {
            case 1:
                return new k0();
            case 2:
                return new yck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", qdk.f, "zzg", k0.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (k0.class) {
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

    public final double p() {
        return this.zzk;
    }

    public final int q() {
        int iG = fsh.g(this.zzf);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public final String r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzi;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzj;
    }

    public final boolean v() {
        return (this.zze & 8) != 0;
    }

    public final boolean w() {
        return (this.zze & 16) != 0;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }
}
