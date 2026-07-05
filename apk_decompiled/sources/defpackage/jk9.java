package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jk9 extends wp1 {
    public static final jk9 g;
    public static final jk9 h;
    public final boolean f;

    static {
        jk9 jk9Var = new jk9(new int[]{1, 8, 0}, false);
        g = jk9Var;
        int i = jk9Var.c;
        int i2 = jk9Var.b;
        h = (i2 == 1 && i == 9) ? new jk9(new int[]{2, 0, 0}, false) : new jk9(new int[]{i2, i + 1, 0}, false);
        new jk9(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk9(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }

    public final boolean b(jk9 jk9Var) {
        jk9Var.getClass();
        jk9 jk9Var2 = g;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 2 && i == 0 && jk9Var2.b == 1 && jk9Var2.c == 8) {
            return true;
        }
        if (!this.f) {
            jk9Var2 = h;
        }
        int i3 = jk9Var2.b;
        int i4 = jk9Var.b;
        if (i3 > i4 || (i3 >= i4 && jk9Var2.c > jk9Var.c)) {
            jk9Var = jk9Var2;
        }
        boolean z = false;
        if ((i2 == 1 && i == 0) || i2 == 0) {
            return false;
        }
        int i5 = jk9Var.b;
        if (i2 > i5 || (i2 >= i5 && i > jk9Var.c)) {
            z = true;
        }
        return !z;
    }
}
