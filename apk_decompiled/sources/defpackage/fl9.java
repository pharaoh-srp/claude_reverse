package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class fl9 {
    public static final oc7 a;

    static {
        oc7 oc7Var = new oc7();
        oc7Var.a(el9.a);
        oc7Var.a(el9.b);
        oc7Var.a(el9.c);
        oc7Var.a(el9.d);
        oc7Var.a(el9.e);
        oc7Var.a(el9.f);
        oc7Var.a(el9.g);
        oc7Var.a(el9.h);
        oc7Var.a(el9.i);
        oc7Var.a(el9.j);
        oc7Var.a(el9.k);
        oc7Var.a(el9.l);
        oc7Var.a(el9.m);
        oc7Var.a(el9.n);
        a = oc7Var;
    }

    public static ik9 a(gsd gsdVar, txb txbVar, cbi cbiVar) {
        String strS0;
        gsdVar.getClass();
        txbVar.getClass();
        cbiVar.getClass();
        t28 t28Var = el9.a;
        t28Var.getClass();
        wk9 wk9Var = (wk9) uik.i(gsdVar, t28Var);
        String string = (wk9Var == null || (wk9Var.F & 1) != 1) ? "<init>" : txbVar.getString(wk9Var.G);
        if (wk9Var == null || (wk9Var.F & 2) != 2) {
            List list = gsdVar.I;
            list.getClass();
            List<vtd> list2 = list;
            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
            for (vtd vtdVar : list2) {
                vtdVar.getClass();
                String strE = e(ajk.w(vtdVar, cbiVar), txbVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strS0 = w44.S0(arrayList, "", "(", ")V", null, 56);
        } else {
            strS0 = txbVar.getString(wk9Var.H);
        }
        return new ik9(string, strS0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x004a: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x004c A[HIDDEN]
          (r4v2 java.lang.String) from 0x004d: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x004a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.hk9 b(defpackage.ctd r4, defpackage.txb r5, defpackage.cbi r6, boolean r7) {
        /*
            r4.getClass()
            r5.getClass()
            r6.getClass()
            t28 r0 = defpackage.el9.d
            r0.getClass()
            java.lang.Object r0 = defpackage.uik.i(r4, r0)
            yk9 r0 = (defpackage.yk9) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L4c
        L18:
            int r2 = r0.F
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L21
            uk9 r0 = r0.G
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L27
            if (r7 == 0) goto L27
            goto L4c
        L27:
            if (r0 == 0) goto L31
            int r7 = r0.F
            r7 = r7 & r3
            if (r7 != r3) goto L31
            int r7 = r0.G
            goto L33
        L31:
            int r7 = r4.J
        L33:
            if (r0 == 0) goto L42
            int r2 = r0.F
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L42
            int r4 = r0.H
            java.lang.String r4 = r5.getString(r4)
            goto L4d
        L42:
            ntd r4 = defpackage.ajk.q(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L4d
        L4c:
            return r1
        L4d:
            hk9 r6 = new hk9
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl9.b(ctd, txb, cbi, boolean):hk9");
    }

    public static ik9 c(usd usdVar, txb txbVar, cbi cbiVar) {
        String strConcat;
        usdVar.getClass();
        txbVar.getClass();
        cbiVar.getClass();
        t28 t28Var = el9.b;
        t28Var.getClass();
        wk9 wk9Var = (wk9) uik.i(usdVar, t28Var);
        int i = (wk9Var == null || (wk9Var.F & 1) != 1) ? usdVar.J : wk9Var.G;
        if (wk9Var == null || (wk9Var.F & 2) != 2) {
            List listY = x44.Y(ajk.n(usdVar, cbiVar));
            List list = usdVar.S;
            list.getClass();
            List<vtd> list2 = list;
            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
            for (vtd vtdVar : list2) {
                vtdVar.getClass();
                arrayList.add(ajk.w(vtdVar, cbiVar));
            }
            ArrayList arrayListA1 = w44.a1(listY, arrayList);
            ArrayList arrayList2 = new ArrayList(x44.y(arrayListA1, 10));
            Iterator it = arrayListA1.iterator();
            while (it.hasNext()) {
                String strE = e((ntd) it.next(), txbVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(ajk.p(usdVar, cbiVar), txbVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = w44.S0(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = txbVar.getString(wk9Var.H);
        }
        return new ik9(txbVar.getString(i), strConcat);
    }

    public static final boolean d(ctd ctdVar) {
        ctdVar.getClass();
        in7 in7VarA = bk9.a();
        Object objK = ctdVar.k(el9.e);
        objK.getClass();
        return in7VarA.e(((Number) objK).intValue()).booleanValue();
    }

    public static String e(ntd ntdVar, txb txbVar) {
        if (ntdVar.p()) {
            return kh3.b(txbVar.a(ntdVar.M));
        }
        return null;
    }

    public static final cpc f(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rq1.a(strArr));
        kk9 kk9VarG = g(byteArrayInputStream, strArr2);
        sk9 sk9Var = esd.o0;
        sk9Var.getClass();
        t34 t34Var = new t34(byteArrayInputStream);
        b3 b3Var = (b3) sk9Var.b(t34Var, a);
        try {
            t34Var.a(0);
            if (b3Var.b()) {
                return new cpc(kk9VarG, (esd) b3Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferExceptionA = new UninitializedMessageException().a();
            invalidProtocolBufferExceptionA.E = b3Var;
            throw invalidProtocolBufferExceptionA;
        } catch (InvalidProtocolBufferException e) {
            e.E = b3Var;
            throw e;
        }
    }

    public static kk9 g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        dl9 dl9Var = (dl9) dl9.L.a(byteArrayInputStream, a);
        dl9Var.getClass();
        return new kk9(dl9Var, strArr);
    }

    public static final cpc h(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rq1.a(strArr));
        kk9 kk9VarG = g(byteArrayInputStream, strArr2);
        sk9 sk9Var = ysd.P;
        sk9Var.getClass();
        t34 t34Var = new t34(byteArrayInputStream);
        b3 b3Var = (b3) sk9Var.b(t34Var, a);
        try {
            t34Var.a(0);
            if (b3Var.b()) {
                return new cpc(kk9VarG, (ysd) b3Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferExceptionA = new UninitializedMessageException().a();
            invalidProtocolBufferExceptionA.E = b3Var;
            throw invalidProtocolBufferExceptionA;
        } catch (InvalidProtocolBufferException e) {
            e.E = b3Var;
            throw e;
        }
    }
}
