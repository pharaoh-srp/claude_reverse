package defpackage;

import com.anthropic.claude.code.ui.DiffLineComment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ii7 {
    public final fi7 a;
    public final xm8 b;
    public final om8 c;
    public final l45 d;
    public final pz7 e;
    public final lsc f;
    public final String g;
    public final mdg h;
    public final kdg i;
    public List j;
    public final int k;
    public final int l;
    public final int m;

    public ii7(fi7 fi7Var, List list, xm8 xm8Var, om8 om8Var, l45 l45Var, pz7 pz7Var) {
        int i;
        int i2;
        xm8Var.getClass();
        om8Var.getClass();
        l45Var.getClass();
        pz7Var.getClass();
        this.a = fi7Var;
        this.b = xm8Var;
        this.c = om8Var;
        this.d = l45Var;
        this.e = pz7Var;
        this.f = mpk.P(Boolean.FALSE);
        List list2 = qx3.a;
        String str = fi7Var.b;
        if (str == null && (str = fi7Var.a) == null) {
            str = "";
        }
        this.g = qx3.a(str);
        mdg mdgVar = new mdg();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DiffLineComment diffLineComment = (DiffLineComment) it.next();
            Long lValueOf = Long.valueOf(diffLineComment.getLineKey());
            Object kdgVar = mdgVar.get(lValueOf);
            if (kdgVar == null) {
                kdgVar = new kdg();
                mdgVar.put(lValueOf, kdgVar);
            }
            x5a x5aVar = new x5a(diffLineComment.getId(), diffLineComment.getCommentText());
            x5aVar.c.setValue(Boolean.FALSE);
            ((kdg) kdgVar).add(x5aVar);
        }
        this.h = mdgVar;
        kdg kdgVar2 = new kdg();
        List list3 = this.a.d;
        ArrayList arrayList = new ArrayList(x44.y(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(new m36((l36) it2.next(), this.b, this.c, this.d, this.g));
        }
        kdgVar2.addAll(arrayList);
        this.i = kdgVar2;
        Iterator it3 = this.a.d.iterator();
        int i3 = 0;
        while (true) {
            Integer num = null;
            if (!it3.hasNext()) {
                this.k = i3;
                Iterator it4 = this.a.d.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    List list4 = ((l36) it4.next()).f;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it5 = list4.iterator();
                        i = 0;
                        while (it5.hasNext()) {
                            if (((n36) it5.next()).a == r36.G && (i = i + 1) < 0) {
                                x44.m0();
                                throw null;
                            }
                        }
                    }
                    i4 += i;
                }
                this.l = i4;
                Iterator it6 = this.a.d.iterator();
                if (it6.hasNext()) {
                    l36 l36Var = (l36) it6.next();
                    Integer numValueOf = Integer.valueOf(Math.max(l36Var.a + l36Var.b, l36Var.c + l36Var.d));
                    loop6: while (true) {
                        num = numValueOf;
                        while (it6.hasNext()) {
                            l36 l36Var2 = (l36) it6.next();
                            numValueOf = Integer.valueOf(Math.max(l36Var2.a + l36Var2.b, l36Var2.c + l36Var2.d));
                            if (num.compareTo(numValueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                this.m = num != null ? num.intValue() : 0;
                return;
            }
            List list5 = ((l36) it3.next()).f;
            if ((list5 instanceof Collection) && list5.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it7 = list5.iterator();
                i2 = 0;
                while (it7.hasNext()) {
                    if (((n36) it7.next()).a == r36.F && (i2 = i2 + 1) < 0) {
                        x44.m0();
                        throw null;
                    }
                }
            }
            i3 += i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ii7 r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.gi7
            if (r0 == 0) goto L13
            r0 = r5
            gi7 r0 = (defpackage.gi7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            gi7 r0 = new gi7
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r5)
            goto L4b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2c:
            defpackage.sf5.h0(r5)
            java.util.List r5 = r4.j
            if (r5 != 0) goto L55
            fi7 r5 = r4.a
            java.lang.String r1 = r5.a
            if (r1 != 0) goto L3b
            java.lang.String r1 = r5.b
        L3b:
            if (r1 != 0) goto L3e
            return r3
        L3e:
            pz7 r5 = r4.e
            r0.G = r2
            java.lang.Object r5 = r5.invoke(r1, r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L4b
            return r0
        L4b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L53
            java.util.List r3 = defpackage.bsg.N0(r5)
        L53:
            r4.j = r3
        L55:
            java.util.List r4 = r4.j
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii7.a(ii7, vp4):java.lang.Object");
    }

    public final boolean b(int i) {
        kdg kdgVar = this.i;
        l36 l36Var = ((m36) kdgVar.get(i)).a;
        int i2 = l36Var.a + l36Var.b;
        if (i < kdgVar.size() - 1 && ((m36) kdgVar.get(i + 1)).a.a <= i2) {
            return false;
        }
        List list = this.j;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        return numValueOf == null || i2 <= numValueOf.intValue();
    }
}
