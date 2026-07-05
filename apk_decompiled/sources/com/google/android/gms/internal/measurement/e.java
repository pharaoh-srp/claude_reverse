package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.uck;
import defpackage.zck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends n0 {
    private static final e zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private c zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        e eVar = new e();
        zzc = eVar;
        n0.i(e.class, eVar);
    }

    public static /* synthetic */ void q(e eVar, String str) {
        eVar.zze |= 2;
        eVar.zzg = str;
    }

    public static zck s() {
        return (zck) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new e();
            case 2:
                return new zck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (e.class) {
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

    public final c r() {
        c cVar = this.zzh;
        return cVar == null ? c.q() : cVar;
    }

    public final String t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final boolean w() {
        return this.zzk;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 32) != 0;
    }
}
