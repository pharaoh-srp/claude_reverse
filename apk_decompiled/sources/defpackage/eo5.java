package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eo5 extends co5 implements do5 {
    public final bo5 G;
    public final neg H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo5(bo5 bo5Var, wc0 wc0Var, sxb sxbVar, neg negVar) {
        super(wc0Var, sxbVar);
        if (bo5Var == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (sxbVar == null) {
            k0(2);
            throw null;
        }
        if (negVar == null) {
            k0(3);
            throw null;
        }
        this.G = bo5Var;
        this.H = negVar;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: M0 */
    public do5 a() {
        return this;
    }

    public neg d() {
        neg negVar = this.H;
        if (negVar != null) {
            return negVar;
        }
        k0(6);
        throw null;
    }

    @Override // defpackage.bo5
    public bo5 h() {
        bo5 bo5Var = this.G;
        if (bo5Var != null) {
            return bo5Var;
        }
        k0(5);
        throw null;
    }
}
