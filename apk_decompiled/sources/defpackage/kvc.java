package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kvc extends nvc {
    public final float c;
    public final float d;

    public kvc(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final float a() {
        return this.c;
    }

    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvc)) {
            return false;
        }
        kvc kvcVar = (kvc) obj;
        return Float.compare(this.c, kvcVar.c) == 0 && Float.compare(this.d, kvcVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ebh.o(sb, this.d, ')');
    }
}
