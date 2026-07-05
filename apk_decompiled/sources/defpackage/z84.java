package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class z84 extends w82 {
    @Override // defpackage.w82
    public final x82 a(Type type, Annotation[] annotationArr, qre qreVar) {
        if (zni.F(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            sz6.j("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        int i = 0;
        Type typeD = zni.D(0, (ParameterizedType) type);
        if (zni.F(typeD) != oqe.class) {
            return new x84(i, typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new x84(1, zni.D(0, (ParameterizedType) typeD));
        }
        sz6.j("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
