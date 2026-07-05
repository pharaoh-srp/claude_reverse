package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ejd {
    public final float a;

    public ejd(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejd) && Float.compare(this.a, ((ejd) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "ProfilingConfiguration(customEndpointUrl=null, sampleRate=" + this.a + ")";
    }
}
