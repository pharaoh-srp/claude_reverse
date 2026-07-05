package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class kxe implements c4f, cgd {
    public final ArrayList E;
    public final o1e F;
    public final oo0 G;
    public final long H;

    public kxe(ArrayList arrayList, int i, o1e o1eVar) {
        this.E = arrayList;
        this.F = o1eVar;
        oo0 oo0Var = new oo0();
        oo0Var.b = System.nanoTime();
        oo0Var.a = Math.max(1, i);
        oo0Var.c = new AtomicLong(0L);
        this.G = oo0Var;
        this.H = i;
    }

    public static kxe c(HashMap map, HashMap map2, j3i j3iVar, Double d, int i) {
        ArrayList arrayList = new ArrayList();
        List<i3i> list = j3iVar.a;
        if (list.isEmpty()) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    try {
                        arrayList.add(new f4f((String) entry.getKey(), new d26(Double.parseDouble((String) entry.getValue())), 1));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    try {
                        arrayList.add(new f4f((String) entry2.getKey(), new d26(Double.parseDouble((String) entry2.getValue())), 0));
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        } else {
            if (map.isEmpty()) {
                map2.isEmpty();
            }
            for (i3i i3iVar : list) {
                arrayList.add(new g4f(i3iVar.a, i3iVar.b, i3iVar.c, i3iVar.d, new d26(i3iVar.e)));
            }
        }
        if (d != null) {
            arrayList.add(new e4f(new d26(d.doubleValue())));
        }
        return new kxe(arrayList, i, new o1e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r1.d(-1, "_dd.rule_psr", r3, 3);
        r1 = r18;
     */
    @Override // defpackage.cgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.cf5 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.E
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            h4f r3 = (defpackage.h4f) r3
            boolean r4 = r3.a(r1)
            if (r4 == 0) goto La
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 != 0) goto L26
            o1e r0 = r0.F
            r0.a(r1)
            return
        L26:
            d26 r2 = r3.a
            float r3 = r2.E
            boolean r2 = r2.b(r1)
            if (r2 == 0) goto Lab
            oo0 r2 = r0.G
            java.lang.Object r4 = r2.c
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4
            r6 = 1
            r7 = r6
            r8 = 0
        L39:
            long r9 = r4.get()
            if (r7 == 0) goto L4c
            long r7 = java.lang.System.nanoTime()
            long r11 = r2.b
            long r7 = r7 - r11
            r11 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r7 = r7 / r11
            int r8 = (int) r7
            r7 = 0
        L4c:
            r11 = 32
            long r12 = r9 >> r11
            int r12 = (int) r12
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r13 = r13 & r9
            int r13 = (int) r13
            int r14 = r8 - r12
            r15 = 2147483647(0x7fffffff, float:NaN)
            if (r14 > 0) goto L7e
            int r13 = r13 + r6
            int r5 = r2.a
            if (r13 > r5) goto L73
            if (r13 >= 0) goto L65
            goto L73
        L65:
            r5 = r12 & r15
            r16 = r7
            long r6 = (long) r5
            long r5 = r6 << r11
            long r12 = (long) r13
            long r5 = r5 | r12
            if (r14 >= 0) goto L87
            r16 = 1
            goto L87
        L73:
            double r4 = (double) r3
            r6 = 3
            r2 = -1
            java.lang.String r3 = "_dd.rule_psr"
            r1.d(r2, r3, r4, r6)
            r1 = r18
            goto L97
        L7e:
            r16 = r7
            r1 = r8 & r15
            long r5 = (long) r1
            long r5 = r5 << r11
            r11 = 1
            long r5 = r5 | r11
        L87:
            boolean r1 = r4.compareAndSet(r9, r5)
            if (r1 == 0) goto La5
            double r4 = (double) r3
            r6 = 3
            r2 = 2
            java.lang.String r3 = "_dd.rule_psr"
            r1 = r18
            r1.d(r2, r3, r4, r6)
        L97:
            df5 r1 = r1.c
            long r2 = r0.H
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "_dd.limit_psr"
            r1.j(r0, r2)
            return
        La5:
            r1 = r18
            r7 = r16
            r6 = 1
            goto L39
        Lab:
            double r3 = (double) r3
            r5 = 3
            r1 = -1
            java.lang.String r2 = "_dd.rule_psr"
            r0 = r18
            r0.d(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.a(cf5):void");
    }

    @Override // defpackage.c4f
    public final boolean b(cf5 cf5Var) {
        return true;
    }
}
