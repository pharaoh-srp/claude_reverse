package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class q06 {
    public static final p06 a;
    public static final p06 b;
    public static final p06 c;
    public static final p06 d;
    public static final p06 e;
    public static final p06 f;
    public static final p06 g;
    public static final p06 h;
    public static final p06 i;
    public static final p06 j;
    public static final zp3 k;
    public static final dd8 l;
    public static final ql8 m;
    public static final xqb n;
    public static final HashMap o;

    static {
        ezi eziVar = ezi.c;
        p06 p06Var = new p06(eziVar, 0);
        a = p06Var;
        fzi fziVar = fzi.c;
        p06 p06Var2 = new p06(fziVar, 1);
        b = p06Var2;
        gzi gziVar = gzi.c;
        p06 p06Var3 = new p06(gziVar, 2);
        c = p06Var3;
        bzi bziVar = bzi.c;
        p06 p06Var4 = new p06(bziVar, 3);
        d = p06Var4;
        hzi hziVar = hzi.c;
        p06 p06Var5 = new p06(hziVar, 4);
        e = p06Var5;
        dzi dziVar = dzi.c;
        p06 p06Var6 = new p06(dziVar, 5);
        f = p06Var6;
        azi aziVar = azi.c;
        p06 p06Var7 = new p06(aziVar, 6);
        g = p06Var7;
        czi cziVar = czi.c;
        p06 p06Var8 = new p06(cziVar, 7);
        h = p06Var8;
        izi iziVar = izi.c;
        p06 p06Var9 = new p06(iziVar, 8);
        i = p06Var9;
        Collections.unmodifiableSet(mp0.Z0(new ow5[]{p06Var, p06Var2, p06Var4, p06Var6}));
        HashMap map = new HashMap(6);
        map.put(p06Var2, 0);
        map.put(p06Var, 0);
        map.put(p06Var4, 1);
        map.put(p06Var3, 1);
        map.put(p06Var5, 2);
        Collections.unmodifiableMap(map);
        j = p06Var5;
        int i2 = 17;
        k = new zp3(i2);
        l = new dd8(i2);
        m = new ql8(i2);
        try {
            Iterator it = Arrays.asList(new xqb[0]).iterator();
            n = it.hasNext() ? (xqb) it.next() : xqb.a;
            HashMap map2 = new HashMap();
            o = map2;
            map2.put(eziVar, p06Var);
            map2.put(fziVar, p06Var2);
            map2.put(gziVar, p06Var3);
            map2.put(bziVar, p06Var4);
            map2.put(hziVar, p06Var5);
            map2.put(dziVar, p06Var6);
            map2.put(aziVar, p06Var7);
            map2.put(cziVar, p06Var8);
            map2.put(iziVar, p06Var9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q06.a(int):void");
    }

    public static Integer b(ow5 ow5Var, ow5 ow5Var2) {
        if (ow5Var == null) {
            a(12);
            throw null;
        }
        kzi kziVar = ow5Var.a;
        if (ow5Var2 == null) {
            a(13);
            throw null;
        }
        kzi kziVar2 = ow5Var2.a;
        Integer numA = kziVar.a(kziVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = kziVar2.a(kziVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static go5 c(m6e m6eVar, go5 go5Var, bo5 bo5Var) {
        go5 go5VarC;
        if (go5Var == null) {
            a(8);
            throw null;
        }
        if (bo5Var == null) {
            a(9);
            throw null;
        }
        for (go5 go5Var2 = (go5) go5Var.a(); go5Var2 != null && go5Var2.getVisibility() != f; go5Var2 = (go5) m06.i(go5Var2, go5.class, true)) {
            if (!go5Var2.getVisibility().a(m6eVar, go5Var2, bo5Var)) {
                return go5Var2;
            }
        }
        if (!(go5Var instanceof o9i) || (go5VarC = c(m6eVar, ((o9i) go5Var).Y0(), bo5Var)) == null) {
            return null;
        }
        return go5VarC;
    }

    public static boolean d(go5 go5Var, bo5 bo5Var) {
        if (bo5Var != null) {
            lyk lykVarF = m06.f(bo5Var);
            return lykVarF != lyk.W && lykVarF == m06.f(go5Var);
        }
        a(7);
        throw null;
    }

    public static boolean e(ow5 ow5Var) {
        if (ow5Var != null) {
            return ow5Var == a || ow5Var == b;
        }
        a(14);
        throw null;
    }

    public static ow5 f(kzi kziVar) {
        if (kziVar == null) {
            a(15);
            throw null;
        }
        ow5 ow5Var = (ow5) o.get(kziVar);
        if (ow5Var != null) {
            return ow5Var;
        }
        xh6.k("Inapplicable visibility: ", kziVar);
        return null;
    }
}
