package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.fek;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.yck;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n0 {
    private static final j zzc;
    private static volatile jzk zzd;
    private int zze;
    private dyk zzf;
    private dyk zzg;
    private dyk zzh;
    private boolean zzi;
    private dyk zzj;

    static {
        j jVar = new j();
        zzc = jVar;
        n0.i(j.class, jVar);
    }

    public j() {
        nzk nzkVar = nzk.H;
        this.zzf = nzkVar;
        this.zzg = nzkVar;
        this.zzh = nzkVar;
        this.zzj = nzkVar;
    }

    public static j q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new j();
            case 2:
                return new yck(2);
            case 3:
                return new zzk(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", g.class, "zzg", h.class, "zzh", i.class, "zzi", "zzj", g.class});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (j.class) {
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

    public final dyk r() {
        return this.zzh;
    }

    public final List s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final List u() {
        return this.zzj;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }
}
