package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class rai extends r4 {
    public final ArrayList O;
    public boolean P;

    /* JADX WARN: Illegal instructions before constructor call */
    public rai(bo5 bo5Var, wc0 wc0Var, boolean z, int i, sxb sxbVar, int i2, gfa gfaVar) {
        zp3 zp3Var = zp3.Y;
        if (bo5Var == null) {
            k0(19);
            throw null;
        }
        if (wc0Var == null) {
            k0(20);
            throw null;
        }
        if (i == 0) {
            k0(21);
            throw null;
        }
        if (sxbVar == null) {
            k0(22);
            throw null;
        }
        if (gfaVar == null) {
            k0(25);
            throw null;
        }
        super(gfaVar, bo5Var, wc0Var, sxbVar, i, z, i2, zp3Var);
        this.O = new ArrayList(1);
        this.P = false;
    }

    public static rai P0(bo5 bo5Var, wc0 wc0Var, boolean z, int i, sxb sxbVar, int i2, gfa gfaVar) {
        if (bo5Var == null) {
            k0(6);
            throw null;
        }
        if (wc0Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (sxbVar == null) {
            k0(9);
            throw null;
        }
        if (gfaVar == null) {
            k0(11);
            throw null;
        }
        if (i != 0) {
            return new rai(bo5Var, wc0Var, z, i, sxbVar, i2, gfaVar);
        }
        k0(14);
        throw null;
    }

    public static rai Q0(i0 i0Var, int i, sxb sxbVar, int i2, gfa gfaVar) {
        vc0 vc0Var = dd8.F;
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (gfaVar == null) {
            k0(4);
            throw null;
        }
        rai raiVarP0 = P0(i0Var, vc0Var, false, i, sxbVar, i2, gfaVar);
        j7g j7gVarN = o06.e(i0Var).n();
        if (raiVarP0.P) {
            sz6.j("Type parameter descriptor is already initialized: ".concat(raiVarP0.R0()));
            return null;
        }
        if (!ttj.j(j7gVarN)) {
            raiVarP0.O.add(j7gVarN);
        }
        if (raiVarP0.P) {
            sz6.j("Type parameter descriptor is already initialized: ".concat(raiVarP0.R0()));
            return null;
        }
        raiVarP0.P = true;
        return raiVarP0;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "source";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.r4
    public final List O0() {
        if (!this.P) {
            sz6.j("Type parameter descriptor is not initialized: ".concat(R0()));
            return null;
        }
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            return arrayList;
        }
        k0(28);
        throw null;
    }

    public final String R0() {
        return getName() + " declared in " + m06.g(h());
    }
}
