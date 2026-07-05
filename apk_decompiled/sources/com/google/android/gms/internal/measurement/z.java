package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nhk;
import defpackage.nzk;
import defpackage.qsk;
import defpackage.zzk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends n0 {
    private static final z zzc;
    private static volatile jzk zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private dyk zzk = nzk.H;

    static {
        z zVar = new z();
        zzc = zVar;
        n0.i(z.class, zVar);
    }

    public static void A(z zVar) {
        zVar.zzk = nzk.H;
    }

    public static /* synthetic */ void C(z zVar) {
        zVar.zze &= -3;
        zVar.zzg = zzc.zzg;
    }

    public static nhk D() {
        return (nhk) zzc.k();
    }

    public static /* synthetic */ void q(z zVar, double d) {
        zVar.zze |= 16;
        zVar.zzj = d;
    }

    public static /* synthetic */ void r(z zVar, long j) {
        zVar.zze |= 4;
        zVar.zzh = j;
    }

    public static void s(z zVar, z zVar2) {
        dyk dykVar = zVar.zzk;
        if (!((qsk) dykVar).E) {
            zVar.zzk = n0.g(dykVar);
        }
        zVar.zzk.add(zVar2);
    }

    public static /* synthetic */ void t(z zVar, String str) {
        str.getClass();
        zVar.zze |= 1;
        zVar.zzf = str;
    }

    public static void u(z zVar, ArrayList arrayList) {
        dyk dykVar = zVar.zzk;
        if (!((qsk) dykVar).E) {
            zVar.zzk = n0.g(dykVar);
        }
        l0.b(arrayList, zVar.zzk);
    }

    public static /* synthetic */ void v(z zVar) {
        zVar.zze &= -17;
        zVar.zzj = 0.0d;
    }

    public static /* synthetic */ void x(z zVar) {
        zVar.zze &= -5;
        zVar.zzh = 0L;
    }

    public static /* synthetic */ void y(z zVar, String str) {
        str.getClass();
        zVar.zze |= 2;
        zVar.zzg = str;
    }

    public final long B() {
        return this.zzh;
    }

    public final String E() {
        return this.zzf;
    }

    public final String F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zze & 16) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new z();
            case 2:
                return new nhk(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", z.class});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (z.class) {
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
        return this.zzj;
    }

    public final float w() {
        return this.zzi;
    }

    public final int z() {
        return this.zzk.size();
    }
}
