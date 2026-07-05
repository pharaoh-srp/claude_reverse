package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bch implements lye {
    public final k99 E;
    public final q28 F;
    public final d4f G;
    public final ov5 H;
    public final int I = 100;
    public final LinkedHashSet J = new LinkedHashSet();
    public int K;

    public bch(k99 k99Var, q28 q28Var, q28 q28Var2, ov5 ov5Var) {
        this.E = k99Var;
        this.F = q28Var;
        this.G = q28Var2;
        this.H = ov5Var;
    }

    public static final qbh a(bch bchVar, lj5 lj5Var, long j, String str, Map map, float f) {
        k99 k99Var = bchVar.E;
        sxe sxeVarE = e(lj5Var);
        p26 p26Var = lj5Var.m;
        LinkedHashMap linkedHashMapB = b(new LinkedHashMap(map == null ? nm6.E : map));
        linkedHashMapB.put("process_uptime", Long.valueOf(k99Var.A() / 1000000));
        yl4 yl4Var = new yl4((char) 0);
        int i = amk.i(lj5Var.h, k99Var.t());
        if (i == 0) {
            i = 1;
        }
        int i2 = i;
        String str2 = lj5Var.i;
        kbh kbhVar = new kbh(sxeVarE.a);
        nbh nbhVar = new nbh(sxeVarE.b);
        String str3 = sxeVarE.d;
        pbh pbhVar = str3 != null ? new pbh(str3) : null;
        String str4 = sxeVarE.g;
        return new qbh(yl4Var, j, i2, str2, kbhVar, nbhVar, pbhVar, str4 != null ? new jbh(str4) : null, Float.valueOf(f), new obh(new lbh(p26Var.i, p26Var.b, p26Var.c, Integer.valueOf(p26Var.l), p26Var.m, p26Var.n), new mbh(p26Var.e, p26Var.f, p26Var.h), str, linkedHashMapB));
    }

    public static LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (int i : sq6.H(3)) {
            linkedHashMap.remove(vb7.a(i));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float c(defpackage.bch r8, java.util.Map r9, java.lang.Float r10, int r11) {
        /*
            r0 = r11 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r9 = r1
        L6:
            r0 = 2
            r11 = r11 & r0
            if (r11 == 0) goto Lb
            r10 = r1
        Lb:
            yxe r8 = r8.d()
            if (r8 == 0) goto L67
            r8 = 1101004800(0x41a00000, float:20.0)
            double r2 = defpackage.xuk.g(r8)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r9 == 0) goto L37
            r8 = 1
            java.lang.String r8 = defpackage.vb7.a(r8)
            java.lang.Object r8 = r9.get(r8)
            boolean r11 = r8 instanceof java.lang.Float
            if (r11 == 0) goto L2b
            java.lang.Float r8 = (java.lang.Float) r8
            goto L2c
        L2b:
            r8 = r1
        L2c:
            if (r8 == 0) goto L37
            float r8 = r8.floatValue()
            double r6 = defpackage.xuk.g(r8)
            goto L38
        L37:
            r6 = r4
        L38:
            if (r9 == 0) goto L54
            java.lang.String r8 = defpackage.vb7.a(r0)
            java.lang.Object r8 = r9.get(r8)
            boolean r9 = r8 instanceof java.lang.Float
            if (r9 == 0) goto L49
            r1 = r8
            java.lang.Float r1 = (java.lang.Float) r1
        L49:
            if (r1 == 0) goto L54
            float r8 = r1.floatValue()
            double r8 = defpackage.xuk.g(r8)
            goto L55
        L54:
            r8 = r4
        L55:
            if (r10 == 0) goto L5f
            float r10 = r10.floatValue()
            double r4 = defpackage.xuk.g(r10)
        L5f:
            double r2 = r2 * r6
            double r2 = r2 * r8
            double r2 = r2 * r4
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r8
            float r8 = (float) r2
            return r8
        L67:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bch.c(bch, java.util.Map, java.lang.Float, int):float");
    }

    public static sxe e(lj5 lj5Var) {
        Map map = (Map) lj5Var.q.get("rum");
        if (map == null) {
            map = nm6.E;
        }
        String str = sxe.p;
        return zni.y(map);
    }

    public final yxe d() {
        gbf feature = this.E.getFeature("rum");
        if (feature != null) {
            return ((aye) feature.c).G;
        }
        return null;
    }

    @Override // defpackage.lye
    public final void q(String str, boolean z) {
        str.getClass();
        this.J.clear();
        this.K = 0;
    }
}
