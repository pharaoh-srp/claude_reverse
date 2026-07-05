package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import io.sentry.e0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class prd extends erd {
    public eri Q;
    public final prd R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prd(hrd hrdVar, wc0 wc0Var, int i, ow5 ow5Var, boolean z, boolean z2, boolean z3, int i2, prd prdVar, neg negVar) {
        super(i, ow5Var, hrdVar, wc0Var, sxb.g("<set-" + hrdVar.getName() + ">"), z, z2, z3, i2, negVar);
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
        this.R = prdVar != null ? prdVar : this;
    }

    public static eri S0(prd prdVar, yr9 yr9Var, wc0 wc0Var) {
        if (yr9Var == null) {
            k0(8);
            throw null;
        }
        if (wc0Var != null) {
            return new eri(prdVar, null, 0, wc0Var, ygg.g, yr9Var, false, false, false, null, neg.n);
        }
        k0(9);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.n(this, obj);
    }

    @Override // defpackage.c92
    public final List I() {
        eri eriVar = this.Q;
        if (eriVar == null) {
            e0.b();
            return null;
        }
        List listSingletonList = Collections.singletonList(eriVar);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        k0(11);
        throw null;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final prd a() {
        prd prdVar = this.R;
        if (prdVar != null) {
            return prdVar;
        }
        k0(13);
        throw null;
    }

    public final void U0(eri eriVar) {
        if (eriVar != null) {
            this.Q = eriVar;
        } else {
            k0(6);
            throw null;
        }
    }

    @Override // defpackage.c92
    public final yr9 getReturnType() {
        return o06.e(this).v();
    }

    @Override // defpackage.e92, defpackage.c92
    public final Collection i() {
        return O0(false);
    }
}
