package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa {
    public final Number a;
    public final Number b;
    public final Number c;
    public final Number d;

    public fa(Number number, Number number2, Number number3, Number number4) {
        this.a = number;
        this.b = number2;
        this.c = number3;
        this.d = number4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.a.equals(faVar.a) && x44.r(this.b, faVar.b) && x44.r(this.c, faVar.c) && x44.r(this.d, faVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Number number = this.b;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.c;
        int iHashCode3 = (iHashCode2 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Number number3 = this.d;
        return iHashCode3 + (number3 != null ? number3.hashCode() : 0);
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.a + ", sessionReplaySampleRate=" + this.b + ", profilingSampleRate=" + this.c + ", traceSampleRate=" + this.d + ")";
    }
}
