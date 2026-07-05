package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jri extends eo5 implements iri {
    public yr9 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jri(bo5 bo5Var, wc0 wc0Var, sxb sxbVar, yr9 yr9Var, neg negVar) {
        super(bo5Var, wc0Var, sxbVar, negVar);
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
        this.I = yr9Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.c92
    public final List I() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(6);
        throw null;
    }

    public l6e P() {
        return null;
    }

    public l6e S() {
        return null;
    }

    public yr9 getReturnType() {
        yr9 type = getType();
        if (type != null) {
            return type;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.tqi
    public final yr9 getType() {
        yr9 yr9Var = this.I;
        if (yr9Var != null) {
            return yr9Var;
        }
        k0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(8);
        throw null;
    }

    public boolean v() {
        return false;
    }
}
