package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef5 {
    public static final bf5 a = bf5.f(0);

    public static ef5 a(String str) {
        long jZ;
        long jZ2;
        if (str.length() <= 16) {
            return bf5.f(j8.Z(str, 0, str.length(), false));
        }
        int length = str.length();
        int length2 = str.length();
        if (length <= 0 || length > 32 || length > length2) {
            throw new NumberFormatException("Illegal start or length");
        }
        if (length > 16) {
            int i = length - 16;
            jZ2 = j8.Z(str, 0, i, true);
            jZ = j8.Z(str, i, 16, true);
        } else {
            jZ = j8.Z(str, 0, length, true);
            jZ2 = 0;
        }
        long j = jZ;
        long j2 = jZ2;
        if (length != 32) {
            str = null;
        }
        return new af5(j2, j, str);
    }

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract long e();

    public abstract String toString();
}
