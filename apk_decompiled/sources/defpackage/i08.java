package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.LinkedHashMap;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class i08 implements g08 {
    public bbi E;
    public bo5 F;
    public int G;
    public ow5 H;
    public h08 I;
    public int J;
    public List K;
    public final List L;
    public l6e M;
    public l6e N;
    public yr9 O;
    public sxb P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public lm6 V;
    public wc0 W;
    public boolean X;
    public final LinkedHashMap Y;
    public Boolean Z;
    public boolean a0;
    public final /* synthetic */ j08 b0;

    public i08(j08 j08Var, bbi bbiVar, bo5 bo5Var, int i, ow5 ow5Var, int i2, List list, List list2, l6e l6eVar, yr9 yr9Var) {
        if (bbiVar == null) {
            h(0);
            throw null;
        }
        if (bo5Var == null) {
            h(1);
            throw null;
        }
        if (i == 0) {
            h(2);
            throw null;
        }
        if (ow5Var == null) {
            h(3);
            throw null;
        }
        if (i2 == 0) {
            h(4);
            throw null;
        }
        if (list == null) {
            h(5);
            throw null;
        }
        if (list2 == null) {
            h(6);
            throw null;
        }
        if (yr9Var == null) {
            h(7);
            throw null;
        }
        this.b0 = j08Var;
        this.I = null;
        this.N = j08Var.N;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = j08Var.W;
        this.V = null;
        this.W = null;
        this.X = j08Var.X;
        this.Y = new LinkedHashMap();
        this.Z = null;
        this.a0 = false;
        this.E = bbiVar;
        this.F = bo5Var;
        this.G = i;
        this.H = ow5Var;
        this.J = i2;
        this.K = list;
        this.L = list2;
        this.M = l6eVar;
        this.O = yr9Var;
        this.P = null;
    }

    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "name";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
                objArr[0] = "parameters";
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "type";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "setName";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[1] = "setValueParameters";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "setName";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[2] = "setReturnType";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final g08 A(bbi bbiVar) {
        if (bbiVar != null) {
            this.E = bbiVar;
            return this;
        }
        h(37);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 a(List list) {
        this.K = list;
        return this;
    }

    @Override // defpackage.g08
    public final g08 b(ow5 ow5Var) {
        if (ow5Var != null) {
            this.H = ow5Var;
            return this;
        }
        h(12);
        throw null;
    }

    @Override // defpackage.g08
    public final h08 build() {
        return this.b0.Q0(this);
    }

    @Override // defpackage.g08
    public final g08 c(int i) {
        if (i != 0) {
            this.J = i;
            return this;
        }
        h(14);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 d() {
        this.S = true;
        return this;
    }

    @Override // defpackage.g08
    public final g08 e(l6e l6eVar) {
        this.N = l6eVar;
        return this;
    }

    @Override // defpackage.g08
    public final g08 f() {
        this.Y.put(ge9.k0, Boolean.TRUE);
        return this;
    }

    @Override // defpackage.g08
    public final g08 g() {
        this.X = true;
        return this;
    }

    @Override // defpackage.g08
    public final g08 i(wc0 wc0Var) {
        if (wc0Var != null) {
            this.W = wc0Var;
            return this;
        }
        h(35);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 l() {
        this.Q = false;
        return this;
    }

    @Override // defpackage.g08
    public final g08 m() {
        this.V = lm6.E;
        return this;
    }

    @Override // defpackage.g08
    public final g08 n(yr9 yr9Var) {
        if (yr9Var != null) {
            this.O = yr9Var;
            return this;
        }
        h(23);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 p() {
        this.U = true;
        return this;
    }

    @Override // defpackage.g08
    public final g08 r(bo5 bo5Var) {
        if (bo5Var != null) {
            this.F = bo5Var;
            return this;
        }
        h(8);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 s(sxb sxbVar) {
        if (sxbVar != null) {
            this.P = sxbVar;
            return this;
        }
        h(17);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 v(int i) {
        if (i != 0) {
            this.G = i;
            return this;
        }
        h(10);
        throw null;
    }

    @Override // defpackage.g08
    public final g08 w() {
        this.R = true;
        return this;
    }

    public final void x() {
        this.a0 = true;
    }

    public final void y(h08 h08Var) {
        this.I = h08Var;
    }

    public final void z() {
        this.S = true;
    }
}
