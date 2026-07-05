package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zv7 implements Comparable {
    public final int E;
    public final int F;
    public final String G;
    public final String H;

    public zv7(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.E = i;
        this.F = i2;
        this.G = str;
        this.H = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zv7 zv7Var = (zv7) obj;
        zv7Var.getClass();
        int i = this.E - zv7Var.E;
        return i == 0 ? this.F - zv7Var.F : i;
    }
}
