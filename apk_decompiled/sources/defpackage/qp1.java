package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qp1 extends jv8 {
    public final byte[] b;

    public qp1(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qp1.class != obj.getClass()) {
            return false;
        }
        qp1 qp1Var = (qp1) obj;
        return this.a.equals(qp1Var.a) && Arrays.equals(this.b, qp1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + kgh.l(527, 31, this.a);
    }
}
