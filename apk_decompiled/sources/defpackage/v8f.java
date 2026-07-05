package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v8f {
    public final zy7 a;
    public final zy7 b;
    public final boolean c;

    public v8f(zy7 zy7Var, zy7 zy7Var2, boolean z) {
        this.a = zy7Var;
        this.b = zy7Var2;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.a.a()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.b.a()).floatValue());
        sb.append(", reverseScrolling=");
        return y6a.p(sb, this.c, ')');
    }
}
