package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qsk;
import defpackage.uck;
import defpackage.wck;
import defpackage.zzk;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n0 {
    private static final b zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private dyk zzh = nzk.H;
    private boolean zzi;
    private d zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        b bVar = new b();
        zzc = bVar;
        n0.i(b.class, bVar);
    }

    public static void r(b bVar, int i, c cVar) {
        dyk dykVar = bVar.zzh;
        if (!((qsk) dykVar).E) {
            bVar.zzh = n0.g(dykVar);
        }
        bVar.zzh.set(i, cVar);
    }

    public static /* synthetic */ void s(b bVar, String str) {
        bVar.zze |= 2;
        bVar.zzg = str;
    }

    public static wck u() {
        return (wck) zzc.k();
    }

    public final boolean A() {
        return this.zzm;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new b();
            case 2:
                return new wck(zzc);
            case 3:
                return new zzk(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", c.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (b.class) {
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
        return this.zzh.size();
    }

    public final c q(int i) {
        return (c) this.zzh.get(i);
    }

    public final int t() {
        return this.zzf;
    }

    public final d v() {
        d dVar = this.zzj;
        return dVar == null ? d.q() : dVar;
    }

    public final String w() {
        return this.zzg;
    }

    public final dyk x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzl;
    }
}
