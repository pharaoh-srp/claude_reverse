package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pk7 {
    public static final pk7 b = new pk7(0);
    public final int a;

    public pk7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pk7) {
            return this.a == ((pk7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
