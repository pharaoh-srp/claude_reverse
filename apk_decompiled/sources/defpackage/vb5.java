package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vb5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vb5(String str) {
        String[] strArrSplit = str.split("\\.");
        this.a = Integer.parseInt(strArrSplit[0]);
        this.b = Integer.parseInt(strArrSplit[1]);
        this.c = Integer.parseInt(strArrSplit[2]);
        this.d = Integer.parseInt(strArrSplit[3]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        return ij0.g(this.d, ".", sb);
    }
}
