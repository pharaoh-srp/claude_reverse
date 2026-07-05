package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dj0 implements fjb {
    public final int a;
    public final String b;

    public dj0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return ij0.m(sb, this.b, ")");
    }
}
