package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u8f {
    public final float a;
    public final float b;

    public u8f(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8f)) {
            return false;
        }
        u8f u8fVar = (u8f) obj;
        return Float.compare(this.a, u8fVar.a) == 0 && Float.compare(this.b, u8fVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAreaOffsets(start=");
        sb.append(this.a);
        sb.append(", end=");
        return ebh.o(sb, this.b, ')');
    }
}
