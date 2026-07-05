package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 extends r4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(gfa gfaVar, bo5 bo5Var, wc0 wc0Var, sxb sxbVar, int i, boolean z, int i2, zp3 zp3Var) {
        super(gfaVar, bo5Var, wc0Var, sxbVar, i, z, i2, zp3Var);
        if (gfaVar == null) {
            k0(0);
            throw null;
        }
        if (bo5Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(4);
            throw null;
        }
        if (zp3Var != null) {
        } else {
            k0(6);
            throw null;
        }
    }

    public static /* synthetic */ void k0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.co5
    public final String toString() {
        return (this.J ? "reified " : "") + (z() != 1 ? fsh.E(z()).concat(" ") : "") + getName();
    }
}
