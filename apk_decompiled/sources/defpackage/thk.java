package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class thk {
    public static final ta4 a = new ta4(216592251, false, new ya4(7));
    public static final Object b = new Object();
    public static z5j c;

    public static final void a(final String str, final iqb iqbVar, nf2 nf2Var, final tkh tkhVar, final long j, ld4 ld4Var, int i) throws IOException {
        nf2 nf2Var2;
        nf2 nf2Var3;
        int i2;
        lz1 lz1Var;
        int i3;
        String strP;
        int i4;
        Long lK;
        final boolean z;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1212079905);
        int i5 = (i & 6) == 0 ? (e18Var.f(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i6 = i5 | 384;
        if ((i & 3072) == 0) {
            i6 |= e18Var.f(tkhVar) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i6 |= e18Var.e(j) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i6 & 1, (i6 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                nf2Var3 = nf2.E;
            } else {
                e18Var.T();
                nf2Var3 = nf2Var;
            }
            e18Var.q();
            wt7 wt7Var = (wt7) e18Var.j(ve4.k);
            umg umgVar = ve4.h;
            cz5 cz5Var = (cz5) e18Var.j(umgVar);
            fu9 fu9Var = (fu9) e18Var.j(ve4.n);
            boolean zF = e18Var.f(wt7Var) | e18Var.f(cz5Var) | e18Var.d(fu9Var.ordinal()) | e18Var.d(8);
            Object objN = e18Var.N();
            lz1 lz1Var2 = jd4.a;
            if (zF || objN == lz1Var2) {
                objN = new fkh(wt7Var, cz5Var, fu9Var, 8);
                e18Var.k0(objN);
            }
            fkh fkhVar = (fkh) objN;
            cz5 cz5Var2 = (cz5) e18Var.j(umgVar);
            boolean zF2 = ((((i6 & 7168) ^ 3072) > 2048 && e18Var.f(tkhVar)) || (i6 & 3072) == 2048) | e18Var.f(fkhVar) | e18Var.f(cz5Var2);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var2) {
                pi2 pi2Var = (pi2) new qi2('0', '9').iterator();
                if (!pi2Var.G) {
                    pmf.d();
                    return;
                }
                i2 = i6;
                pi2 pi2Var2 = pi2Var;
                lz1Var = lz1Var2;
                Integer numValueOf = Integer.valueOf((int) (fkh.a(fkhVar, new zb0(String.valueOf(pi2Var.a())), tkhVar, false, 0, 0L, null, null, null, 2044).c >> 32));
                while (pi2Var2.G) {
                    Integer num = numValueOf;
                    pi2 pi2Var3 = pi2Var2;
                    numValueOf = Integer.valueOf((int) (fkh.a(fkhVar, new zb0(String.valueOf(pi2Var2.a())), tkhVar, false, 0, 0L, null, null, null, 2044).c >> 32));
                    if (num.compareTo(numValueOf) >= 0) {
                        numValueOf = num;
                    }
                    pi2Var2 = pi2Var3;
                }
                objN2 = new va6(cz5Var2.c0(numValueOf.intValue()));
                e18Var.k0(objN2);
            } else {
                i2 = i6;
                lz1Var = lz1Var2;
            }
            final float f = ((va6) objN2).E;
            boolean z2 = (i2 & 14) == 4;
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < str.length()) {
                    if (j(str.charAt(i7))) {
                        int i8 = i7 + 1;
                        while (i8 < str.length()) {
                            if (j(str.charAt(i8))) {
                                i8++;
                            } else if (!bsg.v0(",.  '", str.charAt(i8)) || (i4 = i8 + 1) >= str.length() || !j(str.charAt(i4))) {
                                break;
                            } else {
                                i8 += 2;
                            }
                        }
                        if (sb.length() > 0) {
                            arrayList.add(new gac(sb.toString()));
                            sb.setLength(0);
                        }
                        arrayList.add(new fac(str.substring(i7, i8)));
                        i7 = i8;
                    } else {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(new gac(sb.toString()));
                }
                mva mvaVar = new mva(arrayList);
                ArrayList arrayList2 = new ArrayList(x44.y(mvaVar, 10));
                Iterator it = mvaVar.iterator();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    ListIterator listIterator = ((fse) it).E;
                    if (!listIterator.hasPrevious()) {
                        mva mvaVar2 = new mva(arrayList2);
                        e18Var.k0(mvaVar2);
                        objN3 = mvaVar2;
                        break;
                    }
                    Object objPrevious = listIterator.previous();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        x44.n0();
                        throw null;
                    }
                    hac hacVar = (hac) objPrevious;
                    if (hacVar instanceof fac) {
                        i3 = i9 + 1;
                        strP = grc.p(i9, "number");
                    } else if (!(hacVar instanceof gac)) {
                        wg6.i();
                        return;
                    } else {
                        i3 = i9;
                        strP = grc.p(i10, "plain");
                        i10++;
                    }
                    arrayList2.add(new qag(i11, hacVar, strP));
                    i11 = i12;
                    i9 = i3;
                }
            }
            List list = (List) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN4);
            }
            nwb nwbVar = (nwb) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new ve(22, nwbVar);
                e18Var.k0(objN5);
            }
            fd9.s((zy7) objN5, e18Var);
            int iOrdinal = nf2Var3.ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(872708484);
                Object objN6 = e18Var.N();
                Object obj = objN6;
                if (objN6 == lz1Var) {
                    d81 d81Var = new d81();
                    d81Var.a = nm6.E;
                    d81Var.b = true;
                    e18Var.k0(d81Var);
                    obj = d81Var;
                }
                d81 d81Var2 = (d81) obj;
                boolean zF3 = e18Var.f(list);
                Object objN7 = e18Var.N();
                if (zF3 || objN7 == lz1Var) {
                    ArrayList<qag> arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((qag) obj2).b instanceof fac) {
                            arrayList3.add(obj2);
                        }
                    }
                    int iD0 = tta.d0(x44.y(arrayList3, 10));
                    if (iD0 < 16) {
                        iD0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                    for (qag qagVar : arrayList3) {
                        linkedHashMap.put(qagVar.a, ((hac) qagVar.b).getText());
                    }
                    Map map = d81Var2.a;
                    d81Var2.a = linkedHashMap;
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        String str4 = (String) map.get(str2);
                        if (str4 != null && (lK = k(str4)) != null) {
                            long jLongValue = lK.longValue();
                            Long lK2 = k(str3);
                            if (lK2 != null) {
                                long jLongValue2 = lK2.longValue();
                                if (jLongValue2 != jLongValue) {
                                    d81Var2.b = jLongValue2 > jLongValue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    objN7 = Boolean.valueOf(d81Var2.b);
                    e18Var.k0(objN7);
                }
                boolean zBooleanValue = ((Boolean) objN7).booleanValue();
                e18Var.p(false);
                z = zBooleanValue;
            } else if (iOrdinal == 1) {
                e18Var.a0(1284236874);
                e18Var.p(false);
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw ebh.u(e18Var, 872706634, false);
                }
                e18Var.a0(1284285519);
                e18Var.p(false);
                z = false;
            }
            final List listL = l(list, ((Boolean) nwbVar.getValue()).booleanValue(), e18Var);
            j8.c(ve4.n.a(fu9.E), fd9.q0(-1910300063, new pz7() { // from class: if2
                @Override // defpackage.pz7
                public final Object invoke(Object obj3, Object obj4) {
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    int i13 = 2;
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        iqb iqbVarW = xn5.W(iqbVar);
                        String str5 = str;
                        boolean zF4 = e18Var2.f(str5);
                        Object objN8 = e18Var2.N();
                        if (zF4 || objN8 == jd4.a) {
                            objN8 = new o8(str5, 27);
                            e18Var2.k0(objN8);
                        }
                        iqb iqbVarA = tjf.a(iqbVarW, (bz7) objN8);
                        cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
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
                        e18Var2.a0(705771124);
                        for (e6i e6iVar : listL) {
                            e18Var2.X(1753002034, e6iVar.a);
                            swb swbVar = e6iVar.d;
                            yig yigVarN = thk.n();
                            boolean z3 = z;
                            wd6.J(swbVar, xn5.W(kxk.p(fqb.E, new p6(10))), gp6.m(yigVarN, new q8(z3, 18)).a(gp6.e(thk.m(), i13)), gp6.o(thk.n(), new q8(z3, 16)).a(gp6.f(thk.m(), i13)), null, fd9.q0(1116430182, new kf2(e6iVar, z3, tkhVar, j, f), e18Var2), e18Var2, 1572870, 16);
                            e18Var2.p(false);
                            i13 = 2;
                        }
                        e18Var2.p(false);
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            nf2Var2 = nf2Var3;
        } else {
            e18Var.T();
            nf2Var2 = nf2Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jf2(str, iqbVar, nf2Var2, tkhVar, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r19, int r20, defpackage.ld4 r21, defpackage.zy7 r22, defpackage.iqb r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thk.b(int, int, ld4, zy7, iqb, boolean):void");
    }

    public static final void c(final String str, final boolean z, final tkh tkhVar, final long j, final float f, ld4 ld4Var, final int i) {
        e18 e18Var;
        boolean z2;
        boolean z3 = z;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-386048136);
        int i2 = 2;
        tkh tkhVar2 = tkhVar;
        long j2 = j;
        float f2 = f;
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.g(z3) ? 32 : 16) | (e18Var2.f(tkhVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.e(j2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.c(f2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                z2 = true;
                objN2 = new ve(23, nwbVar);
                e18Var2.k0(objN2);
            } else {
                z2 = true;
            }
            fd9.s((zy7) objN2, e18Var2);
            boolean z4 = (i3 & 14) == 4 ? z2 : false;
            Object objN3 = e18Var2.N();
            if (z4 || objN3 == lz1Var) {
                ArrayList arrayList = new ArrayList(str.length());
                int length = str.length() - 1;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = length - 1;
                        char cCharAt = str.charAt(length);
                        if (j(cCharAt)) {
                            arrayList.add(new qag((i4 * 2) + 1, Character.valueOf(cCharAt), grc.p(i4, "d")));
                            i4++;
                        } else {
                            arrayList.add(new qag(i4 * 2, Character.valueOf(cCharAt), grc.p(i4, "s")));
                        }
                        if (i5 < 0) {
                            break;
                        } else {
                            length = i5;
                        }
                    }
                }
                objN3 = new ese(arrayList);
                e18Var2.k0(objN3);
            }
            List<e6i> listL = l((List) objN3, ((Boolean) nwbVar.getValue()).booleanValue(), e18Var2);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
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
            e18Var2.a0(-441970282);
            for (e6i e6iVar : listL) {
                e18Var2.X(633813856, e6iVar.a);
                swb swbVar = e6iVar.d;
                wp6 wp6VarA = gp6.m(n(), new q8(z3, 18)).a(gp6.e(m(), i2));
                d77 d77VarA = gp6.o(n(), new q8(z3, 16)).a(gp6.f(m(), i2));
                iqb iqbVarW = xn5.W(kxk.p(fqbVar, new p6(10)));
                ta4 ta4VarQ0 = fd9.q0(436715859, new kf2(e6iVar, z, f2, j2, tkhVar2), e18Var2);
                e18 e18Var3 = e18Var2;
                wd6.J(swbVar, iqbVarW, wp6VarA, d77VarA, null, ta4VarQ0, e18Var3, 1572870, 16);
                e18Var3.p(false);
                z3 = z;
                j2 = j;
                f2 = f;
                e18Var2 = e18Var3;
                i2 = 2;
                tkhVar2 = tkhVar;
            }
            e18Var = e18Var2;
            e18Var.p(false);
            e18Var.p(z2);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, z, tkhVar, j, f, i) { // from class: lf2
                public final /* synthetic */ String E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ tkh G;
                public final /* synthetic */ long H;
                public final /* synthetic */ float I;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    thk.c(this.E, this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1306581204);
        int i2 = i | (e18Var2.h(zy7Var) ? 4 : 2) | (e18Var2.h(zy7Var2) ? 32 : 16);
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            trk.b(zy7Var2, fd9.q0(1749018383, new sxa(zy7Var, 26, b2), e18Var2), null, fd9.q0(1818666257, new sxa(zy7Var2, 27, b2), e18Var2), fuk.a, fuk.b, null, 0L, 0L, 0L, 0L, null, e18Var, ((i2 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, 8, zy7Var, zy7Var2);
        }
    }

    public static final Locale e(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (x44.r(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    public static void f(Context context) {
        if (c == null) {
            z5j z5jVar = new z5j(context);
            c = z5jVar;
            synchronized (z5jVar.a) {
                z5jVar.g = true;
            }
        }
    }

    public static void g(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [ft6] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [at6] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [qs6] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static vs6 h(qh9 qh9Var) {
        vs6 vs6Var;
        String strM;
        String strM2;
        String strM3;
        int[] iArrH;
        int length;
        int i;
        ArrayList arrayList;
        String str;
        int i2;
        Boolean bool;
        int i3;
        int i4;
        ?? r17;
        ?? arrayList2;
        String strM4;
        String strM5;
        String strM6;
        try {
            bh9 bh9VarS = qh9Var.s("id");
            strM = bh9VarS != null ? bh9VarS.m() : null;
            strM2 = qh9Var.s("message").m();
            strM3 = qh9Var.s("source").m();
            strM3.getClass();
            iArrH = sq6.H(8);
            length = iArrH.length;
            i = 0;
        } catch (IllegalStateException e) {
            e = e;
            vs6Var = null;
        } catch (NullPointerException e2) {
            e = e2;
            vs6Var = null;
        } catch (NumberFormatException e3) {
            e = e3;
            vs6Var = null;
        }
        while (i < length) {
            int[] iArr = iArrH;
            int i5 = iArr[i];
            if (ms6.p(i5).equals(strM3)) {
                bh9 bh9VarS2 = qh9Var.s("stack");
                String strM7 = bh9VarS2 != null ? bh9VarS2.m() : null;
                bh9 bh9VarS3 = qh9Var.s("causes");
                if (bh9VarS3 != null) {
                    ArrayList arrayList3 = bh9VarS3.e().E;
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(me7.e(((bh9) it.next()).g()));
                    }
                } else {
                    arrayList = null;
                }
                bh9 bh9VarS4 = qh9Var.s("is_crash");
                Boolean boolValueOf = bh9VarS4 != null ? Boolean.valueOf(bh9VarS4.a()) : null;
                bh9 bh9VarS5 = qh9Var.s("fingerprint");
                String strM8 = bh9VarS5 != null ? bh9VarS5.m() : null;
                bh9 bh9VarS6 = qh9Var.s("type");
                String strM9 = bh9VarS6 != null ? bh9VarS6.m() : null;
                bh9 bh9VarS7 = qh9Var.s("category");
                if (bh9VarS7 != null && (strM6 = bh9VarS7.m()) != null) {
                    int[] iArrH2 = sq6.H(6);
                    int length2 = iArrH2.length;
                    str = null;
                    for (int i6 = 0; i6 < length2; i6++) {
                        i2 = iArrH2[i6];
                        if (!qy1.b(i2).equals(strM6)) {
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                str = null;
                i2 = 0;
                bh9 bh9VarS8 = qh9Var.s("handling");
                if (bh9VarS8 != null && (strM5 = bh9VarS8.m()) != null) {
                    int[] iArrH3 = sq6.H(2);
                    int length3 = iArrH3.length;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = iArrH3[i7];
                        bool = boolValueOf;
                        if (ms6.q(i8).equals(strM5)) {
                            i3 = i8;
                        } else {
                            i7++;
                            boolValueOf = bool;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                bool = boolValueOf;
                i3 = 0;
                bh9 bh9VarS9 = qh9Var.s("handling_stack");
                String strM10 = bh9VarS9 != null ? bh9VarS9.m() : str;
                bh9 bh9VarS10 = qh9Var.s("source_type");
                if (bh9VarS10 != null && (strM4 = bh9VarS10.m()) != null) {
                    int[] iArrH4 = sq6.H(13);
                    int length4 = iArrH4.length;
                    int i9 = 0;
                    while (i9 < length4) {
                        int i10 = iArrH4[i9];
                        int[] iArr2 = iArrH4;
                        if (ms6.j(i10).equals(strM4)) {
                            i4 = i10;
                        } else {
                            i9++;
                            iArrH4 = iArr2;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                i4 = 0;
                bh9 bh9VarS11 = qh9Var.s("resource");
                Object objD = bh9VarS11 != null ? jik.d(bh9VarS11.g()) : str;
                bh9 bh9VarS12 = qh9Var.s("threads");
                if (bh9VarS12 != null) {
                    ArrayList arrayList4 = bh9VarS12.e().E;
                    ArrayList arrayList5 = new ArrayList(arrayList4.size());
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(nik.f(((bh9) it2.next()).g()));
                    }
                    r17 = arrayList5;
                } else {
                    r17 = str;
                }
                bh9 bh9VarS13 = qh9Var.s("binary_images");
                if (bh9VarS13 != null) {
                    ArrayList arrayList6 = bh9VarS13.e().E;
                    arrayList2 = new ArrayList(arrayList6.size());
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(mwj.g(((bh9) it3.next()).g()));
                    }
                } else {
                    arrayList2 = str;
                }
                bh9 bh9VarS14 = qh9Var.s("was_truncated");
                ?? ValueOf = bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : str;
                bh9 bh9VarS15 = qh9Var.s("meta");
                ?? E = bh9VarS15 != null ? bik.e(bh9VarS15.g()) : str;
                bh9 bh9VarS16 = qh9Var.s("csp");
                ?? F = bh9VarS16 != null ? kzj.f(bh9VarS16.g()) : str;
                bh9 bh9VarS17 = qh9Var.s("time_since_app_start");
                ?? ValueOf2 = bh9VarS17 != null ? Long.valueOf(bh9VarS17.k()) : str;
                strM2.getClass();
                return new vs6(strM, strM2, i5, strM7, arrayList, bool, strM8, strM9, i2, i3, strM10, i4, objD, r17, arrayList2, ValueOf, E, F, ValueOf2);
            }
            try {
                vs6Var = null;
                i++;
                iArrH = iArr;
            } catch (IllegalStateException e4) {
                e = e4;
            } catch (NullPointerException e5) {
                e = e5;
                pmf.j("Unable to parse json into type Error", e);
                return vs6Var;
            } catch (NumberFormatException e6) {
                e = e6;
                pmf.j("Unable to parse json into type Error", e);
                return vs6Var;
            }
            pmf.j("Unable to parse json into type Error", e);
            return vs6Var;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static ywi i(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("score").l();
            bh9 bh9VarS = qh9Var.s("timestamp");
            Long lValueOf = bh9VarS != null ? Long.valueOf(bh9VarS.k()) : null;
            bh9 bh9VarS2 = qh9Var.s("target_selector");
            String strM = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("previous_rect");
            axi axiVarH = bh9VarS3 != null ? yhk.h(bh9VarS3.g()) : null;
            bh9 bh9VarS4 = qh9Var.s("current_rect");
            axi axiVarH2 = bh9VarS4 != null ? yhk.h(bh9VarS4.g()) : null;
            numberL.getClass();
            return new ywi(numberL, lValueOf, strM, axiVarH, axiVarH2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type PerformanceCls", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type PerformanceCls", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type PerformanceCls", e3);
            return null;
        }
    }

    public static final boolean j(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public static final Long k(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (j(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return isg.t0(string);
        }
        return null;
    }

    public static final List l(List list, boolean z, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new ArrayList();
            e18Var.k0(objN);
        }
        List list2 = (List) objN;
        boolean zF = e18Var.f(list);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            b54.w0(new c32(23), list2);
            List<qag> list3 = list;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((qag) it.next()).a);
            }
            List<e6i> list4 = list2;
            for (e6i e6iVar : list4) {
                if (!linkedHashSet.contains(e6iVar.a)) {
                    e6iVar.d.M0(Boolean.FALSE);
                }
            }
            int iD0 = tta.d0(x44.y(list4, 10));
            if (iD0 < 16) {
                iD0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
            for (Object obj : list4) {
                linkedHashMap.put(((e6i) obj).a, obj);
            }
            for (qag qagVar : list3) {
                String str = qagVar.a;
                int i = qagVar.c;
                Object obj2 = qagVar.b;
                e6i e6iVar2 = (e6i) linkedHashMap.get(str);
                if (e6iVar2 != null) {
                    e6iVar2.b.setValue(obj2);
                    e6iVar2.c = i;
                    e6iVar2.d.M0(Boolean.TRUE);
                } else {
                    list2.add(new e6i(qagVar.a, true ^ z, i, obj2));
                }
            }
            if (list2.size() > 1) {
                a54.s0(list2, new mt7(13));
            }
            objN2 = w44.p1(list4);
            e18Var.k0(objN2);
        }
        return (List) objN2;
    }

    public static final z8i m() {
        return kxk.N(130, 0, null, 6);
    }

    public static final yig n() {
        return kxk.K(0.9f, 380.0f, null, 4);
    }

    public static ComponentName o(Context context, Intent intent) {
        synchronized (b) {
            try {
                f(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
