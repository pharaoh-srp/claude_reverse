package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fxi {
    public final Number a;
    public final Number b;
    public final Number c;
    public final Number d;

    public fxi(Number number, Number number2, Number number3, Number number4) {
        this.a = number;
        this.b = number2;
        this.c = number3;
        this.d = number4;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(this.a, "max_depth");
        qh9Var.p(this.b, "max_depth_scroll_top");
        qh9Var.p(this.c, "max_scroll_height");
        qh9Var.p(this.d, "max_scroll_height_time");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxi)) {
            return false;
        }
        fxi fxiVar = (fxi) obj;
        return this.a.equals(fxiVar.a) && this.b.equals(fxiVar.b) && this.c.equals(fxiVar.c) && this.d.equals(fxiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Scroll(maxDepth=" + this.a + ", maxDepthScrollTop=" + this.b + ", maxScrollHeight=" + this.c + ", maxScrollHeightTime=" + this.d + ")";
    }
}
