package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us4 {
    public static final us4 e = new us4(new vj(6), new ho3(), new ts4(), null);
    public final pz7 a;
    public final rz7 b;
    public final tz7 c;
    public final c61 d;

    public us4(pz7 pz7Var, rz7 rz7Var, tz7 tz7Var, c61 c61Var) {
        this.a = pz7Var;
        this.b = rz7Var;
        this.c = tz7Var;
        this.d = c61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us4)) {
            return false;
        }
        us4 us4Var = (us4) obj;
        return this.a.equals(us4Var.a) && this.b.equals(us4Var.b) && this.c.equals(us4Var.c) && x44.r(this.d, us4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        c61 c61Var = this.d;
        return iHashCode + (c61Var == null ? 0 : c61Var.hashCode());
    }

    public final String toString() {
        return "ConwayDeviceCallbacks(getLocation=" + this.a + ", readCalendar=" + this.b + ", createCalendarEvent=" + this.c + ", speak=" + this.d + ")";
    }
}
