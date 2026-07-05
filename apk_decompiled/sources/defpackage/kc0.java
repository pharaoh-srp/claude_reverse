package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kc0 implements jc0 {
    public final yr9 a;
    public final Map b;
    public final neg c;

    public kc0(j7g j7gVar, Map map, neg negVar) {
        if (j7gVar == null) {
            a(0);
            throw null;
        }
        if (map == null) {
            a(1);
            throw null;
        }
        this.a = j7gVar;
        this.b = map;
        this.c = negVar;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.jc0
    public final neg d() {
        return this.c;
    }

    @Override // defpackage.jc0
    public final ww7 e() {
        qqb qqbVarD = o06.d(this);
        if (qqbVarD != null) {
            if (nu6.f(qqbVarD)) {
                qqbVarD = null;
            }
            if (qqbVarD != null) {
                return o06.c(qqbVarD);
            }
        }
        return null;
    }

    @Override // defpackage.jc0
    public final Map f() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    @Override // defpackage.jc0
    public final yr9 getType() {
        yr9 yr9Var = this.a;
        if (yr9Var != null) {
            return yr9Var;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return g06.c.y(this, null);
    }
}
