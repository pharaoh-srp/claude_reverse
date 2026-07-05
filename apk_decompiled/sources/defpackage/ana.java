package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ana {
    public final float a;
    public final float b;

    public ana(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ana)) {
            return false;
        }
        ana anaVar = (ana) obj;
        return Float.compare(this.a, anaVar.a) == 0 && Float.compare(this.b, anaVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Progress(min=" + this.a + ", max=" + this.b + ")";
    }
}
