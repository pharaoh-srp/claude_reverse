package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.hhk;
import defpackage.jhk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class u extends n0 {
    private static final u zzc;
    private static volatile jzk zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        u uVar = new u();
        zzc = uVar;
        n0.i(u.class, uVar);
    }

    public static /* synthetic */ void B(u uVar, boolean z) {
        uVar.zze |= 8;
        uVar.zzi = z;
    }

    public static jhk p() {
        return (jhk) zzc.k();
    }

    public static /* synthetic */ void q(u uVar, boolean z) {
        uVar.zze |= 32;
        uVar.zzk = z;
    }

    public static /* synthetic */ void s(u uVar, boolean z) {
        uVar.zze |= 16;
        uVar.zzj = z;
    }

    public static u t() {
        return zzc;
    }

    public static /* synthetic */ void u(u uVar, boolean z) {
        uVar.zze |= 1;
        uVar.zzf = z;
    }

    public static /* synthetic */ void v(u uVar, boolean z) {
        uVar.zze |= 64;
        uVar.zzl = z;
    }

    public static /* synthetic */ void x(u uVar, boolean z) {
        uVar.zze |= 2;
        uVar.zzg = z;
    }

    public static /* synthetic */ void z(u uVar, boolean z) {
        uVar.zze |= 4;
        uVar.zzh = z;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final boolean D() {
        return this.zzg;
    }

    public final boolean E() {
        return this.zzh;
    }

    public final boolean F() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new u();
            case 2:
                return new jhk();
            case 3:
                return new zzk(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (u.class) {
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

    public final boolean w() {
        return this.zzk;
    }

    public final boolean y() {
        return this.zzj;
    }
}
