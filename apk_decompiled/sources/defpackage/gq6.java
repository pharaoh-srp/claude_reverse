package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class gq6 extends i2 implements fq6, RandomAccess, Serializable {
    public final Enum[] E;

    public gq6(Enum[] enumArr) {
        enumArr.getClass();
        this.E = enumArr;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) mp0.I0(r3.ordinal(), this.E)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e2 e2Var = i2.Companion;
        Enum[] enumArr = this.E;
        int length = enumArr.length;
        e2Var.getClass();
        e2.b(i, length);
        return enumArr[i];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.length;
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) mp0.I0(iOrdinal, this.E)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) mp0.I0(iOrdinal, this.E)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
