package com.anthropic.claude.app.main.loggedin;

import android.content.Context;
import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a21;
import defpackage.bf3;
import defpackage.bz7;
import defpackage.cga;
import defpackage.da3;
import defpackage.dga;
import defpackage.e18;
import defpackage.ej3;
import defpackage.eu1;
import defpackage.eve;
import defpackage.f23;
import defpackage.fd9;
import defpackage.fga;
import defpackage.fj;
import defpackage.fk0;
import defpackage.gga;
import defpackage.h9;
import defpackage.i8c;
import defpackage.im6;
import defpackage.iqb;
import defpackage.is5;
import defpackage.iv1;
import defpackage.j03;
import defpackage.j8;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jj;
import defpackage.ka0;
import defpackage.kce;
import defpackage.koi;
import defpackage.l45;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.mwa;
import defpackage.nai;
import defpackage.nmi;
import defpackage.nwb;
import defpackage.ok3;
import defpackage.oq5;
import defpackage.pz7;
import defpackage.q61;
import defpackage.qi3;
import defpackage.qoi;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.sz7;
import defpackage.ta4;
import defpackage.tp4;
import defpackage.ul7;
import defpackage.vc8;
import defpackage.w00;
import defpackage.wv4;
import defpackage.x44;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(i8c i8cVar, wv4 wv4Var, ld4 ld4Var, int i) {
        i8c i8cVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-858288425);
        int i2 = i | 18;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(i8c.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i8c i8cVar3 = (i8c) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(wv4.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                wv4Var = (wv4) objN2;
                i8cVar2 = i8cVar3;
            } else {
                e18Var.T();
                i8cVar2 = i8cVar;
            }
            wv4 wv4Var2 = wv4Var;
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            boolean zH = e18Var.h(context) | e18Var.h(i8cVar2) | e18Var.h(wv4Var2);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                f23 f23Var = new f23(context, i8cVar2, wv4Var2, tp4Var, 3);
                e18Var.k0(f23Var);
                objN3 = f23Var;
            }
            fd9.i(e18Var, (pz7) objN3, i8cVar2);
            i8cVar = i8cVar2;
            wv4Var = wv4Var2;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(i8cVar, wv4Var, i, i3);
        }
    }

    public static final void b(boolean z, q61 q61Var, fk0 fk0Var, String str, h9 h9Var, ul7 ul7Var, qi3 qi3Var, bz7 bz7Var, ld4 ld4Var, int i, int i2) {
        boolean z2;
        int i3;
        fk0 fk0Var2;
        String str2;
        h9 h9Var2;
        ul7 ul7Var2;
        qi3 qi3Var2;
        boolean z3;
        q61 q61Var2;
        boolean z4;
        ul7 ul7Var3;
        qi3 qi3Var3;
        fk0 fk0Var3;
        String str3;
        h9 h9Var3;
        q61 q61Var3;
        ul7 ul7Var4;
        qi3 qi3Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-520857835);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            i3 = i | (e18Var.g(z2) ? 4 : 2);
        }
        int i5 = i3 | 599184 | (e18Var.h(bz7Var) ? 8388608 : 4194304);
        if (e18Var.Q(i5 & 1, (4793491 & i5) != 4793490)) {
            e18Var.V();
            int i6 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var.A()) {
                z4 = i4 == 0 ? z2 : true;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(q61.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                q61 q61Var4 = (q61) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(fk0.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                fk0 fk0Var4 = (fk0) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(AccountId.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                AccountId accountId = (AccountId) objN3;
                String strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(h9.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                h9 h9Var4 = (h9) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(ul7.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                ul7Var3 = (ul7) objN5;
                m7f m7fVarN6 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF6 = e18Var.f(null) | e18Var.f(m7fVarN6);
                Object objN6 = e18Var.N();
                if (zF6 || objN6 == lz1Var) {
                    objN6 = m7fVarN6.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN6);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN6;
                fk0Var3 = fk0Var4;
                str3 = strM949unboximpl;
                h9Var3 = h9Var4;
                q61Var3 = q61Var4;
            } else {
                e18Var.T();
                q61Var3 = q61Var;
                fk0Var3 = fk0Var;
                str3 = str;
                h9Var3 = h9Var;
                ul7Var3 = ul7Var;
                qi3Var3 = qi3Var;
                z4 = z2;
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            nwb nwbVarZ2 = mpk.Z(Boolean.valueOf(z4), e18Var);
            if (z4) {
                e18Var.a0(841724191);
                boolean zH = e18Var.h(q61Var3) | e18Var.f(nwbVarZ2) | e18Var.h(qi3Var3) | e18Var.h(fk0Var3) | e18Var.f(str3) | e18Var.h(h9Var3) | e18Var.h(ul7Var3) | e18Var.f(nwbVarZ);
                Object objN7 = e18Var.N();
                if (zH || objN7 == lz1Var) {
                    ul7Var4 = ul7Var3;
                    qi3Var4 = qi3Var3;
                    ok3 ok3Var = new ok3(q61Var3, nwbVarZ2, qi3Var4, fk0Var3, str3, h9Var3, ul7Var4, nwbVarZ, null);
                    e18Var.k0(ok3Var);
                    objN7 = ok3Var;
                } else {
                    ul7Var4 = ul7Var3;
                    qi3Var4 = qi3Var3;
                }
                fd9.i(e18Var, (pz7) objN7, q61Var3);
                e18Var.p(false);
            } else {
                ul7Var4 = ul7Var3;
                qi3Var4 = qi3Var3;
                e18Var.a0(843767277);
                e18Var.p(false);
            }
            z3 = z4;
            q61Var2 = q61Var3;
            qi3Var2 = qi3Var4;
            fk0Var2 = fk0Var3;
            str2 = str3;
            h9Var2 = h9Var3;
            ul7Var2 = ul7Var4;
        } else {
            e18Var.T();
            fk0Var2 = fk0Var;
            str2 = str;
            h9Var2 = h9Var;
            ul7Var2 = ul7Var;
            qi3Var2 = qi3Var;
            z3 = z2;
            q61Var2 = q61Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gga(z3, q61Var2, fk0Var2, str2, h9Var2, ul7Var2, qi3Var2, bz7Var, i, i2);
        }
    }

    public static final void c(String str, jj jjVar, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, eu1 eu1Var, ld4 ld4Var, int i) {
        eu1 eu1Var2;
        int i2;
        eu1 eu1Var3;
        jjVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1876098239);
        int i3 = i | (e18Var.f(str != null ? OrganizationId.m1065boximpl(str) : null) ? 4 : 2) | (e18Var.d(jjVar.ordinal()) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var3) ? 131072 : 65536) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 4194304;
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(eu1.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                eu1 eu1Var4 = (eu1) objN;
                i2 = i3 & (-29360129);
                eu1Var3 = eu1Var4;
            } else {
                e18Var.T();
                i2 = i3 & (-29360129);
                eu1Var3 = eu1Var;
            }
            e18Var.q();
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new vc8(9, jjVar, str);
                e18Var.k0(objN2);
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(BootstrapScreen.class), oq5.B(kceVar.b(BootstrapScreen.class)), true, iv1.M(kceVar.b(BootstrapScreen.class)), (zy7) objN2, e18Var);
            x44.q0(rweVarP, e18Var);
            boolean z2 = ((bf3) rweVarP.F.getValue()).a.a instanceof BootstrapScreen.NeedsBootstrap;
            boolean z3 = (i2 & 896) == 256;
            Object objN3 = e18Var.N();
            if (z3 || objN3 == lz1Var) {
                objN3 = new da3(3, bz7Var);
                e18Var.k0(objN3);
            }
            b(z2, null, null, null, null, null, null, (bz7) objN3, e18Var, 0, 126);
            e18Var = e18Var;
            mwa.l(rweVarP, null, iv1.P(nai.x(), null, 6), fd9.q0(-492052892, new dga(eu1Var3, zy7Var, zy7Var2, zy7Var3, bz7Var, iqbVar, rweVarP, str), e18Var), e18Var, 3072, 2);
            eu1Var2 = eu1Var3;
        } else {
            e18Var.T();
            eu1Var2 = eu1Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new j03(str, jjVar, bz7Var, zy7Var, zy7Var2, zy7Var3, iqbVar, eu1Var2, i);
        }
    }

    public static final void d(jj jjVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, koi koiVar, is5 is5Var, ld4 ld4Var, int i) {
        koi koiVar2;
        is5 is5Var2;
        koi koiVar3;
        int i2;
        is5 is5Var3;
        jj jjVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-826149050);
        int i3 = i | (e18Var.d(jjVar.ordinal()) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 73728;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                koiVar3 = (koi) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(is5.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-516097);
                is5Var3 = (is5) objN2;
            } else {
                e18Var.T();
                i2 = i3 & (-516097);
                koiVar3 = koiVar;
                is5Var3 = is5Var;
            }
            e18Var.q();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN3);
            }
            l45 l45Var = (l45) objN3;
            boolean zF3 = e18Var.f(koiVar3) | ((i2 & 14) == 4);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                jjVar2 = jjVar;
                objN4 = new vc8(koiVar3, 10, jjVar2);
                e18Var.k0(objN4);
            } else {
                jjVar2 = jjVar;
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(LoggedInScreens.class), oq5.B(kceVar.b(LoggedInScreens.class)), true, iv1.M(kceVar.b(LoggedInScreens.class)), (zy7) objN4, e18Var);
            e18Var = e18Var;
            x44.q0(rweVarP, e18Var);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new ej3(3);
                e18Var.k0(objN5);
            }
            is5 is5Var4 = is5Var3;
            koi koiVar4 = koiVar3;
            mwa.l(rweVarP, null, iv1.O(3, null, (sz7) objN5), fd9.q0(-1591109893, new dga(l45Var, is5Var4, rweVarP, koiVar4, jjVar2, iqbVar, zy7Var2, zy7Var), e18Var), e18Var, 3072, 2);
            is5Var2 = is5Var4;
            koiVar2 = koiVar4;
        } else {
            e18Var.T();
            koiVar2 = koiVar;
            is5Var2 = is5Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(jjVar, zy7Var, zy7Var2, iqbVar, koiVar2, is5Var2, i);
        }
    }

    public static final void e(nmi nmiVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-878232869);
        int i2 = i | 2;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(nmi.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                nmiVar = (nmi) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            boolean zH = e18Var.h(nmiVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new fj(nmiVar, null, 19);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, nmiVar);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a21(nmiVar, i, 14);
        }
    }

    public static final void f(koi koiVar, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-985781982);
        int i2 = (e18Var.f(koiVar) ? 4 : 2) | i | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            j8.c(qoi.a.a(koiVar), fd9.q0(540650594, new cga(koiVar, bz7Var, bz7Var2, ta4Var), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cga(koiVar, bz7Var, bz7Var2, ta4Var, i);
        }
    }
}
