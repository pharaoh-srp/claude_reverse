package defpackage;

import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s5l {
    public final String a;
    public final boolean b;
    public final e0 c;
    public final BitSet d;
    public final BitSet e;
    public final bp0 f;
    public final bp0 g;
    public final /* synthetic */ l5l h;

    public s5l(l5l l5lVar, String str, e0 e0Var, BitSet bitSet, BitSet bitSet2, bp0 bp0Var, bp0 bp0Var2) {
        this.h = l5lVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = bp0Var;
        this.g = new bp0(0);
        for (Integer num : (xo0) bp0Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bp0Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = e0Var;
    }

    public final v a(int i) {
        ArrayList arrayList;
        List list;
        khk khkVarT = v.t();
        khkVarT.c();
        v.q((v) khkVarT.F, i);
        khkVarT.c();
        v.s((v) khkVarT.F, this.b);
        e0 e0Var = this.c;
        if (e0Var != null) {
            khkVarT.c();
            v.u((v) khkVarT.F, e0Var);
        }
        qhk qhkVarB = e0.B();
        qhkVarB.h(dik.a1(this.d));
        qhkVarB.l(dik.a1(this.e));
        bp0 bp0Var = this.f;
        if (bp0Var == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(bp0Var.G);
            for (Integer num : (xo0) bp0Var.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) bp0Var.get(num);
                if (l != null) {
                    lhk lhkVarT = w.t();
                    lhkVarT.c();
                    w.q((w) lhkVarT.F, iIntValue);
                    long jLongValue = l.longValue();
                    lhkVarT.c();
                    w.r((w) lhkVarT.F, jLongValue);
                    arrayList2.add((w) lhkVarT.b());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            qhkVarB.g(arrayList);
        }
        bp0 bp0Var2 = this.g;
        if (bp0Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(bp0Var2.G);
            for (Integer num2 : (xo0) bp0Var2.keySet()) {
                rhk rhkVarU = f0.u();
                int iIntValue2 = num2.intValue();
                rhkVarU.c();
                f0.r((f0) rhkVarU.F, iIntValue2);
                List list2 = (List) bp0Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    rhkVarU.c();
                    f0.s((f0) rhkVarU.F, list2);
                }
                arrayList3.add((f0) rhkVarU.b());
            }
            list = arrayList3;
        }
        qhkVarB.j(list);
        khkVarT.c();
        v.r((v) khkVarT.F, (e0) qhkVarB.b());
        return (v) khkVarT.b();
    }

    public final void c(spj spjVar) {
        int iT;
        boolean z;
        umk umkVar = (umk) this.h.E;
        switch (spjVar.g) {
            case 0:
                iT = ((b) spjVar.i).t();
                break;
            default:
                iT = ((e) spjVar.i).p();
                break;
        }
        Boolean bool = spjVar.c;
        if (bool != null) {
            this.e.set(iT, bool.booleanValue());
        }
        Boolean bool2 = spjVar.d;
        if (bool2 != null) {
            this.d.set(iT, bool2.booleanValue());
        }
        if (spjVar.e != null) {
            Integer numValueOf = Integer.valueOf(iT);
            bp0 bp0Var = this.f;
            Long l = (Long) bp0Var.get(numValueOf);
            long jLongValue = spjVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                bp0Var.put(Integer.valueOf(iT), Long.valueOf(jLongValue));
            }
        }
        if (spjVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iT);
            bp0 bp0Var2 = this.g;
            List arrayList = (List) bp0Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                bp0Var2.put(Integer.valueOf(iT), arrayList);
            }
            boolean zB = false;
            switch (spjVar.g) {
                case 0:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            u2l.a();
            vqj vqjVar = umkVar.K;
            yek yekVar = zvj.n0;
            String str = this.a;
            if (vqjVar.X0(str, yekVar)) {
                switch (spjVar.g) {
                    case 0:
                        zB = ((b) spjVar.i).B();
                        break;
                }
                if (zB) {
                    arrayList.clear();
                }
            }
            u2l.a();
            boolean zX0 = umkVar.K.X0(str, yekVar);
            Long l2 = spjVar.f;
            if (!zX0) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            long jLongValue2 = l2.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public s5l(l5l l5lVar, String str) {
        this.h = l5lVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new bp0(0);
        this.g = new bp0(0);
    }
}
