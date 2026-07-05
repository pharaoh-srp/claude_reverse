package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tsb implements fjb {
    public final float a;
    public final ssb b;
    public final ssb c;

    public tsb(float f, ssb ssbVar, ssb ssbVar2) {
        this.a = f;
        this.b = ssbVar;
        this.c = ssbVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tsb)) {
            return false;
        }
        tsb tsbVar = (tsb) obj;
        return Float.compare(this.a, tsbVar.a) == 0 && Objects.equals(this.b, tsbVar.b) && Objects.equals(this.c, tsbVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        ssb ssbVar = this.b;
        int iHashCode2 = (iHashCode + (ssbVar != null ? ssbVar.hashCode() : 0)) * 31;
        ssb ssbVar2 = this.c;
        return iHashCode2 + (ssbVar2 != null ? ssbVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
