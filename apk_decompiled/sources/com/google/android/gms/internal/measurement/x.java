package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mhk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qsk;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class x extends n0 {
    private static final x zzc;
    private static volatile jzk zzd;
    private int zze;
    private dyk zzf = nzk.H;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        x xVar = new x();
        zzc = xVar;
        n0.i(x.class, xVar);
    }

    public static mhk C() {
        return (mhk) zzc.k();
    }

    public static /* synthetic */ void r(int i, x xVar) {
        xVar.I();
        xVar.zzf.remove(i);
    }

    public static /* synthetic */ void s(long j, x xVar) {
        xVar.zze |= 4;
        xVar.zzi = j;
    }

    public static void t(x xVar) {
        xVar.zzf = nzk.H;
    }

    public static /* synthetic */ void u(x xVar, int i, z zVar) {
        xVar.I();
        xVar.zzf.set(i, zVar);
    }

    public static /* synthetic */ void v(x xVar, z zVar) {
        zVar.getClass();
        xVar.I();
        xVar.zzf.add(zVar);
    }

    public static /* synthetic */ void w(x xVar, Iterable iterable) {
        xVar.I();
        l0.b(iterable, xVar.zzf);
    }

    public static /* synthetic */ void x(x xVar, String str) {
        str.getClass();
        xVar.zze |= 1;
        xVar.zzg = str;
    }

    public static /* synthetic */ void z(long j, x xVar) {
        xVar.zze |= 2;
        xVar.zzh = j;
    }

    public final long A() {
        return this.zzi;
    }

    public final long B() {
        return this.zzh;
    }

    public final String D() {
        return this.zzg;
    }

    public final dyk E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 4) != 0;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final void I() {
        dyk dykVar = this.zzf;
        if (((qsk) dykVar).E) {
            return;
        }
        this.zzf = n0.g(dykVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new x();
            case 2:
                return new mhk(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", z.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (x.class) {
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
        return this.zzj;
    }

    public final z q(int i) {
        return (z) this.zzf.get(i);
    }

    public final int y() {
        return this.zzf.size();
    }
}
