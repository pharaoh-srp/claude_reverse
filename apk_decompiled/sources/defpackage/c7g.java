package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public class c7g extends j08 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7g(bo5 bo5Var, c7g c7gVar, wc0 wc0Var, sxb sxbVar, int i, neg negVar) {
        super(i, wc0Var, bo5Var, c7gVar, sxbVar, negVar);
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
        if (i == 0) {
            k0(3);
            throw null;
        }
        if (negVar != null) {
        } else {
            k0(4);
            throw null;
        }
    }

    public static c7g Y0(qqb qqbVar, sxb sxbVar, int i, neg negVar) {
        vc0 vc0Var = dd8.F;
        if (qqbVar == null) {
            k0(5);
            throw null;
        }
        if (sxbVar == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (negVar != null) {
            return new c7g(qqbVar, null, vc0Var, sxbVar, i, negVar);
        }
        k0(9);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 29:
            case 30:
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.j08
    public j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        if (bo5Var == null) {
            k0(25);
            throw null;
        }
        if (i == 0) {
            k0(26);
            throw null;
        }
        if (wc0Var == null) {
            k0(27);
            throw null;
        }
        c7g c7gVar = (c7g) h08Var;
        if (sxbVar == null) {
            sxbVar = getName();
        }
        return new c7g(bo5Var, c7gVar, wc0Var, sxbVar, i, negVar);
    }

    @Override // defpackage.j08, defpackage.eo5, defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final c7g a() {
        c7g c7gVar = (c7g) super.a();
        if (c7gVar != null) {
            return c7gVar;
        }
        k0(24);
        throw null;
    }

    @Override // defpackage.j08
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final c7g S0(l6e l6eVar, l6e l6eVar2, List list, List list2, List list3, yr9 yr9Var, int i, ow5 ow5Var) {
        if (list == null) {
            k0(14);
            throw null;
        }
        if (list2 == null) {
            k0(15);
            throw null;
        }
        if (list3 == null) {
            k0(16);
            throw null;
        }
        if (ow5Var != null) {
            return b1(l6eVar, l6eVar2, list, list2, list3, yr9Var, i, ow5Var, null);
        }
        k0(17);
        throw null;
    }

    public c7g b1(l6e l6eVar, l6e l6eVar2, List list, List list2, List list3, yr9 yr9Var, int i, ow5 ow5Var, Map map) {
        if (list == null) {
            k0(19);
            throw null;
        }
        if (list2 == null) {
            k0(20);
            throw null;
        }
        if (list3 == null) {
            k0(21);
            throw null;
        }
        if (ow5Var == null) {
            k0(22);
            throw null;
        }
        super.S0(l6eVar, l6eVar2, list, list2, list3, yr9Var, i, ow5Var);
        if (map != null && !map.isEmpty()) {
            this.g0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // defpackage.j08, defpackage.h08
    public g08 f0() {
        return T0(a.b);
    }
}
