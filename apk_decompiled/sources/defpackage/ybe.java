package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class ybe extends obe implements sd9, yd9 {
    public final TypeVariable a;

    public ybe(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    @Override // defpackage.sd9
    public final zae a(ww7 ww7Var) {
        Annotation[] declaredAnnotations;
        ww7Var.getClass();
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return rkk.d(declaredAnnotations, ww7Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ybe) {
            return x44.r(this.a, ((ybe) obj).a);
        }
        return false;
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? lm6.E : rkk.g(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ybe.class.getName() + ": " + this.a;
    }
}
