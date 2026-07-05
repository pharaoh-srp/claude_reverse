package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tzi {
    public final Float a;

    public tzi(Float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzi) && this.a.equals(((tzi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 29791;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.a + ", sessionReplaySampleRate=null, profilingSampleRate=null, traceSampleRate=null)";
    }
}
