package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class pz8 extends bz8 {
    public Object[] d;
    public int e;

    @Override // defpackage.bz8
    public /* bridge */ /* synthetic */ bz8 a(Object obj) {
        f(obj);
        return this;
    }

    public void f(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iM = qz8.m(this.b);
            Object[] objArr = this.d;
            if (iM <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iH = bsk.h(iHashCode);
                while (true) {
                    int i = iH & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iH = i + 1;
                    }
                }
            }
        }
        this.d = null;
        b(obj);
    }

    public void g(List list) {
        list.getClass();
        if (this.d == null) {
            c(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public qz8 h() {
        qz8 qz8VarO;
        int i = this.b;
        if (i == 0) {
            int i2 = qz8.G;
            return cee.N;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i3 = qz8.G;
            return new g8g(obj);
        }
        if (this.d == null || qz8.m(i) != this.d.length) {
            qz8VarO = qz8.o(this.b, this.a);
            this.b = qz8VarO.size();
        } else {
            int i4 = this.b;
            Object[] objArrCopyOf = this.a;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            qz8VarO = new cee(this.e, r9.length - 1, this.b, objArrCopyOf, this.d);
        }
        this.c = true;
        this.d = null;
        return qz8VarO;
    }
}
