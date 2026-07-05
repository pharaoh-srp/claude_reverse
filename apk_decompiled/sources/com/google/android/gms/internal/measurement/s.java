package com.google.android.gms.internal.measurement;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.cm4;
import defpackage.hhk;
import defpackage.ihk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.zzk;

/* JADX INFO: loaded from: classes.dex */
public final class s extends n0 {
    private static final s zzc;
    private static volatile jzk zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        s sVar = new s();
        zzc = sVar;
        n0.i(s.class, sVar);
    }

    public static /* synthetic */ void B(s sVar) {
        sVar.zze &= -65;
        sVar.zzl = zzc.zzl;
    }

    public static /* synthetic */ void C(s sVar, String str) {
        sVar.zze |= 64;
        sVar.zzl = str;
    }

    public static s D() {
        return zzc;
    }

    public static /* synthetic */ void E(s sVar) {
        sVar.zze &= -33;
        sVar.zzk = zzc.zzk;
    }

    public static /* synthetic */ void F(s sVar, String str) {
        sVar.zze |= 32;
        sVar.zzk = str;
    }

    public static /* synthetic */ void H(s sVar) {
        sVar.zze &= -17;
        sVar.zzj = zzc.zzj;
    }

    public static /* synthetic */ void I(s sVar, String str) {
        sVar.zze |= 16;
        sVar.zzj = str;
    }

    public static /* synthetic */ void q(s sVar) {
        sVar.zze &= -5;
        sVar.zzh = zzc.zzh;
    }

    public static /* synthetic */ void r(s sVar, long j) {
        sVar.zze |= 8;
        sVar.zzi = j;
    }

    public static /* synthetic */ void s(s sVar, String str) {
        sVar.zze |= 4;
        sVar.zzh = str;
    }

    public static /* synthetic */ void u(s sVar) {
        sVar.zze &= -3;
        sVar.zzg = zzc.zzg;
    }

    public static /* synthetic */ void v(s sVar, long j) {
        sVar.zze |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        sVar.zzm = j;
    }

    public static /* synthetic */ void w(s sVar, String str) {
        sVar.zze |= 2;
        sVar.zzg = str;
    }

    public static ihk x() {
        return (ihk) zzc.k();
    }

    public static /* synthetic */ void y(s sVar) {
        sVar.zze &= -2;
        sVar.zzf = zzc.zzf;
    }

    public static /* synthetic */ void z(s sVar, String str) {
        sVar.zze |= 1;
        sVar.zzf = str;
    }

    public final String G() {
        return this.zzh;
    }

    public final String J() {
        return this.zzg;
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzl;
    }

    public final String M() {
        return this.zzk;
    }

    public final String N() {
        return this.zzj;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final boolean S() {
        return (this.zze & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
    }

    public final boolean T() {
        return (this.zze & 64) != 0;
    }

    public final boolean U() {
        return (this.zze & 32) != 0;
    }

    public final boolean V() {
        return (this.zze & 16) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new s();
            case 2:
                return new ihk();
            case 3:
                return new zzk(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (s.class) {
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

    public final long p() {
        return this.zzi;
    }

    public final long t() {
        return this.zzm;
    }
}
