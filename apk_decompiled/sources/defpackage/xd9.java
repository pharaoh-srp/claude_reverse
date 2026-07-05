package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xd9 {
    public final gh3 a;
    public final byte[] b;
    public final vd9 c;

    public xd9(gh3 gh3Var, vd9 vd9Var, int i) {
        vd9Var = (i & 4) != 0 ? null : vd9Var;
        this.a = gh3Var;
        this.b = null;
        this.c = vd9Var;
    }

    public final gh3 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd9)) {
            return false;
        }
        xd9 xd9Var = (xd9) obj;
        return this.a.equals(xd9Var.a) && x44.r(this.b, xd9Var.b) && x44.r(this.c, xd9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        vd9 vd9Var = this.c;
        return iHashCode2 + (vd9Var != null ? ((jbe) vd9Var).a.hashCode() : 0);
    }

    public final String toString() {
        return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
    }
}
