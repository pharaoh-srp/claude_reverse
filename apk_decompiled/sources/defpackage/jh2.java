package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jh2 {
    public final kh2 a;
    public final String b;

    public jh2(kh2 kh2Var, String str) {
        str.getClass();
        this.a = kh2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh2)) {
            return false;
        }
        jh2 jh2Var = (jh2) obj;
        return this.a == jh2Var.a && x44.r(this.b, jh2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChannelEvent(source=" + this.a + ", payload=" + this.b + ")";
    }
}
