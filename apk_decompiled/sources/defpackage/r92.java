package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r92 extends fa2 implements kv1 {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public r92(Constructor constructor, Object obj, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : mp0.y0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override // defpackage.q92
    public final Object call(Object[] objArr) {
        int i = this.e;
        Object obj = this.f;
        Member member = this.a;
        objArr.getClass();
        switch (i) {
            case 0:
                tvj.b(this, objArr);
                wig wigVar = new wig(3);
                wigVar.a(obj);
                wigVar.b(objArr);
                wigVar.a(null);
                ArrayList arrayList = wigVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                tvj.b(this, objArr);
                wig wigVar2 = new wig(2);
                wigVar2.a(obj);
                wigVar2.b(objArr);
                ArrayList arrayList2 = wigVar2.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
