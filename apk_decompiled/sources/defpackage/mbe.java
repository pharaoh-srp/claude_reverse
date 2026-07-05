package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class mbe extends xbe {
    public final Type a;
    public final yd9 b;

    public mbe(Type type) {
        yd9 jbeVar;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            jbeVar = new jbe((Class) type);
        } else if (type instanceof TypeVariable) {
            jbeVar = new ybe((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            jbeVar = new jbe((Class) rawType);
        }
        this.b = jbeVar;
    }

    @Override // defpackage.xbe, defpackage.sd9
    public final zae a(ww7 ww7Var) {
        ww7Var.getClass();
        return null;
    }

    @Override // defpackage.xbe
    public final Type b() {
        return this.a;
    }

    public final yd9 c() {
        return this.b;
    }

    public final void d() {
        throw new UnsupportedOperationException("Type not found: " + this.a);
    }

    public final String e() {
        return this.a.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f() {
        /*
            r5 = this;
            java.lang.reflect.Type r5 = r5.a
            java.util.List r5 = defpackage.yae.c(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.x44.y(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r1.getClass()
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L39
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r4 = r3.isPrimitive()
            if (r4 == 0) goto L39
            vbe r1 = new vbe
            r1.<init>(r3)
            goto L62
        L39:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L5c
            if (r2 == 0) goto L49
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L49
            goto L5c
        L49:
            boolean r2 = r1 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L56
            ace r2 = new ace
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            r2.<init>(r1)
        L54:
            r1 = r2
            goto L62
        L56:
            mbe r2 = new mbe
            r2.<init>(r1)
            goto L54
        L5c:
            dbe r2 = new dbe
            r2.<init>(r1)
            goto L54
        L62:
            r0.add(r1)
            goto L17
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.f():java.util.ArrayList");
    }

    public final boolean g() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        return lm6.E;
    }
}
