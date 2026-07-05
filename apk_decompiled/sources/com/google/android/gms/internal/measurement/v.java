package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.khk;
import defpackage.mr9;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class v extends n0 {
    private static final v zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private e0 zzg;
    private e0 zzh;
    private boolean zzi;

    static {
        v vVar = new v();
        zzc = vVar;
        n0.i(v.class, vVar);
    }

    public static /* synthetic */ void q(v vVar, int i) {
        vVar.zze |= 1;
        vVar.zzf = i;
    }

    public static /* synthetic */ void r(v vVar, e0 e0Var) {
        vVar.zzg = e0Var;
        vVar.zze |= 2;
    }

    public static /* synthetic */ void s(v vVar, boolean z) {
        vVar.zze |= 8;
        vVar.zzi = z;
    }

    public static khk t() {
        return (khk) zzc.k();
    }

    public static /* synthetic */ void u(v vVar, e0 e0Var) {
        e0Var.getClass();
        vVar.zzh = e0Var;
        vVar.zze |= 4;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new v();
            case 2:
                return new khk();
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (v.class) {
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

    public final e0 w() {
        e0 e0Var = this.zzg;
        return e0Var == null ? e0.D() : e0Var;
    }

    public final e0 x() {
        e0 e0Var = this.zzh;
        return e0Var == null ? e0.D() : e0Var;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
