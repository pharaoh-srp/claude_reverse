package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 implements c29 {
    public final Float a;
    public final Boolean b;

    public nh1(Float f, Boolean bool) {
        this.a = f;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        return x44.r(this.a, nh1Var.a) && x44.r(this.b, nh1Var.b);
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BatteryInfo(batteryLevel=" + this.a + ", lowPowerMode=" + this.b + ")";
    }
}
