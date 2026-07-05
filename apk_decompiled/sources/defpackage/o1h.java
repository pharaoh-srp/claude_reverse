package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o1h {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public o1h(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    public static o1h a(o1h o1hVar, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = o1hVar.a;
        }
        if ((i2 & 2) != 0) {
            i = o1hVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = o1hVar.c;
        }
        if ((i2 & 8) != 0) {
            z3 = o1hVar.d;
        }
        o1hVar.getClass();
        return new o1h(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1h)) {
            return false;
        }
        o1h o1hVar = (o1h) obj;
        return this.a == o1hVar.a && this.b == o1hVar.b && this.c == o1hVar.c && this.d == o1hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fsh.p(vb7.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.a + ", batteryLevel=" + this.b + ", powerSaveMode=" + this.c + ", onExternalPowerSource=" + this.d + ")";
    }

    public /* synthetic */ o1h() {
        this(-1, false, false, false);
    }
}
