package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class zbe extends obe implements sd9 {
    public final xbe a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public zbe(xbe xbeVar, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = xbeVar;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.sd9
    public final zae a(ww7 ww7Var) {
        ww7Var.getClass();
        return rkk.d(this.b, ww7Var);
    }

    public final sxb b() {
        String str = this.c;
        if (str != null) {
            return sxb.d(str);
        }
        return null;
    }

    public final xbe c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        return rkk.g(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zbe.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        sb.append(b());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
