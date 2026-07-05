package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvc extends nvc {
    public final float c;
    public final float d;

    public hvc(float f, float f2) {
        super(3);
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
        if (!(obj instanceof hvc)) {
            return false;
        }
        hvc hvcVar = (hvc) obj;
        return Float.compare(this.c, hvcVar.c) == 0 && Float.compare(this.d, hvcVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ebh.o(sb, this.d, ')');
    }
}
