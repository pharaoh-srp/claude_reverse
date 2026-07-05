package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends k5 {
    public static n5 c;

    @Override // defpackage.k5
    public final int[] g(int i) {
        int length = l().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && l().charAt(i) == '\n' && (l().charAt(i) == '\n' || (i != 0 && l().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !t(i2)) {
            i2++;
        }
        return k(i, i2);
    }

    @Override // defpackage.k5
    public final int[] r(int i) {
        int length = l().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && l().charAt(i - 1) == '\n' && !t(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (l().charAt(i2) == '\n' || (i2 != 0 && l().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return k(i2, i);
    }

    public final boolean t(int i) {
        if (i <= 0 || l().charAt(i - 1) == '\n') {
            return false;
        }
        return i == l().length() || l().charAt(i) == '\n';
    }
}
