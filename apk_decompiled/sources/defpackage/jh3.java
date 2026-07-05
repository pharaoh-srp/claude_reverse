package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jh3 {
    public final gh3 a;
    public final int b;

    public jh3(gh3 gh3Var, int i) {
        this.a = gh3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3Var = (jh3) obj;
        return this.a.equals(jh3Var.a) && this.b == jh3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
