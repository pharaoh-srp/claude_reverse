package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pn3 implements rn3 {
    public final float a;

    public pn3(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn3) && Float.compare(this.a, ((pn3) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Scrub(progress=" + this.a + ")";
    }
}
