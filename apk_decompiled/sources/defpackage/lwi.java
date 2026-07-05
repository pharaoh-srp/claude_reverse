package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lwi {
    public final Number a;
    public final Number b;
    public final Number c;
    public final Number d;

    public lwi(Number number, Number number2, Number number3, Number number4) {
        this.a = number;
        this.b = number2;
        this.c = number3;
        this.d = number4;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(this.a, "min");
        qh9Var.p(this.b, "max");
        qh9Var.p(this.c, "average");
        Number number = this.d;
        if (number != null) {
            qh9Var.p(number, "metric_max");
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwi)) {
            return false;
        }
        lwi lwiVar = (lwi) obj;
        return x44.r(this.a, lwiVar.a) && x44.r(this.b, lwiVar.b) && x44.r(this.c, lwiVar.c) && x44.r(this.d, lwiVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Number number = this.d;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "FlutterBuildTime(min=" + this.a + ", max=" + this.b + ", average=" + this.c + ", metricMax=" + this.d + ")";
    }
}
