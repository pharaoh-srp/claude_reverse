package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sqk {
    public static final ta4 a = new ta4(-2080004320, false, new ub4(26));

    static {
        new ta4(700208523, false, new ub4(27));
        new ta4(-1995694161, false, new ub4(28));
        new ta4(984654095, false, new ub4(29));
        new ta4(1786574232, false, new vb4(0));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final String str, final String str2, final boolean z, iqb iqbVar, h86 h86Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        h86 h86Var2;
        int i2;
        h86 h86Var3;
        xpa xpaVar;
        iqb iqbVar3;
        int i3;
        l45 l45Var;
        nwb nwbVar;
        Context context;
        final h86 h86Var4;
        zy7 zy7Var;
        xpa xpaVar2;
        h86 h86Var5;
        iqb iqbVar4;
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1584072240);
        int i4 = 4;
        int i5 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 90112;
        if (e18Var.Q(i5 & 1, (74899 & i5) != 74898)) {
            e18Var.V();
            int i6 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(h86.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i5 & (-458753);
                h86Var3 = (h86) objN;
                xpaVar = null;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i5 & (-458753);
                iqbVar3 = iqbVar;
                xpaVar = null;
                h86Var3 = h86Var;
            }
            e18Var.q();
            Context context2 = (Context) e18Var.j(w00.b);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var2 = (l45) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN3);
            }
            nwb nwbVar2 = (nwb) objN3;
            boolean zH = e18Var.h(context2);
            xpa xpaVar3 = xpaVar;
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new cq0(context2, i4);
                e18Var.k0(objN4);
            }
            zy7 zy7Var2 = (zy7) objN4;
            boolean z2 = uca.a(e18Var) != null;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(xpaVar3);
                e18Var.k0(objN5);
            }
            nwb nwbVar3 = (nwb) objN5;
            if (z2) {
                e18Var.a0(1875034746);
                r65 r65Var = r65.r;
                boolean zH2 = ((i2 & 14) == 4) | e18Var.h(l45Var2) | e18Var.h(context2) | e18Var.h(h86Var3) | e18Var.f(zy7Var2);
                Object objN6 = e18Var.N();
                if (zH2 || objN6 == lz1Var) {
                    i3 = 6;
                    e7 e7Var = new e7(str, l45Var2, nwbVar3, context2, h86Var3, zy7Var2);
                    l45Var = l45Var2;
                    nwbVar = nwbVar3;
                    context = context2;
                    h86Var4 = h86Var3;
                    zy7Var = zy7Var2;
                    e18Var.k0(e7Var);
                    objN6 = e7Var;
                } else {
                    zy7Var = zy7Var2;
                    context = context2;
                    h86Var4 = h86Var3;
                    l45Var = l45Var2;
                    nwbVar = nwbVar3;
                    i3 = 6;
                }
                xpa xpaVarD0 = sf5.d0(r65Var, (bz7) objN6, e18Var, i3);
                e18Var.p(false);
                xpaVar2 = xpaVarD0;
            } else {
                e18Var.a0(-2003496947);
                e18Var.p(false);
                xpaVar2 = xpaVar3;
                zy7Var = zy7Var2;
                context = context2;
                h86Var4 = h86Var3;
                l45Var = l45Var2;
                nwbVar = nwbVar3;
                i3 = 6;
            }
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar3);
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
            tqh tqhVar = tqh.T;
            boolean z3 = str != null;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = new vi4(i3, nwbVar2);
                e18Var.k0(objN7);
            }
            tqhVar.A(null, null, z3, (zy7) objN7, e18Var, 27648, 3);
            if (str != null) {
                e18Var.a0(-346240988);
                Object objN8 = e18Var.N();
                if (objN8 == lz1Var) {
                    objN8 = new vi4(7, nwbVar2);
                    e18Var.k0(objN8);
                }
                final zy7 zy7Var3 = (zy7) objN8;
                final Context context3 = context;
                final zy7 zy7Var4 = zy7Var;
                final nwb nwbVar4 = nwbVar;
                final xpa xpaVar4 = xpaVar2;
                final l45 l45Var3 = l45Var;
                iqbVar4 = iqbVar3;
                h86Var5 = h86Var4;
                j8.b(((Boolean) nwbVar2.getValue()).booleanValue(), zy7Var3, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1435699372, new rz7() { // from class: ko4
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        lz1 lz1Var2;
                        String str3;
                        zy7 zy7Var5;
                        l45 l45Var4;
                        Object ck4Var;
                        lz1 lz1Var3;
                        s64 s64Var = (s64) obj;
                        ld4 ld4Var2 = (ld4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        s64Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((e18) ld4Var2).f(s64Var) ? 4 : 2;
                        }
                        e18 e18Var2 = (e18) ld4Var2;
                        if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            op3 op3Var = (op3) e18Var2.j(ve4.f);
                            String strJ0 = d4c.j0(R.string.artifact_sheet_menu_copy, e18Var2);
                            bpc bpcVarA = a.a(ud0.Y, e18Var2);
                            l45 l45Var5 = l45Var3;
                            boolean zH3 = e18Var2.h(l45Var5) | e18Var2.h(op3Var);
                            int i7 = iIntValue;
                            final String str4 = str;
                            boolean zF2 = zH3 | e18Var2.f(str4);
                            Object objN9 = e18Var2.N();
                            final zy7 zy7Var6 = zy7Var3;
                            lz1 lz1Var4 = jd4.a;
                            if (zF2 || objN9 == lz1Var4) {
                                objN9 = new lo4(zy7Var6, l45Var5, op3Var, str4);
                                e18Var2.k0(objN9);
                            }
                            uuj.a(strJ0, bpcVarA, (zy7) objN9, null, null, false, null, null, null, null, 0, 0, e18Var2, 64, 4088);
                            e18 e18Var3 = e18Var2;
                            if (z) {
                                e18Var3.a0(1636158491);
                                String upperCase = "js".toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                String strJ02 = d4c.j0(R.string.artifact_default_title, e18Var3);
                                String strB = rq0.b(str2);
                                if (!bsg.I0(strB)) {
                                    strJ02 = strB;
                                }
                                String strO = kgh.o(strJ02, ".js");
                                xpa xpaVar5 = xpaVar4;
                                zy7 zy7Var7 = zy7Var4;
                                if (xpaVar5 != null) {
                                    e18Var3.a0(1636495244);
                                    String strK0 = d4c.k0(R.string.artifact_sheet_menu_save_as, new Object[]{upperCase}, e18Var3);
                                    bpc bpcVarA2 = a.a(ud0.d0, e18Var3);
                                    boolean zF3 = e18Var3.f(str4) | ((i7 & 14) == 4) | e18Var3.h(xpaVar5) | e18Var3.f(strO) | e18Var3.f(zy7Var7);
                                    Object objN10 = e18Var3.N();
                                    if (zF3 || objN10 == lz1Var4) {
                                        lz1Var3 = lz1Var4;
                                        str3 = strO;
                                        zy7Var5 = zy7Var7;
                                        ck4Var = new ck4(str4, s64Var, zy7Var6, nwbVar4, xpaVar5, str3, zy7Var5);
                                        e18Var3.k0(ck4Var);
                                    } else {
                                        lz1Var3 = lz1Var4;
                                        ck4Var = objN10;
                                        str3 = strO;
                                        zy7Var5 = zy7Var7;
                                    }
                                    l45Var4 = l45Var5;
                                    lz1Var2 = lz1Var3;
                                    uuj.a(strK0, bpcVarA2, (zy7) ck4Var, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                                    e18Var3 = e18Var3;
                                    e18Var3.p(false);
                                } else {
                                    lz1Var2 = lz1Var4;
                                    str3 = strO;
                                    zy7Var5 = zy7Var7;
                                    l45Var4 = l45Var5;
                                    e18Var3.a0(1637581174);
                                    e18Var3.p(false);
                                }
                                String strK02 = d4c.k0(R.string.artifact_sheet_menu_share_as, new Object[]{upperCase}, e18Var3);
                                bpc bpcVarA3 = a.a(ud0.o1, e18Var3);
                                boolean zH4 = e18Var3.h(l45Var4);
                                final Context context4 = context3;
                                boolean zH5 = zH4 | e18Var3.h(context4) | e18Var3.f(str4) | e18Var3.f(str3);
                                final h86 h86Var6 = h86Var4;
                                boolean zH6 = zH5 | e18Var3.h(h86Var6) | e18Var3.f(zy7Var5);
                                Object objN11 = e18Var3.N();
                                if (zH6 || objN11 == lz1Var2) {
                                    final l45 l45Var6 = l45Var4;
                                    final String str5 = str3;
                                    final zy7 zy7Var8 = zy7Var5;
                                    objN11 = new zy7() { // from class: mo4
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            gb9.D(l45Var6, null, null, new tm((Object) context4, str4, str5, (Object) h86Var6, zy7Var8, (tp4) null, 27), 3);
                                            zy7Var6.a();
                                            return iei.a;
                                        }
                                    };
                                    e18Var3.k0(objN11);
                                }
                                e18 e18Var4 = e18Var3;
                                uuj.a(strK02, bpcVarA3, (zy7) objN11, null, null, false, null, null, null, null, 0, 0, e18Var4, 64, 4088);
                                e18Var4.p(false);
                            } else {
                                e18Var3.a0(1638183318);
                                e18Var3.p(false);
                            }
                        } else {
                            e18Var2.T();
                        }
                        return iei.a;
                    }
                }, e18Var), e18Var, 48, 2044);
                e18Var.p(false);
            } else {
                h86Var5 = h86Var4;
                iqbVar4 = iqbVar3;
                e18Var.a0(-343577096);
                e18Var.p(false);
            }
            e18Var.p(true);
            h86Var2 = h86Var5;
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            h86Var2 = h86Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(i, 3, str, str2, iqbVar2, h86Var2, z);
        }
    }

    public static final void b(boolean z, boolean z2, bz7 bz7Var, GroveConfigStrings groveConfigStrings, hya hyaVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        bz7 bz7Var2;
        boolean z4;
        String strN;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-121492488);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= e18Var.g(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(groveConfigStrings) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(hyaVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 74899) != 74898)) {
            zb0 zb0VarH = null;
            String onboarding_bullet_title = groveConfigStrings != null ? groveConfigStrings.getOnboarding_bullet_title() : null;
            if (onboarding_bullet_title == null) {
                onboarding_bullet_title = vb7.n(e18Var, -790155030, R.string.onboarding_v2_grove_title, e18Var, false);
            } else {
                e18Var.a0(-790156580);
                e18Var.p(false);
            }
            String str = onboarding_bullet_title;
            ekh ekhVar = new ekh(new egg(gm3.a(e18Var).M, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null);
            String onboarding_bullet_description = groveConfigStrings != null ? groveConfigStrings.getOnboarding_bullet_description() : null;
            if (onboarding_bullet_description == null) {
                e18Var.a0(1275208926);
            } else {
                e18Var.a0(1275208927);
                zb0VarH = u00.h(gm3.a(e18Var).M, onboarding_bullet_description);
            }
            e18Var.p(false);
            if (zb0VarH == null) {
                e18Var.a0(-790145291);
                z4 = false;
                zb0VarH = zrk.j(R.string.onboarding_v2_grove_body, x44.W("https://privacy.claude.com/articles/12109829"), ekhVar, new CharSequence[0], e18Var, 48, 0);
                e18Var.p(false);
            } else {
                z4 = false;
                e18Var.a0(-790149693);
                e18Var.p(false);
            }
            if (!z && groveConfigStrings != null) {
                e18Var.a0(-790135321);
                e18Var.p(z4);
                strN = groveConfigStrings.getDisabled_toggle();
            } else if (groveConfigStrings != null) {
                e18Var.a0(-790133303);
                e18Var.p(z4);
                strN = groveConfigStrings.getOnboarding_toggle();
            } else {
                strN = vb7.n(e18Var, -790132181, R.string.onboarding_v2_grove_toggle, e18Var, z4);
            }
            nvk.d(str, null, d4c.j0(R.string.onboarding_v2_continue, e18Var), hyaVar, iqbVar.B(b.c), false, false, false, null, null, fd9.q0(1536129348, new es2(zb0VarH, z, z3, bz7Var2, strN), e18Var), e18Var, ((i3 >> 3) & 7168) | 48, 992);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(z, z2, bz7Var, groveConfigStrings, hyaVar, iqbVar, i);
        }
    }

    public static final void c(String str, Date date, String str2, zy7 zy7Var, zbb zbbVar, ze0 ze0Var, qi3 qi3Var, ld4 ld4Var, int i) {
        zbb zbbVar2;
        ze0 ze0Var2;
        e18 e18Var;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        zbb zbbVar3;
        ze0 ze0Var3;
        str.getClass();
        date.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(207017095);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(date) ? 32 : 16) | (e18Var2.f(str2 != null ? ProjectId.m1079boximpl(str2) : null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 598016;
        boolean z = true;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var2.V();
            int i4 = 6;
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarB = gr9.b(e18Var2);
                if ((((i3 & 14) ^ 6) <= 4 || !e18Var2.f(str)) && (i3 & 6) != 4) {
                    z = false;
                }
                boolean zH = e18Var2.h(date) | z | e18Var2.h(m7fVarB);
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    objN = new ny4((Object) str, (Object) date, m7fVarB, 25);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                zbb zbbVar4 = (zbb) fd9.r0(kceVar.b(zbb.class), oq5.B(kceVar.b(zbb.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(ze0.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                ze0 ze0Var4 = (ze0) objN2;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN3 = e18Var2.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i3 & (-4186113);
                qi3Var3 = (qi3) objN3;
                zbbVar3 = zbbVar4;
                ze0Var3 = ze0Var4;
            } else {
                e18Var2.T();
                zbbVar3 = zbbVar;
                ze0Var3 = ze0Var;
                i2 = i3 & (-4186113);
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            qi3 qi3Var4 = qi3Var3;
            zbb zbbVar5 = zbbVar3;
            e18Var = e18Var2;
            vkc.a(gb9.S(u4g.F, null, null, zy7Var, e18Var2, (i2 & 7168) | 6, 6), d4c.j0(R.string.memory_summary_title, e18Var2), null, null, false, false, null, null, null, null, fd9.q0(1082370026, new gr4(qi3Var4, str2, ze0Var3, (eli) e18Var2.j(ve4.t), zy7Var, zbbVar3), e18Var2), null, fd9.q0(1858617580, new ci(i4, zbbVar5), e18Var2), e18Var, 8, 3120, 6140);
            zbbVar2 = zbbVar5;
            ze0Var2 = ze0Var3;
            qi3Var2 = qi3Var4;
        } else {
            e18Var2.T();
            zbbVar2 = zbbVar;
            ze0Var2 = ze0Var;
            e18Var = e18Var2;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(str, (Object) date, (Object) str2, (qz7) zy7Var, (Object) zbbVar2, (Object) ze0Var2, qi3Var2, i, 15);
        }
    }

    public static epe d(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("encoded_body_size");
            Long lValueOf = bh9VarS != null ? Long.valueOf(bh9VarS.k()) : null;
            bh9 bh9VarS2 = qh9Var.s("decoded_body_size");
            Long lValueOf2 = bh9VarS2 != null ? Long.valueOf(bh9VarS2.k()) : null;
            bh9 bh9VarS3 = qh9Var.s("headers");
            return new epe(lValueOf, lValueOf2, bh9VarS3 != null ? grk.e(bh9VarS3.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Request", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Request", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Request", e3);
            return null;
        }
    }

    public static int e(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static final int[] f(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = d4c.n0(((d54) list.get(i)).a);
        }
        return iArr;
    }

    public static final float[] g(List list, List list2) {
        if (list != null) {
            return w44.n1(list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.op3 r6, java.lang.String r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.oo4
            if (r0 == 0) goto L13
            r0 = r8
            oo4 r0 = (defpackage.oo4) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            oo4 r0 = new oo4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.G
            r2 = 1
            iei r3 = defpackage.iei.a
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L2a
            goto L6f
        L2a:
            r7 = move-exception
            goto L77
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L32:
            defpackage.sf5.h0(r8)
            r7.getClass()
            r8 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r7 = defpackage.bsg.j1(r8, r7)
            java.lang.Character r8 = defpackage.bsg.M0(r7)
            if (r8 == 0) goto L53
            char r8 = r8.charValue()
            boolean r8 = java.lang.Character.isHighSurrogate(r8)
            if (r8 != r2) goto L53
            java.lang.String r7 = defpackage.bsg.y0(r2, r7)
        L53:
            android.content.ClipData r8 = android.content.ClipData.newPlainText(r4, r7)     // Catch: java.lang.Throwable -> L75
            r8.getClass()     // Catch: java.lang.Throwable -> L75
            r0.E = r7     // Catch: java.lang.Throwable -> L75
            r0.G = r2     // Catch: java.lang.Throwable -> L75
            mz r6 = (defpackage.mz) r6     // Catch: java.lang.Throwable -> L75
            nz r6 = r6.a     // Catch: java.lang.Throwable -> L75
            android.content.ClipboardManager r6 = r6.a()     // Catch: java.lang.Throwable -> L75
            r6.setPrimaryClip(r8)     // Catch: java.lang.Throwable -> L75
            m45 r6 = defpackage.m45.E
            if (r3 != r6) goto L6e
            return r6
        L6e:
            r6 = r7
        L6f:
            r8 = r3
            goto L7c
        L71:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L77
        L75:
            r6 = move-exception
            goto L71
        L77:
            hre r8 = new hre
            r8.<init>(r7)
        L7c:
            java.lang.Throwable r7 = defpackage.jre.a(r8)
            if (r7 == 0) goto La2
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto La1
            java.util.List r8 = defpackage.xah.a
            int r6 = r6.length()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "body_length"
            java.util.Map r6 = java.util.Collections.singletonMap(r8, r6)
            r6.getClass()
            ozf r8 = defpackage.ozf.F
            r0 = 18
            defpackage.xah.f(r7, r4, r8, r6, r0)
            goto La2
        La1:
            throw r7
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqk.h(op3, java.lang.String, vp4):java.lang.Object");
    }

    public static final void i(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            sz6.p("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            sz6.p("colors and colorStops arguments must have equal length.");
        }
    }

    public static byte[] j(byte[]... bArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            length += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }
}
