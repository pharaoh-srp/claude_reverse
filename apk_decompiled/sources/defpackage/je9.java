package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class je9 extends jrd implements ud9 {
    public final boolean e0;
    public final cpc f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je9(bo5 bo5Var, wc0 wc0Var, int i, ow5 ow5Var, boolean z, sxb sxbVar, neg negVar, hrd hrdVar, int i2, boolean z2, cpc cpcVar) {
        super(bo5Var, hrdVar, wc0Var, i, ow5Var, z, sxbVar, i2, negVar, false, false, false, false, false);
        if (bo5Var == null) {
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
        if (ow5Var == null) {
            k0(3);
            throw null;
        }
        if (sxbVar == null) {
            k0(4);
            throw null;
        }
        if (negVar == null) {
            k0(5);
            throw null;
        }
        if (i2 == 0) {
            k0(6);
            throw null;
        }
        this.e0 = z2;
        this.f0 = cpcVar;
    }

    public static je9 V0(bo5 bo5Var, sx9 sx9Var, ow5 ow5Var, boolean z, sxb sxbVar, ize izeVar, boolean z2) {
        if (bo5Var == null) {
            k0(7);
            throw null;
        }
        if (sxbVar != null) {
            return new je9(bo5Var, sx9Var, 1, ow5Var, z, sxbVar, izeVar, null, 1, z2, null);
        }
        k0(11);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = "newVisibility";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "newName";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.jrd
    public final jrd P0(bo5 bo5Var, int i, ow5 ow5Var, hrd hrdVar, int i2, sxb sxbVar) {
        if (bo5Var == null) {
            k0(13);
            throw null;
        }
        if (i == 0) {
            k0(14);
            throw null;
        }
        if (ow5Var == null) {
            k0(15);
            throw null;
        }
        if (i2 == 0) {
            k0(16);
            throw null;
        }
        if (sxbVar == null) {
            k0(17);
            throw null;
        }
        return new je9(bo5Var, getAnnotations(), i, ow5Var, this.J, sxbVar, neg.n, hrdVar, i2, this.e0, this.f0);
    }

    @Override // defpackage.jrd
    public final void T0(yr9 yr9Var) {
    }

    @Override // defpackage.ud9
    public final ud9 h0(yr9 yr9Var, ArrayList arrayList, yr9 yr9Var2, cpc cpcVar) {
        yr9 yr9Var3;
        krd krdVar;
        prd prdVar;
        hrd hrdVarA = a() == this ? null : a();
        je9 je9Var = new je9(h(), getAnnotations(), q(), getVisibility(), this.J, getName(), d(), hrdVarA, getKind(), this.e0, cpcVar);
        krd krdVar2 = this.a0;
        if (krdVar2 != null) {
            krd krdVar3 = new krd(je9Var, krdVar2.getAnnotations(), krdVar2.q(), krdVar2.getVisibility(), krdVar2.I, krdVar2.J, krdVar2.M, getKind(), hrdVarA == null ? null : hrdVarA.b(), krdVar2.d());
            krdVar3.P = krdVar2.P;
            yr9Var3 = yr9Var2;
            krdVar3.Q = yr9Var3;
            krdVar = krdVar3;
        } else {
            yr9Var3 = yr9Var2;
            krdVar = null;
        }
        prd prdVar2 = this.b0;
        if (prdVar2 != null) {
            prdVar = new prd(je9Var, prdVar2.getAnnotations(), prdVar2.q(), prdVar2.getVisibility(), prdVar2.I, prdVar2.J, prdVar2.M, getKind(), hrdVarA == null ? null : hrdVarA.c(), prdVar2.d());
            prdVar.P = prdVar.P;
            prdVar.U0((eri) prdVar2.I().get(0));
        } else {
            prdVar = null;
        }
        je9Var.R0(krdVar, prdVar, this.c0, this.d0);
        zy7 zy7Var = this.L;
        if (zy7Var != null) {
            je9Var.S0(this.K, zy7Var);
        }
        je9Var.d0(i());
        je9Var.U0(yr9Var3, getTypeParameters(), this.X, yr9Var != null ? xzk.u(this, yr9Var, dd8.F) : null, lm6.E);
        return je9Var;
    }

    @Override // defpackage.jrd, defpackage.c92
    public final Object n(e16 e16Var) {
        cpc cpcVar = this.f0;
        if (cpcVar == null || !((e16) cpcVar.E).equals(e16Var)) {
            return null;
        }
        return cpcVar.F;
    }

    @Override // defpackage.jrd, defpackage.iri
    public final boolean r() {
        yr9 type = getType();
        if (!this.e0) {
            return false;
        }
        type.getClass();
        if (((!or9.E(type) && !dhi.c(type)) || fbi.e(type)) && !or9.F(type)) {
            return false;
        }
        xc0 xc0Var = eai.a;
        ww7 ww7Var = mj9.p;
        ww7Var.getClass();
        return !okk.v(type, ww7Var) || or9.F(type);
    }

    @Override // defpackage.jri, defpackage.c92
    public final boolean v() {
        return false;
    }
}
