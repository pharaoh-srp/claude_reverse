package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x9b extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9b(fo9 fo9Var, int i, kw9 kw9Var) {
        super(0);
        this.F = 2;
        this.G = fo9Var;
        this.I = i;
        this.H = kw9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        List listP1;
        Type type;
        int i = this.F;
        lm6 lm6Var = lm6.E;
        Object obj = this.H;
        Object obj2 = this.G;
        int i2 = this.I;
        switch (i) {
            case 0:
                bab babVar = (bab) obj2;
                wk wkVar = babVar.a;
                a0 a0VarA = babVar.a((bo5) wkVar.a);
                listP1 = a0VarA != null ? w44.p1(((r06) wkVar.d).e.w(a0VarA, (b3) obj, i2)) : null;
                return listP1 == null ? lm6Var : listP1;
            case 1:
                bab babVar2 = (bab) obj2;
                wk wkVar2 = babVar2.a;
                a0 a0VarA2 = babVar2.a((bo5) wkVar2.a);
                listP1 = a0VarA2 != null ? ((r06) wkVar2.d).e.c(a0VarA2, (b3) obj, i2) : null;
                return listP1 == null ? lm6Var : listP1;
            default:
                fo9 fo9Var = (fo9) obj2;
                ece eceVar = fo9Var.F;
                Type type2 = eceVar != null ? (Type) eceVar.a() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type2 instanceof GenericArrayType) {
                    if (i2 != 0) {
                        rl7.n("Array type has been queried for a non-0th argument: ", fo9Var);
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type2 instanceof ParameterizedType)) {
                    rl7.n("Non-generic type has been queried for arguments: ", fo9Var);
                    return null;
                }
                Type type3 = (Type) ((List) ((kw9) obj).getValue()).get(i2);
                if (type3 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    lowerBounds.getClass();
                    Type type4 = (Type) mp0.E0(lowerBounds);
                    if (type4 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        upperBounds.getClass();
                        type3 = (Type) mp0.D0(upperBounds);
                        type = type3;
                    } else {
                        type = type4;
                    }
                } else {
                    type = type3;
                }
                type.getClass();
                return type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9b(bab babVar, b3 b3Var, int i, int i2) {
        super(0);
        this.F = i2;
        this.G = babVar;
        this.H = b3Var;
        this.I = i;
    }
}
