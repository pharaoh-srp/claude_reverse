package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr0 {
    public final String a;
    public final bs0 b;

    public cr0(String str, bs0 bs0Var) {
        str.getClass();
        this.a = str;
        this.b = bs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr0)) {
            return false;
        }
        cr0 cr0Var = (cr0) obj;
        return x44.r(this.a, cr0Var.a) && this.b == cr0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", renderType=" + this.b + ")";
    }
}
