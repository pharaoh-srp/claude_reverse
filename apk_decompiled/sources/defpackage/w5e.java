package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w5e implements y5e {
    public final int a;
    public final CharSequence b;

    public w5e(int i, CharSequence charSequence) {
        charSequence.getClass();
        this.a = i;
        this.b = charSequence;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5e)) {
            return false;
        }
        w5e w5eVar = (w5e) obj;
        return this.a == w5eVar.a && x44.r(this.b, w5eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(code=" + this.a + ", message=" + ((Object) this.b) + ")";
    }
}
