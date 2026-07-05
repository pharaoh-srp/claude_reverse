package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sbe extends obe implements sd9, de9 {
    @Override // defpackage.sd9
    public final zae a(ww7 ww7Var) {
        ww7Var.getClass();
        Member memberC = c();
        memberC.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberC).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return rkk.d(declaredAnnotations, ww7Var);
        }
        return null;
    }

    public final jbe b() {
        Class<?> declaringClass = c().getDeclaringClass();
        declaringClass.getClass();
        return new jbe(declaringClass);
    }

    public abstract Member c();

    public final sxb d() {
        String name = c().getName();
        sxb sxbVarE = name != null ? sxb.e(name) : null;
        return sxbVarE == null ? ygg.a : sxbVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbe.e(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sbe) && x44.r(c(), ((sbe) obj).c());
    }

    public final kzi f() {
        int modifiers = c().getModifiers();
        return Modifier.isPublic(modifiers) ? hzi.c : Modifier.isPrivate(modifiers) ? ezi.c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? jf9.c : if9.c : hf9.c;
    }

    public final boolean g() {
        return Modifier.isAbstract(((Method) c()).getModifiers());
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        Member memberC = c();
        memberC.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberC).getDeclaredAnnotations();
        return declaredAnnotations != null ? rkk.g(declaredAnnotations) : lm6.E;
    }

    public final boolean h() {
        return Modifier.isFinal(c().getModifiers());
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final boolean i() {
        return Modifier.isStatic(c().getModifiers());
    }

    public final String toString() {
        return getClass().getName() + ": " + c();
    }
}
