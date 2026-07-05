package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aa2 extends fa2 {
    public final /* synthetic */ int e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public aa2(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f = z;
    }

    @Override // defpackage.fa2
    public void c(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                tvj.b(this, objArr);
                if (this.f && mp0.N0(objArr) == null) {
                    sz6.p("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.c(objArr);
                break;
        }
    }

    @Override // defpackage.q92
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        c(objArr);
        ((Field) this.a).set(this.c != null ? mp0.D0(objArr) : null, mp0.N0(objArr));
        return iei.a;
    }

    public Object e(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f ? iei.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aa2(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ aa2(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }
}
