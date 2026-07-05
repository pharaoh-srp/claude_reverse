package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qdk;
import defpackage.uck;
import defpackage.yck;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends n0 {
    private static final f zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private dyk zzi = nzk.H;

    static {
        f fVar = new f();
        zzc = fVar;
        n0.i(f.class, fVar);
    }

    public static f r() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new f();
            case 2:
                return new yck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", qdk.c, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (f.class) {
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
        return this.zzi.size();
    }

    public final int q() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String s() {
        return this.zzg;
    }

    public final List t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zze & 4) != 0;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}
