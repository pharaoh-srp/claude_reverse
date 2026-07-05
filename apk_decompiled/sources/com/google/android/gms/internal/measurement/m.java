package com.google.android.gms.internal.measurement;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.cm4;
import defpackage.dyk;
import defpackage.fek;
import defpackage.jzk;
import defpackage.lek;
import defpackage.mr9;
import defpackage.nzk;
import defpackage.qsk;
import defpackage.zzk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n0 {
    private static final m zzc;
    private static volatile jzk zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private dyk zzi;
    private dyk zzj;
    private dyk zzk;
    private String zzl;
    private boolean zzm;
    private dyk zzn;
    private dyk zzo;
    private String zzp;
    private String zzq;
    private j zzr;
    private o zzs;
    private r zzt;
    private p zzu;
    private n zzv;

    static {
        m mVar = new m();
        zzc = mVar;
        n0.i(m.class, mVar);
    }

    public m() {
        nzk nzkVar = nzk.H;
        this.zzi = nzkVar;
        this.zzj = nzkVar;
        this.zzk = nzkVar;
        this.zzl = "";
        this.zzn = nzkVar;
        this.zzo = nzkVar;
        this.zzp = "";
        this.zzq = "";
    }

    public static void r(m mVar) {
        mVar.zzk = nzk.H;
    }

    public static void s(m mVar, int i, l lVar) {
        dyk dykVar = mVar.zzj;
        if (!((qsk) dykVar).E) {
            mVar.zzj = n0.g(dykVar);
        }
        mVar.zzj.set(i, lVar);
    }

    public static lek w() {
        return (lek) zzc.k();
    }

    public static m x() {
        return zzc;
    }

    public final String A() {
        return this.zzp;
    }

    public final List B() {
        return this.zzk;
    }

    public final dyk C() {
        return this.zzo;
    }

    public final dyk D() {
        return this.zzn;
    }

    public final dyk E() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final boolean I() {
        return (this.zze & 512) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (fek.a[i - 1]) {
            case 1:
                return new m();
            case 2:
                return new lek(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", q.class, "zzj", l.class, "zzk", a.class, "zzl", "zzm", "zzn", j0.class, "zzo", k.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (m.class) {
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
        return this.zzn.size();
    }

    public final l q(int i) {
        return (l) this.zzj.get(i);
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final j v() {
        j jVar = this.zzr;
        return jVar == null ? j.q() : jVar;
    }

    public final r y() {
        r rVar = this.zzt;
        return rVar == null ? r.r() : rVar;
    }

    public final String z() {
        return this.zzg;
    }
}
