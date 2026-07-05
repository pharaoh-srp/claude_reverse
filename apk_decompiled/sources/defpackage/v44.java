package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class v44 implements g9i {
    public final /* synthetic */ int E;
    public final nyj F;

    public /* synthetic */ v44(nyj nyjVar, int i) {
        this.E = i;
        this.F = nyjVar;
    }

    public static f9i b(nyj nyjVar, xd8 xd8Var, dbi dbiVar, hg9 hg9Var) {
        f9i f9iVarA;
        Object objO0 = nyjVar.W(new dbi(hg9Var.value())).o0();
        boolean zNullSafe = hg9Var.nullSafe();
        if (objO0 instanceof f9i) {
            f9iVarA = (f9i) objO0;
        } else {
            if (!(objO0 instanceof g9i)) {
                sz6.m("Invalid attempt to bind an instance of ", objO0.getClass().getName(), " as a @JsonAdapter for ", yb5.R(dbiVar.b), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            f9iVarA = ((g9i) objO0).a(xd8Var, dbiVar);
        }
        return (f9iVarA == null || !zNullSafe) ? f9iVarA : new ajg(f9iVarA, 3);
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.E;
        cls = Object.class;
        nyj nyjVar = this.F;
        switch (i) {
            case 0:
                Type type = dbiVar.b;
                Class cls2 = dbiVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                ez1.w(Collection.class.isAssignableFrom(cls2));
                Type typeF = yb5.F(type, cls2, yb5.r(type, cls2, Collection.class), new HashMap());
                cls = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
                return new kp0(xd8Var, cls, xd8Var.c(new dbi(cls)), nyjVar.W(dbiVar));
            case 1:
                hg9 hg9Var = (hg9) dbiVar.a.getAnnotation(hg9.class);
                if (hg9Var == null) {
                    return null;
                }
                return b(nyjVar, xd8Var, dbiVar, hg9Var);
            default:
                Type type2 = dbiVar.b;
                Class cls3 = dbiVar.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    ez1.w(Map.class.isAssignableFrom(cls3));
                    Type typeF2 = yb5.F(type2, cls3, yb5.r(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeF2 instanceof ParameterizedType ? ((ParameterizedType) typeF2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                f9i f9iVarC = (type3 == Boolean.TYPE || type3 == Boolean.class) ? n9i.c : xd8Var.c(new dbi(type3));
                f9i f9iVarC2 = xd8Var.c(new dbi(actualTypeArguments[1]));
                sac sacVarW = nyjVar.W(dbiVar);
                Type[] typeArr = actualTypeArguments;
                return new fta(this, xd8Var, typeArr[0], f9iVarC, typeArr[1], f9iVarC2, sacVarW);
        }
    }
}
