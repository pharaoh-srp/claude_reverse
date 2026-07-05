package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class ee7 extends ar4 {
    public final p8b a;
    public final efe b;

    public ee7(p8b p8bVar, efe efeVar) {
        this.a = p8bVar;
        this.b = efeVar;
    }

    @Override // defpackage.ar4
    public final br4 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, qre qreVar) {
        type.getClass();
        annotationArr2.getClass();
        efe efeVar = this.b;
        return new lrb(this.a, iv1.L(((bg9) efeVar.F).b, type), efeVar, 13);
    }

    @Override // defpackage.ar4
    public final br4 b(Type type, Annotation[] annotationArr, qre qreVar) {
        annotationArr.getClass();
        efe efeVar = this.b;
        return new nyj(iv1.L(((bg9) efeVar.F).b, type), 24, efeVar);
    }
}
