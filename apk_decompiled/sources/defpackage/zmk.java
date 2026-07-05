package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zmk {
    public static final ta4 a = new ta4(41566337, false, new sb4(9));
    public static final float b = 20.0f;
    public static final float c = 80.0f;

    public static final void a(oe oeVar, mnc mncVar, pl3 pl3Var, iqb iqbVar, oxf oxfVar, nxf nxfVar, ld4 ld4Var, int i) {
        szh szhVar = oeVar.d;
        mncVar.getClass();
        pl3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(789999590);
        int i2 = i | (e18Var.f(oeVar) ? 4 : 2) | (e18Var.f(mncVar) ? 32 : 16) | (e18Var.f(pl3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(oxfVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(nxfVar) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            long j = szhVar.b() ? nxfVar.b : nxfVar.e;
            String str = oeVar.b;
            pz7 pz7Var = oeVar.c;
            e18Var.a0(-1019587300);
            zb0 zb0VarA = szhVar.a(e18Var);
            e18Var.p(false);
            boolean zB = szhVar.b();
            int i3 = i2 >> 3;
            rkj.c(fd9.q0(1476930191, new me(oeVar, j, 0), e18Var), str, szhVar.c, oeVar.e, iqbVar, pz7Var, zb0VarA, zB, nxfVar, oxfVar, mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(0L, gm3.a(e18Var).k, e18Var, 253), pl3Var, e18Var, ((i2 << 9) & 234881024) | 24582 | ((i2 << 15) & 1879048192), (i3 & 14) | 384, i3 & 112, 1042432);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(oeVar, mncVar, pl3Var, iqbVar, oxfVar, nxfVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy7 r22, defpackage.iqb r23, defpackage.e0g r24, long r25, long r27, defpackage.xo7 r29, defpackage.ta4 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmk.b(zy7, iqb, e0g, long, long, xo7, ta4, ld4, int, int):void");
    }

    public static final void c(final zy7 zy7Var, final iqb iqbVar, final e0g e0gVar, long j, long j2, xo7 xo7Var, final ta4 ta4Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        long jD;
        long jB;
        xo7 xo7Var2;
        e18 e18Var;
        final xo7 xo7Var3;
        final long j3;
        final long j4;
        int i4;
        int i5;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(748201188);
        if ((i & 6) == 0) {
            i3 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(e0gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jD = j;
                if (e18Var2.e(jD)) {
                    i5 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                }
                i3 |= i5;
            } else {
                jD = j;
            }
            i5 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
            i3 |= i5;
        } else {
            jD = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jB = j2;
                if (e18Var2.e(jB)) {
                    i4 = 16384;
                }
                i3 |= i4;
            } else {
                jB = j2;
            }
            i4 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
            i3 |= i4;
        } else {
            jB = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xo7Var2 = xo7Var;
                int i6 = e18Var2.f(xo7Var2) ? 131072 : 65536;
                i3 |= i6;
            } else {
                xo7Var2 = xo7Var;
            }
            i3 |= i6;
        } else {
            xo7Var2 = xo7Var;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= e18Var2.f(null) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.h(ta4Var) ? 8388608 : 4194304;
        }
        if (e18Var2.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                if ((i2 & 8) != 0) {
                    jD = p54.d(ac1.f, e18Var2);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jB = p54.b(jD, e18Var2);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    xo7Var2 = new xo7(ac1.g, ac1.j, ac1.h, ac1.i);
                }
            } else {
                e18Var2.T();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            long j5 = jD;
            long j6 = jB;
            xo7 xo7Var4 = xo7Var2;
            e18Var2.q();
            int i7 = i3 << 9;
            e18Var = e18Var2;
            d(zy7Var, bci.a(xzk.c, e18Var2), x41.d, iqbVar, e0gVar, j5, j6, xo7Var4, ta4Var, e18Var, (i3 & 14) | 3456 | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), (i3 >> 21) & 14);
            j4 = j5;
            j3 = j6;
            xo7Var3 = xo7Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            xo7Var3 = xo7Var2;
            j3 = jB;
            j4 = jD;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: cp7
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zmk.c(zy7Var, iqbVar, e0gVar, j4, j3, xo7Var3, ta4Var, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(final zy7 zy7Var, final tkh tkhVar, final float f, final iqb iqbVar, final e0g e0gVar, final long j, final long j2, final xo7 xo7Var, final ta4 ta4Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        e0g e0gVar2;
        ta4 ta4Var2;
        int i4;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(121669932);
        if ((i & 6) == 0) {
            i3 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(tkhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.c(f) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.c(56.0f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            e0gVar2 = e0gVar;
            i3 |= e18Var2.f(e0gVar2) ? 131072 : 65536;
        } else {
            e0gVar2 = e0gVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= e18Var2.f(xo7Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= e18Var2.f(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            ta4Var2 = ta4Var;
            i4 = i2 | (e18Var2.h(ta4Var2) ? 4 : 2);
        } else {
            ta4Var2 = ta4Var;
            i4 = i2;
        }
        int i5 = i3;
        boolean z = true;
        if (e18Var2.Q(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            e18Var2.a0(-282853233);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.f(e18Var2);
            }
            zub zubVar = (zub) objN;
            e18Var2.p(false);
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new hz6(8);
                e18Var2.k0(objN2);
            }
            iqb iqbVarB = tjf.b(iqbVar, false, (bz7) objN2);
            float f2 = xo7Var.a;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean zF = e18Var2.f(zubVar);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new ap7(xo7Var.a, xo7Var.b, xo7Var.d, xo7Var.c);
                e18Var2.k0(objN3);
            }
            ap7 ap7Var = (ap7) objN3;
            boolean zH = e18Var2.h(ap7Var);
            if (((i7 ^ 48) <= 32 || !e18Var2.f(xo7Var)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean z2 = zH | z;
            Object objN4 = e18Var2.N();
            if (z2 || objN4 == lz1Var) {
                objN4 = new ix5(ap7Var, xo7Var, null, 7);
                e18Var2.k0(objN4);
            }
            fd9.i(e18Var2, (pz7) objN4, xo7Var);
            boolean zF2 = e18Var2.f(zubVar) | e18Var2.h(ap7Var);
            Object objN5 = e18Var2.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = new t74(zubVar, ap7Var, (tp4) null, 23);
                e18Var2.k0(objN5);
            }
            fd9.i(e18Var2, (pz7) objN5, zubVar);
            final ta4 ta4Var3 = ta4Var2;
            int i8 = i5 >> 6;
            e18Var = e18Var2;
            pzg.c(zy7Var, iqbVarB, false, e0gVar2, j, j2, f2, ((va6) ap7Var.e.c.F.getValue()).E, null, zubVar, fd9.q0(-1779603465, new pz7() { // from class: dp7
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zh4.h(j2, tkhVar, fd9.q0(-1767363041, new fp7(f, ta4Var3), e18Var3), e18Var3, 384);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ep7
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    zmk.d(zy7Var, tkhVar, f, iqbVar, e0gVar, j, j2, xo7Var, ta4Var, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, e0g e0gVar, long j, long j2, xo7 xo7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(26608441);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(e0gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(xo7Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.h(ta4Var) ? 8388608 : 4194304;
        }
        if (e18Var2.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            e18Var = e18Var2;
            c(zy7Var, b.s(iqbVar, nv1.g, 40.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12), e0gVar, j, j2, xo7Var, ta4Var, e18Var, i3 & 33554318, 0);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bp7(zy7Var, iqbVar, e0gVar, j, j2, xo7Var, ta4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r41, defpackage.iqb r42, defpackage.bpc r43, long r44, long r46, defpackage.mnc r48, defpackage.qu1 r49, defpackage.e0g r50, defpackage.tkh r51, defpackage.ld4 r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmk.f(java.lang.String, iqb, bpc, long, long, mnc, qu1, e0g, tkh, ld4, int, int):void");
    }

    public static final zj6 g(zj6 zj6Var, String str) {
        String strLookupPrefix = ((Node) zj6Var.F).lookupPrefix("http://schemas.android.com/apk/res/android");
        strLookupPrefix.getClass();
        Object obj = null;
        al7 al7Var = new al7(bnf.V(new pp0(1, new ajj(zj6Var, null)), dah.K));
        while (true) {
            if (!al7Var.hasNext()) {
                break;
            }
            Object next = al7Var.next();
            zj6 zj6Var2 = (zj6) next;
            String namespaceURI = ((Node) zj6Var2.F).getNamespaceURI();
            namespaceURI.getClass();
            if (namespaceURI.equals("http://schemas.android.com/aapt")) {
                String localName = ((Node) zj6Var2.F).getLocalName();
                localName.getClass();
                if (localName.equals("attr")) {
                    String attribute = zj6Var2.G.getAttribute("name");
                    attribute.getClass();
                    if (attribute.equals(strLookupPrefix + ":" + str)) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (zj6) obj;
    }

    public static final String h(zj6 zj6Var, String str) {
        zj6Var.getClass();
        String attributeNS = zj6Var.G.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        attributeNS.getClass();
        if (bsg.I0(attributeNS)) {
            return null;
        }
        return attributeNS;
    }

    public static void i(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void j(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final ArrayList k(String str) {
        List listX0 = bsg.X0(bsg.g1(str, '-'), new char[]{'.'}, 6);
        ArrayList arrayList = new ArrayList(x44.y(listX0, 10));
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            Integer numS0 = isg.s0((String) it.next());
            arrayList.add(Integer.valueOf(numS0 != null ? numS0.intValue() : 0));
        }
        return arrayList;
    }

    public static iqb l(oge ogeVar, iqb iqbVar, zy7 zy7Var) {
        p9d p9dVar = p9d.R;
        ogeVar.getClass();
        iqbVar.getClass();
        zy7Var.getClass();
        return kxk.p(iqbVar, new nge(ogeVar, p9dVar, zy7Var));
    }

    public static final cpc[] m(zj6 zj6Var) {
        List listE0 = bnf.e0(bnf.V(bnf.V(new pp0(1, new ajj(zj6Var, null)), dah.L), new f9j(6)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listE0) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            zj6 zj6Var2 = (zj6) obj;
            float f = i;
            int size = listE0.size() - 1;
            if (size < 1) {
                size = 1;
            }
            float f2 = f / size;
            String strH = h(zj6Var2, "offset");
            if (strH != null) {
                f2 = Float.parseFloat(strH);
            }
            String strH2 = h(zj6Var2, "color");
            cpc cpcVar = strH2 != null ? new cpc(Float.valueOf(f2), new d54(d4c.m(hvj.m(strH2)))) : null;
            if (cpcVar != null) {
                arrayList.add(cpcVar);
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            String strH3 = h(zj6Var, "startColor");
            Integer numValueOf = strH3 != null ? Integer.valueOf(hvj.m(strH3)) : null;
            String strH4 = h(zj6Var, "centerColor");
            Integer numValueOf2 = strH4 != null ? Integer.valueOf(hvj.m(strH4)) : null;
            String strH5 = h(zj6Var, "endColor");
            Integer numValueOf3 = strH5 != null ? Integer.valueOf(hvj.m(strH5)) : null;
            if (numValueOf != null) {
                arrayList.add(new cpc(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), new d54(d4c.m(numValueOf.intValue()))));
            }
            if (numValueOf2 != null) {
                arrayList.add(new cpc(Float.valueOf(0.5f), new d54(d4c.m(numValueOf2.intValue()))));
            }
            if (numValueOf3 != null) {
                arrayList.add(new cpc(Float.valueOf(1.0f), new d54(d4c.m(numValueOf3.intValue()))));
            }
        }
        return (cpc[]) arrayList.toArray(new cpc[0]);
    }

    public static final rzf n(zj6 zj6Var) {
        Object next;
        String strH;
        al7 al7Var = new al7(bnf.V(new pp0(1, new ajj(zj6Var, null)), dah.M));
        while (true) {
            if (!al7Var.hasNext()) {
                next = null;
                break;
            }
            next = al7Var.next();
            String nodeName = ((Node) ((zj6) next).F).getNodeName();
            nodeName.getClass();
            if (nodeName.equals("gradient")) {
                break;
            }
        }
        zj6 zj6Var2 = (zj6) next;
        if (zj6Var2 != null && (strH = h(zj6Var2, "type")) != null) {
            int iHashCode = strH.hashCode();
            int i = 0;
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (iHashCode != -1102672091) {
                if (iHashCode != -938579425) {
                    if (iHashCode == 109850348 && strH.equals("sweep")) {
                        cpc[] cpcVarArrM = m(zj6Var2);
                        cpc[] cpcVarArr = (cpc[]) Arrays.copyOf(cpcVarArrM, cpcVarArrM.length);
                        String strH2 = h(zj6Var2, "centerX");
                        float f2 = strH2 != null ? Float.parseFloat(strH2) : 0.0f;
                        String strH3 = h(zj6Var2, "centerY");
                        if (strH3 != null) {
                            f = Float.parseFloat(strH3);
                        }
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                        ArrayList arrayList = new ArrayList(cpcVarArr.length);
                        for (cpc cpcVar : cpcVarArr) {
                            arrayList.add(new d54(((d54) cpcVar.F).a));
                        }
                        int length = cpcVarArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i < length) {
                            arrayList2.add(Float.valueOf(((Number) cpcVarArr[i].E).floatValue()));
                            i++;
                        }
                        return new l0h(jFloatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (strH.equals("radial")) {
                    cpc[] cpcVarArrM2 = m(zj6Var2);
                    cpc[] cpcVarArr2 = (cpc[]) Arrays.copyOf(cpcVarArrM2, cpcVarArrM2.length);
                    String strH4 = h(zj6Var2, "centerX");
                    float f3 = strH4 != null ? Float.parseFloat(strH4) : 0.0f;
                    String strH5 = h(zj6Var2, "centerY");
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(strH5 != null ? Float.parseFloat(strH5) : 0.0f)) & 4294967295L);
                    String strH6 = h(zj6Var2, "gradientRadius");
                    if (strH6 != null) {
                        f = Float.parseFloat(strH6);
                    }
                    float f4 = f;
                    String strH7 = h(zj6Var2, "tileMode");
                    int iO = strH7 != null ? hvj.o(strH7) : 0;
                    ArrayList arrayList3 = new ArrayList(cpcVarArr2.length);
                    for (cpc cpcVar2 : cpcVarArr2) {
                        arrayList3.add(new d54(((d54) cpcVar2.F).a));
                    }
                    int length2 = cpcVarArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i < length2) {
                        arrayList4.add(Float.valueOf(((Number) cpcVarArr2[i].E).floatValue()));
                        i++;
                    }
                    return new w0e(arrayList3, arrayList4, jFloatToRawIntBits2, f4, iO);
                }
            } else if (strH.equals("linear")) {
                cpc[] cpcVarArrM3 = m(zj6Var2);
                cpc[] cpcVarArr3 = (cpc[]) Arrays.copyOf(cpcVarArrM3, cpcVarArrM3.length);
                String strH8 = h(zj6Var2, "startX");
                float f5 = strH8 != null ? Float.parseFloat(strH8) : 0.0f;
                String strH9 = h(zj6Var2, "startY");
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(strH9 != null ? Float.parseFloat(strH9) : 0.0f)) & 4294967295L);
                String strH10 = h(zj6Var2, "endX");
                float f6 = strH10 != null ? Float.parseFloat(strH10) : 0.0f;
                String strH11 = h(zj6Var2, "endY");
                if (strH11 != null) {
                    f = Float.parseFloat(strH11);
                }
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f6)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)));
                String strH12 = h(zj6Var2, "tileMode");
                int iO2 = strH12 != null ? hvj.o(strH12) : 0;
                ArrayList arrayList5 = new ArrayList(cpcVarArr3.length);
                for (cpc cpcVar3 : cpcVarArr3) {
                    arrayList5.add(new d54(((d54) cpcVar3.F).a));
                }
                int length3 = cpcVarArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i < length3) {
                    arrayList6.add(Float.valueOf(((Number) cpcVarArr3[i].E).floatValue()));
                    i++;
                }
                return new g6a(iO2, jFloatToRawIntBits3, jFloatToRawIntBits4, arrayList5, arrayList6);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.zj6 r22, defpackage.oy8 r23, defpackage.d80 r24) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmk.o(zj6, oy8, d80):void");
    }
}
