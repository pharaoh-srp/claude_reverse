package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wd9 extends tg3 implements ud9 {
    public Boolean i0;
    public Boolean j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(qqb qqbVar, wd9 wd9Var, wc0 wc0Var, boolean z, int i, neg negVar) {
        super(qqbVar, wd9Var, wc0Var, z, i, negVar);
        if (qqbVar == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (negVar == null) {
            k0(3);
            throw null;
        }
        this.i0 = null;
        this.j0 = null;
    }

    public static wd9 e1(qqb qqbVar, wc0 wc0Var, boolean z, ize izeVar) {
        if (qqbVar != null) {
            return new wd9(qqbVar, null, wc0Var, z, 1, izeVar);
        }
        k0(4);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.tg3, defpackage.j08
    public final /* bridge */ /* synthetic */ j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        return f1(bo5Var, h08Var, i, wc0Var, negVar);
    }

    @Override // defpackage.j08
    public final void V0(boolean z) {
        this.i0 = Boolean.valueOf(z);
    }

    @Override // defpackage.j08
    public final void W0(boolean z) {
        this.j0 = Boolean.valueOf(z);
    }

    @Override // defpackage.tg3
    /* JADX INFO: renamed from: Y0 */
    public final /* bridge */ /* synthetic */ tg3 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        return f1(bo5Var, h08Var, i, wc0Var, negVar);
    }

    public final wd9 f1(bo5 bo5Var, h08 h08Var, int i, wc0 wc0Var, neg negVar) {
        if (bo5Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (wc0Var == null) {
            k0(9);
            throw null;
        }
        if (negVar == null) {
            k0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(bo5Var);
            String strB = qy1.B(i);
            sb.append("\nkind: ");
            sb.append(strB);
            throw new IllegalStateException(sb.toString());
        }
        qqb qqbVar = (qqb) bo5Var;
        wd9 wd9Var = (wd9) h08Var;
        if (i == 0) {
            k0(13);
            throw null;
        }
        wd9 wd9Var2 = new wd9(qqbVar, wd9Var, wc0Var, this.h0, i, negVar);
        Boolean bool = this.i0;
        bool.getClass();
        wd9Var2.i0 = bool;
        Boolean bool2 = this.j0;
        bool2.getClass();
        wd9Var2.j0 = bool2;
        return wd9Var2;
    }

    @Override // defpackage.ud9
    public final ud9 h0(yr9 yr9Var, ArrayList arrayList, yr9 yr9Var2, cpc cpcVar) {
        wd9 wd9VarF1 = f1(h(), null, getKind(), getAnnotations(), d());
        wd9VarF1.S0(yr9Var == null ? null : xzk.u(wd9VarF1, yr9Var, dd8.F), this.N, lm6.E, getTypeParameters(), ntj.c(arrayList, I(), wd9VarF1), yr9Var2, q(), getVisibility());
        if (cpcVar != null) {
            wd9VarF1.U0((e16) cpcVar.E, cpcVar.F);
        }
        return wd9VarF1;
    }

    @Override // defpackage.j08, defpackage.c92
    public final boolean v() {
        return this.j0.booleanValue();
    }
}
