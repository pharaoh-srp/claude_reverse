package defpackage;

import android.util.Base64;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cok {
    public static final ta4 a = new ta4(-1279508245, false, new tb4(0));
    public static final ta4 b = new ta4(-1433495719, false, new ya4(11));
    public static final ta4 c = new ta4(-1891746021, false, new tb4(1));

    static {
        new ta4(1066786002, false, new ya4(12));
        new ta4(468958345, false, new ya4(13));
        new ta4(-99013878, false, new ya4(14));
    }

    public static final void a(an anVar, bz7 bz7Var, qnc qncVar, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        sl slVar = anVar.b;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(845870757);
        int i2 = 4;
        int i3 = i | (e18Var.f(anVar) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.f(qncVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            x0a x0aVarA = a1a.a(0, 3, e18Var);
            kdg kdgVar = ((vm) slVar).n;
            String str = (String) ((vm) slVar).J.getValue();
            lwc lwcVar = (lwc) w44.N0(((vm) slVar).I);
            boolean zF = e18Var.f(x0aVarA) | e18Var.h(kdgVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            tp4 tp4Var = null;
            Object obj = objN;
            if (zF || objN == lz1Var) {
                wn wnVar = new wn(x0aVarA, kdgVar, (tp4) null);
                e18Var.k0(wnVar);
                obj = wnVar;
            }
            fd9.i(e18Var, (pz7) obj, x0aVarA);
            Object objN2 = e18Var.N();
            Object obj2 = objN2;
            if (objN2 == lz1Var) {
                wz5 wz5VarW = mpk.w(new k6(x0aVarA, i2, anVar));
                e18Var.k0(wz5VarW);
                obj2 = wz5VarW;
            }
            wlg wlgVar = (wlg) obj2;
            Boolean bool = (Boolean) wlgVar.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(anVar.O());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objN3 = e18Var.N();
            Object obj3 = objN3;
            if (z || objN3 == lz1Var) {
                g9 g9Var = new g9(anVar, wlgVar, tp4Var, 4);
                e18Var.k0(g9Var);
                obj3 = g9Var;
            }
            fd9.j(bool, boolValueOf, (pz7) obj3, e18Var);
            boolean zF2 = e18Var.f(LocalDate.now()) | e18Var.d(kdgVar.size());
            Object objN4 = e18Var.N();
            Object obj4 = objN4;
            if (zF2 || objN4 == lz1Var) {
                Instant instantNow = Instant.now();
                e18Var.k0(instantNow);
                obj4 = instantNow;
            }
            Instant instant = (Instant) obj4;
            ho0 ho0Var = new ho0(MTTypesetterKt.kLineSkipLimitMultiplier, false, new do0(0, lja.R));
            iqbVar2 = iqbVar;
            iqb iqbVarB = iqbVar2.B(b.c);
            int i5 = (e18Var.h(lwcVar) ? 1 : 0) | (i4 == 4 ? 1 : 0) | (e18Var.h(kdgVar) ? 1 : 0) | (e18Var.h(instant) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0) | (e18Var.f(str) ? 1 : 0);
            Object objN5 = e18Var.N();
            if (i5 != 0 || objN5 == lz1Var) {
                e7 e7Var = new e7(lwcVar, kdgVar, anVar, instant, str, bz7Var);
                e18Var.k0(e7Var);
                objN5 = e7Var;
            }
            knk.h(iqbVarB, x0aVarA, qncVar, true, ho0Var, null, null, false, null, (bz7) objN5, e18Var, (i3 & 896) | 27648, 480);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(anVar, bz7Var, qncVar, iqbVar2, i, 0);
        }
    }

    public static final void b(ml3 ml3Var, zy7 zy7Var, bz7 bz7Var, an anVar, ysg ysgVar, fk0 fk0Var, ld4 ld4Var, int i) {
        int i2;
        an anVar2;
        ysg ysgVar2;
        fk0 fk0Var2;
        int i3;
        ysg ysgVar3;
        an anVar3;
        fk0 fk0Var3;
        String strL;
        py1 py1Var;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1918290685);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ml3Var) : e18Var.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i & 3072;
        fqb fqbVar = fqb.E;
        if (i4 == 0) {
            i2 |= e18Var.f(fqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        int i5 = 1;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            int i6 = i & 1;
            lz1 lz1Var = jd4.a;
            tp4 tp4Var = null;
            if (i6 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, i5);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                an anVar4 = (an) fd9.r0(kceVar.b(an.class), oq5.B(kceVar.b(an.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(ysg.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                ysg ysgVar4 = (ysg) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(fk0.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                fk0 fk0Var4 = (fk0) objN3;
                i3 = i2 & (-4186113);
                ysgVar3 = ysgVar4;
                anVar3 = anVar4;
                fk0Var3 = fk0Var4;
            } else {
                e18Var.T();
                ysgVar3 = ysgVar;
                fk0Var3 = fk0Var;
                i3 = i2 & (-4186113);
                anVar3 = anVar;
            }
            e18Var.q();
            boolean zF3 = e18Var.f(anVar3);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new hm(anVar3, tp4Var, i5);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN5;
            sl slVar = anVar3.b;
            j8i j8iVar = anVar3.d;
            xk xkVar = (xk) ((vm) slVar).B.getValue();
            switch (xkVar == null ? -1 : co.a[xkVar.ordinal()]) {
                case -1:
                    e18Var.a0(-1035466336);
                    e18Var.p(false);
                    strL = null;
                    break;
                case 0:
                default:
                    throw ebh.u(e18Var, 936402531, false);
                case 1:
                    e18Var.a0(936403702);
                    strL = gik.l((nrg) drg.i.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 2:
                    e18Var.a0(936407029);
                    strL = gik.l((nrg) drg.k.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 3:
                    e18Var.a0(936410488);
                    strL = gik.l((nrg) drg.j.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 4:
                    e18Var.a0(936413917);
                    strL = gik.l((nrg) drg.l.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 5:
                    e18Var.a0(936417336);
                    strL = gik.l((nrg) drg.g.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 6:
                    e18Var.a0(936420627);
                    strL = gik.l((nrg) drg.f.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 7:
                    e18Var.a0(936423703);
                    strL = gik.l((nrg) drg.h.getValue(), e18Var);
                    e18Var.p(false);
                    break;
                case 8:
                    e18Var.a0(936426870);
                    strL = gik.l((nrg) drg.m.getValue(), e18Var);
                    e18Var.p(false);
                    break;
            }
            vm vmVar = (vm) slVar;
            Integer numValueOf = Integer.valueOf(vmVar.C.h());
            boolean zF4 = e18Var.f(strL);
            Object objN6 = e18Var.N();
            if (zF4 || objN6 == lz1Var) {
                py1Var = null;
                objN6 = new yn(strL, ybgVar, null);
                e18Var.k0(objN6);
            } else {
                py1Var = null;
            }
            fd9.j(xkVar, numValueOf, (pz7) objN6, e18Var);
            wz5 wz5Var = ysgVar3.d;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = wd6.P(-2, 6, py1Var);
                e18Var.k0(objN7);
            }
            gh2 gh2Var = (gh2) objN7;
            zni.g(gh2Var, ybgVar, e18Var, 48);
            boolean zF5 = e18Var.f(anVar3);
            Object objN8 = e18Var.N();
            if (zF5 || objN8 == lz1Var) {
                objN8 = new hn(anVar3, 0);
                e18Var.k0(objN8);
            }
            zy7 zy7Var2 = (zy7) objN8;
            boolean zH2 = e18Var.h(gh2Var);
            Object objN9 = e18Var.N();
            if (zH2 || objN9 == lz1Var) {
                objN9 = new ln(gh2Var, 0);
                e18Var.k0(objN9);
            }
            fk0 fk0Var5 = fk0Var3;
            nwb nwbVarM = dgj.M(zy7Var2, (zy7) objN9, null, e18Var, 0, 4);
            boolean zH3 = e18Var.h(fk0Var5) | e18Var.f(anVar3) | e18Var.f(nwbVarM);
            Object objN10 = e18Var.N();
            if (zH3 || objN10 == lz1Var) {
                objN10 = new cn(fk0Var5, anVar3, nwbVarM, 1);
                e18Var.k0(objN10);
            }
            long j = gm3.a(e18Var).o;
            an anVar5 = anVar3;
            e18Var = e18Var;
            ysg ysgVar5 = ysgVar3;
            oq5.i(fqbVar, null, null, fd9.q0(-1327605129, new rn(ybgVar, 0), e18Var), null, 0, j, 0L, null, fd9.q0(177116174, new sn(anVar5, bz7Var, fk0Var5, nwbVarM, ml3Var, zy7Var, gh2Var, (zy7) objN10, wz5Var), e18Var), e18Var, ((i3 >> 9) & 14) | 805309440, 438);
            jwc jwcVar = (jwc) j8iVar.o.getValue();
            j8i j8iVar2 = anVar5.d;
            boolean zF6 = e18Var.f(j8iVar2);
            Object objN11 = e18Var.N();
            if (zF6 || objN11 == lz1Var) {
                yb ybVar = new yb(1, j8iVar2, j8i.class, "onReattestPromptResult", "onReattestPromptResult(Lcom/anthropic/claude/api/trusteddevice/ReattestPromptResult;)V", 0, 9);
                e18Var.k0(ybVar);
                objN11 = ybVar;
            }
            ac1.b(jwcVar, (bz7) ((jm9) objN11), e18Var, 0);
            yo6 yo6VarC = j8iVar.c();
            boolean zG = vmVar.g();
            j8i j8iVar3 = anVar5.d;
            boolean zF7 = e18Var.f(j8iVar3);
            Object objN12 = e18Var.N();
            if (zF7 || objN12 == lz1Var) {
                xn xnVar = new xn(0, j8iVar3, j8i.class, "resetEnrollmentState", "resetEnrollmentState()V", 0, 4);
                e18Var.k0(xnVar);
                objN12 = xnVar;
            }
            zy7 zy7Var3 = (zy7) ((jm9) objN12);
            j8i j8iVar4 = anVar5.d;
            boolean zF8 = e18Var.f(j8iVar4);
            Object objN13 = e18Var.N();
            if (zF8 || objN13 == lz1Var) {
                bo boVar = new bo(2, j8iVar4, j8i.class, "trackReloginCompleted", "trackReloginCompleted(ZLjava/lang/String;)V", 0, 0);
                e18Var.k0(boVar);
                objN13 = boVar;
            }
            pz7 pz7Var = (pz7) ((jm9) objN13);
            j8i j8iVar5 = anVar5.d;
            boolean zF9 = e18Var.f(j8iVar5);
            Object objN14 = e18Var.N();
            if (zF9 || objN14 == lz1Var) {
                xn xnVar2 = new xn(0, j8iVar5, j8i.class, "prepareForRelogin", "prepareForRelogin()V", 0, 5);
                e18Var.k0(xnVar2);
                objN14 = xnVar2;
            }
            zy7 zy7Var4 = (zy7) ((jm9) objN14);
            j8i j8iVar6 = anVar5.d;
            boolean zF10 = e18Var.f(j8iVar6);
            Object objN15 = e18Var.N();
            if (zF10 || objN15 == lz1Var) {
                xn xnVar3 = new xn(0, j8iVar6, j8i.class, "onReloginSucceeded", "onReloginSucceeded()V", 0, 6);
                e18Var.k0(xnVar3);
                objN15 = xnVar3;
            }
            jvk.f(yo6VarC, zG, zy7Var3, pz7Var, zy7Var4, (zy7) ((jm9) objN15), null, null, e18Var, 0);
            anVar2 = anVar5;
            fk0Var2 = fk0Var5;
            ysgVar2 = ysgVar5;
        } else {
            e18Var.T();
            anVar2 = anVar;
            ysgVar2 = ysgVar;
            fk0Var2 = fk0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(ml3Var, zy7Var, bz7Var, anVar2, ysgVar2, fk0Var2, i);
        }
    }

    public static final void c(ArrayList arrayList, SessionResource sessionResource, String str, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(853021400);
        int i2 = 4;
        int i3 = i | (e18Var.f(arrayList) ? 4 : 2) | (e18Var.h(sessionResource) ? 32 : 16) | (e18Var.f(str != null ? SessionId.m1114boximpl(str) : null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ve(3, nwbVar);
                e18Var.k0(objN2);
            }
            ta4 ta4VarQ0 = fd9.q0(-246443018, new kn(sessionResource, i4, str), e18Var);
            fqb fqbVar = fqb.E;
            ez1.e((zy7) objN2, fqbVar, false, null, null, ta4VarQ0, e18Var, 1572918, 60);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new ve(i2, nwbVar);
                e18Var.k0(objN3);
            }
            j8.b(zBooleanValue, (zy7) objN3, null, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L) | (((long) Float.floatToRawIntBits(-8.0f)) << 32), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-135649605, new gn(arrayList, sessionResource, bz7Var, zy7Var, str, nwbVar), e18Var), e18Var, 3120, 2036);
            e18Var = e18Var;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne((Object) arrayList, (Object) sessionResource, (Object) str, (qz7) bz7Var, (qz7) zy7Var, iqbVar2, i, 2);
        }
    }

    public static final void d(final SessionStatus sessionStatus, final rk rkVar, final Boolean bool, iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        iqb iqbVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        cpc cpcVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1650612805);
        int i2 = i | (e18Var2.d(sessionStatus.ordinal()) ? 4 : 2) | (e18Var2.d(rkVar.ordinal()) ? 32 : 16) | (e18Var2.f(bool) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            rk rkVar2 = rk.G;
            final fqb fqbVar = fqb.E;
            if (rkVar == rkVar2) {
                cpcVar = new cpc(new d54(jl3VarA.Q), (nrg) drg.d0.getValue());
            } else if (rkVar == rk.E) {
                cpcVar = new cpc(new d54(jl3VarA.O), (nrg) drg.Z.getValue());
            } else if (x44.r(bool, Boolean.FALSE)) {
                cpcVar = new cpc(new d54(jl3VarA.Q), (nrg) drg.a0.getValue());
            } else if (sessionStatus == SessionStatus.RUNNING) {
                cpcVar = new cpc(new d54(jl3VarA.B), (nrg) drg.X.getValue());
            } else if (sessionStatus == SessionStatus.IDLE) {
                cpcVar = new cpc(new d54(jl3VarA.O), (nrg) drg.b0.getValue());
            } else if (sessionStatus == SessionStatus.PENDING) {
                cpcVar = new cpc(new d54(jl3VarA.Q), (nrg) drg.c0.getValue());
            } else if (sessionStatus == SessionStatus.REQUIRES_ACTION) {
                cpcVar = new cpc(new d54(jl3VarA.Q), (nrg) drg.e0.getValue());
            } else {
                if (sessionStatus != SessionStatus.ARCHIVED) {
                    r7eVarS = e18Var2.s();
                    if (r7eVarS != null) {
                        final int i3 = 0;
                        pz7Var = new pz7(sessionStatus, rkVar, bool, fqbVar, i, i3) { // from class: jn
                            public final /* synthetic */ int E;
                            public final /* synthetic */ SessionStatus F;
                            public final /* synthetic */ rk G;
                            public final /* synthetic */ Boolean H;
                            public final /* synthetic */ iqb I;

                            {
                                this.E = i3;
                            }

                            @Override // defpackage.pz7
                            public final Object invoke(Object obj, Object obj2) {
                                int i4 = this.E;
                                iei ieiVar = iei.a;
                                switch (i4) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP0 = x44.p0(1);
                                        cok.d(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP02 = x44.p0(1);
                                        cok.d(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        r7eVarS.d = pz7Var;
                    }
                    return;
                }
                cpcVar = new cpc(new d54(jl3VarA.O), (nrg) drg.Y.getValue());
            }
            long j = ((d54) cpcVar.E).a;
            nrg nrgVar = (nrg) cpcVar.F;
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            dw1.a(yfd.p(xn5.V(b.o(fqbVar, 8.0f), xve.a), j, zni.b), e18Var2, 0);
            kxk.g(e18Var2, b.t(fqbVar, 4.0f));
            iqbVar2 = fqbVar;
            tjh.b(gik.l(nrgVar, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i4 = 1;
            final iqb iqbVar3 = iqbVar2;
            pz7Var = new pz7(sessionStatus, rkVar, bool, iqbVar3, i, i4) { // from class: jn
                public final /* synthetic */ int E;
                public final /* synthetic */ SessionStatus F;
                public final /* synthetic */ rk G;
                public final /* synthetic */ Boolean H;
                public final /* synthetic */ iqb I;

                {
                    this.E = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.E;
                    iei ieiVar = iei.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            cok.d(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            cok.d(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void e(ml3 ml3Var, String str, ArrayList arrayList, SessionResource sessionResource, String str2, rk rkVar, Boolean bool, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(737355075);
        int i2 = 2;
        int i3 = i | (e18Var.f(ml3Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(arrayList) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(sessionResource) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(str2 != null ? SessionId.m1114boximpl(str2) : null) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.d(rkVar.ordinal()) ? 131072 : 65536) | (e18Var.f(bool) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(bz7Var) ? 8388608 : 4194304) | (e18Var.h(zy7Var) ? 67108864 : 33554432) | (e18Var.h(zy7Var2) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            ta4 ta4VarQ0 = fd9.q0(-1207833854, new fn(str, sessionResource, rkVar, bool, 1), e18Var);
            ta4 ta4VarQ02 = fd9.q0(-1321444349, new gl(ml3Var, i2), e18Var);
            ta4 ta4VarQ03 = fd9.q0(1560031404, new gn(arrayList, zy7Var, sessionResource, str2, bz7Var, zy7Var2), e18Var);
            fqb fqbVar = fqb.E;
            zni.e(fqbVar, ta4VarQ0, ta4VarQ02, ta4VarQ03, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var, 3510, 240);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new in(ml3Var, str, arrayList, sessionResource, str2, rkVar, bool, bz7Var, zy7Var, zy7Var2, iqbVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.ta4 r19, defpackage.q2i r20, defpackage.iqb r21, defpackage.m2i r22, final defpackage.ta4 r23, defpackage.rz7 r24, float r25, float r26, defpackage.ld4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.f(ta4, q2i, iqb, m2i, ta4, rz7, float, float, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, defpackage.iqb r31, boolean r32, defpackage.zy7 r33, defpackage.ld4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.g(java.lang.String, java.lang.String, java.lang.String, boolean, iqb, boolean, zy7, ld4, int, int):void");
    }

    public static final void h(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        iqb iqbVarC;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-513580995);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            fqb fqbVar = fqb.E;
            if (zy7Var != null) {
                zy7Var2 = zy7Var;
                iqbVarC = androidx.compose.foundation.b.c(xn5.V(fqbVar, xve.a(50)), false, "Show error details", new vue(0), null, zy7Var2, 9);
            } else {
                zy7Var2 = zy7Var;
                iqbVarC = fqbVar;
            }
            xo1 xo1Var = lja.K;
            iqb iqbVarB = b.o(fqbVar, 24.0f).B(iqbVarC);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            u4b.a(b.o(fqbVar, 16.0f), e18Var, 6);
            e18Var.p(true);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 7, zy7Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b A[PHI: r14
      0x013b: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v11 java.lang.String) binds: [B:72:0x0122, B:74:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [kl7, tn, yig] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.ctc r29, final defpackage.g93 r30, final defpackage.m83 r31, final boolean r32, final defpackage.iqb r33, defpackage.x89 r34, defpackage.ld4 r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.i(ctc, g93, m83, boolean, iqb, x89, ld4, int):void");
    }

    public static final void j(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1636261612);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            zbi zbiVar = ((gwa) e18Var.j(jwa.a)).b;
            jwa.b(null, null, new zbi(zbiVar.a, zbiVar.b, zbiVar.c, zbiVar.d, zbiVar.e, ((jm3) gm3.c(e18Var).e.E).b, ((jm3) gm3.c(e18Var).e.E).d, zbiVar.h, zbiVar.i, zbiVar.j, zbiVar.k, zbiVar.l, zbiVar.m, zbiVar.n, zbiVar.o, zbiVar.p, zbiVar.q, zbiVar.r, zbiVar.s, zbiVar.t, zbiVar.u, zbiVar.v, zbiVar.w, zbiVar.x, zbiVar.y, zbiVar.z, zbiVar.A, zbiVar.B, zbiVar.C, zbiVar.D), ta4Var, e18Var, 3072, 3);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rx0(ta4Var, i, 10);
        }
    }

    public static final bt7 k(jt7 jt7Var, int i, fu9 fu9Var) {
        bt7 bt7Var;
        ws7 ws7VarR1 = jt7Var.r1();
        bt7 bt7Var2 = ws7VarR1.h;
        bt7 bt7Var3 = ws7VarR1.i;
        if (i == 1) {
            return ws7VarR1.b;
        }
        if (i == 2) {
            return ws7VarR1.c;
        }
        if (i == 5) {
            return ws7VarR1.d;
        }
        if (i == 6) {
            return ws7VarR1.e;
        }
        if (i == 3) {
            int iOrdinal = fu9Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    wg6.i();
                    return null;
                }
                bt7Var2 = bt7Var3;
            }
            bt7Var = bt7Var2 != bt7.b ? bt7Var2 : null;
            return bt7Var == null ? ws7VarR1.f : bt7Var;
        }
        if (i == 4) {
            int iOrdinal2 = fu9Var.ordinal();
            if (iOrdinal2 == 0) {
                bt7Var2 = bt7Var3;
            } else if (iOrdinal2 != 1) {
                wg6.i();
                return null;
            }
            bt7Var = bt7Var2 != bt7.b ? bt7Var2 : null;
            return bt7Var == null ? ws7VarR1.g : bt7Var;
        }
        if (i != 7 && i != 8) {
            sz6.j("invalid FocusDirection");
            return null;
        }
        qa2 qa2Var = new qa2(i);
        ts7 ts7Var = (ts7) yfd.X(jt7Var).getFocusOwner();
        jt7 jt7VarH = ts7Var.h();
        if (i == 7) {
            ws7VarR1.j.invoke(qa2Var);
        } else {
            ws7VarR1.k.invoke(qa2Var);
        }
        return qa2Var.b ? bt7.c : jt7VarH != ts7Var.h() ? bt7.d : bt7.b;
    }

    public static final jt7 l(jt7 jt7Var) {
        jt7 jt7VarH = ((ts7) yfd.X(jt7Var).getFocusOwner()).h();
        if (jt7VarH == null || !jt7VarH.R) {
            return null;
        }
        return jt7VarH;
    }

    public static final l9e m(jt7 jt7Var) {
        m5c m5cVar;
        if (jt7Var.R && (m5cVar = jt7Var.L) != null) {
            cu9 cu9VarA = nai.A(m5cVar);
            if (!cu9VarA.n()) {
                cu9VarA = null;
            }
            if (cu9VarA != null) {
                return jt7Var.s1(cu9VarA);
            }
        }
        return l9e.e;
    }

    public static final Boolean n(jt7 jt7Var, int i, fu9 fu9Var, l9e l9eVar, j70 j70Var) {
        boolean zC;
        g5c g5cVar;
        Object obj = null;
        if (i == 1 || i == 2) {
            if (i == 1) {
                zC = qvk.f(jt7Var, j70Var);
            } else {
                if (i != 2) {
                    sz6.j("This function should only be used for 1-D focus search");
                    return null;
                }
                zC = qvk.c(jt7Var, j70Var);
            }
            return Boolean.valueOf(zC);
        }
        int i2 = 3;
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return nvk.v(i, j70Var, jt7Var, l9eVar);
        }
        if (i == 7) {
            int iOrdinal = fu9Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 4;
            } else if (iOrdinal != 1) {
                wg6.i();
                return null;
            }
            jt7 jt7VarL = l(jt7Var);
            if (jt7VarL != null) {
                return nvk.v(i2, j70Var, jt7VarL, l9eVar);
            }
            return null;
        }
        if (i != 8) {
            sz6.k("Focus search invoked with invalid FocusDirection ", wr7.a(i));
            return null;
        }
        jt7 jt7VarL2 = l(jt7Var);
        boolean zBooleanValue = false;
        if (jt7VarL2 != null) {
            if (!jt7VarL2.E.R) {
                b39.c("visitAncestors called on an unattached node");
            }
            hqb hqbVar = jt7VarL2.E.I;
            av9 av9VarW = yfd.W(jt7VarL2);
            loop0: while (true) {
                if (av9VarW == null) {
                    break;
                }
                if ((((hqb) av9VarW.k0.K).H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                    while (hqbVar != null) {
                        if ((hqbVar.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                            hqb hqbVarJ = hqbVar;
                            wwb wwbVar = null;
                            while (hqbVarJ != null) {
                                if (hqbVarJ instanceof jt7) {
                                    jt7 jt7Var2 = (jt7) hqbVarJ;
                                    if (jt7Var2.r1().a) {
                                        obj = jt7Var2;
                                        break loop0;
                                    }
                                } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                    int i3 = 0;
                                    for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                        if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                hqbVarJ = hqbVar2;
                                            } else {
                                                if (wwbVar == null) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (hqbVarJ != null) {
                                                    wwbVar.b(hqbVarJ);
                                                    hqbVarJ = null;
                                                }
                                                wwbVar.b(hqbVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                hqbVarJ = yfd.j(wwbVar);
                            }
                        }
                        hqbVar = hqbVar.I;
                    }
                }
                av9VarW = av9VarW.G();
                hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
            }
        }
        if (obj != null && obj != jt7Var) {
            zBooleanValue = ((Boolean) j70Var.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jt7 o(defpackage.jt7 r9) {
        /*
            hqb r0 = r9.E
            boolean r0 = r0.R
            r1 = 0
            if (r0 != 0) goto L9
            goto Lab
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.b39.c(r0)
        L10:
            wwb r0 = new wwb
            r2 = 16
            hqb[] r3 = new defpackage.hqb[r2]
            r4 = 0
            r0.<init>(r4, r3)
            hqb r9 = r9.E
            hqb r3 = r9.J
            if (r3 != 0) goto L24
            defpackage.yfd.i(r0, r9)
            goto L27
        L24:
            r0.b(r3)
        L27:
            int r9 = r0.G
            if (r9 == 0) goto Lab
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.m(r9)
            hqb r9 = (defpackage.hqb) r9
            int r3 = r9.H
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            defpackage.yfd.i(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.G
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La8
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof defpackage.jt7
            r6 = 1
            if (r5 == 0) goto L6d
            jt7 r9 = (defpackage.jt7) r9
            hqb r5 = r9.E
            boolean r5 = r5.R
            if (r5 == 0) goto La3
            ft7 r5 = r9.u1()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L6c
            if (r5 == r6) goto L6c
            r6 = 2
            if (r5 == r6) goto L6c
            r9 = 3
            if (r5 != r9) goto L68
            goto La3
        L68:
            defpackage.wg6.i()
            return r1
        L6c:
            return r9
        L6d:
            int r5 = r9.G
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto La3
            boolean r5 = r9 instanceof defpackage.qw5
            if (r5 == 0) goto La3
            r5 = r9
            qw5 r5 = (defpackage.qw5) r5
            hqb r5 = r5.T
            r7 = r4
        L7d:
            if (r5 == 0) goto La0
            int r8 = r5.G
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9d
            int r7 = r7 + 1
            if (r7 != r6) goto L8b
            r9 = r5
            goto L9d
        L8b:
            if (r3 != 0) goto L94
            wwb r3 = new wwb
            hqb[] r8 = new defpackage.hqb[r2]
            r3.<init>(r4, r8)
        L94:
            if (r9 == 0) goto L9a
            r3.b(r9)
            r9 = r1
        L9a:
            r3.b(r5)
        L9d:
            hqb r5 = r5.J
            goto L7d
        La0:
            if (r7 != r6) goto La3
            goto L46
        La3:
            hqb r9 = defpackage.yfd.j(r3)
            goto L46
        La8:
            hqb r9 = r9.J
            goto L3d
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.o(jt7):jt7");
    }

    public static /* synthetic */ Collection p(fab fabVar, c06 c06Var, int i) {
        if ((i & 1) != 0) {
            c06Var = c06.m;
        }
        fab.a.getClass();
        return fabVar.b(c06Var, f06.c0);
    }

    public static final boolean q(jt7 jt7Var) {
        av9 av9Var;
        m5c m5cVar;
        av9 av9Var2;
        m5c m5cVar2 = jt7Var.L;
        return (m5cVar2 == null || (av9Var = m5cVar2.S) == null || !av9Var.Y() || (m5cVar = jt7Var.L) == null || (av9Var2 = m5cVar.S) == null || !av9Var2.X()) ? false : true;
    }

    public static void r(cjh cjhVar, seh sehVar, yjh yjhVar, cu9 cu9Var, njh njhVar, boolean z, occ occVar) {
        if (z) {
            int iD = occVar.D(kkh.f(cjhVar.b));
            g2h g2hVar = new g2h(4, sehVar);
            String str = agh.a;
            l9e l9eVarB = iD < yjhVar.a.a.F.length() ? yjhVar.b(iD) : iD != 0 ? yjhVar.b(iD - 1) : new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, (int) (((g79) g2hVar.a()).a & 4294967295L));
            float f = l9eVarB.b;
            float f2 = l9eVarB.a;
            long jK = cu9Var.K((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            l9e l9eVarX = d4c.x((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK >> 32)))) << 32), (((long) Float.floatToRawIntBits(l9eVarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(l9eVarB.d - f)) & 4294967295L));
            if (x44.r((njh) njhVar.a.b.get(), njhVar)) {
                njhVar.b.h(l9eVarX);
            }
        }
    }

    public static String s(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
