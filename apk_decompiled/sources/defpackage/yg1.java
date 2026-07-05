package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yg1 {
    public final ih1 a;
    public final List b;
    public final byte[] c;

    public yg1(ih1 ih1Var, List list, byte[] bArr) {
        list.getClass();
        this.a = ih1Var;
        this.b = list;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yg1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yg1 yg1Var = (yg1) obj;
        if (!this.a.equals(yg1Var.a) || !x44.r(this.b, yg1Var.b)) {
            return false;
        }
        byte[] bArr = yg1Var.c;
        byte[] bArr2 = this.c;
        return bArr2 != null ? bArr != null && Arrays.equals(bArr2, bArr) : bArr == null;
    }

    public final int hashCode() {
        int iM = kgh.m(this.a.a.hashCode() * 31, 31, this.b);
        byte[] bArr = this.c;
        return iM + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("BatchData(id=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", metadata=");
        return ij0.m(sb, string, ")");
    }
}
