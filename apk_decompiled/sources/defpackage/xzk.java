package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.kyc.KycStatusResponse;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.settings.n;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xzk {
    public static iyk a;
    public static final q0g b = q0g.J;
    public static final aci c = aci.J;

    public static boolean A(int[][] iArr, int i) {
        if (i <= 255) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int[] iArr2 = iArr[i2];
                if (i > iArr2[1]) {
                    i2++;
                } else {
                    int i3 = iArr2[0];
                    if (i >= i3 && (i - i3) % iArr2[2] == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (iArr.length > 0 && i >= iArr[0][0]) {
            int length2 = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                int i5 = ((length2 - i4) / 2) + i4;
                int[] iArr3 = iArr[i5];
                int i6 = iArr3[0];
                if (i6 > i || i > iArr3[1]) {
                    if (i < i6) {
                        length2 = i5;
                    } else {
                        i4 = i5 + 1;
                    }
                } else if ((i - i6) % iArr3[2] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean B(h08 h08Var) {
        return h08Var.getKind() == 4 && m06.n(h08Var.h(), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(h08 h08Var) {
        return ((co5) h08Var).getName().equals(pkg.c) && B(h08Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(h08 h08Var) {
        return ((co5) h08Var).getName().equals(pkg.a) && B(h08Var);
    }

    public static final boolean E(k29 k29Var, j29 j29Var, boolean z) {
        l29 l29Var;
        k29Var.getClass();
        bm4 bm4Var = ar9.F;
        String str = k29Var.a;
        bm4Var.getClass();
        if (bm4.d(str) == ar9.J && (j29Var == j29.G || j29Var == j29.H)) {
            return true;
        }
        if (!z) {
            return false;
        }
        bm4Var.getClass();
        return (bm4.d(str) != ar9.I || (l29Var = k29Var.b) == l29.F || l29Var == l29.H) ? false : true;
    }

    public static final boolean F(xbe xbeVar) {
        ace aceVar = xbeVar instanceof ace ? (ace) xbeVar : null;
        return (aceVar == null || aceVar.c() == null || aceVar.d()) ? false : true;
    }

    public static int G(int i) {
        char c2;
        char[] cArr = eei.a;
        if (i < cArr.length && (c2 = cArr[i]) != 0) {
            return c2;
        }
        int lowerCase = Character.toLowerCase(i);
        return lowerCase != i ? lowerCase : Character.toUpperCase(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String H(defpackage.k29 r11, defpackage.j29 r12, boolean r13, defpackage.ld4 r14) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzk.H(k29, j29, boolean, ld4):java.lang.String");
    }

    public static synchronized void I() {
        bzk bzkVar = new bzk();
        synchronized (xzk.class) {
            try {
                if (a == null) {
                    a = new iyk(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "createGetter";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-194914349);
        int i2 = 4;
        int i3 = 2;
        int i4 = (e18Var.f(str) ? 4 : 2) | i;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            pzg.a(iqbVar, gm3.b(e18Var).q, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), fd9.q0(-1144384082, new rq(str, i2), e18Var), e18Var, 12582918, 60);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, i3);
        }
    }

    public static final void c(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2028092132);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.h(zy7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            xsc.g(a.a(ud0.p0, e18Var2), d4c.j0(R.string.billing_button_change_subscription_plan_adjust_max, e18Var2), zy7Var, null, null, null, false, null, null, n.a, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var, 8 | ((i2 << 6) & 896), 0, 130552);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 0, zy7Var);
        }
    }

    public static final void d(zy7 zy7Var, zy7 zy7Var2, pvg pvgVar, RavenType ravenType, iqb iqbVar, qi3 qi3Var, jp1 jp1Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qi3 qi3Var2;
        jp1 jp1Var2;
        qi3 qi3Var3;
        jp1 jp1Var3;
        int i2;
        iqb iqbVar3;
        zy7Var.getClass();
        zy7Var2.getClass();
        pvgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2020871734);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.d(pvgVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(ravenType == null ? -1 : ravenType.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 614400;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN;
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new di(m7fVarB, 5);
                    e18Var.k0(objN2);
                }
                kce kceVar = jce.a;
                jp1Var3 = (jp1) fd9.r0(kceVar.b(jp1.class), oq5.B(kceVar.b(jp1.class)), (bz7) objN2, e18Var);
                i2 = i3 & (-4128769);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                qi3Var3 = qi3Var;
                jp1Var3 = jp1Var;
                i2 = i3 & (-4128769);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.f(jp1Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new dv(qi3Var3, jp1Var3, tp4Var, i4);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            qi3 qi3Var4 = qi3Var3;
            jp1Var2 = jp1Var3;
            e(zy7Var, iqbVar3, fd9.q0(-1331531606, new xe(pvgVar, qi3Var4, zy7Var2, jp1Var2, ravenType, 8), e18Var), e18Var, (i2 & 14) | 432);
            qi3Var2 = qi3Var4;
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            jp1Var2 = jp1Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(zy7Var, (qz7) zy7Var2, (Object) pvgVar, (Object) ravenType, (Object) iqbVar2, qi3Var2, (Object) jp1Var2, i, 2);
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1100695676);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? 32 : 16;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 << 3;
            ssj.c(d4c.j0(R.string.title_billing, e18Var), zy7Var, iqbVar2, null, null, 0L, fd9.q0(725915147, new ru(ta4Var, i3), e18Var), e18Var, (i4 & 112) | 1572864 | (i4 & 896), 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new op1(zy7Var, iqbVar, ta4Var, i, 0);
        }
    }

    public static final void f(s64 s64Var, zy7 zy7Var, boolean z, ovg ovgVar, KycStatusResponse kycStatusResponse, String str, ld4 ld4Var, int i) {
        int i2;
        String str2;
        e18 e18Var;
        boolean z2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-916260883);
        if ((i & 48) == 0) {
            i2 = (e18Var2.h(zy7Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.d(ovgVar == null ? -1 : ovgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(kycStatusResponse) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            str2 = str;
            i2 |= e18Var2.f(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if (e18Var2.Q(i2 & 1, (74897 & i2) != 74896)) {
            String strJ0 = d4c.j0(R.string.subscription_level_free, e18Var2);
            fqb fqbVar = fqb.E;
            b(strJ0, gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var2, 48);
            if (kycStatusResponse != null) {
                sq6.A(16.0f, -1810337037, e18Var2, e18Var2, fqbVar);
                String vendor_inquiry_url = kycStatusResponse.getVendor_inquiry_url();
                if (vendor_inquiry_url == null) {
                    vendor_inquiry_url = str2;
                }
                g(vendor_inquiry_url, e18Var2, 0);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else if (z) {
                sq6.A(16.0f, -1810149797, e18Var2, e18Var2, fqbVar);
                fe5.b(zy7Var, e18Var2, (i2 >> 3) & 14);
                if (ovgVar == ovg.J) {
                    sq6.A(16.0f, -1809745402, e18Var2, e18Var2, fqbVar);
                    String strJ02 = d4c.j0(R.string.upgrade_to_pro_error_account_mismatch, e18Var2);
                    tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
                    long j = gm3.a(e18Var2).N;
                    z2 = false;
                    tjh.b(strJ02, gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 48, 0, 131064);
                    e18Var = e18Var2;
                    e18Var.p(false);
                } else {
                    e18Var = e18Var2;
                    z2 = false;
                    e18Var.a0(-1809238955);
                    e18Var.p(false);
                }
                e18Var.p(z2);
            } else {
                e18Var = e18Var2;
                e18Var.a0(-1809233003);
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(s64Var, zy7Var, z, ovgVar, kycStatusResponse, str2, i, 2);
        }
    }

    public static final void g(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        String str2 = str;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(407596540);
        int i2 = i | (e18Var2.f(str2) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            eli eliVarA = kd7.a(e18Var2);
            String strJ0 = d4c.j0(R.string.kyc_pending_body, e18Var2);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
            long j = gm3.a(e18Var2).N;
            fqb fqbVar = fqb.E;
            tjh.b(strJ0, gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 48, 0, 131064);
            kxk.g(e18Var2, b.e(fqbVar, 8.0f));
            bpc bpcVarA = a.a(ud0.l, e18Var2);
            String strJ02 = d4c.j0(R.string.kyc_pending_button_verify_identity, e18Var2);
            qnc qncVar = n.a;
            boolean zH = e18Var2.h(eliVarA) | ((i2 & 14) == 4);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new kp1(eliVarA, str, 1);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            str2 = str;
            xsc.g(bpcVarA, strJ02, (zy7) objN, null, null, null, false, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var, 8, 0, 130552);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rq(str2, i, 5);
        }
    }

    public static final void h(String str, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(515124894);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            eli eliVarA = kd7.a(e18Var2);
            bpc bpcVarA = a.a(ud0.l, e18Var2);
            String strJ0 = d4c.j0(R.string.billing_button_manage_subscription_web, e18Var2);
            qnc qncVar = n.a;
            boolean zH = e18Var2.h(eliVarA) | ((i2 & 14) == 4);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new kp1(eliVarA, str, 0);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            xsc.g(bpcVarA, strJ0, (zy7) objN, null, null, null, false, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var, 8, 0, 130552);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            byte b2 = 0;
            r7eVarS.d = new lp1(str, i, b2, b2);
        }
    }

    public static final void i(int i, ld4 ld4Var) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1233424909);
        if (e18Var2.Q(i & 1, i != 0)) {
            eli eliVarA = kd7.a(e18Var2);
            bpc bpcVarD = u00.D(R.drawable.material_manage_subscriptions, 0, e18Var2);
            String strJ0 = d4c.j0(R.string.billing_button_manage_subscriptions, e18Var2);
            qnc qncVar = n.a;
            boolean zH = e18Var2.h(eliVarA);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new mp1(eliVarA, 0);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            xsc.g(bpcVarD, strJ0, (zy7) objN, null, null, null, false, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var, 8, 0, 130552);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 9);
        }
    }

    public static final void j(s64 s64Var, pvg pvgVar, RavenType ravenType, qvg qvgVar, String str, boolean z, ovg ovgVar, boolean z2, KycStatusResponse kycStatusResponse, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        boolean z3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(571594214);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(s64Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.d(pvgVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.d(ravenType == null ? -1 : ravenType.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.d(qvgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(str) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.d(ovgVar != null ? ovgVar.ordinal() : -1) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.g(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.f(kycStatusResponse) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 536870912 : 268435456;
        }
        if (e18Var2.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            String strF = xik.f(pvgVar, ravenType, e18Var2);
            fqb fqbVar = fqb.E;
            int i3 = i2;
            b(strF, gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var2, 48);
            kxk.g(e18Var2, b.e(fqbVar, 16.0f));
            if (kycStatusResponse != null) {
                e18Var2.a0(-1181438847);
                String vendor_inquiry_url = kycStatusResponse.getVendor_inquiry_url();
                if (vendor_inquiry_url == null) {
                    vendor_inquiry_url = str;
                }
                g(vendor_inquiry_url, e18Var2, 0);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else {
                int iOrdinal = pvgVar.ordinal();
                if (iOrdinal == 0) {
                    e18Var = e18Var2;
                    e18Var.a0(-1179022180);
                    e18Var.p(false);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        wg6.i();
                        return;
                    }
                    int iOrdinal2 = pvgVar.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                        e18Var2.a0(-1181222095);
                        int iOrdinal3 = qvgVar.ordinal();
                        if (iOrdinal3 == 0) {
                            e18Var = e18Var2;
                            e18Var.a0(-1181162265);
                            if (z) {
                                sq6.A(8.0f, -1181148811, e18Var, e18Var, fqbVar);
                                ez1.a(s64Var.a(fqbVar, lja.T), vf2.H, 0L, e18Var, 48, 4);
                                z3 = false;
                                e18Var.p(false);
                            } else if (ovgVar == ovg.J) {
                                e18Var.a0(-1180612139);
                                tjh.b(d4c.j0(R.string.upgrade_to_pro_error_account_mismatch, e18Var), gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 48, 0, 131064);
                                z3 = false;
                                e18Var.p(false);
                            } else {
                                e18Var.a0(-1180264164);
                                if (pvgVar == pvg.MAX && z2) {
                                    e18Var.a0(-1180181642);
                                    c(zy7Var, e18Var, (i3 >> 27) & 14);
                                    z3 = false;
                                    e18Var.p(false);
                                } else {
                                    z3 = false;
                                    e18Var.a0(-1180022116);
                                    e18Var.p(false);
                                }
                                i(z3 ? 1 : 0, e18Var);
                                e18Var.p(z3);
                            }
                            e18Var.p(z3);
                        } else if (iOrdinal3 == 1) {
                            e18Var2.a0(-1179864636);
                            tjh.b(d4c.j0(R.string.billing_manage_subscription_stripe, e18Var2), gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 0, 131064);
                            e18Var = e18Var2;
                            kxk.g(e18Var, b.e(fqbVar, 8.0f));
                            h(str, e18Var, (i3 >> 12) & 14);
                            z3 = false;
                            e18Var.p(false);
                        } else {
                            if (iOrdinal3 != 2) {
                                throw ebh.u(e18Var2, -453745935, false);
                            }
                            e18Var2.a0(-1179348889);
                            tjh.b(d4c.j0(R.string.billing_manage_subscription_other_platform, e18Var2), gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 0, 131064);
                            e18Var2.p(false);
                            z3 = false;
                            e18Var = e18Var2;
                        }
                        e18Var.p(z3);
                    } else {
                        if (iOrdinal2 != 3) {
                            wg6.i();
                            return;
                        }
                        e18Var = e18Var2;
                        e18Var.a0(-1179022180);
                        e18Var.p(false);
                    }
                }
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ak4(s64Var, pvgVar, ravenType, qvgVar, str, z, ovgVar, z2, kycStatusResponse, zy7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.m29 r34, boolean r35, defpackage.zy7 r36, defpackage.iqb r37, defpackage.ld4 r38, int r39) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzk.k(m29, boolean, zy7, iqb, ld4, int):void");
    }

    public static final void l(m29 m29Var, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        m29Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1129956329);
        int i2 = i | (e18Var.h(m29Var) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            ho0 ho0Var = new ho0(14.0f, true, new sz6(1));
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(667875716);
            for (k29 k29Var : m29Var.a) {
                e18Var.a0(-770664296);
                if (E(k29Var, m29Var.b, z)) {
                    e18Var.p(false);
                } else {
                    m(k29Var, m29Var.b, z, null, e18Var, (i2 << 3) & 896);
                    e18Var.p(false);
                }
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(m29Var, z, iqbVar, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.k29 r33, defpackage.j29 r34, boolean r35, defpackage.iqb r36, defpackage.ld4 r37, int r38) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzk.m(k29, j29, boolean, iqb, ld4, int):void");
    }

    public static final void n(l29 l29Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1141967090);
        int i2 = 4;
        int i3 = (e18Var.d(l29Var.ordinal()) ? 4 : 2) | i | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            iqbVar2 = fqb.E;
            iqb iqbVarO = b.o(iqbVar2, 16.0f);
            int iOrdinal = l29Var.ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(2081286913);
                dw1.a(ez1.t(gb9.J(iqbVarO, 1.0f), 1.0f, gm3.a(e18Var).v, xve.a), e18Var, 0);
                e18Var.p(false);
            } else if (iOrdinal == 1) {
                e18Var.a0(94990049);
                tjd.a(iqbVarO, gm3.a(e18Var).N, 1.5f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 384, 56);
                e18Var = e18Var;
                e18Var.p(false);
            } else if (iOrdinal == 2) {
                e18Var.a0(94557723);
                cv8.b(a.a(ud0.M, e18Var), null, iqbVarO, gm3.a(e18Var).N, e18Var, 56, 0);
                e18Var.p(false);
            } else if (iOrdinal == 3) {
                e18Var.a0(94774909);
                cv8.b(a.a(ud0.N1, e18Var), null, iqbVarO, gm3.a(e18Var).x, e18Var, 56, 0);
                e18Var.p(false);
            } else {
                if (iOrdinal != 4) {
                    throw ebh.u(e18Var, 2081259422, false);
                }
                e18Var.a0(95171647);
                cv8.b(a.a(ud0.N1, e18Var), null, iqbVarO, gm3.a(e18Var).O, e18Var, 56, 0);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(l29Var, iqbVar2, i, i2);
        }
    }

    public static mw9 o(c92 c92Var, yr9 yr9Var, sxb sxbVar, wc0 wc0Var, int i) {
        if (wc0Var == null) {
            a(33);
            throw null;
        }
        if (yr9Var == null) {
            return null;
        }
        uo4 uo4Var = new uo4(c92Var, yr9Var, sxbVar);
        ide ideVar = uxb.a;
        return new mw9(c92Var, uo4Var, wc0Var, sxb.e("_context_receiver_" + i));
    }

    public static krd p(hrd hrdVar, wc0 wc0Var) {
        return v(hrdVar, wc0Var, true, hrdVar.d());
    }

    public static prd q(hrd hrdVar, wc0 wc0Var) {
        vc0 vc0Var = dd8.F;
        neg negVarD = hrdVar.d();
        if (negVarD != null) {
            return x(hrdVar, wc0Var, vc0Var, true, hrdVar.getVisibility(), negVarD);
        }
        a(6);
        throw null;
    }

    public static jrd r(qqb qqbVar) {
        if (qqbVar == null) {
            a(26);
            throw null;
        }
        qqb qqbVarT = kxk.t(m06.d(qqbVar), ikg.t);
        if (qqbVarT == null) {
            return null;
        }
        vc0 vc0Var = dd8.F;
        p06 p06Var = q06.e;
        jrd jrdVarO0 = jrd.O0(qqbVar, 1, p06Var, false, pkg.b, 4, qqbVar.d());
        krd krdVar = new krd(jrdVarO0, vc0Var, 1, p06Var, false, false, false, 4, null, qqbVar.d());
        jrdVarO0.R0(krdVar, null, null, null);
        r9i.F.getClass();
        r9i r9iVar = r9i.G;
        u9i u9iVarP = qqbVarT.p();
        List listSingletonList = Collections.singletonList(new wai(qqbVar.W()));
        r9iVar.getClass();
        u9iVarP.getClass();
        listSingletonList.getClass();
        j7g j7gVarC0 = yfd.c0(r9iVar, u9iVarP, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        jrdVarO0.U0(j7gVarC0, list, null, null, list);
        krdVar.T0(jrdVarO0.getReturnType());
        return jrdVarO0;
    }

    public static c7g s(qqb qqbVar) {
        if (qqbVar == null) {
            a(24);
            throw null;
        }
        vc0 vc0Var = dd8.F;
        c7g c7gVarY0 = c7g.Y0(qqbVar, pkg.c, 4, qqbVar.d());
        eri eriVar = new eri(c7gVarY0, null, 0, vc0Var, sxb.e(ExperienceToggle.DEFAULT_PARAM_KEY), o06.e(qqbVar).t(), false, false, false, null, qqbVar.d());
        List list = Collections.EMPTY_LIST;
        return c7gVarY0.S0(null, null, list, list, Collections.singletonList(eriVar), qqbVar.W(), 1, q06.e);
    }

    public static c7g t(qqb qqbVar) {
        if (qqbVar == null) {
            a(22);
            throw null;
        }
        c7g c7gVarY0 = c7g.Y0(qqbVar, pkg.a, 4, qqbVar.d());
        List list = Collections.EMPTY_LIST;
        return c7gVarY0.S0(null, null, list, list, list, o06.e(qqbVar).h(qqbVar.W()), 1, q06.e);
    }

    public static mw9 u(c92 c92Var, yr9 yr9Var, wc0 wc0Var) {
        if (yr9Var == null) {
            return null;
        }
        return new mw9(c92Var, new dc7(c92Var, yr9Var), wc0Var);
    }

    public static krd v(hrd hrdVar, wc0 wc0Var, boolean z, neg negVar) {
        if (wc0Var == null) {
            a(18);
            throw null;
        }
        if (negVar != null) {
            return new krd(hrdVar, wc0Var, hrdVar.q(), hrdVar.getVisibility(), z, false, false, 1, null, negVar);
        }
        a(19);
        throw null;
    }

    public static xz5 w(qqb qqbVar) {
        p06 p06Var;
        xz5 xz5Var = new xz5(qqbVar, null, dd8.F, true, 1, neg.n);
        List list = Collections.EMPTY_LIST;
        int i = m06.a;
        int iM = qqbVar.m();
        if (iM == 3 || qy1.a(iM)) {
            p06Var = q06.a;
            if (p06Var == null) {
                m06.a(49);
                throw null;
            }
        } else if (m06.q(qqbVar)) {
            p06Var = q06.a;
            if (p06Var == null) {
                m06.a(51);
                throw null;
            }
        } else if (m06.k(qqbVar)) {
            p06Var = q06.j;
            if (p06Var == null) {
                m06.a(52);
                throw null;
            }
        } else {
            p06Var = q06.e;
            if (p06Var == null) {
                m06.a(53);
                throw null;
            }
        }
        xz5Var.b1(list, p06Var);
        return xz5Var;
    }

    public static prd x(hrd hrdVar, wc0 wc0Var, wc0 wc0Var2, boolean z, ow5 ow5Var, neg negVar) {
        if (wc0Var == null) {
            a(8);
            throw null;
        }
        if (wc0Var2 == null) {
            a(9);
            throw null;
        }
        if (ow5Var == null) {
            a(10);
            throw null;
        }
        if (negVar == null) {
            a(11);
            throw null;
        }
        prd prdVar = new prd(hrdVar, wc0Var, hrdVar.q(), ow5Var, z, false, false, 1, null, negVar);
        prdVar.Q = prd.S0(prdVar, hrdVar.getType(), wc0Var2);
        return prdVar;
    }

    public static final long y(koc kocVar) {
        return mwa.M(((hsc) kocVar.d.H).h() * kocVar.n()) + (((long) ((isc) kocVar.d.G).h()) * ((long) kocVar.n()));
    }

    public static final String z(m29 m29Var, boolean z, ld4 ld4Var, int i) {
        Object obj;
        Object next;
        Object next2;
        j29 j29Var = m29Var.b;
        boolean z2 = j29Var == j29.G;
        List list = m29Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!E((k29) obj2, j29Var, z)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((k29) next).b == l29.H) {
                break;
            }
        }
        k29 k29Var = (k29) next;
        e18 e18Var = (e18) ld4Var;
        if (k29Var != null) {
            e18Var.a0(-1315204477);
            String strH = H(k29Var, j29Var, z, e18Var);
            e18Var.p(false);
            return strH;
        }
        e18Var.a0(-1315204478);
        e18Var.p(false);
        if (m29Var.c) {
            e18Var.a0(-1315098147);
            String strJ0 = d4c.j0((z && z2) ? R.string.ccr_init_cowork_header_resume_done : z ? R.string.ccr_init_cowork_header_new_done : z2 ? R.string.ccr_init_header_resumed : R.string.ccr_init_header_initialized, e18Var);
            e18Var.p(false);
            return strJ0;
        }
        e18Var.a0(-1314743538);
        e18Var.p(false);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((k29) next2).b == l29.F) {
                break;
            }
        }
        k29 k29Var2 = (k29) next2;
        if (k29Var2 != null) {
            e18Var.a0(-1314675741);
            String strH2 = H(k29Var2, j29Var, z, e18Var);
            e18Var.p(false);
            return strH2;
        }
        e18Var.a0(-1314675742);
        e18Var.p(false);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (((k29) objPrevious).b != l29.E) {
                obj = objPrevious;
                break;
            }
        }
        k29 k29Var3 = (k29) obj;
        if (k29Var3 == null) {
            e18Var.a0(-1314536862);
            e18Var.p(false);
            return d4c.j0((z && z2) ? R.string.ccr_init_cowork_header_resume_pending : z ? R.string.ccr_init_cowork_header_new_pending : z2 ? R.string.ccr_init_header_resuming : R.string.ccr_init_header_initializing, e18Var);
        }
        e18Var.a0(-1314536861);
        String strH3 = H(k29Var3, j29Var, z, e18Var);
        e18Var.p(false);
        return strH3;
    }
}
