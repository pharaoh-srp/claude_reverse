package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class jnf implements SerialDescriptor, f62 {
    public final String a;
    public final u00 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final u0h l;

    public jnf(String str, u00 u00Var, int i, List list, oh3 oh3Var) {
        this.a = str;
        this.b = u00Var;
        this.c = i;
        this.d = oh3Var.b;
        ArrayList arrayList = oh3Var.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(tta.d0(x44.y(arrayList, 12)));
        w44.m1(arrayList, hashSet);
        this.e = hashSet;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = yfd.s(oh3Var.e);
        this.h = (List[]) oh3Var.f.toArray(new List[0]);
        ArrayList arrayList2 = oh3Var.g;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        strArr.getClass();
        c19 c19Var = new c19(0, new p7(2, strArr));
        ArrayList arrayList3 = new ArrayList(x44.y(c19Var, 10));
        Iterator it2 = c19Var.iterator();
        while (true) {
            f2 f2Var = (f2) it2;
            if (!((Iterator) f2Var.G).hasNext()) {
                this.j = sta.p0(arrayList3);
                this.k = yfd.s(list);
                this.l = new u0h(new p3f(8, this));
                return;
            }
            b19 b19Var = (b19) f2Var.next();
            arrayList3.add(new cpc(b19Var.b, Integer.valueOf(b19Var.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // defpackage.f62
    public final Set b() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jnf) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals(this.k, ((jnf) obj).k)) {
                int iE = serialDescriptor.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        if (x44.r(serialDescriptorArr[i2].a(), serialDescriptor.h(i2).a()) && x44.r(serialDescriptorArr[i2].getKind(), serialDescriptor.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return d4c.p0(this);
    }
}
