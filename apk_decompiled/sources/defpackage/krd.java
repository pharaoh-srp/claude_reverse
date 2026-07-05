package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class krd extends erd {
    public yr9 Q;
    public final krd R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krd(hrd hrdVar, wc0 wc0Var, int i, ow5 ow5Var, boolean z, boolean z2, boolean z3, int i2, krd krdVar, neg negVar) {
        super(i, ow5Var, hrdVar, wc0Var, sxb.g("<get-" + hrdVar.getName() + ">"), z, z2, z3, i2, negVar);
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
        if (i2 == 0) {
            k0(4);
            throw null;
        }
        if (negVar == null) {
            k0(5);
            throw null;
        }
        this.R = krdVar != null ? krdVar : this;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.b(this, obj);
    }

    @Override // defpackage.c92
    public final List I() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final krd a() {
        krd krdVar = this.R;
        if (krdVar != null) {
            return krdVar;
        }
        k0(8);
        throw null;
    }

    public final void T0(yr9 yr9Var) {
        if (yr9Var == null) {
            yr9Var = N0().getType();
        }
        this.Q = yr9Var;
    }

    @Override // defpackage.c92
    public final yr9 getReturnType() {
        return this.Q;
    }

    @Override // defpackage.e92, defpackage.c92
    public final Collection i() {
        return O0(true);
    }
}
