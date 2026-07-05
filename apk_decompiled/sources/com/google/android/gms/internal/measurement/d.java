package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.fsh;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.qdk;
import defpackage.uck;
import defpackage.yck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends n0 {
    private static final d zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        d dVar = new d();
        zzc = dVar;
        n0.i(d.class, dVar);
    }

    public static d q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new d();
            case 2:
                return new yck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", qdk.b, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (d.class) {
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
        int iF = fsh.f(this.zzf);
        if (iF == 0) {
            return 1;
        }
        return iF;
    }

    public final String r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzj;
    }

    public final String t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }

    public final boolean w() {
        return (this.zze & 4) != 0;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 16) != 0;
    }

    public final boolean z() {
        return (this.zze & 8) != 0;
    }
}
