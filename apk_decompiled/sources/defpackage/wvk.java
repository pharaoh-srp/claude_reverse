package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wvk {
    public static final ta4 a = new ta4(1327322666, false, new lc4(5));

    static {
        new ta4(-1673515138, false, new lc4(6));
        new ta4(-388760746, false, new lc4(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cte r13, defpackage.jz0 r14, defpackage.lo3 r15, defpackage.eua r16, defpackage.s6a r17, defpackage.kwa r18, defpackage.dua r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvk.a(cte, jz0, lo3, eua, s6a, kwa, dua, ld4, int, int):void");
    }

    public static final void b(cte cteVar, jz0 jz0Var, ld4 ld4Var, int i) {
        r7e r7eVarS;
        ze1 ze1Var;
        cte cteVar2 = cteVar;
        cteVar2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1867380426);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (e18Var.f(cteVar2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= e18Var.f(jz0Var) ? 32 : 16;
        }
        int i4 = 1;
        int i5 = 0;
        if (!e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var.T();
        } else {
            if (jz0Var == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    ze1Var = new ze1(cteVar2, jz0Var, i, i5);
                    r7eVarS.d = ze1Var;
                }
                return;
            }
            nz0 nz0Var = jz0Var.a;
            if (nz0Var instanceof vy0) {
                e18Var.a0(-743735225);
                o(cteVar2, jz0Var, e18Var, i3 & 126);
                e18Var.p(false);
            } else if (nz0Var instanceof ry0) {
                e18Var.a0(-1580896097);
                ur1.a(cteVar2, fd9.q0(-957810462, new af1(jz0Var, i5), e18Var), e18Var, (i3 & 14) | 48);
                e18Var.p(false);
            } else {
                if (nz0Var instanceof b01) {
                    e18Var.a0(-1580763014);
                    rw7.a(cteVar2, paa.F, bnf.e0(xb5.h(jz0Var, hr0.G)), 0, ovj.a, e18Var, (i3 & 14) | 24624, 4);
                    e18Var = e18Var;
                    e18Var.p(false);
                } else if (nz0Var instanceof oz0) {
                    e18Var.a0(-1580256784);
                    cteVar2 = cteVar;
                    rw7.a(cteVar2, paa.E, bnf.e0(xb5.g(jz0Var, false)), ((oz0) nz0Var).a - 1, ovj.b, e18Var, (i3 & 14) | 24624, 0);
                    e18Var = e18Var;
                    e18Var.p(false);
                } else {
                    cteVar2 = cteVar;
                    if (nz0Var instanceof a01) {
                        e18Var.a0(-1579723088);
                        wsk.b(cteVar2, e18Var, i3 & 14);
                        e18Var.p(false);
                    } else if (nz0Var instanceof zy0) {
                        e18Var.a0(-1579653214);
                        rta.c(cteVar2, ((zy0) nz0Var).a, fd9.q0(267970566, new af1(jz0Var, i4), e18Var), e18Var, (i3 & 14) | 384);
                        e18Var.p(false);
                    } else if (nz0Var instanceof dz0) {
                        e18Var.a0(-1579463494);
                        dua duaVar = (dua) e18Var.j(yq3.a);
                        if (duaVar != null) {
                            e18Var.a0(-1579376012);
                            duaVar.a(cteVar, bsg.k1(((dz0) nz0Var).a).toString(), null, e18Var, (i3 & 14) | 384);
                            cteVar2 = cteVar;
                            e18Var.p(false);
                        } else {
                            e18Var.a0(-1579271604);
                            xq3.b(cteVar2, bsg.k1(((dz0) nz0Var).a).toString(), e18Var, i3 & 14);
                            e18Var.p(false);
                        }
                        e18Var.p(false);
                    } else {
                        e69 e69Var = null;
                        if (nz0Var instanceof xy0) {
                            e18Var.a0(-1579142737);
                            dua duaVar2 = (dua) e18Var.j(yq3.a);
                            xy0 xy0Var = (xy0) nz0Var;
                            String str = xy0Var.e;
                            String str2 = xy0Var.d;
                            if (bsg.I0(str2)) {
                                str2 = null;
                            }
                            if (duaVar2 != null) {
                                e18Var.a0(-1578987024);
                                duaVar2.a(cteVar, bsg.k1(str).toString(), str2, e18Var, i3 & 14);
                                cteVar2 = cteVar;
                                e18Var.p(false);
                            } else {
                                e18Var.a0(-1578878772);
                                xq3.b(cteVar2, bsg.k1(str).toString(), e18Var, i3 & 14);
                                e18Var.p(false);
                            }
                            e18Var.p(false);
                        } else if (nz0Var instanceof uy0) {
                            e18Var.a0(-1578759577);
                            uy0 uy0Var = (uy0) nz0Var;
                            ((kwa) e18Var.j(lwa.a)).c(0, e18Var, bsg.k1(uy0Var.a).toString(), uy0Var.b);
                            e18Var.p(false);
                        } else if (nz0Var instanceof az0) {
                            e18Var.a0(-1578554543);
                            e18Var.a0(-743656980);
                            xb0 xb0Var = new xb0(16);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            k39 k39Var = new k39(e69Var, fd9.q0(1514267555, new xu(cteVar2, i2, nz0Var), e18Var), 3);
                            String strI = vb7.i();
                            linkedHashMap.put("inline:".concat(strI), k39Var);
                            qvk.b(xb0Var, strI, "�");
                            int i6 = i3;
                            mte mteVar = new mte(xb0Var.n(), sta.q0(linkedHashMap));
                            e18Var.p(false);
                            tpk.a(cteVar2, mteVar, null, null, false, 0, 0, e18Var, i6 & 14, 62);
                            e18Var = e18Var;
                            e18Var.p(false);
                        } else {
                            int i7 = i3;
                            if (nz0Var instanceof hz0) {
                                e18Var.a0(-1578318509);
                                e18Var.p(false);
                            } else if (nz0Var instanceof pz0) {
                                e18Var.a0(-1578221913);
                                cteVar2 = cteVar;
                                flk.d(cteVar2, jz0Var, null, e18Var, i7 & 126, 2);
                                e18Var = e18Var;
                                e18Var.p(false);
                            } else {
                                cteVar2 = cteVar;
                                if (nz0Var instanceof xz0) {
                                    e18Var.a0(-1578144692);
                                    pmk.d(cteVar2, jz0Var, e18Var, i7 & 126);
                                    e18Var.p(false);
                                } else if (nz0Var instanceof zz0) {
                                    e18Var.a0(-1577833080);
                                    System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
                                    StringBuilder sb = new StringBuilder(16);
                                    new ArrayList();
                                    ArrayList arrayList = new ArrayList();
                                    new ArrayList();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    String str3 = ((zz0) nz0Var).a;
                                    str3.getClass();
                                    sb.append(str3);
                                    String string = sb.toString();
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    int size = arrayList.size();
                                    for (int i8 = 0; i8 < size; i8++) {
                                        arrayList2.add(((wb0) arrayList.get(i8)).a(sb.length()));
                                    }
                                    tpk.a(cteVar2, new mte(new zb0(string, (List) arrayList2), sta.q0(linkedHashMap2)), null, null, false, 0, 0, e18Var, i7 & 14, 62);
                                    e18Var = e18Var;
                                    e18Var.p(false);
                                } else if (nz0Var instanceof iz0) {
                                    e18Var.a0(-1577571006);
                                    e18Var.p(false);
                                    System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
                                } else if (nz0Var instanceof fz0) {
                                    e18Var.a0(-1577418951);
                                    e18Var.p(false);
                                    System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + nz0Var + " while traversing the Abstract Syntax Tree."));
                                } else {
                                    if (!nz0Var.equals(tz0.a) && !nz0Var.equals(wz0.a) && !nz0Var.equals(yz0.a) && !(nz0Var instanceof uz0)) {
                                        throw ebh.u(e18Var, -743733352, false);
                                    }
                                    e18Var.a0(-1577158365);
                                    e18Var.p(false);
                                    System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
                                }
                            }
                        }
                    }
                }
                cteVar2 = cteVar;
            }
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            ze1Var = new ze1(cteVar2, jz0Var, i, 1);
            r7eVarS.d = ze1Var;
        }
    }

    public static final ohf c(iif iifVar, lv1 lv1Var) {
        boolean z = iifVar.i() == hc5.E;
        return new ohf(g(iifVar.j(), z, true, iifVar.k(), lv1Var), g(iifVar.h(), z, false, iifVar.g(), lv1Var), z);
    }

    public static final Throwable d(Throwable th, fjc fjcVar, vag vagVar, y08 y08Var) {
        if (fjcVar == null) {
            return th;
        }
        kpk.j(th, new hya(y08Var, vagVar, fjcVar, 10));
        return th;
    }

    public static final nhf e(final iif iifVar, final tgf tgfVar, nhf nhfVar) {
        final int i = iifVar.a() ? tgfVar.c : tgfVar.d;
        int iK = iifVar.a() ? iifVar.k() : iifVar.g();
        int i2 = tgfVar.b;
        yjh yjhVar = tgfVar.f;
        int i3 = tgfVar.e;
        if (iK != i2) {
            return tgfVar.a(i);
        }
        t51 t51Var = new t51(tgfVar, i, 4);
        w1a w1aVar = w1a.G;
        final kw9 kw9VarW = yb5.w(w1aVar, t51Var);
        final int i4 = iifVar.a() ? tgfVar.d : tgfVar.c;
        kw9 kw9VarW2 = yb5.w(w1aVar, new zy7() { // from class: qhf
            @Override // defpackage.zy7
            public final Object a() {
                int iIntValue = ((Number) kw9VarW.getValue()).intValue();
                iif iifVar2 = iifVar;
                boolean zA = iifVar2.a();
                boolean z = iifVar2.i() == hc5.E;
                tgf tgfVar2 = tgfVar;
                yjh yjhVar2 = tgfVar2.f;
                int i5 = i;
                long jK = yjhVar2.k(i5);
                yjh yjhVar3 = tgfVar2.f;
                qtb qtbVar = yjhVar3.b;
                int i6 = kkh.c;
                int iH = (int) (jK >> 32);
                int iD = qtbVar.d(iH);
                int i7 = qtbVar.f;
                if (iD != iIntValue) {
                    iH = iIntValue >= i7 ? yjhVar3.h(i7 - 1) : yjhVar3.h(iIntValue);
                }
                int iC = (int) (jK & 4294967295L);
                if (qtbVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i7 ? qtbVar.c(i7 - 1, false) : qtbVar.c(iIntValue, false);
                }
                int i8 = i4;
                if (iH == i8) {
                    return tgfVar2.a(iC);
                }
                if (iC == i8) {
                    return tgfVar2.a(iH);
                }
                if (!(zA ^ z) ? i5 >= iH : i5 > iC) {
                    iH = iC;
                }
                return tgfVar2.a(iH);
            }
        });
        if (tgfVar.a != nhfVar.c) {
            return (nhf) kw9VarW2.getValue();
        }
        if (i == i3) {
            return nhfVar;
        }
        if (((Number) kw9VarW.getValue()).intValue() != yjhVar.b.d(i3)) {
            return (nhf) kw9VarW2.getValue();
        }
        int i5 = nhfVar.b;
        long jK = yjhVar.k(i5);
        boolean zA = iifVar.a();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zA ^ (tgfVar.b() == hc5.E))) {
                }
            }
            return tgfVar.a(i);
        }
        int i6 = kkh.c;
        return (i5 == ((int) (jK >> 32)) || i5 == ((int) (jK & 4294967295L))) ? (nhf) kw9VarW2.getValue() : tgfVar.a(i);
    }

    public static final qb5 f(fjc fjcVar, vag vagVar) {
        return new qb5((Object) fjcVar, (Object) vagVar, false);
    }

    public static final nhf g(tgf tgfVar, boolean z, boolean z2, int i, lv1 lv1Var) {
        long j;
        int i2 = z2 ? tgfVar.c : tgfVar.d;
        if (i != tgfVar.b) {
            return tgfVar.a(i2);
        }
        long jT = lv1Var.t(tgfVar, i2);
        if (z ^ z2) {
            int i3 = kkh.c;
            j = jT >> 32;
        } else {
            int i4 = kkh.c;
            j = 4294967295L & jT;
        }
        return tgfVar.a((int) j);
    }

    public static final nhf h(nhf nhfVar, tgf tgfVar, int i) {
        return new nhf(tgfVar.f.a(i), i, nhfVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ohf i(defpackage.ohf r8, defpackage.iif r9) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvk.i(ohf, iif):ohf");
    }

    public static void j(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void k(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static final void l(vag vagVar, hn0 hn0Var, int i) {
        while (true) {
            int i2 = vagVar.v;
            if (i > i2 && i < vagVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            vagVar.M();
            if (vagVar.y(vagVar.v)) {
                hn0Var.g();
            }
            vagVar.j();
        }
    }

    public static final boolean m(int i) {
        if (i != 0) {
            return i != 3;
        }
        throw null;
    }

    public static final long n(int i, int i2) {
        long j = (((long) i) * 12) + ((long) i2);
        long j2 = j / 12;
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return j;
        }
        mr9.q(vb7.q("The total number of years in ", " years and ", i, i2, " months overflows an Int"));
        return 0L;
    }

    public static final void o(cte cteVar, jz0 jz0Var, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1692053881);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(jz0Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ymf ymfVarG = jz0Var != null ? xb5.g(jz0Var, false) : null;
            if (ymfVarG == null) {
                e18Var.a0(2054065626);
                e18Var.p(false);
            } else {
                e18Var.a0(2054065627);
                Iterator it = ymfVarG.iterator();
                while (it.hasNext()) {
                    b(cteVar, (jz0) it.next(), e18Var, i2 & 14);
                }
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ze1(cteVar, jz0Var, i, i3);
        }
    }
}
