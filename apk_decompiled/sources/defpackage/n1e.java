package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1e {
    public static int checkGreaterThanOrEqual(int i, int i2, String str) {
        if (i >= i2) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: >= " + i2 + ')');
    }
}
