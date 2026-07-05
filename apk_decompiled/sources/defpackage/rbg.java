package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rbg implements fjb {
    public final float a;
    public final int b;

    public rbg(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rbg.class == obj.getClass()) {
            rbg rbgVar = (rbg) obj;
            if (this.a == rbgVar.a && this.b == rbgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
