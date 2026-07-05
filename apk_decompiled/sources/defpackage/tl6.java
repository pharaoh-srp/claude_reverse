package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tl6 implements sl6 {
    public final int E;
    public int F = -1;
    public int G = -1;

    public tl6(int i) {
        this.E = i;
    }

    @Override // defpackage.sl6
    public final boolean e(CharSequence charSequence, int i, int i2, pbi pbiVar) {
        int i3 = this.E;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.F = i;
        this.G = i2;
        return false;
    }

    @Override // defpackage.sl6
    public final Object getResult() {
        return this;
    }
}
