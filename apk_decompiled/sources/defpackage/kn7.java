package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kn7 extends ln7 {
    public final l89[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kn7(int i, l89[] l89VarArr) {
        if (l89VarArr == null) {
            sz6.p("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = l89VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            xh6.n("Empty enum: ", l89VarArr.getClass());
            throw null;
        }
        super(i, i2, 0, (byte) 0);
        this.d = l89VarArr;
    }

    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (l89 l89Var : this.d) {
            if (l89Var.a() == i4) {
                return l89Var;
            }
        }
        return null;
    }
}
