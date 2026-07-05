package defpackage;

import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class hv7 {
    public static final fv7 a;
    public static final fv7 b;
    public static final List c = x44.X(Float.valueOf(16.0f), Float.valueOf(17.0f), Float.valueOf(20.0f), Float.valueOf(24.0f), Float.valueOf(28.0f), Float.valueOf(32.0f), Float.valueOf(34.0f), Float.valueOf(48.0f));
    public static final List d;

    /* JADX WARN: Type inference failed for: r0v0, types: [fv7] */
    /* JADX WARN: Type inference failed for: r0v1, types: [fv7] */
    static {
        final int i = 0;
        a = new yt7() { // from class: fv7
            @Override // defpackage.yt7
            public final xt7 a(float f) {
                switch (i) {
                    case 0:
                        fv7 fv7Var = hv7.a;
                        return xt7.E;
                    default:
                        fv7 fv7Var2 = hv7.a;
                        return xt7.H;
                }
            }
        };
        final int i2 = 1;
        b = new yt7() { // from class: fv7
            @Override // defpackage.yt7
            public final xt7 a(float f) {
                switch (i2) {
                    case 0:
                        fv7 fv7Var = hv7.a;
                        return xt7.E;
                    default:
                        fv7 fv7Var2 = hv7.a;
                        return xt7.H;
                }
            }
        };
        dv7 dv7Var = dv7.F;
        d = x44.X(dv7.J, dv7.K, new dv7(550), dv7.L, x44.S(), dv7.M);
    }

    public static yt7 a(ou7 ou7Var, ou7 ou7Var2, ld4 ld4Var, int i, int i2) {
        ByteBuffer byteBuffer;
        boolean z;
        ou7 ou7Var3 = ou7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(812795738);
        Map map = null;
        z28 z28Var = (i2 & 4) != 0 ? null : xt7.G;
        xne xneVarB = aoe.b(e18Var);
        List<dv7> list = d;
        List list2 = c;
        lz1 lz1Var = jd4.a;
        boolean z2 = false;
        if (z28Var == null) {
            e18Var.a0(-1026736909);
            e18Var.p(false);
        } else {
            e18Var.a0(-1026736908);
            ou7Var.getClass();
            list2.getClass();
            list.getClass();
            e18Var.a0(-2116886162);
            if (Build.VERSION.SDK_INT >= 29 && !((Boolean) e18Var.j(p59.a)).booleanValue()) {
                nwb nwbVarR0 = xn5.r0(ou7Var, e18Var, i & 14);
                if (ou7Var3 == null) {
                    e18Var.a0(-1149964976);
                    e18Var.p(false);
                    byteBuffer = null;
                } else {
                    e18Var.a0(-1149964975);
                    ByteBuffer byteBuffer2 = (ByteBuffer) xn5.r0(ou7Var3, e18Var, 0).getValue();
                    e18Var.p(false);
                    byteBuffer = byteBuffer2;
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) nwbVarR0.getValue();
                if (byteBuffer3 != null && (ou7Var3 == null || byteBuffer != null)) {
                    boolean zF = e18Var.f(byteBuffer3) | e18Var.f(byteBuffer) | e18Var.f(z28Var) | e18Var.f(list2) | e18Var.f(list);
                    Object objN = e18Var.N();
                    Object obj = objN;
                    if (zF || objN == lz1Var) {
                        String str = z28Var.J;
                        List list3 = list2;
                        int iD0 = tta.d0(x44.y(list3, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj2 : list3) {
                            float fFloatValue = ((Number) obj2).floatValue();
                            d8a d8aVarE = x44.E();
                            for (dv7 dv7Var : list) {
                                String str2 = str;
                                float f = fFloatValue;
                                fFloatValue = f;
                                d8aVarE.add(new re7(byteBuffer3, str2, f, dv7Var, 0));
                                if (byteBuffer != null) {
                                    d8a d8aVar = d8aVarE;
                                    str = str2;
                                    d8aVar.add(new re7(byteBuffer, str, fFloatValue, dv7Var, 1));
                                    d8aVarE = d8aVar;
                                } else {
                                    str = str2;
                                }
                            }
                            linkedHashMap.put(obj2, new cu7(x44.v(d8aVarE)));
                        }
                        e18Var.k0(linkedHashMap);
                        obj = linkedHashMap;
                    }
                    map = (Map) obj;
                }
            }
            e18Var.p(false);
            e18Var.p(false);
        }
        int i3 = i & 14;
        int i4 = 1;
        boolean zF2 = (((i3 ^ 6) > 4 && e18Var.f(ou7Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && e18Var.f(ou7Var3)) || (i & 48) == 32) | e18Var.f(xneVarB) | e18Var.f(map);
        Object objN2 = e18Var.N();
        Object obj3 = objN2;
        if (zF2 || objN2 == lz1Var) {
            yt7[] yt7VarArr = new yt7[1];
            e18Var.k0(yt7VarArr);
            obj3 = yt7VarArr;
        }
        yt7[] yt7VarArr2 = (yt7[]) obj3;
        yt7 yt7Var = yt7VarArr2[0];
        if (yt7Var != null) {
            e18Var.p(false);
            return yt7Var;
        }
        if (map != null) {
            e18Var.a0(-1026433232);
            boolean zH = e18Var.h(map);
            Object objN3 = e18Var.N();
            Object obj4 = objN3;
            if (zH || objN3 == lz1Var) {
                gv7 gv7Var = new gv7(1, map);
                e18Var.k0(gv7Var);
                obj4 = gv7Var;
            }
            yt7 yt7Var2 = (yt7) obj4;
            yt7VarArr2[0] = yt7Var2;
            e18Var.p(false);
            e18Var.p(false);
            return yt7Var2;
        }
        e18Var.a0(-1026194904);
        e18Var.p(false);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e18Var.a0(-587288905);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            float fFloatValue2 = ((Number) it.next()).floatValue();
            ArrayList arrayList = new ArrayList();
            e18Var.a0(-587286120);
            for (dv7 dv7Var2 : list) {
                ArrayList arrayList2 = arrayList;
                boolean z3 = z2;
                zu7 zu7Var = new zu7("opsz", fFloatValue2);
                int i5 = dv7Var2.E;
                int i6 = i4;
                if (i4 > i5 || i5 >= 1001) {
                    c39.a("'wght' value must be in [1, 1000]. Actual: " + i5);
                }
                av7 av7Var = new av7(i5);
                yu7[] yu7VarArr = new yu7[2];
                yu7VarArr[z3 ? 1 : 0] = zu7Var;
                yu7VarArr[i6] = av7Var;
                bv7 bv7Var = new bv7(yu7VarArr);
                int i7 = i3;
                arrayList2.add(oq5.e(ou7Var, dv7Var2, bv7Var, e18Var, i7, 4));
                if (ou7Var3 != null) {
                    e18Var.a0(-1025513741);
                    arrayList2.add(oq5.e(ou7Var3, dv7Var2, bv7Var, e18Var, (i >> 3) & 14, 0));
                    z = z3 ? 1 : 0;
                    e18Var.p(z);
                } else {
                    z = z3 ? 1 : 0;
                    e18Var.a0(-1025186040);
                    e18Var.p(z);
                }
                ou7Var3 = ou7Var2;
                arrayList = arrayList2;
                i3 = i7;
                i4 = i6;
                z2 = z;
            }
            boolean z4 = z2;
            e18Var.p(z4);
            linkedHashMap2.put(Float.valueOf(fFloatValue2), new cu7(arrayList));
            ou7Var3 = ou7Var2;
            z2 = z4 ? 1 : 0;
            i3 = i3;
            i4 = i4;
        }
        e18Var.p(z2 ? 1 : 0);
        boolean zH2 = e18Var.h(linkedHashMap2);
        Object objN4 = e18Var.N();
        Object obj5 = objN4;
        if (zH2 || objN4 == lz1Var) {
            gv7 gv7Var2 = new gv7(2, linkedHashMap2);
            e18Var.k0(gv7Var2);
            obj5 = gv7Var2;
        }
        yt7 yt7Var3 = (yt7) obj5;
        yt7VarArr2[0] = yt7Var3;
        e18Var.p(false);
        return yt7Var3;
    }
}
