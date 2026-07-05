package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qsk;
import defpackage.uck;
import defpackage.vck;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n0 {
    private static final a zzc;
    private static volatile jzk zzd;
    private int zze;
    private int zzf;
    private dyk zzg;
    private dyk zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        a aVar = new a();
        zzc = aVar;
        n0.i(a.class, aVar);
    }

    public a() {
        nzk nzkVar = nzk.H;
        this.zzg = nzkVar;
        this.zzh = nzkVar;
    }

    public static void r(a aVar, int i, b bVar) {
        dyk dykVar = aVar.zzh;
        if (!((qsk) dykVar).E) {
            aVar.zzh = n0.g(dykVar);
        }
        aVar.zzh.set(i, bVar);
    }

    public static void s(a aVar, int i, e eVar) {
        dyk dykVar = aVar.zzg;
        if (!((qsk) dykVar).E) {
            aVar.zzg = n0.g(dykVar);
        }
        aVar.zzg.set(i, eVar);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (uck.a[i - 1]) {
            case 1:
                return new a();
            case 2:
                return new vck();
            case 3:
                return new zzk(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", e.class, "zzh", b.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (a.class) {
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

    public final b q(int i) {
        return (b) this.zzh.get(i);
    }

    public final int t() {
        return this.zzh.size();
    }

    public final e u(int i) {
        return (e) this.zzg.get(i);
    }

    public final int v() {
        return this.zzg.size();
    }

    public final List x() {
        return this.zzh;
    }

    public final List y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
