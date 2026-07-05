package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 extends m4 {
    public final zp3 c;
    public final /* synthetic */ r4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(r4 r4Var, gfa gfaVar, zp3 zp3Var) {
        super(gfaVar);
        if (gfaVar == null) {
            l(0);
            throw null;
        }
        this.d = r4Var;
        this.c = zp3Var;
    }

    public static /* synthetic */ void l(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        return this.d;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4
    public final Collection e() {
        List listO0 = this.d.O0();
        if (listO0 != null) {
            return listO0;
        }
        l(1);
        throw null;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        or9 or9VarE = o06.e(this.d);
        if (or9VarE != null) {
            return or9VarE;
        }
        l(4);
        throw null;
    }

    @Override // defpackage.m4
    public final yr9 g() {
        return nu6.c(mu6.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    @Override // defpackage.m4
    public final zp3 h() {
        zp3 zp3Var = this.c;
        if (zp3Var != null) {
            return zp3Var;
        }
        l(5);
        throw null;
    }

    @Override // defpackage.m4
    public final boolean j(xh3 xh3Var) {
        if (!(xh3Var instanceof qai)) {
            return false;
        }
        return lyk.L.g(this.d, (qai) xh3Var, true, c0.V);
    }

    @Override // defpackage.m4
    public final List k(List list) {
        List listN0 = this.d.N0(list);
        if (listN0 != null) {
            return listN0;
        }
        l(8);
        throw null;
    }

    public final String toString() {
        return this.d.getName().E;
    }
}
