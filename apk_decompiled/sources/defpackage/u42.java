package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u42 {
    public v42 a;
    public b1f b;
    public int c;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "RenderOptions" : "Document");
        sb.append(")");
        return sb.toString();
    }
}
