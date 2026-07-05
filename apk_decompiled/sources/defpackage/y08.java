package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y08 {
    public int a;

    public y08(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return vb7.l(this.a, " }", sb);
    }
}
