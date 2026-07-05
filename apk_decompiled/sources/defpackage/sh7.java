package defpackage;

import androidx.health.platform.client.proto.g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sh7 {
    public static final sh7 c = new sh7(0);
    public final ebg a = new ebg(16);
    public boolean b;

    public sh7(int i) {
        f();
    }

    public static int c(bfj bfjVar, Object obj) {
        switch (bfjVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return v34.g(((Long) obj).longValue());
            case 3:
                return v34.g(((Long) obj).longValue());
            case 4:
                return v34.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return v34.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    xh6.f("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((b3) obj).c();
            case 10:
                return v34.e((b3) obj);
            case 11:
                if (obj instanceof l22) {
                    l22 l22Var = (l22) obj;
                    return l22Var.size() + v34.f(l22Var.size());
                }
                byte[] bArr = (byte[]) obj;
                return v34.f(bArr.length) + bArr.length;
            case 12:
                return v34.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof l89 ? v34.c(((l89) obj).a()) : v34.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return v34.f((iIntValue >> 31) ^ (iIntValue << 1));
            case g.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return v34.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                pmf.o("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(s28 s28Var, Object obj) {
        bfj bfjVar = s28Var.F;
        int i = s28Var.E;
        if (!s28Var.G) {
            int iH = v34.h(i);
            if (bfjVar == bfj.I) {
                iH *= 2;
            }
            return c(bfjVar, obj) + iH;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iH2 = v34.h(i);
            if (bfjVar == bfj.I) {
                iH2 *= 2;
            }
            iC += c(bfjVar, obj2) + iH2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        s28 s28Var = (s28) entry.getKey();
        if (s28Var.F.E != ffj.N) {
            return true;
        }
        if (s28Var.G) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((b3) it.next()).b()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof b3)) {
            sz6.p("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((b3) value).b()) {
            return true;
        }
        return false;
    }

    public static Object h(t34 t34Var, bfj bfjVar) {
        switch (bfjVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(t34Var.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(t34Var.i()));
            case 2:
                return Long.valueOf(t34Var.l());
            case 3:
                return Long.valueOf(t34Var.l());
            case 4:
                return Integer.valueOf(t34Var.k());
            case 5:
                return Long.valueOf(t34Var.j());
            case 6:
                return Integer.valueOf(t34Var.i());
            case 7:
                return Boolean.valueOf(t34Var.l() != 0);
            case 8:
                int iK = t34Var.k();
                int i = t34Var.b;
                int i2 = t34Var.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(t34Var.h(iK), "UTF-8");
                }
                String str = new String(t34Var.a, i2, iK, "UTF-8");
                t34Var.d += iK;
                return str;
            case 9:
                sz6.p("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                sz6.p("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return t34Var.e();
            case 12:
                return Integer.valueOf(t34Var.k());
            case 13:
                sz6.p("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(t34Var.i());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Long.valueOf(t34Var.j());
            case 16:
                int iK2 = t34Var.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case g.MAX_FIELD_NUMBER /* 17 */:
                long jL = t34Var.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                pmf.o("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.bfj r2, java.lang.Object r3) {
        /*
            r3.getClass()
            ffj r2 = r2.E
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof defpackage.b3
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof defpackage.l89
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof defpackage.l22
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            defpackage.sz6.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh7.j(bfj, java.lang.Object):void");
    }

    public static void k(v34 v34Var, bfj bfjVar, Object obj) {
        switch (bfjVar.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                v34Var.getClass();
                v34Var.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                v34Var.getClass();
                v34Var.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                v34Var.w(((Long) obj).longValue());
                break;
            case 3:
                v34Var.w(((Long) obj).longValue());
                break;
            case 4:
                v34Var.n(((Integer) obj).intValue());
                break;
            case 5:
                v34Var.u(((Long) obj).longValue());
                break;
            case 6:
                v34Var.t(((Integer) obj).intValue());
                break;
            case 7:
                v34Var.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                v34Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                v34Var.v(bytes.length);
                v34Var.s(bytes);
                break;
            case 9:
                v34Var.getClass();
                ((b3) obj).f(v34Var);
                break;
            case 10:
                v34Var.p((b3) obj);
                break;
            case 11:
                if (!(obj instanceof l22)) {
                    byte[] bArr = (byte[]) obj;
                    v34Var.getClass();
                    v34Var.v(bArr.length);
                    v34Var.s(bArr);
                } else {
                    l22 l22Var = (l22) obj;
                    v34Var.getClass();
                    v34Var.v(l22Var.size());
                    v34Var.r(l22Var);
                }
                break;
            case 12:
                v34Var.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof l89)) {
                    v34Var.n(((Integer) obj).intValue());
                } else {
                    v34Var.n(((l89) obj).a());
                }
                break;
            case 14:
                v34Var.t(((Integer) obj).intValue());
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                v34Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                v34Var.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                v34Var.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(s28 s28Var, Object obj) {
        List arrayList;
        if (!s28Var.G) {
            sz6.p("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(s28Var.F, obj);
        ebg ebgVar = this.a;
        Object obj2 = ebgVar.get(s28Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            ebgVar.put(s28Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sh7 clone() {
        ebg ebgVar;
        sh7 sh7Var = new sh7();
        int i = 0;
        while (true) {
            ebgVar = this.a;
            if (i >= ebgVar.F.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ebgVar.F.get(i);
            sh7Var.i((s28) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : ebgVar.d()) {
            sh7Var.i((s28) entry2.getKey(), entry2.getValue());
        }
        return sh7Var;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        ebg ebgVar = this.a;
        if (!ebgVar.H) {
            for (int i = 0; i < ebgVar.F.size(); i++) {
                Map.Entry entry = (Map.Entry) ebgVar.F.get(i);
                if (((s28) entry.getKey()).G) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : ebgVar.d()) {
                if (((s28) entry2.getKey()).G) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!ebgVar.H) {
            ebgVar.G = ebgVar.G.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ebgVar.G);
            ebgVar.H = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        s28 s28Var = (s28) entry.getKey();
        Object value = entry.getValue();
        boolean z = s28Var.G;
        ebg ebgVar = this.a;
        if (z) {
            Object arrayList = ebgVar.get(s28Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            ebgVar.put(s28Var, arrayList);
            return;
        }
        if (s28Var.F.E != ffj.N) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            ebgVar.put(s28Var, value);
            return;
        }
        Object obj2 = ebgVar.get(s28Var);
        if (obj2 != null) {
            ebgVar.put(s28Var, ((b3) obj2).e().f((u28) ((b3) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        ebgVar.put(s28Var, value);
    }

    public final void i(s28 s28Var, Object obj) {
        boolean z = s28Var.G;
        bfj bfjVar = s28Var.F;
        if (!z) {
            j(bfjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                sz6.p("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(bfjVar, it.next());
            }
            obj = arrayList;
        }
        this.a.put(s28Var, obj);
    }

    public sh7() {
    }
}
