package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.byk;
import defpackage.cm4;
import defpackage.dyk;
import defpackage.hhk;
import defpackage.jzk;
import defpackage.mfk;
import defpackage.mr9;
import defpackage.nxk;
import defpackage.nzk;
import defpackage.phk;
import defpackage.qsk;
import defpackage.txk;
import defpackage.zzk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends n0 {
    private static final c0 zzc;
    private static volatile jzk zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private dyk zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private d0 zzas;
    private byk zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private a0 zzbc;
    private String zzbd;
    private dyk zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private u zzbn;
    private int zzbo;
    private s zzbp;
    private int zze;
    private int zzf;
    private int zzg;
    private dyk zzh;
    private dyk zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        c0 c0Var = new c0();
        zzc = c0Var;
        n0.i(c0.class, c0Var);
    }

    public c0() {
        nzk nzkVar = nzk.H;
        this.zzh = nzkVar;
        this.zzi = nzkVar;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = nzkVar;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = txk.H;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = nzkVar;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
    }

    public static /* synthetic */ void A(c0 c0Var, String str) {
        str.getClass();
        c0Var.zzf |= 4;
        c0Var.zzar = str;
    }

    public static /* synthetic */ void A1(c0 c0Var, long j) {
        c0Var.zzf |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
        c0Var.zzbg = j;
    }

    public static void B(c0 c0Var, ArrayList arrayList) {
        dyk dykVar = c0Var.zzag;
        if (!((qsk) dykVar).E) {
            c0Var.zzag = n0.g(dykVar);
        }
        l0.b(arrayList, c0Var.zzag);
    }

    public static /* synthetic */ void B1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= Integer.MIN_VALUE;
        c0Var.zzao = str;
    }

    public static /* synthetic */ void C(c0 c0Var, boolean z) {
        c0Var.zzf |= 65536;
        c0Var.zzbh = z;
    }

    public static /* synthetic */ void D1(c0 c0Var) {
        c0Var.zze &= -65537;
        c0Var.zzy = zzc.zzy;
    }

    public static /* synthetic */ void E1(c0 c0Var, long j) {
        c0Var.zze |= 2;
        c0Var.zzj = j;
    }

    public static /* synthetic */ void F1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zzf |= 16384;
        c0Var.zzbf = str;
    }

    public static /* synthetic */ void H1(c0 c0Var) {
        c0Var.zzf &= -8193;
        c0Var.zzbd = zzc.zzbd;
    }

    public static /* synthetic */ void I1(c0 c0Var, String str) {
        c0Var.zze |= 16777216;
        c0Var.zzah = str;
    }

    public static /* synthetic */ void J1(c0 c0Var) {
        c0Var.zze |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
        c0Var.zzx = 102001L;
    }

    public static void K0(c0 c0Var) {
        c0Var.zzag = nzk.H;
    }

    public static /* synthetic */ void L0(c0 c0Var, int i) {
        c0Var.zzf |= FreeTypeConstants.FT_LOAD_COLOR;
        c0Var.zzbl = i;
    }

    public static /* synthetic */ void L1(c0 c0Var) {
        c0Var.zze &= -268435457;
        c0Var.zzal = zzc.zzal;
    }

    public static /* synthetic */ void M0(c0 c0Var, long j) {
        c0Var.zze |= 524288;
        c0Var.zzab = j;
    }

    public static /* synthetic */ void M1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= 4194304;
        c0Var.zzae = str;
    }

    public static /* synthetic */ void N0(c0 c0Var, String str) {
        c0Var.zze |= 262144;
        c0Var.zzaa = str;
    }

    public static void O0(c0 c0Var, ArrayList arrayList) {
        List list = c0Var.zzat;
        if (!((qsk) list).E) {
            int size = list.size();
            int i = size == 0 ? 10 : size << 1;
            txk txkVar = (txk) list;
            if (i < txkVar.G) {
                mr9.y();
                return;
            }
            c0Var.zzat = new txk(Arrays.copyOf(txkVar.F, i), txkVar.G, true);
        }
        l0.b(arrayList, c0Var.zzat);
    }

    public static /* synthetic */ void O1(c0 c0Var, String str) {
        c0Var.zze |= FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
        c0Var.zzad = str;
    }

    public static /* synthetic */ void P0(c0 c0Var, boolean z) {
        c0Var.zze |= 131072;
        c0Var.zzz = z;
    }

    public static /* synthetic */ void Q1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        c0Var.zzp = str;
    }

    public static /* synthetic */ void S1(c0 c0Var) {
        c0Var.zze |= 64;
        c0Var.zzo = "android";
    }

    public static /* synthetic */ void T0(c0 c0Var) {
        c0Var.zze &= -257;
        c0Var.zzq = zzc.zzq;
    }

    public static /* synthetic */ void U0(c0 c0Var, int i) {
        c0Var.zze |= 33554432;
        c0Var.zzai = i;
    }

    public static /* synthetic */ void U1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= 65536;
        c0Var.zzy = str;
    }

    public static /* synthetic */ void V0(c0 c0Var, long j) {
        c0Var.zzf |= 16;
        c0Var.zzau = j;
    }

    public static /* synthetic */ void W0(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        c0Var.zzt = str;
    }

    public static /* synthetic */ void W1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zzf |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        c0Var.zzbd = str;
    }

    public static void X0(c0 c0Var, Set set) {
        dyk dykVar = c0Var.zzbe;
        if (!((qsk) dykVar).E) {
            c0Var.zzbe = n0.g(dykVar);
        }
        l0.b(set, c0Var.zzbe);
    }

    public static /* synthetic */ void Y0(c0 c0Var) {
        c0Var.zze |= 8388608;
        c0Var.zzaf = false;
    }

    public static /* synthetic */ void Y1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= 512;
        c0Var.zzr = str;
    }

    public static /* synthetic */ void a1(c0 c0Var) {
        c0Var.zze &= Integer.MAX_VALUE;
        c0Var.zzao = zzc.zzao;
    }

    public static /* synthetic */ void b1(c0 c0Var, int i) {
        c0Var.zze |= FreeTypeConstants.FT_LOAD_COLOR;
        c0Var.zzac = i;
    }

    public static /* synthetic */ void c1(c0 c0Var, long j) {
        c0Var.zze |= 8;
        c0Var.zzl = j;
    }

    public static phk c2() {
        return (phk) zzc.k();
    }

    public static /* synthetic */ void d1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        c0Var.zzv = str;
    }

    public static /* synthetic */ void f0(c0 c0Var) {
        c0Var.zze &= -262145;
        c0Var.zzaa = zzc.zzaa;
    }

    public static void f1(c0 c0Var) {
        c0Var.zzh = nzk.H;
    }

    public static /* synthetic */ void g0(c0 c0Var, int i) {
        c0Var.R0();
        c0Var.zzi.remove(i);
    }

    public static /* synthetic */ void g1(c0 c0Var, int i) {
        c0Var.zzf |= 8388608;
        c0Var.zzbo = i;
    }

    public static /* synthetic */ void h0(c0 c0Var, long j) {
        c0Var.zze |= 536870912;
        c0Var.zzam = j;
    }

    public static /* synthetic */ void h1(c0 c0Var, long j) {
        c0Var.zze |= 16384;
        c0Var.zzw = j;
    }

    public static /* synthetic */ void i0(c0 c0Var, String str) {
        str.getClass();
        c0Var.zze |= FreeTypeConstants.FT_LOAD_MONOCHROME;
        c0Var.zzu = str;
    }

    public static /* synthetic */ void i1(c0 c0Var, String str) {
        c0Var.zzf |= 131072;
        c0Var.zzbi = str;
    }

    public static /* synthetic */ void j0(c0 c0Var, ArrayList arrayList) {
        c0Var.Q0();
        l0.b(arrayList, c0Var.zzh);
    }

    public static /* synthetic */ void k0(c0 c0Var, boolean z) {
        c0Var.zzf |= 262144;
        c0Var.zzbj = z;
    }

    public static /* synthetic */ void k1(c0 c0Var) {
        c0Var.zze &= -2097153;
        c0Var.zzad = zzc.zzad;
    }

    public static /* synthetic */ void l1(c0 c0Var, long j) {
        c0Var.zze |= 32;
        c0Var.zzn = j;
    }

    public static /* synthetic */ void m1(c0 c0Var, String str) {
        c0Var.zzf |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        c0Var.zzax = str;
    }

    public static /* synthetic */ void n1(c0 c0Var) {
        c0Var.zze |= 1;
        c0Var.zzg = 1;
    }

    public static /* synthetic */ void p1(c0 c0Var) {
        c0Var.zze &= -131073;
        c0Var.zzz = false;
    }

    public static /* synthetic */ void q1(c0 c0Var, int i) {
        c0Var.zzf |= 2;
        c0Var.zzaq = i;
    }

    public static phk r(c0 c0Var) {
        nxk nxkVarK = zzc.k();
        nxkVarK.a(c0Var);
        return (phk) nxkVarK;
    }

    public static /* synthetic */ void r1(c0 c0Var, long j) {
        c0Var.zze |= 16;
        c0Var.zzm = j;
    }

    public static /* synthetic */ void s(c0 c0Var, int i) {
        c0Var.Q0();
        c0Var.zzh.remove(i);
    }

    public static /* synthetic */ void s1(c0 c0Var, String str) {
        str.getClass();
        c0Var.zzf |= 524288;
        c0Var.zzbk = str;
    }

    public static /* synthetic */ void t(c0 c0Var, int i, x xVar) {
        c0Var.Q0();
        c0Var.zzh.set(i, xVar);
    }

    public static /* synthetic */ void u(c0 c0Var, int i, g0 g0Var) {
        c0Var.R0();
        c0Var.zzi.set(i, g0Var);
    }

    public static /* synthetic */ void u1(c0 c0Var) {
        c0Var.zze &= -33;
        c0Var.zzn = 0L;
    }

    public static /* synthetic */ void v(c0 c0Var, long j) {
        c0Var.zzf |= 32;
        c0Var.zzav = j;
    }

    public static /* synthetic */ void v1(c0 c0Var, int i) {
        c0Var.zze |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        c0Var.zzs = i;
    }

    public static /* synthetic */ void w(c0 c0Var, s sVar) {
        c0Var.zzbp = sVar;
        c0Var.zzf |= 16777216;
    }

    public static /* synthetic */ void w1(c0 c0Var, long j) {
        c0Var.zze |= 4;
        c0Var.zzk = j;
    }

    public static /* synthetic */ void x(c0 c0Var, u uVar) {
        c0Var.zzbn = uVar;
        c0Var.zzf |= 4194304;
    }

    public static /* synthetic */ void x1(c0 c0Var) {
        String str = Build.MODEL;
        str.getClass();
        c0Var.zze |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        c0Var.zzq = str;
    }

    public static /* synthetic */ void y(c0 c0Var, x xVar) {
        c0Var.Q0();
        c0Var.zzh.add(xVar);
    }

    public static /* synthetic */ void z(c0 c0Var, g0 g0Var) {
        c0Var.R0();
        c0Var.zzi.add(g0Var);
    }

    public static /* synthetic */ void z1(c0 c0Var) {
        c0Var.zze &= -17;
        c0Var.zzm = 0L;
    }

    public final boolean A0() {
        return (this.zze & 1) != 0;
    }

    public final boolean B0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean C0() {
        return (this.zze & 8388608) != 0;
    }

    public final long C1() {
        return this.zzab;
    }

    public final String D() {
        return this.zzaa;
    }

    public final boolean D0() {
        return (this.zzf & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0;
    }

    public final String E() {
        return this.zzt;
    }

    public final boolean E0() {
        return (this.zze & 4) != 0;
    }

    public final String F() {
        return this.zzv;
    }

    public final boolean F0() {
        return (this.zzf & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0;
    }

    public final String G() {
        return this.zzbi;
    }

    public final boolean G0() {
        return (this.zze & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0;
    }

    public final long G1() {
        return this.zzau;
    }

    public final String H() {
        return this.zzax;
    }

    public final boolean H0() {
        return (this.zze & 2) != 0;
    }

    public final String I() {
        return this.zzbk;
    }

    public final boolean I0() {
        return (this.zze & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0;
    }

    public final String J() {
        return this.zzq;
    }

    public final int J0() {
        return this.zzac;
    }

    public final String K() {
        return this.zzao;
    }

    public final long K1() {
        return this.zzl;
    }

    public final String L() {
        return this.zzah;
    }

    public final String M() {
        return this.zzae;
    }

    public final String N() {
        return this.zzad;
    }

    public final long N1() {
        return this.zzw;
    }

    public final String O() {
        return this.zzp;
    }

    public final String P() {
        return this.zzo;
    }

    public final long P1() {
        return this.zzn;
    }

    public final String Q() {
        return this.zzy;
    }

    public final void Q0() {
        dyk dykVar = this.zzh;
        if (((qsk) dykVar).E) {
            return;
        }
        this.zzh = n0.g(dykVar);
    }

    public final String R() {
        return this.zzbd;
    }

    public final void R0() {
        dyk dykVar = this.zzi;
        if (((qsk) dykVar).E) {
            return;
        }
        this.zzi = n0.g(dykVar);
    }

    public final long R1() {
        return this.zzm;
    }

    public final String S() {
        return this.zzr;
    }

    public final int S0() {
        return this.zzbo;
    }

    public final dyk T() {
        return this.zzag;
    }

    public final long T1() {
        return this.zzk;
    }

    public final dyk U() {
        return this.zzh;
    }

    public final dyk V() {
        return this.zzi;
    }

    public final long V1() {
        return this.zzbg;
    }

    public final boolean W() {
        return this.zzbh;
    }

    public final boolean X() {
        return this.zzbj;
    }

    public final long X1() {
        return this.zzj;
    }

    public final boolean Y() {
        return this.zzz;
    }

    public final boolean Z() {
        return this.zzaf;
    }

    public final int Z0() {
        return this.zzh.size();
    }

    public final long Z1() {
        return this.zzx;
    }

    public final boolean a0() {
        return (this.zzf & 16777216) != 0;
    }

    public final s a2() {
        s sVar = this.zzbp;
        return sVar == null ? s.D() : sVar;
    }

    public final boolean b0() {
        return (this.zze & 33554432) != 0;
    }

    public final u b2() {
        u uVar = this.zzbn;
        return uVar == null ? u.t() : uVar;
    }

    public final boolean c0() {
        return (this.zzf & 4194304) != 0;
    }

    public final int d0() {
        return this.zzai;
    }

    public final String d2() {
        return this.zzar;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final Object e(int i) {
        jzk cm4Var;
        switch (hhk.a[i - 1]) {
            case 1:
                return new c0();
            case 2:
                return new phk(zzc);
            case 3:
                return new zzk(zzc, "\u0004>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", x.class, "zzi", g0.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", v.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", mfk.d, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
            case 4:
                return zzc;
            case 5:
                jzk jzkVar = zzd;
                if (jzkVar != null) {
                    return jzkVar;
                }
                synchronized (c0.class) {
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

    public final g0 e0(int i) {
        return (g0) this.zzi.get(i);
    }

    public final int e1() {
        return this.zzg;
    }

    public final String e2() {
        return this.zzu;
    }

    public final int j1() {
        return this.zzaq;
    }

    public final boolean l0() {
        return (this.zze & FreeTypeConstants.FT_LOAD_COLOR) != 0;
    }

    public final boolean m0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean n0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean o0() {
        return (this.zzf & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
    }

    public final int o1() {
        return this.zzs;
    }

    public final int p() {
        return this.zzbl;
    }

    public final boolean p0() {
        return (this.zzf & 524288) != 0;
    }

    public final x q(int i) {
        return (x) this.zzh.get(i);
    }

    public final boolean q0() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean r0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean s0() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    public final boolean t0() {
        return (this.zzf & 16) != 0;
    }

    public final int t1() {
        return this.zzi.size();
    }

    public final boolean u0() {
        return (this.zze & 8) != 0;
    }

    public final boolean v0() {
        return (this.zze & 16384) != 0;
    }

    public final boolean w0() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean x0() {
        return (this.zze & 131072) != 0;
    }

    public final boolean y0() {
        return (this.zze & 32) != 0;
    }

    public final long y1() {
        return this.zzam;
    }

    public final boolean z0() {
        return (this.zze & 16) != 0;
    }
}
