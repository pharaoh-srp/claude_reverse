package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u21 implements w21 {
    public final String a;

    public u21(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u21) && x44.r(this.a, ((u21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("PlainText(text=", this.a, ")");
    }
}
