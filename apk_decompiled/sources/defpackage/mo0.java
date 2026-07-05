package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mo0 implements CharSequence {
    public final char[] E;
    public int F;

    public mo0(char[] cArr) {
        this.E = cArr;
        this.F = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.E[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.F;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return isg.c0(this.E, i, Math.min(i2, this.F));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.F;
        return isg.c0(this.E, 0, Math.min(i, i));
    }
}
