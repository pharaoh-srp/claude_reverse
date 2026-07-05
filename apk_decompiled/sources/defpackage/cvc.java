package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cvc extends nvc {
    public final float c;
    public final float d;

    public cvc(float f, float f2) {
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
        if (!(obj instanceof cvc)) {
            return false;
        }
        cvc cvcVar = (cvc) obj;
        return Float.compare(this.c, cvcVar.c) == 0 && Float.compare(this.d, cvcVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ebh.o(sb, this.d, ')');
    }
}
