package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t44 {
    public final float a;
    public final float b;

    public t44(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t44)) {
            return false;
        }
        t44 t44Var = (t44) obj;
        return Float.compare(this.a, t44Var.a) == 0 && Float.compare(this.b, t44Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScrollPadding(start=");
        sb.append(this.a);
        sb.append(", end=");
        return ebh.o(sb, this.b, ')');
    }
}
