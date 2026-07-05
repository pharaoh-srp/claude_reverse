package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dn0 implements gd5, fb8 {
    public ArrayList E;

    public dn0(int i) {
        switch (i) {
            case 1:
                this.E = new ArrayList(32);
                break;
            case 2:
                this.E = new ArrayList();
                break;
            case 3:
                break;
            default:
                this.E = new ArrayList();
                break;
        }
    }

    public static dn0 l() {
        return new dn0();
    }

    @Override // defpackage.gd5
    public long a(long j) {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((hd5) arrayList.get(0)).b) {
            return ((hd5) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            hd5 hd5Var = (hd5) arrayList.get(i);
            long j2 = hd5Var.b;
            long j3 = hd5Var.b;
            if (j < j2) {
                long j4 = ((hd5) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((hd5) qwk.l(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // defpackage.gd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(defpackage.hd5 r10, long r11) {
        /*
            r9 = this;
            java.util.ArrayList r9 = r9.E
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L11
            r4 = r6
            goto L12
        L11:
            r4 = r5
        L12:
            defpackage.fd9.E(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L25
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L25
        L23:
            r2 = r6
            goto L26
        L25:
            r2 = r5
        L26:
            int r3 = r9.size()
            int r3 = r3 - r6
        L2b:
            if (r3 < 0) goto L4e
            java.lang.Object r4 = r9.get(r3)
            hd5 r4 = (defpackage.hd5) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L3e
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L3e:
            java.lang.Object r4 = r9.get(r3)
            hd5 r4 = (defpackage.hd5) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L4b
            r2 = r5
        L4b:
            int r3 = r3 + (-1)
            goto L2b
        L4e:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.b(hd5, long):boolean");
    }

    @Override // defpackage.fb8
    public Object c(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.gd5
    public void clear() {
        this.E.clear();
    }

    @Override // defpackage.gd5
    public nz8 d(long j) {
        int iM = m(j);
        if (iM == 0) {
            iz8 iz8Var = nz8.F;
            return vde.I;
        }
        hd5 hd5Var = (hd5) this.E.get(iM - 1);
        long j2 = hd5Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return hd5Var.a;
        }
        iz8 iz8Var2 = nz8.F;
        return vde.I;
    }

    @Override // defpackage.gd5
    public long e(long j) {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty() || j < ((hd5) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((hd5) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                hd5 hd5Var = (hd5) arrayList.get(i - 1);
                long j3 = hd5Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? hd5Var.b : j3;
            }
        }
        hd5 hd5Var2 = (hd5) qwk.l(arrayList);
        long j4 = hd5Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? hd5Var2.b : j4;
    }

    @Override // defpackage.gd5
    public void f(long j) {
        ArrayList arrayList = this.E;
        int iM = m(j);
        if (iM == 0) {
            return;
        }
        long j2 = ((hd5) arrayList.get(iM - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM--;
        }
        arrayList.subList(0, iM).clear();
    }

    public void g(kw7 kw7Var) {
        ArrayList arrayList = this.E;
        if (kw7Var instanceof c6c) {
            arrayList.add(kw7Var);
        } else {
            if (!(kw7Var instanceof ze4)) {
                wg6.i();
                return;
            }
            Iterator it = ((ze4) kw7Var).a.iterator();
            while (it.hasNext()) {
                arrayList.add((c6c) it.next());
            }
        }
    }

    public void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.E == null) {
            this.E = new ArrayList();
        }
        boolean zIsEmpty = this.E.isEmpty();
        ArrayList arrayList = this.E;
        if (zIsEmpty) {
            arrayList.addAll(list);
            return;
        }
        int size = arrayList.size() - 1;
        cfg cfgVar = (cfg) this.E.get(size);
        cfg cfgVar2 = (cfg) list.get(0);
        int i = cfgVar.a;
        if (i == cfgVar2.a) {
            int i2 = cfgVar.b;
            int i3 = cfgVar.c;
            if (i2 + i3 == cfgVar2.b) {
                this.E.set(size, new cfg(i, i2, i3 + cfgVar2.c));
                this.E.addAll(list.subList(1, list.size()));
                return;
            }
        }
        this.E.addAll(list);
    }

    public void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h(((b5c) it.next()).d());
        }
    }

    public void j() {
        this.E.add(vuc.c);
    }

    public void k(float f, float f2, float f3, float f4, float f5, float f6) {
        this.E.add(new evc(f, f2, f3, f4, f5, f6));
    }

    public int m(long j) {
        ArrayList arrayList = this.E;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((hd5) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public List n() {
        ArrayList arrayList = this.E;
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    public void o(float f) {
        this.E.add(new fvc(f));
    }

    public void p(float f, float f2) {
        this.E.add(new yuc(f, f2));
    }

    public void q(float f, float f2) {
        this.E.add(new gvc(f, f2));
    }

    public void r(float f, float f2) {
        this.E.add(new zuc(f, f2));
    }

    public void s(float f, float f2, float f3, float f4) {
        this.E.add(new jvc(f, f2, f3, f4));
    }

    public void t(float f) {
        this.E.add(new mvc(f));
    }

    @Override // defpackage.fb8
    public Iterator t0() {
        return this.E.iterator();
    }

    public void u(float f) {
        this.E.add(new lvc(f));
    }

    public dn0(ArrayList arrayList) {
        this.E = arrayList;
    }
}
