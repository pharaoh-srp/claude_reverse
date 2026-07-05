package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ku9 {
    public final int a;

    public ku9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku9) && this.a == ((ku9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("LayoutInfo(layoutId="), this.a, ')');
    }
}
