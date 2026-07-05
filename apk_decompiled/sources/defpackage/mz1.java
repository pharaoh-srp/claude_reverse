package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends ar4 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz1(int i) {
        this.a = i;
    }

    @Override // defpackage.ar4
    public br4 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, qre qreVar) {
        switch (this.a) {
            case 0:
                if (tie.class.isAssignableFrom(zni.F(type))) {
                    return hj6.G;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, qreVar);
        }
    }

    @Override // defpackage.ar4
    public final br4 b(Type type, Annotation[] annotationArr, qre qreVar) {
        switch (this.a) {
            case 0:
                if (type == rqe.class) {
                    return zni.J(annotationArr, lqg.class) ? tqh.H : c0l.H;
                }
                if (type == Void.class) {
                    return lyk.I;
                }
                if (zni.d && type == iei.class) {
                    return unb.F;
                }
                return null;
            default:
                if (zni.F(type) != Optional.class) {
                    return null;
                }
                return new ro6(18, qreVar.d(zni.D(0, (ParameterizedType) type), annotationArr));
        }
    }
}
