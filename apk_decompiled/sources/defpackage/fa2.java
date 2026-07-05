package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fa2 implements q92 {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public fa2(Member member, Type type, Class cls, Type[] typeArr) {
        List listY0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            wig wigVar = new wig(2);
            wigVar.a(cls);
            wigVar.b(typeArr);
            ArrayList arrayList = wigVar.a;
            listY0 = x44.X(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listY0 = mp0.Y0(typeArr);
        }
        this.d = listY0;
    }

    @Override // defpackage.q92
    public final List a() {
        return this.d;
    }

    @Override // defpackage.q92
    public final Member b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        tvj.b(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            sz6.p("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.q92
    public final Type getReturnType() {
        return this.b;
    }
}
