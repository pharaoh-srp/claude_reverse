package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xvk {
    public static final ta4 a = new ta4(2048739146, false, new ic4(15));
    public static final ta4 b = new ta4(1583694801, false, new lc4(9));
    public static final ta4 c = new ta4(1109668818, false, new lc4(10));

    public static final void a(iqb iqbVar, ote oteVar, rz7 rz7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        rz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(492092787);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(oteVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? e18Var.f(null) : e18Var.h(null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            if (i5 != 0) {
                oteVar = null;
            }
            rw7.c(fd9.q0(1569935176, new m6(oteVar, iqbVar, rz7Var, 13), e18Var), e18Var, 6);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        ote oteVar2 = oteVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(iqbVar2, oteVar2, rz7Var, i, i2);
        }
    }

    public static final void b(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1162635549);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            j8.c(uif.a.a(null), ta4Var, e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tte(ta4Var, i);
        }
    }

    public static final void c(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        int i3;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i5 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            iqb iqbVar3 = i4 != 0 ? fqb.E : iqbVar;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            ohf ohfVar = (ohf) nwbVar.getValue();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new shf(i5, nwbVar);
                e18Var.k0(objN2);
            }
            d(iqbVar3, ohfVar, (bz7) objN2, ta4Var, e18Var, (i3 & 14) | 384 | ((i3 << 6) & 7168));
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i, i2, 7, iqbVar2, ta4Var);
        }
    }

    public static final void d(iqb iqbVar, ohf ohfVar, bz7 bz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-917932944);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(ohfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (objN == lz1Var) {
                ucf ucfVar = new ucf(8);
                e18Var.k0(ucfVar);
                obj = ucfVar;
            }
            tif tifVar = (tif) iuj.K(objArr, tif.l, (zy7) obj, e18Var, 384);
            Object objN2 = e18Var.N();
            Object obj2 = objN2;
            if (objN2 == lz1Var) {
                mif mifVar = new mif(tifVar);
                e18Var.k0(mifVar);
                obj2 = mifVar;
            }
            mif mifVar2 = (mif) obj2;
            op3 op3Var = (op3) e18Var.j(ve4.f);
            Object objN3 = e18Var.N();
            Object obj3 = objN3;
            if (objN3 == lz1Var) {
                l45 l45VarO = fd9.O(im6.E, e18Var);
                e18Var.k0(l45VarO);
                obj3 = l45VarO;
            }
            l45 l45Var = (l45) obj3;
            mifVar2.e = (gf8) e18Var.j(ve4.l);
            boolean zF = e18Var.f(l45Var) | e18Var.f(op3Var);
            Object objN4 = e18Var.N();
            Object obj4 = objN4;
            if (zF || objN4 == lz1Var) {
                b4b b4bVar = new b4b(l45Var, 28, op3Var);
                e18Var.k0(b4bVar);
                obj4 = b4bVar;
            }
            mifVar2.f = (bz7) obj4;
            mifVar2.g = (wkh) e18Var.j(ve4.s);
            mifVar2.d = new b4b(mifVar2, 29, bz7Var);
            mifVar2.r(ohfVar);
            e18Var.a0(-82280708);
            mifVar2.x = q5d.b(mhf.F, null, e18Var, 54);
            mifVar2.w = l45Var;
            e18Var.p(false);
            mifVar2.m();
            int i6 = 5;
            c35 c35Var = new c35(mifVar2, i6, new rhf(mifVar2, i3));
            iqb iqbVarP = fqb.E;
            int i7 = 13;
            iqb iqbVarM = dch.M(a0h.a(ez1.C(u00.C(iv1.s(xn5.p0(a0h.a(iqbVarP, iei.a, c35Var), new uhf(mifVar2, i4)), mifVar2.i), new uhf(mifVar2, i6)), null, 3), 8675309, new zo4(true ? 1 : 0, new uhf(mifVar2, 6))), new u3a(i7, mifVar2));
            if (mifVar2.i() != null && mifVar2.l()) {
                ohf ohfVarJ = mifVar2.j();
                if (!(ohfVarJ != null ? x44.r(ohfVarJ.a, ohfVarJ.b) : true) && ipa.a()) {
                    iqbVarP = kxk.p(iqbVarP, new lca(i7, mifVar2));
                }
            }
            iqb iqbVarB = iqbVarM.B(iqbVarP);
            if (knk.j) {
                iqbVarB = uwj.b(iqbVarB, new ska(23, mifVar2));
            }
            d4c.A(iqbVar.B(iqbVarB), fd9.q0(-1799563674, new thf(mifVar2, tifVar, ta4Var), e18Var), e18Var, 48);
            boolean zH = e18Var.h(mifVar2);
            Object objN5 = e18Var.N();
            Object obj5 = objN5;
            if (zH || objN5 == lz1Var) {
                uhf uhfVar = new uhf(mifVar2, i5);
                e18Var.k0(uhfVar);
                obj5 = uhfVar;
            }
            fd9.d(mifVar2, (bz7) obj5, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(iqbVar, ohfVar, bz7Var, ta4Var, i);
        }
    }

    public static ArrayList e(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * MathMethodsKt.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final McpServer f(String str, List list) {
        String strH;
        list.getClass();
        Object obj = null;
        if (str == null || (strH = h(str)) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String url = ((McpServer) next).getUrl();
            if (x44.r(url != null ? h(url) : null, strH)) {
                obj = next;
                break;
            }
        }
        return (McpServer) obj;
    }

    public static long g(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? yr6.INVALID_OWNERSHIP << (i4 & 1) : i5 == 3 ? 60000 : yr6.INVALID_OWNERSHIP << i5));
    }

    public static final String h(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        return bsg.n1(ij0.n(locale, str, locale), '/');
    }

    public static final Object i(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = w44.t1(dxf.q0(set, r4));
            }
            return w44.f1(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (x44.r(r1, r2) && x44.r(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    public static final void j(int i) {
        throw new SerializationException(grc.p(i, "An unknown field for index "));
    }
}
