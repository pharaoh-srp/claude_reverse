package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            mr9.e(i3, vb7.v("startIndex: ", ", endIndex: ", i, i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            sz6.p(grc.o(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            mr9.e(i3, vb7.v("fromIndex: ", ", toIndex: ", i, i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            sz6.p(grc.o(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }
}
