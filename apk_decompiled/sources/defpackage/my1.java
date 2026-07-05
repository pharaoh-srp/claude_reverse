package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class my1 {
    public final /* synthetic */ int E = 0;
    public int F;

    public my1(int i) {
        this.F = i;
    }

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(int i) {
        this.F = i | this.F;
    }

    public boolean c(int i) {
        return (this.F & i) == i;
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return b(this.F);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ my1() {
    }
}
