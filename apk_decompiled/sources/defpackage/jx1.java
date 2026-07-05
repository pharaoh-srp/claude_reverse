package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.painter.ColorPainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jx1 {
    public static final vve a = xve.b(12.0f);
    public static final float b = 8.0f;
    public static final Set c = mp0.Z0(new String[]{"html", "htm"});
    public static final pwf d;

    static {
        pwf pwfVar = new pwf();
        pwfVar.addAll(x44.X("png", "jpg", "jpeg", "gif", "webp", "bmp"));
        if (Build.VERSION.SDK_INT >= 28) {
            pwfVar.add("heic");
            pwfVar.add("heif");
        }
        d = sf5.k(pwfVar);
    }

    public static final void a(List list, i iVar, iqb iqbVar, bz7 bz7Var, bz7 bz7Var2, lgb lgbVar, ld4 ld4Var, int i) {
        bz7 bz7Var3;
        bz7 bz7Var4;
        i iVar2;
        e18 e18Var;
        lgb lgbVar2;
        int i2;
        lgb lgbVar3;
        bz7 bz7Var5;
        bz7 bz7Var6;
        fqb fqbVar;
        list.getClass();
        iVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1896578761);
        int i3 = (i & 6) == 0 ? ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            bz7Var3 = bz7Var;
            i3 |= e18Var2.h(bz7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            bz7Var3 = bz7Var;
        }
        if ((i & 24576) == 0) {
            bz7Var4 = bz7Var2;
            i3 |= e18Var2.h(bz7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            bz7Var4 = bz7Var2;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(lgb.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i3 & (-458753);
                lgbVar3 = (lgb) objN;
            } else {
                e18Var2.T();
                i2 = i3 & (-458753);
                lgbVar3 = lgbVar;
            }
            e18Var2.q();
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var2.f(list));
            Object objN2 = e18Var2.N();
            if (z || objN2 == lz1Var) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (d((fk) obj)) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                cpc cpcVar = new cpc(arrayList, arrayList2);
                e18Var2.k0(cpcVar);
                objN2 = cpcVar;
            }
            cpc cpcVar2 = (cpc) objN2;
            List<fk> list2 = (List) cpcVar2.E;
            List list3 = (List) cpcVar2.F;
            bz7 bz7VarE = e(iVar, lgbVar3, e18Var2, (i2 >> 3) & 14, 0);
            boolean zF2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | e18Var2.f(bz7VarE);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                fe feVar = new fe(iVar, bz7Var4, bz7Var3, bz7VarE, 3);
                iVar2 = iVar;
                bz7Var5 = bz7VarE;
                e18Var2.k0(feVar);
                objN3 = feVar;
            } else {
                iVar2 = iVar;
                bz7Var5 = bz7VarE;
            }
            bz7 bz7Var7 = (bz7) objN3;
            sz6 sz6Var = new sz6(1);
            float f = b;
            q64 q64VarA = p64.a(new ho0(f, true, sz6Var), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            boolean zIsEmpty = list2.isEmpty();
            fqb fqbVar2 = fqb.E;
            if (zIsEmpty) {
                bz7Var6 = bz7Var7;
                fqbVar = fqbVar2;
                e18Var = e18Var2;
                lgbVar2 = lgbVar3;
                e18Var.a0(-788551455);
                e18Var.p(false);
            } else {
                e18Var2.a0(-789269632);
                bz7Var6 = bz7Var7;
                lgbVar2 = lgbVar3;
                ho0 ho0Var = new ho0(f, true, new sz6(1));
                iqb iqbVarB0 = mpk.b0(fqbVar2, mpk.Y(e18Var2), false);
                cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var2, 6);
                int iHashCode2 = Long.hashCode(e18Var2.T);
                hyc hycVarL2 = e18Var2.l();
                iqb iqbVarE2 = kxk.E(e18Var2, iqbVarB0);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, cxeVarA);
                d4c.i0(e18Var2, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE2);
                e18Var2.a0(-390929224);
                for (fk fkVar : list2) {
                    String str = fkVar.e;
                    c(fkVar, str != null ? fkVar.c ? iVar2.Z(str) : iVar2.Y(str) : null, bz7Var6, null, e18Var2, 0);
                }
                fqbVar = fqbVar2;
                e18Var = e18Var2;
                ij0.w(e18Var, false, true, false);
            }
            e18Var.a0(805847366);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                b((fk) it.next(), bz7Var6, bz7Var5, b.c(fqbVar, 1.0f), e18Var, 3072);
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            iVar2 = iVar;
            e18Var = e18Var2;
            e18Var.T();
            lgbVar2 = lgbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(list, iVar2, iqbVar, bz7Var, bz7Var2, lgbVar2, i, 4);
        }
    }

    public static final void b(fk fkVar, bz7 bz7Var, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7 zy7Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1114196163);
        int i2 = i | (e18Var2.h(fkVar) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) e18Var2.j(w00.b);
            boolean z = fkVar.f && fkVar.e != null;
            boolean zF = e18Var2.f(fkVar.b());
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = uaj.c(context, fkVar.b());
                e18Var2.k0(objN);
            }
            String str = (String) objN;
            Long l = fkVar.b;
            zy7 zy7Var2 = null;
            boolean z2 = z;
            String fileSize = l != null ? Formatter.formatFileSize(context, l.longValue()) : null;
            if (fileSize == null) {
                fileSize = "";
            }
            List listX = x44.X(str, fileSize);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listX) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String strS0 = w44.S0(arrayList, " · ", null, null, null, 62);
            String strB = fkVar.b();
            if (z2) {
                e18Var2.a0(1511431688);
                boolean zH = ((i2 & 112) == 32) | e18Var2.h(fkVar);
                Object objN2 = e18Var2.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new nk(bz7Var, fkVar, 4);
                    e18Var2.k0(objN2);
                }
                zy7Var = (zy7) objN2;
                e18Var2.p(false);
            } else {
                e18Var2.a0(1511460858);
                e18Var2.p(false);
                zy7Var = null;
            }
            String strB2 = z2 ? fkVar.b() : null;
            if (z2) {
                e18Var2.a0(1511572645);
                boolean zH2 = ((i2 & 896) == 256) | e18Var2.h(fkVar);
                Object objN3 = e18Var2.N();
                if (zH2 || objN3 == lz1Var) {
                    objN3 = new nk(bz7Var2, fkVar, 5);
                    e18Var2.k0(objN3);
                }
                zy7Var2 = (zy7) objN3;
            } else {
                e18Var2.a0(1511604698);
            }
            e18Var2.p(false);
            zy7 zy7Var3 = zy7Var;
            String str2 = strB2;
            e18Var = e18Var2;
            jwk.m(strB, strS0, fd9.q0(588198832, new mk(fkVar, 1), e18Var2), iqbVar, zy7Var3, str2, zy7Var2, null, lja.K, MTTypesetterKt.kLineSkipLimitMultiplier, zdd.F, null, !fkVar.f, e18Var, 100666752, 6, 2688);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) fkVar, (Object) bz7Var, (Object) bz7Var2, iqbVar, i, 10);
        }
    }

    public static final void c(fk fkVar, String str, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        iqb iqbVar3;
        iqb iqbVar4;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(750342440);
        int i2 = i | (e18Var.h(fkVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = fkVar.e != null;
            xo1 xo1Var = lja.K;
            iqb iqbVarC = fqb.E;
            iqb iqbVarP = yfd.p(xn5.V(b.o(iqbVarC, 120.0f), a), gm3.a(e18Var).q, zni.b);
            if (z2) {
                e18Var.a0(-475406231);
                boolean zH = ((i2 & 896) == 256) | e18Var.h(fkVar);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new nk(bz7Var, fkVar, 3);
                    e18Var.k0(objN);
                }
                iqbVarC = androidx.compose.foundation.b.c(iqbVarC, false, null, null, null, (zy7) objN, 15);
                iqbVar3 = iqbVarC;
            } else {
                iqbVar3 = iqbVarC;
                e18Var.a0(-475405008);
            }
            e18Var.p(false);
            iqb iqbVarB = iqbVarP.B(iqbVarC);
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
            if (fkVar.f) {
                iqbVar4 = iqbVar3;
                if (str == null) {
                    e18Var.a0(-1923780359);
                    iv1.b(ud0.K1, d4c.j0(R.string.ccr_attachment_upload_failed, e18Var), null, null, gm3.a(e18Var).O, e18Var, 0, 12);
                    e18Var = e18Var;
                    e18Var.p(false);
                } else {
                    e18Var.a0(492588787);
                    nuk.d(str, d4c.j0(R.string.ccr_attachment_image_description, e18Var), b.c, null, new ColorPainter(gm3.a(e18Var).q), null, null, null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, ((i2 >> 3) & 14) | 33152, 48, 63464);
                    e18Var = e18Var;
                    e18Var.p(false);
                    z = true;
                    e18Var.p(z);
                    iqbVar2 = iqbVar4;
                }
            } else {
                e18Var.a0(492190468);
                iqbVar4 = iqbVar3;
                tjd.a(b.o(iqbVar3, 24.0f), 0L, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 58);
                e18Var.p(false);
            }
            z = true;
            e18Var.p(z);
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) fkVar, (Object) str, bz7Var, iqbVar2, i, 9);
        }
    }

    public static final boolean d(fk fkVar) {
        String lowerCase;
        if (fkVar.c) {
            return true;
        }
        String strA = fkVar.a();
        if (strA != null) {
            lowerCase = strA.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        return w44.G0(d, lowerCase);
    }

    public static final bz7 e(i iVar, lgb lgbVar, ld4 ld4Var, int i, int i2) {
        iVar.getClass();
        int i3 = i2 & 2;
        lz1 lz1Var = jd4.a;
        if (i3 != 0) {
            e18 e18Var = (e18) ld4Var;
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN = e18Var.N();
            if (zF || objN == lz1Var) {
                objN = m7fVarN.a(jce.a.b(lgb.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            lgbVar = (lgb) objN;
        }
        lgb lgbVar2 = lgbVar;
        e18 e18Var2 = (e18) ld4Var;
        Context applicationContext = ((Context) e18Var2.j(w00.b)).getApplicationContext();
        Object objN2 = e18Var2.N();
        if (objN2 == lz1Var) {
            objN2 = fd9.O(im6.E, e18Var2);
            e18Var2.k0(objN2);
        }
        l45 l45Var = (l45) objN2;
        Object objN3 = e18Var2.N();
        if (objN3 == lz1Var) {
            objN3 = mpk.P(null);
            e18Var2.k0(objN3);
        }
        nwb nwbVar = (nwb) objN3;
        boolean zH = e18Var2.h(l45Var) | ((((i & 112) ^ 48) > 32 && e18Var2.h(lgbVar2)) || (i & 48) == 32) | ((((i & 14) ^ 6) > 4 && e18Var2.f(iVar)) || (i & 6) == 4) | e18Var2.h(applicationContext);
        Object objN4 = e18Var2.N();
        if (zH || objN4 == lz1Var) {
            dn dnVar = new dn(l45Var, nwbVar, applicationContext, lgbVar2, iVar);
            e18Var2.k0(dnVar);
            objN4 = dnVar;
        }
        zy7 zy7VarE = tvj.e((zy7) objN4, e18Var2);
        boolean zF2 = e18Var2.f(zy7VarE);
        Object objN5 = e18Var2.N();
        if (zF2 || objN5 == lz1Var) {
            objN5 = new l0(zy7VarE, 22, nwbVar);
            e18Var2.k0(objN5);
        }
        return (bz7) objN5;
    }
}
