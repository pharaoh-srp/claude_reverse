package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vu6 extends av6 {
    public final int a;
    public final /* synthetic */ int b;

    public vu6(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        int i = this.b;
        int i2 = this.a;
        switch (i) {
            case 0:
                if (yj6Var2.Z() == i2) {
                }
                break;
            case 1:
                if (yj6Var2.Z() > i2) {
                }
                break;
            default:
                if (yj6Var != yj6Var2 && yj6Var2.Z() < i2) {
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        switch (i) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i2));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i2));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i2));
        }
    }
}
