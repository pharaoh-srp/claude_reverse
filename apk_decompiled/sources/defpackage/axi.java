package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class axi {
    public final Number a;
    public final Number b;
    public final Number c;
    public final Number d;

    public axi(Number number, Number number2, Number number3, Number number4) {
        this.a = number;
        this.b = number2;
        this.c = number3;
        this.d = number4;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(this.a, "x");
        qh9Var.p(this.b, "y");
        qh9Var.p(this.c, "width");
        qh9Var.p(this.d, "height");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axi)) {
            return false;
        }
        axi axiVar = (axi) obj;
        return this.a.equals(axiVar.a) && this.b.equals(axiVar.b) && this.c.equals(axiVar.c) && this.d.equals(axiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousRect(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
