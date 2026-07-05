package defpackage;

import androidx.health.platform.client.proto.g;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.ProtoReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class or9 {
    public static final sxb e = sxb.g("<built-ins module>");
    public uqb a;
    public final dfa b;
    public final afa c;
    public final gfa d;

    public or9(gfa gfaVar) {
        this.d = gfaVar;
        gfaVar.a(new lr9(this, 0));
        this.b = new dfa(gfaVar, new lr9(this, 1));
        this.c = gfaVar.b(new g0(4, this));
    }

    public static boolean A(yr9 yr9Var, xw7 xw7Var) {
        if (xw7Var != null) {
            return z(yr9Var, xw7Var) && !yr9Var.b0();
        }
        a(135);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean B(eo5 eo5Var) {
        if (eo5Var.a().getAnnotations().x(okg.m)) {
            return true;
        }
        if (!(eo5Var instanceof hrd)) {
            return false;
        }
        hrd hrdVar = (hrd) eo5Var;
        boolean zR = hrdVar.R();
        krd krdVarB = hrdVar.b();
        prd prdVarC = hrdVar.c();
        if (krdVarB == null || !B(krdVarB)) {
            return false;
        }
        if (zR) {
            return prdVarC != null && B(prdVarC);
        }
        return true;
    }

    public static boolean C(yr9 yr9Var, xw7 xw7Var) {
        if (yr9Var == null) {
            a(105);
            throw null;
        }
        if (xw7Var != null) {
            return !yr9Var.b0() && z(yr9Var, xw7Var);
        }
        a(106);
        throw null;
    }

    public static boolean D(yr9 yr9Var) {
        if (yr9Var == null) {
            a(136);
            throw null;
        }
        if (yr9Var != null) {
            return z(yr9Var, okg.b) && !fbi.e(yr9Var);
        }
        a(138);
        throw null;
    }

    public static boolean E(yr9 yr9Var) {
        if (yr9Var.b0()) {
            return false;
        }
        xh3 xh3VarA = yr9Var.O().a();
        return (xh3VarA instanceof qqb) && s((qqb) xh3VarA) != null;
    }

    public static boolean F(yr9 yr9Var) {
        return C(yr9Var, okg.f);
    }

    public static boolean G(u9i u9iVar, xw7 xw7Var) {
        if (u9iVar == null) {
            a(101);
            throw null;
        }
        if (xw7Var != null) {
            xh3 xh3VarA = u9iVar.a();
            return (xh3VarA instanceof qqb) && b((qqb) xh3VarA, xw7Var);
        }
        a(102);
        throw null;
    }

    public static boolean H(xh3 xh3Var) {
        if (xh3Var == null) {
            a(10);
            throw null;
        }
        for (bo5 bo5VarH = xh3Var; bo5VarH != null; bo5VarH = bo5VarH.h()) {
            if (bo5VarH instanceof wmc) {
                return ((xmc) ((wmc) bo5VarH)).I.h(pkg.i);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case mdj.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case mdj.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case mdj.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case ProtoReader.RECURSION_LIMIT /* 100 */:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case ModuleDescriptor.MODULE_VERSION /* 122 */:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case FreeTypeConstants.FT_LOAD_PEDANTIC /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getBuiltInClassByName";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getSuspendFunction";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getKFunction";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getKCallable";
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case mdj.f /* 48 */:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case mdj.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case ProtoReader.RECURSION_LIMIT /* 100 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 122 */:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case FreeTypeConstants.FT_LOAD_PEDANTIC /* 128 */:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case mdj.f /* 48 */:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(qqb qqbVar, xw7 xw7Var) {
        if (qqbVar == null) {
            a(103);
            throw null;
        }
        if (xw7Var != null) {
            return qqbVar.getName().equals(xw7Var.f()) && xw7Var.equals(m06.g(qqbVar));
        }
        a(104);
        throw null;
    }

    public static vfd q(xh3 xh3Var) {
        if (xh3Var == null) {
            a(77);
            throw null;
        }
        if (okg.a0.contains(xh3Var.getName())) {
            return (vfd) okg.c0.get(m06.g(xh3Var));
        }
        return null;
    }

    public static vfd s(qqb qqbVar) {
        if (okg.Z.contains(qqbVar.getName())) {
            return (vfd) okg.b0.get(m06.g(qqbVar));
        }
        return null;
    }

    public static boolean w(yr9 yr9Var) {
        if (yr9Var != null) {
            return z(yr9Var, okg.a);
        }
        a(139);
        throw null;
    }

    public static boolean x(yr9 yr9Var) {
        if (yr9Var != null) {
            return z(yr9Var, okg.g);
        }
        a(88);
        throw null;
    }

    public static boolean y(bo5 bo5Var) {
        if (bo5Var != null) {
            return m06.i(bo5Var, vz1.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean z(yr9 yr9Var, xw7 xw7Var) {
        if (yr9Var == null) {
            a(97);
            throw null;
        }
        if (xw7Var != null) {
            return G(yr9Var.O(), xw7Var);
        }
        a(98);
        throw null;
    }

    public final void c() {
        sxb sxbVar = e;
        sxbVar.getClass();
        gfa gfaVar = this.d;
        uqb uqbVar = new uqb(sxbVar, gfaVar, this, 48);
        this.a = uqbVar;
        sz1.a.getClass();
        sz1 sz1Var = (sz1) rz1.b.getValue();
        uqb uqbVar2 = this.a;
        Iterable iterableL = l();
        x4d x4dVarO = o();
        bf bfVarD = d();
        uz1 uz1Var = (uz1) sz1Var;
        uz1Var.getClass();
        uqbVar2.getClass();
        iterableL.getClass();
        x4dVarO.getClass();
        bfVarD.getClass();
        Set set = pkg.o;
        tz1 tz1Var = new tz1(1, uz1Var.b, 0);
        set.getClass();
        Set<ww7> set2 = set;
        ArrayList arrayList = new ArrayList(x44.y(set2, 10));
        for (ww7 ww7Var : set2) {
            pz1.m.getClass();
            String strA = pz1.a(ww7Var);
            InputStream inputStream = (InputStream) tz1Var.invoke(strA);
            if (inputStream == null) {
                sz6.j("Resource not found in classpath: ".concat(strA));
                return;
            }
            arrayList.add(mwa.x(ww7Var, gfaVar, uqbVar2, inputStream));
        }
        ymc ymcVar = new ymc(arrayList);
        dpf dpfVar = new dpf(gfaVar, uqbVar2);
        gmf gmfVar = new gmf(13, ymcVar);
        pz1 pz1Var = pz1.m;
        r06 r06Var = new r06(gfaVar, uqbVar2, gmfVar, new nyj(uqbVar2, dpfVar, pz1Var), ymcVar, du6.i, lz1.K, iterableL, dpfVar, bfVarD, x4dVarO, pz1Var.a, null, new ql8(gfaVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vz1) it.next()).O0(r06Var);
        }
        uqbVar.L = ymcVar;
        uqb uqbVar3 = this.a;
        uqbVar3.getClass();
        uqbVar3.K = new d86(mp0.Y0(new uqb[]{uqbVar3}));
    }

    public bf d() {
        return lz1.G;
    }

    public final j7g e() {
        j7g j7gVarW = j("Any").W();
        if (j7gVarW != null) {
            return j7gVarW;
        }
        a(50);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yr9 f(defpackage.yr9 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L96
            boolean r1 = x(r4)
            r2 = 0
            if (r1 == 0) goto L30
            java.util.List r3 = r4.H()
            int r3 = r3.size()
            r1 = 1
            if (r3 != r1) goto L2c
            java.util.List r3 = r4.H()
            java.lang.Object r3 = r3.get(r2)
            vai r3 = (defpackage.vai) r3
            yr9 r3 = r3.b()
            if (r3 == 0) goto L26
            return r3
        L26:
            r3 = 68
            a(r3)
            throw r0
        L2c:
            io.sentry.e0.b()
            return r0
        L30:
            fhi r1 = defpackage.fbi.h(r4, r2)
            dfa r3 = r3.b
            java.lang.Object r3 = r3.a()
            nr9 r3 = (defpackage.nr9) r3
            java.util.HashMap r3 = r3.b
            java.lang.Object r3 = r3.get(r1)
            yr9 r3 = (defpackage.yr9) r3
            if (r3 == 0) goto L47
            return r3
        L47:
            int r3 = defpackage.m06.a
            u9i r3 = r1.O()
            xh3 r3 = r3.a()
            if (r3 != 0) goto L55
            r3 = r0
            goto L59
        L55:
            tqb r3 = defpackage.m06.e(r3)
        L59:
            if (r3 == 0) goto L90
            u9i r1 = r1.O()
            xh3 r1 = r1.a()
            if (r1 != 0) goto L67
        L65:
            r3 = r0
            goto L8d
        L67:
            java.util.Set r2 = defpackage.dhi.a
            sxb r2 = r1.getName()
            boolean r2 = defpackage.dhi.b(r2)
            if (r2 != 0) goto L74
            goto L65
        L74:
            gh3 r1 = defpackage.o06.f(r1)
            if (r1 != 0) goto L7b
            goto L65
        L7b:
            gh3 r1 = defpackage.dhi.a(r1)
            if (r1 != 0) goto L82
            goto L65
        L82:
            qqb r3 = defpackage.kxk.t(r3, r1)
            if (r3 != 0) goto L89
            goto L65
        L89:
            j7g r3 = r3.W()
        L8d:
            if (r3 == 0) goto L90
            return r3
        L90:
            java.lang.String r3 = "not array: "
            defpackage.xh6.m(r3, r4)
            return r0
        L96:
            r3 = 67
            a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or9.f(yr9):yr9");
    }

    public final j7g g(int i, yr9 yr9Var, wc0 wc0Var) {
        if (i == 0) {
            a(78);
            throw null;
        }
        if (yr9Var != null) {
            return yfd.b0(rvk.q(wc0Var), j("Array"), Collections.singletonList(new wai(i, yr9Var)));
        }
        a(79);
        throw null;
    }

    public final j7g h(fhi fhiVar) {
        if (fhiVar != null) {
            return g(1, fhiVar, dd8.F);
        }
        a(83);
        throw null;
    }

    public final qqb i(ww7 ww7Var) {
        if (ww7Var == null) {
            a(12);
            throw null;
        }
        qqb qqbVarO = wb5.o(k(), ww7Var);
        if (qqbVarO != null) {
            return qqbVarO;
        }
        a(13);
        throw null;
    }

    public final qqb j(String str) {
        if (str != null) {
            return (qqb) this.c.invoke(sxb.e(str));
        }
        a(14);
        throw null;
    }

    public final uqb k() {
        this.a.getClass();
        uqb uqbVar = this.a;
        if (uqbVar != null) {
            return uqbVar;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new oz1(this.d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final j7g m() {
        j7g j7gVarW = j("Nothing").W();
        if (j7gVarW != null) {
            return j7gVarW;
        }
        a(48);
        throw null;
    }

    public final j7g n() {
        j7g j7gVarL0 = e().l0(true);
        if (j7gVarL0 != null) {
            return j7gVarL0;
        }
        a(51);
        throw null;
    }

    public x4d o() {
        return ql8.K;
    }

    public final j7g p(vfd vfdVar) {
        if (vfdVar == null) {
            a(73);
            throw null;
        }
        j7g j7gVar = (j7g) ((nr9) this.b.a()).a.get(vfdVar);
        if (j7gVar != null) {
            return j7gVar;
        }
        a(74);
        throw null;
    }

    public final j7g r(vfd vfdVar) {
        if (vfdVar == null) {
            a(53);
            throw null;
        }
        j7g j7gVarW = j(vfdVar.E.b()).W();
        if (j7gVarW != null) {
            return j7gVarW;
        }
        a(54);
        throw null;
    }

    public final j7g t() {
        j7g j7gVarW = j("String").W();
        if (j7gVarW != null) {
            return j7gVarW;
        }
        a(65);
        throw null;
    }

    public final qqb u(int i) {
        return i(pkg.e.c(sxb.e(e08.I.F + i)));
    }

    public final j7g v() {
        j7g j7gVarW = j("Unit").W();
        if (j7gVarW != null) {
            return j7gVarW;
        }
        a(64);
        throw null;
    }
}
