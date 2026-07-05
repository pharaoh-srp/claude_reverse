package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fc0 implements q92 {
    public final Class a;
    public final ArrayList b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public fc0(Class cls, ArrayList arrayList, int i, int i2, List list) {
        cls.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        list.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = i;
        this.d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list3 = this.d;
        ArrayList arrayList3 = new ArrayList(x44.y(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) yae.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list4 = this.d;
        ArrayList arrayList4 = new ArrayList(x44.y(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == 2 && i2 == 1 && !w44.X0(this.b, ExperienceToggle.DEFAULT_PARAM_KEY).isEmpty()) {
            pmf.n("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // defpackage.q92
    public final List a() {
        return this.e;
    }

    @Override // defpackage.q92
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // defpackage.q92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc0.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.q92
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ fc0(Class cls, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, i, 2, arrayList2);
    }
}
