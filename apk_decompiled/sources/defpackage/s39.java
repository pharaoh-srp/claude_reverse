package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s39 {
    public final BitSet a;
    public final HashMap b;
    public final q28 c;
    public final HashMap d;
    public t6f e;
    public boolean f;
    public int g;
    public yy5 h;
    public rw1 i;

    public s39(q28 q28Var) {
        List list = (List) q28Var.F;
        HashMap map = new HashMap();
        b(Arrays.asList(new c01('*'), new c01('_')), map);
        b(list, map);
        this.b = map;
        this.c = q28Var;
        HashMap map2 = new HashMap();
        this.d = map2;
        map2.put('\\', Collections.singletonList(new kc1()));
        map2.put('`', Collections.singletonList(new lc1()));
        map2.put('&', Collections.singletonList(new aq6()));
        map2.put('<', Arrays.asList(new p91(), new zp8()));
        Set setKeySet = map.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        this.a = bitSet;
    }

    public static void a(char c, zy5 zy5Var, HashMap map) {
        if (((zy5) map.put(Character.valueOf(c), zy5Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(Iterable iterable, HashMap map) {
        dkg dkgVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zy5 zy5Var = (zy5) it.next();
            char cD = zy5Var.d();
            char cB = zy5Var.b();
            if (cD == cB) {
                zy5 zy5Var2 = (zy5) map.get(Character.valueOf(cD));
                if (zy5Var2 == null || zy5Var2.d() != zy5Var2.b()) {
                    a(cD, zy5Var, map);
                } else {
                    if (zy5Var2 instanceof dkg) {
                        dkgVar = (dkg) zy5Var2;
                    } else {
                        dkg dkgVar2 = new dkg(cD);
                        dkgVar2.e(zy5Var2);
                        dkgVar = dkgVar2;
                    }
                    dkgVar.e(zy5Var);
                    map.put(Character.valueOf(cD), dkgVar);
                }
            } else {
                a(cD, zy5Var, map);
                a(cB, zy5Var, map);
            }
        }
    }

    public static edh i(d80 d80Var) {
        edh edhVar = new edh(d80Var.g());
        edhVar.g(d80Var.j());
        return edhVar;
    }

    public final void c(b5c b5cVar) {
        b5c b5cVar2 = b5cVar.b;
        if (b5cVar2 == null) {
            return;
        }
        b5c b5cVar3 = b5cVar.c;
        edh edhVar = null;
        edh edhVar2 = null;
        int length = 0;
        while (b5cVar2 != null) {
            if (b5cVar2 instanceof edh) {
                edhVar2 = (edh) b5cVar2;
                if (edhVar == null) {
                    edhVar = edhVar2;
                }
                length = edhVar2.j().length() + length;
            } else {
                d(edhVar, edhVar2, length);
                c(b5cVar2);
                edhVar = null;
                edhVar2 = null;
                length = 0;
            }
            if (b5cVar2 == b5cVar3) {
                break;
            } else {
                b5cVar2 = b5cVar2.e;
            }
        }
        d(edhVar, edhVar2, length);
    }

    public final void d(edh edhVar, edh edhVar2, int i) {
        dn0 dn0Var;
        if (edhVar == null || edhVar2 == null || edhVar == edhVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(edhVar.j());
        if (this.f) {
            dn0Var = new dn0(3);
            dn0Var.h(edhVar.d());
        } else {
            dn0Var = null;
        }
        b5c b5cVar = edhVar.e;
        b5c b5cVar2 = edhVar2.e;
        while (b5cVar != b5cVar2) {
            sb.append(((edh) b5cVar).j());
            if (dn0Var != null) {
                dn0Var.h(b5cVar.d());
            }
            b5c b5cVar3 = b5cVar.e;
            b5cVar.i();
            b5cVar = b5cVar3;
        }
        edhVar.k(sb.toString());
        if (dn0Var != null) {
            edhVar.g(dn0Var.n());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.d80 r14, defpackage.b5c r15) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s39.e(d80, b5c):void");
    }

    public final edh f() {
        char cN;
        l42 l42VarQ = this.e.q();
        this.e.j();
        while (true) {
            cN = this.e.n();
            if (cN == 0 || this.a.get(cN)) {
                break;
            }
            this.e.j();
        }
        t6f t6fVar = this.e;
        d80 d80VarE = t6fVar.e(l42VarQ, t6fVar.q());
        String strG = d80VarE.g();
        if (cN == '\n') {
            int iQ = ybi.q(strG.length() - 1, strG) + 1;
            this.g = strG.length() - iQ;
            strG = strG.substring(0, iQ);
        } else if (cN == 0) {
            strG = strG.substring(0, ybi.s(strG.length() - 1, 0, strG) + 1);
        }
        edh edhVar = new edh(strG);
        edhVar.g(d80VarE.j());
        return edhVar;
    }

    public final void g(yy5 yy5Var) {
        boolean z;
        HashMap map = new HashMap();
        yy5 yy5Var2 = this.h;
        while (yy5Var2 != null) {
            yy5 yy5Var3 = yy5Var2.f;
            if (yy5Var3 == yy5Var) {
                break;
            } else {
                yy5Var2 = yy5Var3;
            }
        }
        while (yy5Var2 != null) {
            char c = yy5Var2.b;
            zy5 zy5Var = (zy5) this.b.get(Character.valueOf(c));
            if (!yy5Var2.a() || zy5Var == null) {
                yy5Var2 = yy5Var2.g;
            } else {
                char cD = zy5Var.d();
                yy5 yy5Var4 = yy5Var2.f;
                int iA = 0;
                boolean z2 = false;
                while (yy5Var4 != null && yy5Var4 != yy5Var && yy5Var4 != map.get(Character.valueOf(c))) {
                    if (yy5Var4.b() && yy5Var4.b == cD) {
                        iA = zy5Var.a(yy5Var4, yy5Var2);
                        if (iA > 0) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    yy5Var4 = yy5Var4.f;
                }
                z = false;
                if (z) {
                    for (int i = 0; i < iA; i++) {
                        ArrayList arrayList = yy5Var4.a;
                        ((edh) arrayList.remove(arrayList.size() - 1)).i();
                    }
                    for (int i2 = 0; i2 < iA; i2++) {
                        ((edh) yy5Var2.a.remove(0)).i();
                    }
                    yy5 yy5Var5 = yy5Var2.f;
                    while (yy5Var5 != null && yy5Var5 != yy5Var4) {
                        yy5 yy5Var6 = yy5Var5.f;
                        h(yy5Var5);
                        yy5Var5 = yy5Var6;
                    }
                    if (yy5Var4.g() == 0) {
                        h(yy5Var4);
                    }
                    if (yy5Var2.g() == 0) {
                        yy5 yy5Var7 = yy5Var2.g;
                        h(yy5Var2);
                        yy5Var2 = yy5Var7;
                    }
                } else {
                    if (!z2) {
                        map.put(Character.valueOf(c), yy5Var2.f);
                        if (!yy5Var2.b()) {
                            h(yy5Var2);
                        }
                    }
                    yy5Var2 = yy5Var2.g;
                }
            }
        }
        while (true) {
            yy5 yy5Var8 = this.h;
            if (yy5Var8 == null || yy5Var8 == yy5Var) {
                return;
            } else {
                h(yy5Var8);
            }
        }
    }

    public final void h(yy5 yy5Var) {
        yy5 yy5Var2 = yy5Var.f;
        if (yy5Var2 != null) {
            yy5Var2.g = yy5Var.g;
        }
        yy5 yy5Var3 = yy5Var.g;
        if (yy5Var3 == null) {
            this.h = yy5Var2;
        } else {
            yy5Var3.f = yy5Var2;
        }
    }
}
