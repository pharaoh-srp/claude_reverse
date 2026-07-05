package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class es1 {
    public static final void a(oe5 oe5Var, r1e r1eVar, iwg iwgVar, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, zy7 zy7Var4, qi3 qi3Var, zy7 zy7Var5, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        int i3;
        zy7 zy7Var6;
        zy7 zy7Var7;
        int i4;
        r1eVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        qi3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-894413590);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? e18Var.f(oe5Var) : e18Var.h(oe5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.d(r1eVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            zy7Var6 = zy7Var2;
            i3 |= e18Var.h(zy7Var6) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var6 = zy7Var2;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var.h(bz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            zy7Var7 = zy7Var3;
            i3 |= e18Var.h(zy7Var7) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            zy7Var7 = zy7Var3;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var.h(zy7Var4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= (134217728 & i) == 0 ? e18Var.f(qi3Var) : e18Var.h(qi3Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= e18Var.h(zy7Var5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(iqbVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!e18Var.Q(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            e18Var.T();
        } else if (oe5Var instanceof js1) {
            e18Var.a0(502361311);
            e(((i3 >> 9) & 14) | ((i4 << 3) & 112), 0, e18Var, zy7Var, iqbVar);
            e18Var.p(false);
        } else {
            boolean z = oe5Var instanceof is1;
            lz1 lz1Var = jd4.a;
            if (z) {
                e18Var.a0(502564175);
                boolean z2 = (i3 & 1879048192) == 536870912;
                Object objN = e18Var.N();
                if (z2 || objN == lz1Var) {
                    objN = new es0(zy7Var5, null, 1);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, oe5Var);
                is1 is1Var = (is1) oe5Var;
                idi.f(zy7Var7, zy7Var6, zy7Var, is1Var.k(), is1Var.j(), iqbVar, e18Var, ((i3 >> 3) & 896) | ((i3 >> 18) & 14) | ((i3 >> 9) & 112) | ((i4 << 15) & 458752));
                e18Var.p(false);
            } else {
                if (oe5Var instanceof hs1) {
                    e18Var.a0(503068421);
                    boolean z3 = (i3 & 1879048192) == 536870912;
                    Object objN2 = e18Var.N();
                    if (z3 || objN2 == lz1Var) {
                        objN2 = new es0(zy7Var5, null, 2);
                        e18Var.k0(objN2);
                    }
                    fd9.i(e18Var, (pz7) objN2, oe5Var);
                    hs1 hs1Var = (hs1) oe5Var;
                    int i5 = i3;
                    dlk.h(hs1Var.j(), hs1Var.m(), hs1Var.l(), bz7Var, zy7Var, zy7Var3, iqbVar, hs1Var.k(), null, e18Var, ((i5 >> 3) & 458752) | (57344 & (i5 << 3)) | ((i5 >> 6) & 7168) | (3670016 & (i4 << 18)));
                    e18Var = e18Var;
                    e18Var.p(false);
                } else {
                    int i6 = i3;
                    int i7 = i4;
                    if (!(oe5Var instanceof gs1)) {
                        throw kgh.s(e18Var, -537984420, false);
                    }
                    e18Var.a0(503666628);
                    int i8 = i6 >> 12;
                    c(((gs1) oe5Var).j(), r1eVar, iwgVar, zy7Var4, qi3Var, iqbVar, 0L, e18Var, (i6 & 1008) | (i8 & 7168) | (i8 & 57344) | ((i7 << 15) & 458752));
                    e18Var = e18Var;
                    e18Var.p(false);
                }
            }
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new as1(oe5Var, r1eVar, iwgVar, zy7Var, zy7Var2, bz7Var, zy7Var3, zy7Var4, qi3Var, zy7Var5, iqbVar, i, i2);
        }
    }

    public static final void b(zb0 zb0Var, rz7 rz7Var, iqb iqbVar, mnc mncVar, ld4 ld4Var, int i) {
        mnc mncVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1640602758);
        int i2 = i | (e18Var.f(zb0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var.h(rz7Var) ? 32 : 16;
        }
        int i3 = i2 | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            qnc qncVar = new qnc(12.0f, 12.0f, 12.0f, 4.0f);
            o5b o5bVarD = dw1.d(lja.N, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            ev2.e(null, null, 0L, 0L, qncVar, null, true, false, fd9.q0(1875713096, new ii(zb0Var, 10, rz7Var), e18Var), e18Var, 114843648, 47);
            e18Var.p(true);
            mncVar2 = qncVar;
        } else {
            e18Var.T();
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(zb0Var, rz7Var, iqbVar, mncVar2, i, 9);
        }
    }

    public static final void c(Date date, r1e r1eVar, iwg iwgVar, zy7 zy7Var, qi3 qi3Var, iqb iqbVar, long j, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        long jA;
        String strK0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1408571763);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(date) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.d(r1eVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var2.f(qi3Var) : e18Var2.h(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if (e18Var2.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var2.V();
            ta4 ta4VarQ0 = null;
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                jA = ((mn5) objN).a();
            } else {
                e18Var2.T();
                jA = j;
            }
            e18Var2.q();
            tyg tygVar = tyg.MESSAGE_LIMITS;
            if (date == null) {
                e18Var2.a0(931285087);
                strK0 = d4c.k0(R.string.rate_limit_notice_out_of_messages, new Object[]{tygVar.a()}, e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(931446194);
                p1e p1eVarW = h66.w(date, jA, e18Var2);
                if (p1eVarW.c()) {
                    e18Var2.a0(931537706);
                    strK0 = d4c.k0(R.string.rate_limit_notice_out_of_messages_until_day, new Object[]{p1eVarW.a(), p1eVarW.b(), tygVar.a()}, e18Var2);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(931769865);
                    strK0 = d4c.k0(R.string.rate_limit_notice_out_of_messages_until, new Object[]{p1eVarW.b(), tygVar.a()}, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(false);
            }
            int i3 = zb0.I;
            j = jA;
            zb0 zb0VarZ = mwa.z(strK0, new ekh(new egg(((d54) e18Var2.j(on4.a)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61438), null, null, null), 4);
            if (r1eVar != r1e.I) {
                e18Var2.a0(932385370);
                ta4VarQ0 = fd9.q0(-1177500893, new bn((Object) r1eVar, (Object) iwgVar, (Object) qi3Var, zy7Var, 7), e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(932749898);
                e18Var2.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            WeakHashMap weakHashMap = gdj.x;
            e18Var = e18Var2;
            b(zb0VarZ, ta4Var, knk.M(iqbVarC, new a5a(s4i.d(e18Var2).g, 15)), null, e18Var, 0);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        long j2 = j;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds1(date, r1eVar, iwgVar, zy7Var, qi3Var, iqbVar, j2, i);
        }
    }

    public static final void d(final s64 s64Var, final r1e r1eVar, final iwg iwgVar, final qi3 qi3Var, final zy7 zy7Var, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        s64 s64Var2;
        qi3 qi3Var2;
        r7e r7eVarS;
        pz7 pz7Var;
        iwg iwgVar2;
        int i3;
        r7i r7iVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1344919124);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(s64Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.d(r1eVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f("chat_input_toast_exceeded") ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var2.f(qi3Var) : e18Var2.h(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        boolean z = true;
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                i3 = 32768;
                e18Var2.a0(1264628161);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new ve(16, nwbVar);
                    e18Var2.k0(objN2);
                }
                iwgVar2 = iwgVar;
                h66.j(iwgVar2, (zy7) objN2, e18Var2, ((i2 >> 6) & 14) | 48);
                e18Var2.p(false);
            } else {
                iwgVar2 = iwgVar;
                i3 = 32768;
                e18Var2.a0(1264740598);
                e18Var2.p(false);
            }
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new ve(17, nwbVar);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var2 = (zy7) objN3;
            int iOrdinal = r1eVar.ordinal();
            if (iOrdinal == 0) {
                s64Var2 = s64Var;
                qi3Var2 = qi3Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_to_pro), "chat_input_toast_exceeded", zy7Var);
            } else if (iOrdinal == 1) {
                s64Var2 = s64Var;
                qi3Var2 = qi3Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions), "chat_input_toast_exceeded_max", zy7Var);
            } else if (iOrdinal == 2) {
                s64Var2 = s64Var;
                qi3Var2 = qi3Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions), "chat_input_toast_exceeded_max_web", zy7Var2);
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        mr9.b();
                        return;
                    }
                    r7eVarS = e18Var2.s();
                    if (r7eVarS != null) {
                        final int i4 = 1;
                        final iwg iwgVar3 = iwgVar2;
                        pz7Var = new pz7() { // from class: cs1
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i4;
                                iei ieiVar = iei.a;
                                int i6 = i;
                                switch (i5) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP0 = x44.p0(i6 | 1);
                                        es1.d(s64Var, r1eVar, iwgVar3, qi3Var, zy7Var, (ld4) obj, iP0);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP02 = x44.p0(i6 | 1);
                                        es1.d(s64Var, r1eVar, iwgVar3, qi3Var, zy7Var, (ld4) obj, iP02);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        r7eVarS.d = pz7Var;
                    }
                    return;
                }
                s64Var2 = s64Var;
                qi3Var2 = qi3Var;
                r7iVar = new r7i(Integer.valueOf(R.string.get_more_usage), "chat_input_toast_exceeded_more_usage_web", zy7Var2);
            }
            int iIntValue = ((Number) r7iVar.E).intValue();
            String str = (String) r7iVar.F;
            zy7 zy7Var3 = (zy7) r7iVar.G;
            String strJ0 = d4c.j0(iIntValue, e18Var2);
            iqb iqbVarA = s64Var2.a(fqb.E, lja.T);
            if ((57344 & i2) != 16384 && ((i2 & i3) == 0 || !e18Var2.h(qi3Var2))) {
                z = false;
            }
            boolean zF = e18Var2.f(str) | z | e18Var2.f(zy7Var3);
            Object objN4 = e18Var2.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new bs1(qi3Var2, str, zy7Var3, 0);
                e18Var2.k0(objN4);
            }
            e18Var = e18Var2;
            rta.f((zy7) objN4, iqbVarA, strJ0, false, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 0, 56);
        } else {
            e18Var = e18Var2;
            s64Var2 = s64Var;
            qi3Var2 = qi3Var;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i5 = 0;
            final s64 s64Var3 = s64Var2;
            final qi3 qi3Var3 = qi3Var2;
            pz7Var = new pz7() { // from class: cs1
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    iei ieiVar = iei.a;
                    int i6 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(i6 | 1);
                            es1.d(s64Var3, r1eVar, iwgVar, qi3Var3, zy7Var, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(i6 | 1);
                            es1.d(s64Var3, r1eVar, iwgVar, qi3Var3, zy7Var, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r30, int r31, defpackage.ld4 r32, defpackage.zy7 r33, defpackage.iqb r34) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es1.e(int, int, ld4, zy7, iqb):void");
    }
}
