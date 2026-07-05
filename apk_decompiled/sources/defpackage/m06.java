package defpackage;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class m06 {
    public static final /* synthetic */ int a = 0;

    static {
        new ww7("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "second";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "aClass";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "kotlinType";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case mdj.f /* 48 */:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case mdj.f /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(c92 c92Var, LinkedHashSet linkedHashSet) {
        if (c92Var == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(c92Var)) {
            return;
        }
        Iterator it = c92Var.a().i().iterator();
        while (it.hasNext()) {
            c92 c92VarA = ((c92) it.next()).a();
            b(c92VarA, linkedHashSet);
            linkedHashSet.add(c92VarA);
        }
    }

    public static qqb c(yr9 yr9Var) {
        if (yr9Var == null) {
            a(45);
            throw null;
        }
        u9i u9iVarO = yr9Var.O();
        if (u9iVarO == null) {
            a(46);
            throw null;
        }
        qqb qqbVar = (qqb) u9iVarO.a();
        if (qqbVar != null) {
            return qqbVar;
        }
        a(47);
        throw null;
    }

    public static tqb d(bo5 bo5Var) {
        if (bo5Var == null) {
            a(21);
            throw null;
        }
        tqb tqbVarE = e(bo5Var);
        if (tqbVarE != null) {
            return tqbVarE;
        }
        a(22);
        throw null;
    }

    public static tqb e(bo5 bo5Var) {
        if (bo5Var == null) {
            a(23);
            throw null;
        }
        while (bo5Var != null) {
            if (bo5Var instanceof tqb) {
                return (tqb) bo5Var;
            }
            if (bo5Var instanceof d1a) {
                return ((d1a) bo5Var).G;
            }
            bo5Var = bo5Var.h();
        }
        return null;
    }

    public static lyk f(bo5 bo5Var) {
        lyk lykVar = lyk.W;
        if (bo5Var == null) {
            a(82);
            throw null;
        }
        if (bo5Var instanceof prd) {
            bo5Var = ((prd) bo5Var).N0();
        }
        if (bo5Var instanceof do5) {
            ((do5) bo5Var).d().getClass();
        }
        return lykVar;
    }

    public static xw7 g(bo5 bo5Var) {
        if (bo5Var != null) {
            ww7 ww7VarH = h(bo5Var);
            return ww7VarH != null ? ww7VarH.i() : g(bo5Var.h()).b(bo5Var.getName());
        }
        a(2);
        throw null;
    }

    public static ww7 h(bo5 bo5Var) {
        if (bo5Var == null) {
            a(5);
            throw null;
        }
        if ((bo5Var instanceof tqb) || nu6.f(bo5Var)) {
            return ww7.c;
        }
        if (bo5Var instanceof d1a) {
            return ((d1a) bo5Var).H;
        }
        if (bo5Var instanceof wmc) {
            return ((xmc) ((wmc) bo5Var)).I;
        }
        return null;
    }

    public static bo5 i(bo5 bo5Var, Class cls, boolean z) {
        if (bo5Var == null) {
            return null;
        }
        if (z) {
            bo5Var = bo5Var.h();
        }
        while (bo5Var != null) {
            if (cls.isInstance(bo5Var)) {
                return bo5Var;
            }
            bo5Var = bo5Var.h();
        }
        return null;
    }

    public static qqb j(qqb qqbVar) {
        if (qqbVar == null) {
            a(44);
            throw null;
        }
        Iterator it = qqbVar.p().b().iterator();
        while (it.hasNext()) {
            qqb qqbVarC = c((yr9) it.next());
            if (qqbVarC.m() != 2) {
                return qqbVarC;
            }
        }
        return null;
    }

    public static boolean k(bo5 bo5Var) {
        return n(bo5Var, 1) && bo5Var.getName().equals(ygg.a);
    }

    public static boolean l(bo5 bo5Var) {
        return n(bo5Var, 6) && ((qqb) bo5Var).p0();
    }

    public static boolean m(bo5 bo5Var) {
        if (bo5Var != null) {
            return n(bo5Var, 4);
        }
        a(36);
        throw null;
    }

    public static boolean n(bo5 bo5Var, int i) {
        if (i != 0) {
            return (bo5Var instanceof qqb) && ((qqb) bo5Var).m() == i;
        }
        a(37);
        throw null;
    }

    public static boolean o(bo5 bo5Var) {
        if (bo5Var == null) {
            a(1);
            throw null;
        }
        while (bo5Var != null) {
            if (k(bo5Var) || ((bo5Var instanceof go5) && ((go5) bo5Var).getVisibility() == q06.f)) {
                return true;
            }
            bo5Var = bo5Var.h();
        }
        return false;
    }

    public static boolean p(yr9 yr9Var, bo5 bo5Var) {
        if (yr9Var == null) {
            a(30);
            throw null;
        }
        if (bo5Var == null) {
            a(31);
            throw null;
        }
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA == null) {
            return false;
        }
        bo5 bo5VarA = xh3VarA.a();
        return (bo5VarA instanceof xh3) && (bo5Var instanceof xh3) && ((xh3) bo5Var).p().equals(((xh3) bo5VarA).p());
    }

    public static boolean q(yh3 yh3Var) {
        return (n(yh3Var, 1) || n(yh3Var, 2)) && ((qqb) yh3Var).q() == 2;
    }

    public static boolean r(yr9 yr9Var, bo5 bo5Var) {
        if (yr9Var == null) {
            a(32);
            throw null;
        }
        if (bo5Var == null) {
            a(33);
            throw null;
        }
        if (p(yr9Var, bo5Var)) {
            return true;
        }
        Iterator it = yr9Var.O().b().iterator();
        while (it.hasNext()) {
            if (r((yr9) it.next(), bo5Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(bo5 bo5Var) {
        return bo5Var != null && (bo5Var.h() instanceof wmc);
    }

    public static e92 t(e92 e92Var) {
        if (e92Var == null) {
            a(59);
            throw null;
        }
        while (e92Var.getKind() == 2) {
            Collection collectionI = e92Var.i();
            if (collectionI.isEmpty()) {
                xh6.m("Fake override should have at least one overridden descriptor: ", e92Var);
                return null;
            }
            e92Var = (e92) collectionI.iterator().next();
        }
        return e92Var;
    }
}
