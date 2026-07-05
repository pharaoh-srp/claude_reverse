package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class khc {
    public final float a;
    public final float b;

    public khc(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue < this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof khc)) {
            return false;
        }
        float f = this.a;
        float f2 = this.b;
        if (f >= f2) {
            khc khcVar = (khc) obj;
            if (khcVar.a >= khcVar.b) {
                return true;
            }
        }
        khc khcVar2 = (khc) obj;
        return f == khcVar2.a && f2 == khcVar2.b;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f >= f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + "..<" + this.b;
    }
}
