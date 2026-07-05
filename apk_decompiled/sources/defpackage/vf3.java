package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vf3 {
    public final LinkedHashMap a;

    public vf3(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(uf3 uf3Var) {
        long[] jArr = uf3Var.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(uf3Var.e[0]), uf3Var);
        }
    }

    public pf5 b() {
        pf5 pf5Var = new pf5(this.a);
        rvk.o(pf5Var);
        return pf5Var;
    }

    public uf3 c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (uf3 uf3Var : this.a.values()) {
            arrayList.add(uf3Var.b);
            arrayList2.add(uf3Var.c);
            arrayList3.add(uf3Var.d);
            arrayList4.add(uf3Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        fd9.D("the total number of elements (%s) in the arrays must fit in an int", length == ((long) i), length);
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new uf3(iArr3, dkk.f((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), dkk.f((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), dkk.f((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void d(String str, Object obj) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            kce kceVar = jce.a;
            pl9 pl9VarB = kceVar.b(cls);
            if (!pl9VarB.equals(kceVar.b(Boolean.TYPE)) && !pl9VarB.equals(kceVar.b(Byte.TYPE)) && !pl9VarB.equals(kceVar.b(Integer.TYPE)) && !pl9VarB.equals(kceVar.b(Long.TYPE)) && !pl9VarB.equals(kceVar.b(Float.TYPE)) && !pl9VarB.equals(kceVar.b(Double.TYPE)) && !pl9VarB.equals(kceVar.b(String.class)) && !pl9VarB.equals(kceVar.b(Boolean[].class)) && !pl9VarB.equals(kceVar.b(Byte[].class)) && !pl9VarB.equals(kceVar.b(Integer[].class)) && !pl9VarB.equals(kceVar.b(Long[].class)) && !pl9VarB.equals(kceVar.b(Float[].class)) && !pl9VarB.equals(kceVar.b(Double[].class)) && !pl9VarB.equals(kceVar.b(String[].class))) {
                int i = 0;
                if (pl9VarB.equals(kceVar.b(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = ii5.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (pl9VarB.equals(kceVar.b(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = ii5.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (pl9VarB.equals(kceVar.b(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = ii5.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (pl9VarB.equals(kceVar.b(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = ii5.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (pl9VarB.equals(kceVar.b(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = ii5.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!pl9VarB.equals(kceVar.b(double[].class))) {
                        pmf.i("Key ", str, " has invalid type ", pl9VarB);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = ii5.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        this.a.put(str, obj);
    }

    public void e(HashMap map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            d((String) entry.getKey(), entry.getValue());
        }
    }

    public void f(String str) {
        this.a.put("_dd.sdk.instanceName", str);
    }

    public vf3(asc ascVar) {
        this.a = sta.t0(ascVar.E);
    }
}
