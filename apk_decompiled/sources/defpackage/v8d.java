package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class v8d extends n3 {
    public final pl9 a;
    public final List b;
    public final kw9 c;

    public v8d(pl9 pl9Var) {
        pl9Var.getClass();
        this.a = pl9Var;
        this.b = lm6.E;
        this.c = yb5.w(w1a.F, new pza(12, this));
    }

    @Override // defpackage.n3
    public final pl9 c() {
        return this.a;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v8d(pl9 pl9Var, Annotation[] annotationArr) {
        this(pl9Var);
        pl9Var.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
