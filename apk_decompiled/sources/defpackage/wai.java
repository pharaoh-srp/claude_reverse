package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wai extends vai {
    public final int a;
    public final yr9 b;

    public wai(int i, yr9 yr9Var) {
        if (i == 0) {
            e(0);
            throw null;
        }
        if (yr9Var == null) {
            e(1);
            throw null;
        }
        this.a = i;
        this.b = yr9Var;
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.vai
    public final int a() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        e(4);
        throw null;
    }

    @Override // defpackage.vai
    public final yr9 b() {
        yr9 yr9Var = this.b;
        if (yr9Var != null) {
            return yr9Var;
        }
        e(5);
        throw null;
    }

    @Override // defpackage.vai
    public final boolean c() {
        return false;
    }

    @Override // defpackage.vai
    public final vai d(es9 es9Var) {
        if (es9Var == null) {
            e(6);
            throw null;
        }
        yr9 yr9Var = this.b;
        yr9Var.getClass();
        return new wai(this.a, yr9Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wai(yr9 yr9Var) {
        this(1, yr9Var);
        if (yr9Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
