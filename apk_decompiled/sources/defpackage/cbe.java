package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cbe extends abe {
    public final Object[] b;

    public cbe(sxb sxbVar, Object[] objArr) {
        super(sxbVar);
        this.b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = yae.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new pbe(null, (Enum) obj) : obj instanceof Annotation ? new bbe(null, (Annotation) obj) : obj instanceof Object[] ? new cbe(null, (Object[]) obj) : obj instanceof Class ? new lbe(null, (Class) obj) : new rbe(null, obj));
        }
        return arrayList;
    }
}
