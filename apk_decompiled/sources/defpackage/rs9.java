package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rs9 {
    public final String a;
    public final String b;

    static {
        tpi.w(0);
        tpi.w(1);
    }

    public rs9(String str, String str2) {
        this.a = tpi.D(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rs9.class == obj.getClass()) {
            rs9 rs9Var = (rs9) obj;
            if (Objects.equals(this.a, rs9Var.a) && Objects.equals(this.b, rs9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
