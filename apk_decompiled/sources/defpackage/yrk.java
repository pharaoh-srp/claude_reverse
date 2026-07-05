package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.Metadata;
import android.view.inputmethod.HandwritingGesture;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yrk {
    public static final ta4 a = new ta4(1099946424, false, new wb4(4));

    public static final void a(Drawable drawable, String str, ld4 ld4Var, int i) {
        int i2;
        String str2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1586548133);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarO = b.o(fqb.E, 36.0f);
            long j = gm3.a(e18Var).o;
            vve vveVar = xve.a;
            iqb iqbVarP = yfd.p(xn5.V(ez1.t(iqbVarO, 1.5f, j, vveVar), vveVar), gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            if (drawable == null) {
                e18Var.a0(1993671734);
                e18Var.p(false);
                str2 = str;
            } else {
                e18Var.a0(1993671735);
                str2 = str;
                xn5.N(ge6.a(drawable, e18Var), str2, nw1.a.b(), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 8 | (i2 & 112), 120);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            str2 = str;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fnh(drawable, str2, i, i3);
        }
    }

    public static final void b(String str, String str2, long j, boolean z, ld4 ld4Var, int i) {
        int i2;
        Drawable drawable;
        Drawable drawable2;
        boolean z2;
        float fFloatValue;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1563931267);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            String packageName = ((Context) e18Var.j(w00.b)).getPackageName();
            packageName.getClass();
            Drawable drawableL = l(packageName, e18Var, 0);
            Drawable drawableL2 = l(str, e18Var, i2 & 14);
            if (z) {
                e18Var.a0(729194115);
                z2 = false;
                drawable = drawableL;
                drawable2 = drawableL2;
                fFloatValue = ((Number) gb9.j(gb9.R("icon_glow", e18Var, 0), 0.85f, 1.15f, kxk.z(kxk.N(1400, 0, wi6.a, 2), fhe.F, 4), "icon_glow_scale", e18Var, 29112, 0).G.getValue()).floatValue();
                e18Var.p(false);
            } else {
                drawable = drawableL;
                drawable2 = drawableL2;
                z2 = false;
                e18Var.a0(729602323);
                e18Var.p(false);
                fFloatValue = 1.0f;
            }
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarQ = b.q(fqbVar, 80.0f, 56.0f);
            boolean zC = ((i2 & 896) == 256 ? true : z2) | e18Var.c(fFloatValue);
            Object objN = e18Var.N();
            if (zC || objN == jd4.a) {
                objN = new i96(j, fFloatValue);
                e18Var.k0(objN);
            }
            iqb iqbVarT = zni.t(iqbVarQ, (bz7) objN);
            o5b o5bVarD = dw1.d(xo1Var, z2);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            int i3 = i2;
            cxe cxeVarA = axe.a(new ho0(-12.0f, true, new sz6(1)), lja.P, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            a(drawable, null, e18Var, 48);
            a(drawable2, str2, e18Var, i3 & 112);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jhg(str, str2, j, z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ppg r35, defpackage.bz7 r36, defpackage.iqb r37, defpackage.ld4 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrk.c(ppg, bz7, iqb, ld4, int, int):void");
    }

    public static final void d(String str, String str2, String str3, boolean z, boolean z2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        long j;
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1589444578);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            if (z2) {
                e18Var.a0(1552125799);
                j = gm3.a(e18Var).x;
                e18Var.p(false);
            } else {
                e18Var.a0(1552127243);
                j = gm3.a(e18Var).c;
                e18Var.p(false);
            }
            long j2 = j;
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            b(str, str2, j2, z, e18Var, i2 & 7294);
            kxk.g(e18Var, b.t(fqb.E, 8.0f));
            fhk.b(str3, null, ((jm3) gm3.c(e18Var).e.E).i, gm3.a(e18Var).N, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, z, e18Var, (i2 >> 6) & 14, (i2 >> 9) & 14, 1010);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(str, str2, str3, z, z2, iqbVar, i);
        }
    }

    public static int e(i5i i5iVar, HandwritingGesture handwritingGesture) {
        yih yihVar = i5iVar.a;
        k6e k6eVar = i5iVar.b;
        yihVar.b.a().D();
        dfh dfhVar = yihVar.b;
        dfhVar.K = null;
        i5iVar.l(dfhVar);
        yih.a(yihVar, k6eVar, true, cgh.E);
        yihVar.f(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        i5i.h(i5iVar, fallbackText, false, 12);
        return 5;
    }

    public static int f(HandwritingGesture handwritingGesture, d6d d6dVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        d6dVar.invoke(new n74(fallbackText, 1));
        return 5;
    }

    public static mpe g(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("email");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("anonymous_id");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), mpe.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            return new mpe(strM, strM2, strM3, strM4, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    public static void h(i5i i5iVar, long j, int i) {
        boolean zD = kkh.d(j);
        cgh cghVar = cgh.E;
        if (zD) {
            yih yihVar = i5iVar.a;
            k6e k6eVar = i5iVar.b;
            yihVar.b.a().D();
            dfh dfhVar = yihVar.b;
            dfhVar.K = null;
            i5iVar.l(dfhVar);
            yih.a(yihVar, k6eVar, true, cghVar);
            yihVar.f(true);
            return;
        }
        long jE = i5iVar.e(j);
        yih yihVar2 = i5iVar.a;
        k6e k6eVar2 = i5iVar.b;
        yihVar2.b.a().D();
        dfh dfhVar2 = yihVar2.b;
        int i2 = (int) (jE >> 32);
        int i3 = (int) (jE & 4294967295L);
        euc eucVar = dfhVar2.F;
        if (i2 >= i3) {
            sz6.p(grc.o(i2, i3, "Do not set reversed or empty range: ", " > "));
            return;
        }
        dfhVar2.K = new cpc(new gjh(i), new kkh(mwa.m(wd6.e0(i2, 0, eucVar.length()), wd6.e0(i3, 0, eucVar.length()))));
        yih.a(yihVar2, k6eVar2, true, cghVar);
        yihVar2.f(true);
    }

    public static void i(long j, zb0 zb0Var, boolean z, d6d d6dVar) {
        if (z) {
            j = zrk.b(j, zb0Var);
        }
        int i = (int) (4294967295L & j);
        d6dVar.invoke(new ff8(new ij6[]{new wwf(i, i), new ry5(kkh.e(j), 0)}));
    }

    public static final s90 j(vve vveVar, yig yigVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(yigVar);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new v90(vveVar, yigVar);
            e18Var.k0(objN);
        }
        v90 v90Var = (v90) objN;
        Object objN2 = e18Var.N();
        tp4 tp4Var = null;
        if (objN2 == lz1Var) {
            objN2 = wd6.P(-1, 6, null);
            e18Var.k0(objN2);
        }
        gh2 gh2Var = (gh2) objN2;
        int i2 = 0;
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.f(vveVar)) || (i & 6) == 4) | e18Var.h(gh2Var);
        Object objN3 = e18Var.N();
        if (zH || objN3 == lz1Var) {
            objN3 = new r90(gh2Var, vveVar, i2);
            e18Var.k0(objN3);
        }
        fd9.s((zy7) objN3, e18Var);
        boolean zH2 = e18Var.h(gh2Var) | e18Var.f(v90Var);
        Object objN4 = e18Var.N();
        if (zH2 || objN4 == lz1Var) {
            objN4 = new cm(gh2Var, v90Var, tp4Var, 2);
            e18Var.k0(objN4);
        }
        fd9.j(v90Var, gh2Var, (pz7) objN4, e18Var);
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        v90Var.d = cz5Var;
        boolean zF2 = e18Var.f(cz5Var) | e18Var.f(v90Var);
        Object objN5 = e18Var.N();
        if (zF2 || objN5 == lz1Var) {
            objN5 = new s90(v90Var);
            e18Var.k0(objN5);
        }
        return (s90) objN5;
    }

    public static final u90 k(vve vveVar, yig yigVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(yigVar);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new k90(vveVar, yigVar);
            e18Var.k0(objN);
        }
        k90 k90Var = (k90) objN;
        Object objN2 = e18Var.N();
        tp4 tp4Var = null;
        if (objN2 == lz1Var) {
            objN2 = wd6.P(-1, 6, null);
            e18Var.k0(objN2);
        }
        gh2 gh2Var = (gh2) objN2;
        int i2 = 1;
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.f(vveVar)) || (i & 6) == 4) | e18Var.h(gh2Var);
        Object objN3 = e18Var.N();
        if (zH || objN3 == lz1Var) {
            objN3 = new r90(gh2Var, vveVar, i2);
            e18Var.k0(objN3);
        }
        fd9.s((zy7) objN3, e18Var);
        boolean zH2 = e18Var.h(gh2Var) | e18Var.f(k90Var);
        Object objN4 = e18Var.N();
        if (zH2 || objN4 == lz1Var) {
            objN4 = new cm(gh2Var, k90Var, tp4Var, 3);
            e18Var.k0(objN4);
        }
        fd9.j(k90Var, gh2Var, (pz7) objN4, e18Var);
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        k90Var.d = cz5Var;
        boolean zF2 = e18Var.f(cz5Var) | e18Var.f(k90Var);
        Object objN5 = e18Var.N();
        if (zF2 || objN5 == lz1Var) {
            objN5 = new u90(k90Var);
            e18Var.k0(objN5);
        }
        return (u90) objN5;
    }

    public static final Drawable l(String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        Context context = (Context) e18Var.j(w00.b);
        int i2 = 1;
        boolean zH = e18Var.h(context) | ((((i & 14) ^ 6) > 4 && e18Var.f(str)) || (i & 6) == 4);
        Object objN = e18Var.N();
        tp4 tp4Var = null;
        if (zH || objN == jd4.a) {
            objN = new tg4(context, str, tp4Var, i2);
            e18Var.k0(objN);
        }
        return (Drawable) mpk.S(null, str, (pz7) objN, e18Var, ((i << 3) & 112) | 6).getValue();
    }

    public static final DataOrigin m(cg5 cg5Var) {
        cg5Var.getClass();
        DataOrigin.Builder builderH = ljb.h();
        builderH.setPackageName(cg5Var.a);
        DataOrigin dataOriginBuild = builderH.build();
        dataOriginBuild.getClass();
        return dataOriginBuild;
    }

    public static final Metadata n(ijb ijbVar) {
        ijbVar.getClass();
        Metadata.Builder builderJ = ljb.j();
        h26 h26Var = ijbVar.g;
        if (h26Var != null) {
            Device.Builder builderI = ljb.i();
            builderI.setType(h26Var.a);
            String str = h26Var.b;
            if (str != null) {
                builderI.setManufacturer(str);
            }
            String str2 = h26Var.c;
            if (str2 != null) {
                builderI.setModel(str2);
            }
            Device deviceBuild = builderI.build();
            deviceBuild.getClass();
            builderJ.setDevice(deviceBuild);
        }
        builderJ.setLastModifiedTime(ijbVar.d);
        builderJ.setId(ijbVar.b);
        builderJ.setDataOrigin(m(ijbVar.c));
        builderJ.setClientRecordId(ijbVar.e);
        builderJ.setClientRecordVersion(ijbVar.f);
        Integer num = (Integer) r69.J.get(Integer.valueOf(ijbVar.a));
        builderJ.setRecordingMethod(num != null ? num.intValue() : 0);
        Metadata metadataBuild = builderJ.build();
        metadataBuild.getClass();
        return metadataBuild;
    }

    public static final ijb o(Metadata metadata) {
        h26 h26Var;
        String id = metadata.getId();
        id.getClass();
        DataOrigin dataOrigin = metadata.getDataOrigin();
        dataOrigin.getClass();
        String packageName = dataOrigin.getPackageName();
        packageName.getClass();
        cg5 cg5Var = new cg5(packageName);
        Instant lastModifiedTime = metadata.getLastModifiedTime();
        lastModifiedTime.getClass();
        String clientRecordId = metadata.getClientRecordId();
        long clientRecordVersion = metadata.getClientRecordVersion();
        Integer num = (Integer) r69.L.get(Integer.valueOf(metadata.getRecordingMethod()));
        int iIntValue = num != null ? num.intValue() : 0;
        Device device = metadata.getDevice();
        device.getClass();
        if (device.equals(ljb.i().build())) {
            h26Var = null;
        } else {
            String manufacturer = device.getManufacturer();
            String model = device.getModel();
            Integer num2 = (Integer) r69.K.get(Integer.valueOf(device.getType()));
            h26Var = new h26(manufacturer, num2 != null ? num2.intValue() : 0, model);
        }
        return new ijb(iIntValue, id, cg5Var, lastModifiedTime, clientRecordId, clientRecordVersion, h26Var);
    }

    public static boolean p(byte b) {
        return b > -65;
    }
}
