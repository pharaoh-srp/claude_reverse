package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class mn9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ nn9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn9(nn9 nn9Var, int i) {
        super(0);
        this.F = i;
        this.G = nn9Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws IllegalPropertyDelegateAccessException {
        int i = this.F;
        nn9 nn9Var = this.G;
        switch (i) {
            case 0:
                return new ln9(nn9Var);
            default:
                Object objW = nn9Var.w();
                try {
                    Object obj = do9.P;
                    Object objX = nn9Var.v() ? nn9Var.x() : null;
                    if (objX == obj) {
                        objX = null;
                    }
                    nn9Var.v();
                    AccessibleObject accessibleObject = objW != null ? (AccessibleObject) objW : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(oe5.i(nn9Var));
                    }
                    if (objW == null) {
                        return null;
                    }
                    if (objW instanceof Field) {
                        return ((Field) objW).get(objX);
                    }
                    if (!(objW instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objW + " neither field nor method");
                    }
                    int length = ((Method) objW).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objW).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objW;
                        if (objX == null) {
                            Class<?> cls = ((Method) objW).getParameterTypes()[0];
                            cls.getClass();
                            objX = vpi.e(cls);
                        }
                        return method.invoke(null, objX);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objW;
                        Class<?> cls2 = ((Method) objW).getParameterTypes()[1];
                        cls2.getClass();
                        return method2.invoke(null, objX, vpi.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objW + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
