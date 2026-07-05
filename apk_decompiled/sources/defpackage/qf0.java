package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends w82 {
    public final cj3 a;
    public final q61 b;

    public qf0(cj3 cj3Var, q61 q61Var) {
        this.a = cj3Var;
        this.b = q61Var;
    }

    @Override // defpackage.w82
    public final x82 a(Type type, Annotation[] annotationArr, qre qreVar) {
        type.getClass();
        annotationArr.getClass();
        if (x44.r(zni.F(type), u82.class)) {
            if (!(type instanceof ParameterizedType)) {
                sz6.j("Call must have generic type (e.g., Call<ApiResult<...>>)");
                return null;
            }
            Type typeD = zni.D(0, (ParameterizedType) type);
            if (x44.r(zni.F(typeD), ApiResult.class)) {
                if (!(typeD instanceof ParameterizedType)) {
                    sz6.j("ApiResult must have generic type (e.g., Call<ApiResult<MyResponse>>).");
                    return null;
                }
                Type typeD2 = zni.D(0, (ParameterizedType) typeD);
                typeD2.getClass();
                return new fj0(typeD2, this.a, this.b);
            }
        }
        return null;
    }
}
