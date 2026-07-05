package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xg3 extends i0 {
    public final bo5 I;
    public final neg J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg3(gfa gfaVar, bo5 bo5Var, sxb sxbVar, neg negVar) {
        super(gfaVar, sxbVar);
        if (gfaVar == null) {
            t0(0);
            throw null;
        }
        if (bo5Var == null) {
            t0(1);
            throw null;
        }
        if (sxbVar == null) {
            t0(2);
            throw null;
        }
        this.I = bo5Var;
        this.J = negVar;
    }

    public static /* synthetic */ void t0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.do5
    public final neg d() {
        neg negVar = this.J;
        if (negVar != null) {
            return negVar;
        }
        t0(5);
        throw null;
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        bo5 bo5Var = this.I;
        if (bo5Var != null) {
            return bo5Var;
        }
        t0(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
