package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class co5 extends rok implements bo5 {
    public final sxb F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co5(wc0 wc0Var, sxb sxbVar) {
        super(wc0Var);
        if (wc0Var == null) {
            k0(0);
            throw null;
        }
        if (sxbVar == null) {
            k0(1);
            throw null;
        }
        this.F = sxbVar;
    }

    public static String L0(bo5 bo5Var) {
        try {
            return g06.e.x(bo5Var) + "[" + bo5Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(bo5Var)) + "]";
        } catch (Throwable unused) {
            return bo5Var.getClass().getSimpleName() + " " + bo5Var.getName();
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public bo5 a() {
        return this;
    }

    @Override // defpackage.bo5
    public final sxb getName() {
        sxb sxbVar = this.F;
        if (sxbVar != null) {
            return sxbVar;
        }
        k0(2);
        throw null;
    }

    public String toString() {
        return L0(this);
    }
}
