package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qz8 extends cz8 implements Set {
    public static final /* synthetic */ int G = 0;
    public transient nz8 F;

    public static int m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            fd9.C("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static qz8 o(int i, Object... objArr) {
        if (i == 0) {
            return cee.N;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new g8g(obj);
        }
        int iM = m(i);
        Object[] objArr2 = new Object[iM];
        int i2 = iM - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                mr9.h(grc.p(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iH = bsk.h(iHashCode);
            while (true) {
                int i6 = iH & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iH++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g8g(obj4);
        }
        if (m(i4) < iM / 2) {
            return o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new cee(i3, i2, i4, objArr, objArr2);
    }

    public static qz8 p(Collection collection) {
        if ((collection instanceof qz8) && !(collection instanceof SortedSet)) {
            qz8 qz8Var = (qz8) collection;
            if (!qz8Var.k()) {
                return qz8Var;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    public static qz8 r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        fd9.C("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return o(length, objArr2);
    }

    @Override // defpackage.cz8
    public nz8 a() {
        nz8 nz8Var = this.F;
        if (nz8Var != null) {
            return nz8Var;
        }
        nz8 nz8VarQ = q();
        this.F = nz8VarQ;
        return nz8VarQ;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof qz8) && (this instanceof cee) && (((qz8) obj) instanceof cee) && ((cee) this).I != obj.hashCode()) {
            return false;
        }
        return uj5.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return uj5.k(this);
    }

    public nz8 q() {
        Object[] array = toArray(cz8.E);
        iz8 iz8Var = nz8.F;
        return nz8.m(array.length, array);
    }
}
