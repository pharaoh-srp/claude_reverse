package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.Surface;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.sessions.types.SessionGroupingMember;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gmk {
    public static final ta4 a = new ta4(-3826955, false, new rb4(23));
    public static final ta4 b = new ta4(-1264708228, false, new sb4(5));

    public static final void a(List list, boolean z, boolean z2, iqb iqbVar, ld4 ld4Var, int i) throws IOException {
        iqb iqbVar2;
        String strN;
        fqb fqbVar;
        fqb fqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1203817295);
        int i2 = 16;
        int i3 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            List listJ1 = w44.j1(list, 5);
            int size = list.size() - listJ1.size();
            String strU = (size > 0 || z) ? size > 0 ? z ? grc.u("+", size, "+") : grc.p(size, "+") : "+" : null;
            String strF0 = d4c.f0(z ? R.plurals.code_project_member_count_truncated : R.plurals.code_project_member_count, list.size(), new Object[]{Integer.valueOf(list.size())}, e18Var);
            if (z2) {
                strN = vb7.n(e18Var, 1522235612, R.string.code_project_private, e18Var, false);
            } else {
                e18Var.a0(-55286962);
                e18Var.p(false);
                strN = null;
            }
            String strS0 = w44.S0(mp0.C0(new String[]{strN, strF0}), ", ", null, null, null, 62);
            wo1 wo1Var = lja.Q;
            boolean zF = e18Var.f(strS0);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new w43(strS0, i2);
                e18Var.k0(objN);
            }
            fqb fqbVar3 = fqb.E;
            iqb iqbVarA = tjf.a(fqbVar3, (bz7) objN);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (z2) {
                e18Var.a0(1668214200);
                fqbVar = fqbVar3;
                iv1.b(ud0.H0, null, gb9.N(fqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), ef2.F, gm3.a(e18Var).O, e18Var, 3504, 0);
                e18Var.p(false);
            } else {
                fqbVar = fqbVar3;
                e18Var.a0(1668469175);
                e18Var.p(false);
            }
            e18Var.a0(885106526);
            int i4 = 0;
            for (Object obj : listJ1) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                b(eve.E(((SessionGroupingMember) obj).getDisplay_name(), "?"), lnk.j(sf5.N(fqbVar, i4 * (-6), MTTypesetterKt.kLineSkipLimitMultiplier, 2), listJ1.size() - i4), e18Var, 0);
                i4 = i5;
            }
            e18Var.p(false);
            if (strU == null) {
                e18Var.a0(1668912970);
                e18Var.p(false);
                fqbVar2 = fqbVar;
            } else {
                e18Var.a0(1668912971);
                fqbVar2 = fqbVar;
                tjh.b(strU, sf5.N(fqbVar, (listJ1.size() * (-6)) + 8, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar2;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(list, z, z2, iqbVar2, i, 2);
        }
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-446809580);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarO = b.o(iqbVar, 24.0f);
            long j = gm3.a(e18Var2).o;
            vve vveVar = xve.a;
            iqb iqbVarP = yfd.p(xn5.V(ez1.t(iqbVarO, 1.0f, j, vveVar), vveVar), gm3.a(e18Var2).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, i2 & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 7);
        }
    }

    public static final void c(final String str, final String str2, final boolean z, final boolean z2, final bz7 bz7Var, boolean z3, ld4 ld4Var, final int i) {
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2104231422);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        final boolean z4 = true;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            int i3 = i2 >> 6;
            ppk.b(u00.g(R.string.verification_flow_agree_to_terms_and_usage_policy, new Object[]{str, str2}, e18Var), z, bz7Var, null, e18Var, (i3 & 896) | ((i2 >> 3) & 112) | 24576, 40);
            e18Var = e18Var;
            xrk.a(i3 & 112, 4, e18Var, null, d4c.j0(R.string.verification_flow_terms_validation_error, e18Var), z2);
            e18Var.p(true);
        } else {
            e18Var.T();
            z4 = z3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, str2, z, z2, bz7Var, z4, i) { // from class: ych
                public final /* synthetic */ String E;
                public final /* synthetic */ String F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ bz7 I;
                public final /* synthetic */ boolean J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    gmk.c(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(Surface surface, ja8 ja8Var, cz5 cz5Var, ib2 ib2Var) {
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.getClass();
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            hb2 hb2Var = ib2Var.E;
            fu9 fu9Var = hb2Var.b;
            iz izVarA = jz.a(canvasLockHardwareCanvas);
            float width = canvasLockHardwareCanvas.getWidth();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(canvasLockHardwareCanvas.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            cz5 cz5Var2 = hb2Var.a;
            fu9 fu9Var2 = hb2Var.b;
            fb2 fb2Var = hb2Var.c;
            long j = hb2Var.d;
            hb2Var.a = cz5Var;
            hb2Var.b = fu9Var;
            hb2Var.c = izVarA;
            hb2Var.d = jFloatToRawIntBits;
            izVarA.g();
            csg.t(ib2Var, ja8Var);
            izVarA.p();
            hb2Var.a = cz5Var2;
            hb2Var.b = fu9Var2;
            hb2Var.c = fb2Var;
            hb2Var.d = j;
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public static boolean e(ssc sscVar, zm7 zm7Var, int i, xm7 xm7Var) {
        long jB = sscVar.B();
        long j = jB >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jB >> 12) & 15);
        int i3 = (int) ((jB >> 8) & 15);
        int i4 = (int) ((jB >> 4) & 15);
        int i5 = (int) ((jB >> 1) & 7);
        boolean z2 = (jB & 1) == 1;
        if (i4 <= 7) {
            if (i4 != zm7Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || zm7Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == zm7Var.i) || z2) {
            return false;
        }
        try {
            long jH = sscVar.H();
            if (!z) {
                jH *= (long) zm7Var.b;
            }
            long j2 = zm7Var.j;
            if (j2 != 0 && jH > j2) {
                return false;
            }
            xm7Var.a = jH;
            int iG = g(i2, sscVar);
            long j3 = zm7Var.j;
            boolean z3 = j3 == 0 || jH + ((long) iG) >= j3;
            if (iG == -1) {
                return false;
            }
            if ((!z3 && iG < zm7Var.a) || iG > zm7Var.b) {
                return false;
            }
            int i6 = zm7Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != zm7Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iG2 = sscVar.G();
                    if (i3 == 14) {
                        iG2 *= 10;
                    }
                    if (iG2 != i6) {
                        return false;
                    }
                } else if (sscVar.z() * 1000 != i6) {
                    return false;
                }
            }
            int iZ = sscVar.z();
            int i7 = sscVar.b;
            byte[] bArr = sscVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = sscVar.b; i10 < i8; i10++) {
                i9 = tpi.i[i9 ^ (bArr[i10] & 255)];
            }
            String str = tpi.a;
            if (iZ != i9) {
                return false;
            }
            if (sscVar.a() != 0) {
                int iJ = sscVar.j();
                if ((iJ & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    return false;
                }
                int i11 = (iJ & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    ysj.n("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static rtk f(int i) {
        if (i != 0 && i == 1) {
            return new me5();
        }
        return new zve();
    }

    public static int g(int i, ssc sscVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return sscVar.z() + 1;
            case 7:
                return sscVar.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING << (i - 8);
            default:
                return -1;
        }
    }

    public static aij h(List list, boolean z) {
        Iterator it;
        uhj uhjVar;
        uhj uhjVar2;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        xvb xvbVarI = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it2.hasNext()) {
            zhj zhjVar = (zhj) it2.next();
            if (zhjVar instanceof yhj) {
                yhj yhjVar = (yhj) zhjVar;
                xvbVarI = i(linkedHashMap, yhjVar.a, yhjVar.b);
            } else {
                if (!(zhjVar instanceof whj)) {
                    wg6.i();
                    return null;
                }
                whj whjVar = (whj) zhjVar;
                Integer num = whjVar.d;
                xvb xvbVarI2 = num != null ? i(linkedHashMap, num.intValue(), whjVar.e) : xvbVarI == null ? i(linkedHashMap, 0, null) : xvbVarI;
                xvbVarI2.c.add(zhjVar);
                int iOrdinal = k(whjVar).ordinal();
                if (iOrdinal == 0) {
                    xvbVarI2.d++;
                    i++;
                } else if (iOrdinal == 1) {
                    xvbVarI2.e++;
                    i2++;
                } else if (iOrdinal == 2) {
                    xvbVarI2.e++;
                    xvbVarI2.f++;
                    i2++;
                    i3++;
                } else if (iOrdinal == 3) {
                    xvbVarI2.g++;
                    i4++;
                } else {
                    if (iOrdinal != 4) {
                        wg6.i();
                        return null;
                    }
                    xvbVarI2.h++;
                    i5++;
                }
                Integer num2 = whjVar.f;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    xvbVarI2.i += iIntValue;
                    i6 += iIntValue;
                }
                Long l = whjVar.g;
                if (l != null) {
                    long jLongValue = l.longValue();
                    Long l2 = xvbVarI2.j;
                    xvbVarI2.j = Long.valueOf(Math.max(l2 != null ? l2.longValue() : 0L, jLongValue));
                }
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Collection collection = collectionValues;
        ArrayList arrayList = new ArrayList(x44.y(collection, 10));
        for (Iterator it3 = collection.iterator(); it3.hasNext(); it3 = it) {
            xvb xvbVar = (xvb) it3.next();
            int i7 = xvbVar.d;
            int i8 = xvbVar.e;
            int i9 = xvbVar.f;
            int i10 = xvbVar.g;
            int i11 = xvbVar.h;
            thj thjVar = new thj(i7, i8, i9, i10, i11);
            int i12 = xvbVar.a;
            String str = xvbVar.b;
            ArrayList arrayList2 = xvbVar.c;
            if (i10 > 0) {
                uhjVar = uhj.H;
                it = it3;
            } else {
                uhj uhjVar3 = uhj.F;
                uhj uhjVar4 = uhj.G;
                if (i8 <= 0) {
                    it = it3;
                    if (thjVar.a() == 0 || i11 == thjVar.a()) {
                        uhjVar = uhj.E;
                    } else {
                        uhjVar2 = (i7 == thjVar.a() || z) ? uhjVar4 : uhjVar3;
                    }
                } else if (z) {
                    it = it3;
                } else {
                    it = it3;
                }
                arrayList.add(new vhj(i12, str, arrayList2, thjVar, uhjVar2, xvbVar.i, xvbVar.j));
            }
            uhjVar2 = uhjVar;
            arrayList.add(new vhj(i12, str, arrayList2, thjVar, uhjVar2, xvbVar.i, xvbVar.j));
        }
        return new aij(new thj(i, i2, i3, i4, i5), w44.i1(arrayList, new x8e(19)), i6);
    }

    public static final xvb i(LinkedHashMap linkedHashMap, int i, String str) {
        if (str == null || bsg.I0(str)) {
            str = null;
        }
        Integer numValueOf = Integer.valueOf(i);
        Object xvbVar = linkedHashMap.get(numValueOf);
        if (xvbVar == null) {
            xvbVar = new xvb(i, str == null ? grc.p(i + 1, "Phase ") : str);
            linkedHashMap.put(numValueOf, xvbVar);
        }
        xvb xvbVar2 = (xvb) xvbVar;
        if (str != null && isg.q0(xvbVar2.b, "Phase ", false)) {
            xvbVar2.b = str;
        }
        return xvbVar2;
    }

    public static boolean j(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static final shj k(whj whjVar) {
        whjVar.getClass();
        int iOrdinal = whjVar.c.ordinal();
        if (iOrdinal == 0) {
            return shj.I;
        }
        if (iOrdinal == 1) {
            return shj.F;
        }
        if (iOrdinal == 2) {
            return shj.E;
        }
        if (iOrdinal == 3) {
            return shj.H;
        }
        wg6.i();
        return null;
    }
}
