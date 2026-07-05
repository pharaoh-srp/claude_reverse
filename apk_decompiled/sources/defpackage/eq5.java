package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eq5 extends w82 {
    public final Executor a;

    public eq5(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.w82
    public final x82 a(Type type, Annotation[] annotationArr, qre qreVar) {
        if (zni.F(type) != u82.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new nyj(zni.D(0, (ParameterizedType) type), 22, zni.J(annotationArr, g9g.class) ? null : this.a);
        }
        sz6.p("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
