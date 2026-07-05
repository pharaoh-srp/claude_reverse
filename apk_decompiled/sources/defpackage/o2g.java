package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class o2g {
    public static final sqb a = new sqb("NO_VALUE", 1);

    public static final n2g a(int i, int i2, py1 py1Var) {
        if (i < 0) {
            mr9.q(grc.p(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            mr9.q(grc.p(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && py1Var != py1.E) {
            mr9.t("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", py1Var);
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new n2g(i, i3, py1Var);
    }

    public static /* synthetic */ n2g b(int i, int i2, py1 py1Var) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            py1Var = py1.E;
        }
        return a(i3, i, py1Var);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final kp7 d(k2g k2gVar, c45 c45Var, int i, py1 py1Var) {
        return ((i == 0 || i == -3) && py1Var == py1.E) ? k2gVar : new ph2(k2gVar, c45Var, i, py1Var);
    }
}
