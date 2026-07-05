package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vvi {
    public final Number a;
    public final Number b;
    public final Number c;
    public final Number d;
    public final Boolean e;

    public vvi(Number number, Number number2, Number number3, Number number4, Boolean bool) {
        this.a = number;
        this.b = number2;
        this.c = number3;
        this.d = number4;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvi)) {
            return false;
        }
        vvi vviVar = (vvi) obj;
        return this.a.equals(vviVar.a) && x44.r(this.b, vviVar.b) && x44.r(this.c, vviVar.c) && x44.r(this.d, vviVar.d) && x44.r(this.e, vviVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Number number = this.b;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.c;
        int iHashCode3 = (iHashCode2 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Number number3 = this.d;
        int iHashCode4 = (iHashCode3 + (number3 == null ? 0 : number3.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(sessionSampleRate=");
        sb.append(this.a);
        sb.append(", sessionReplaySampleRate=");
        sb.append(this.b);
        sb.append(", profilingSampleRate=");
        sb.append(this.c);
        sb.append(", traceSampleRate=");
        sb.append(this.d);
        sb.append(", startSessionReplayRecordingManually=");
        return qy1.h(sb, this.e, ")");
    }
}
