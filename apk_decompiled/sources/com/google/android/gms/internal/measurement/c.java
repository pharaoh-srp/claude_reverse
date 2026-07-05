package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.uck;
import defpackage.xck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n0 {
    private static final c zzc;
    private static volatile jzk zzd;
    private int zze;
    private f zzf;
    private d zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        c cVar = new c();
        zzc = cVar;
        n0.i(c.class, cVar);
    }

    public static /* synthetic */ void p(c cVar, String str) {
        cVar.zze |= 8;
        cVar.zzi = str;
    }

    public static c q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new c();
            case 2:
                return new xck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (c.class) {
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

    public final d r() {
        d dVar = this.zzg;
        return dVar == null ? d.q() : dVar;
    }

    public final f s() {
        f fVar = this.zzf;
        return fVar == null ? f.r() : fVar;
    }

    public final String t() {
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
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
