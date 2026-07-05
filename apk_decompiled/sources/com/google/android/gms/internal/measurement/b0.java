package com.google.android.gms.internal.measurement;

import defpackage.cm4;
import defpackage.dyk;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mr9;
import defpackage.nxk;
import defpackage.nzk;
import defpackage.ohk;
import defpackage.qdk;
import defpackage.qsk;
import defpackage.zzk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends n0 {
    private static final b0 zzc;
    private static volatile jzk zzd;
    private int zze;
    private dyk zzf = nzk.H;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        b0 b0Var = new b0();
        zzc = b0Var;
        n0.i(b0.class, b0Var);
    }

    public static ohk r(b0 b0Var) {
        nxk nxkVarK = zzc.k();
        nxkVarK.a(b0Var);
        return (ohk) nxkVarK;
    }

    public static void s(b0 b0Var, c0 c0Var) {
        dyk dykVar = b0Var.zzf;
        if (!((qsk) dykVar).E) {
            b0Var.zzf = n0.g(dykVar);
        }
        b0Var.zzf.add(c0Var);
    }

    public static /* synthetic */ void t(b0 b0Var, String str) {
        str.getClass();
        b0Var.zze |= 1;
        b0Var.zzg = str;
    }

    public static void u(b0 b0Var, ArrayList arrayList) {
        dyk dykVar = b0Var.zzf;
        if (!((qsk) dykVar).E) {
            b0Var.zzf = n0.g(dykVar);
        }
        l0.b(arrayList, b0Var.zzf);
    }

    public static ohk v() {
        return (ohk) zzc.k();
    }

    public static void w(b0 b0Var) {
        b0Var.zzf = nzk.H;
    }

    public static /* synthetic */ void x(b0 b0Var, String str) {
        str.getClass();
        b0Var.zze |= 2;
        b0Var.zzh = str;
    }

    public final List A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new b0();
            case 2:
                return new ohk(zzc);
            case 3:
                return new zzk(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", c0.class, "zzg", "zzh", "zzi", qdk.d});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (b0.class) {
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
        return this.zzf.size();
    }

    public final c0 q() {
        return (c0) this.zzf.get(0);
    }

    public final String y() {
        return this.zzg;
    }

    public final String z() {
        return this.zzh;
    }
}
