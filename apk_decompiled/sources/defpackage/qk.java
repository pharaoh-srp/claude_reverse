package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.painter.ColorPainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qk {
    public static final float a = wp.b;
    public static final float b = 6.0f;
    public static final vve c = xve.b(12.0f);

    public static final void a(final jk jkVar, final bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        boolean z;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1812970109);
        final int i2 = 2;
        int i3 = i | (e18Var.f(jkVar) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        final int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = jkVar instanceof hk;
            lz1 lz1Var = jd4.a;
            if (z2) {
                e18Var.a0(-1492439577);
                String strB = ((hk) jkVar).a.b();
                int i5 = ((i3 & 112) == 32 ? 1 : 0) | ((i3 & 14) != 4 ? 0 : 1);
                Object objN = e18Var.N();
                if (i5 != 0 || objN == lz1Var) {
                    objN = new zy7() { // from class: lk
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i6 = i4;
                            iei ieiVar = iei.a;
                            jk jkVar2 = jkVar;
                            bz7 bz7Var2 = bz7Var;
                            switch (i6) {
                                case 0:
                                    bz7Var2.invoke(((hk) jkVar2).a);
                                    break;
                                case 1:
                                    bz7Var2.invoke(((ik) jkVar2).a);
                                    break;
                                default:
                                    bz7Var2.invoke(((gk) jkVar2).a);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN);
                }
                otj.e(strB, true, false, (zy7) objN, zy7Var, zy7Var, null, null, null, null, null, fd9.q0(-650828067, new sz7() { // from class: ok
                    @Override // defpackage.sz7
                    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i6 = i4;
                        iei ieiVar = iei.a;
                        jk jkVar2 = jkVar;
                        switch (i6) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((mw1) obj).getClass();
                                e18 e18Var2 = (e18) ld4Var2;
                                if (!e18Var2.Q(1 & iIntValue, (iIntValue & 129) != 128)) {
                                    e18Var2.T();
                                } else {
                                    nuk.e(((hk) jkVar2).b, gik.l((nrg) drg.c.getValue(), e18Var2), iik.j(lnk.j(b.c, -1.0f), pnk.i(e18Var2), false, null, 62), null, null, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, 3, false, e18Var2, 12582912, 2936);
                                }
                                break;
                            default:
                                va6 va6Var = (va6) obj2;
                                ld4 ld4Var3 = (ld4) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((mw1) obj).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= ((e18) ld4Var3).c(va6Var.E) ? 32 : 16;
                                }
                                e18 e18Var3 = (e18) ld4Var3;
                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    e18Var3.T();
                                } else {
                                    String str = ((gk) jkVar2).c;
                                    if (str != null) {
                                        e18Var3.a0(1210512916);
                                        xvk.c(b.c, fd9.q0(-353360978, new m6(str, jkVar2, va6Var, 3), e18Var3), e18Var3, 54, 0);
                                        e18Var3.p(false);
                                    } else {
                                        e18Var3.a0(1210274340);
                                        xo1 xo1Var = lja.K;
                                        FillElement fillElement = b.c;
                                        o5b o5bVarD = dw1.d(xo1Var, false);
                                        int iHashCode = Long.hashCode(e18Var3.T);
                                        hyc hycVarL = e18Var3.l();
                                        iqb iqbVarE = kxk.E(e18Var3, fillElement);
                                        dd4.e.getClass();
                                        re4 re4Var = cd4.b;
                                        e18Var3.e0();
                                        if (e18Var3.S) {
                                            e18Var3.k(re4Var);
                                        } else {
                                            e18Var3.n0();
                                        }
                                        d4c.i0(e18Var3, cd4.f, o5bVarD);
                                        d4c.i0(e18Var3, cd4.e, hycVarL);
                                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                                        d4c.h0(e18Var3, cd4.h);
                                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                                        tjd.a(null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 0, 63);
                                        e18Var3.p(true);
                                        e18Var3.p(false);
                                    }
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var), e18Var, ((i3 << 6) & 57344) | 432 | ((i3 << 9) & 458752), 48, 1984);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                boolean z3 = false;
                if (jkVar instanceof ik) {
                    e18Var.a0(-1492411648);
                    ik ikVar = (ik) jkVar;
                    String str = ikVar.b;
                    String strB2 = ikVar.a.b();
                    boolean z4 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                    Object objN2 = e18Var.N();
                    if (z4 || objN2 == lz1Var) {
                        objN2 = new zy7() { // from class: lk
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i6 = i;
                                iei ieiVar = iei.a;
                                jk jkVar2 = jkVar;
                                bz7 bz7Var2 = bz7Var;
                                switch (i6) {
                                    case 0:
                                        bz7Var2.invoke(((hk) jkVar2).a);
                                        break;
                                    case 1:
                                        bz7Var2.invoke(((ik) jkVar2).a);
                                        break;
                                    default:
                                        bz7Var2.invoke(((gk) jkVar2).a);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN2);
                    }
                    qwj.b(str, strB2, true, false, (zy7) objN2, zy7Var, zy7Var, null, null, null, null, e18Var, ((i3 << 9) & 458752) | 3456 | ((i3 << 12) & 3670016), 1920);
                    e18Var.p(false);
                } else {
                    if (!(jkVar instanceof gk)) {
                        throw ebh.u(e18Var, -1492438741, false);
                    }
                    e18Var.a0(-1492378297);
                    gk gkVar = (gk) jkVar;
                    String strB3 = gkVar.a.b();
                    if (gkVar.c != null) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    boolean z5 = ((i3 & 14) != 4 ? z : true) | ((i3 & 112) == 32 ? true : z);
                    Object objN3 = e18Var.N();
                    if (z5 || objN3 == lz1Var) {
                        objN3 = new zy7() { // from class: lk
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i6 = i2;
                                iei ieiVar = iei.a;
                                jk jkVar2 = jkVar;
                                bz7 bz7Var2 = bz7Var;
                                switch (i6) {
                                    case 0:
                                        bz7Var2.invoke(((hk) jkVar2).a);
                                        break;
                                    case 1:
                                        bz7Var2.invoke(((ik) jkVar2).a);
                                        break;
                                    default:
                                        bz7Var2.invoke(((gk) jkVar2).a);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN3);
                    }
                    otj.e(strB3, z3, false, (zy7) objN3, zy7Var, zy7Var, null, null, null, null, new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier), fd9.q0(-1101273707, new sz7() { // from class: ok
                        @Override // defpackage.sz7
                        public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i6 = i;
                            iei ieiVar = iei.a;
                            jk jkVar2 = jkVar;
                            switch (i6) {
                                case 0:
                                    ld4 ld4Var2 = (ld4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((mw1) obj).getClass();
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (!e18Var2.Q(1 & iIntValue, (iIntValue & 129) != 128)) {
                                        e18Var2.T();
                                    } else {
                                        nuk.e(((hk) jkVar2).b, gik.l((nrg) drg.c.getValue(), e18Var2), iik.j(lnk.j(b.c, -1.0f), pnk.i(e18Var2), false, null, 62), null, null, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, 3, false, e18Var2, 12582912, 2936);
                                    }
                                    break;
                                default:
                                    va6 va6Var = (va6) obj2;
                                    ld4 ld4Var3 = (ld4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((mw1) obj).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= ((e18) ld4Var3).c(va6Var.E) ? 32 : 16;
                                    }
                                    e18 e18Var3 = (e18) ld4Var3;
                                    if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        e18Var3.T();
                                    } else {
                                        String str2 = ((gk) jkVar2).c;
                                        if (str2 != null) {
                                            e18Var3.a0(1210512916);
                                            xvk.c(b.c, fd9.q0(-353360978, new m6(str2, jkVar2, va6Var, 3), e18Var3), e18Var3, 54, 0);
                                            e18Var3.p(false);
                                        } else {
                                            e18Var3.a0(1210274340);
                                            xo1 xo1Var = lja.K;
                                            FillElement fillElement = b.c;
                                            o5b o5bVarD = dw1.d(xo1Var, false);
                                            int iHashCode = Long.hashCode(e18Var3.T);
                                            hyc hycVarL = e18Var3.l();
                                            iqb iqbVarE = kxk.E(e18Var3, fillElement);
                                            dd4.e.getClass();
                                            re4 re4Var = cd4.b;
                                            e18Var3.e0();
                                            if (e18Var3.S) {
                                                e18Var3.k(re4Var);
                                            } else {
                                                e18Var3.n0();
                                            }
                                            d4c.i0(e18Var3, cd4.f, o5bVarD);
                                            d4c.i0(e18Var3, cd4.e, hycVarL);
                                            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                                            d4c.h0(e18Var3, cd4.h);
                                            d4c.i0(e18Var3, cd4.d, iqbVarE);
                                            tjd.a(null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 0, 63);
                                            e18Var3.p(true);
                                            e18Var3.p(false);
                                        }
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, e18Var), e18Var, ((i3 << 6) & 57344) | 384 | ((i3 << 9) & 458752), 54, 960);
                    e18Var = e18Var;
                    e18Var.p(z);
                }
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(jkVar, i, bz7Var, zy7Var, 2);
        }
    }

    public static final void b(List list, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        boolean z;
        boolean z2;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1741908193);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        bz7 bz7Var4 = bz7Var2;
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 24576;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z3 = (i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var.f(list));
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((fk) obj).c) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                cpc cpcVar = new cpc(arrayList, arrayList2);
                e18Var.k0(cpcVar);
                objN = cpcVar;
            }
            cpc cpcVar2 = (cpc) objN;
            List list2 = (List) cpcVar2.E;
            List list3 = (List) cpcVar2.F;
            sz6 sz6Var = new sz6(1);
            float f = b;
            q64 q64VarA = p64.a(new ho0(f, true, sz6Var), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            int size = list2.size();
            if (size != 0) {
                float f2 = a;
                float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (size != 1) {
                    e18Var.a0(1631257164);
                    Iterator it = w44.F0(list2, 2).iterator();
                    while (it.hasNext()) {
                        List<fk> list4 = (List) it.next();
                        ho0 ho0Var = new ho0(f, true, new sz6(1));
                        iqb iqbVarC = b.c(b.v(fqbVar, f3, f2, 1), 1.0f);
                        cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
                        int iHashCode2 = Long.hashCode(e18Var.T);
                        hyc hycVarL2 = e18Var.l();
                        iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
                        dd4.e.getClass();
                        Iterator it2 = it;
                        re4 re4Var2 = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var2);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, cd4.f, cxeVarA);
                        d4c.i0(e18Var, cd4.e, hycVarL2);
                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var, cd4.h);
                        d4c.i0(e18Var, cd4.d, iqbVarE2);
                        e18Var.a0(1393896967);
                        for (fk fkVar : list4) {
                            String str = (String) bz7Var.invoke(fkVar);
                            if (1.0f <= 0.0d) {
                                z29.a("invalid weight; must be greater than zero");
                            }
                            d(fkVar, str, bz7Var4, kud.d(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f, false), e18Var, i3 & 896);
                            bz7Var4 = bz7Var2;
                            f = f;
                        }
                        float f4 = f;
                        e18Var.p(false);
                        if (list4.size() == 1) {
                            e18Var.a0(1393916505);
                            if (1.0f <= 0.0d) {
                                z29.a("invalid weight; must be greater than zero");
                            }
                            z = true;
                            kxk.g(e18Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            z2 = false;
                        } else {
                            z = true;
                            z2 = false;
                            e18Var.a0(261764644);
                        }
                        e18Var.p(z2);
                        e18Var.p(z);
                        bz7Var4 = bz7Var2;
                        f = f4;
                        it = it2;
                        f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
                    }
                    e18Var.p(false);
                } else {
                    e18Var.a0(329874420);
                    d((fk) list2.get(0), (String) bz7Var.invoke(list2.get(0)), bz7Var2, kud.d(b.c(b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1), 1.0f), 1.3333334f, false), e18Var, (i3 & 896) | 3072);
                    e18Var.p(false);
                }
            } else {
                e18Var.a0(1636141833);
                e18Var.p(false);
            }
            e18Var.a0(329918753);
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                c((fk) it3.next(), bz7Var3, b.c(fqbVar, 1.0f), e18Var, ((i3 >> 6) & 112) | 384);
            }
            e18Var.p(false);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(list, bz7Var, bz7Var2, bz7Var3, iqbVar2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final void c(fk fkVar, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7 zy7Var;
        ?? r3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(77079172);
        int i2 = (i & 6) == 0 ? (e18Var2.h(fkVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) e18Var2.j(w00.b);
            boolean z = fkVar.f && fkVar.e != null;
            boolean zF = e18Var2.f(fkVar.b());
            Object objN = e18Var2.N();
            Object obj = jd4.a;
            if (zF || objN == obj) {
                objN = uaj.c(context, fkVar.b());
                e18Var2.k0(objN);
            }
            String str = (String) objN;
            Long l = fkVar.b;
            zy7 zy7Var2 = null;
            String fileSize = l != null ? Formatter.formatFileSize(context, l.longValue()) : null;
            if (fileSize == null) {
                fileSize = "";
            }
            List listX = x44.X(str, fileSize);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listX) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            String strS0 = w44.S0(arrayList, " · ", null, null, null, 62);
            String strB = fkVar.b();
            if (z) {
                e18Var2.a0(-1540864857);
                boolean zH = ((i2 & 112) == 32) | e18Var2.h(fkVar);
                Object objN2 = e18Var2.N();
                if (zH || objN2 == obj) {
                    objN2 = new nk(bz7Var, fkVar, 1);
                    e18Var2.k0(objN2);
                }
                zy7Var = (zy7) objN2;
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1540835687);
                e18Var2.p(false);
                zy7Var = null;
            }
            String strB2 = z ? fkVar.b() : null;
            if (z) {
                e18Var2.a0(-1540723993);
                boolean zH2 = ((i2 & 112) == 32) | e18Var2.h(fkVar);
                Object objN3 = e18Var2.N();
                if (zH2 || objN3 == obj) {
                    objN3 = new nk(bz7Var, fkVar, 2);
                    e18Var2.k0(objN3);
                }
                zy7Var2 = (zy7) objN3;
                r3 = 0;
            } else {
                r3 = 0;
                e18Var2.a0(-1540694823);
            }
            e18Var2.p(r3);
            e18 e18Var3 = e18Var2;
            jwk.m(strB, strS0, fd9.q0(-1595742537, new mk(fkVar, r3), e18Var2), iqbVar, zy7Var, strB2, zy7Var2, null, lja.K, MTTypesetterKt.kLineSkipLimitMultiplier, zdd.F, null, !fkVar.f, e18Var3, ((i2 << 3) & 7168) | 100663680, 6, 2688);
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 1, iqbVar, fkVar, bz7Var);
        }
    }

    public static final void d(fk fkVar, String str, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVarC;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-101676804);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(fkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = fkVar.e != null;
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(xn5.V(iqbVar, c), gm3.a(e18Var2).q, zni.b);
            fqb fqbVar = fqb.E;
            if (z) {
                e18Var2.a0(1072852797);
                boolean zH = ((i2 & 896) == 256) | e18Var2.h(fkVar);
                Object objN = e18Var2.N();
                if (zH || objN == jd4.a) {
                    objN = new nk(bz7Var, fkVar, 0);
                    e18Var2.k0(objN);
                }
                iqbVarC = androidx.compose.foundation.b.c(fqbVar, false, null, null, null, (zy7) objN, 15);
                e18Var2.p(false);
            } else {
                e18Var2.a0(1072854020);
                e18Var2.p(false);
                iqbVarC = fqbVar;
            }
            iqb iqbVarB = iqbVarP.B(iqbVarC);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
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
            if (!fkVar.f) {
                e18Var2.a0(-1477132828);
                iqb iqbVarO = b.o(fqbVar, 24.0f);
                e18Var = e18Var2;
                tjd.a(iqbVarO, 0L, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 58);
                e18Var.p(false);
            } else if (str == null) {
                e18Var2.a0(90903074);
                iv1.b(ud0.K1, gik.l((nrg) drg.d.getValue(), e18Var2), null, null, gm3.a(e18Var2).O, e18Var2, 0, 12);
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                e18Var2.a0(-1476725302);
                nuk.d(str, gik.l((nrg) drg.c.getValue(), e18Var2), b.c, null, new ColorPainter(gm3.a(e18Var2).q), null, null, null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var2, ((i2 >> 3) & 14) | 33152, 48, 63464);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd((Object) fkVar, (Object) str, bz7Var, iqbVar, i, 1);
        }
    }
}
