package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public abstract class ol9 implements ll9, ho9 {
    public final ece E = csg.C(null, new ml9(this, 1));
    public final ece F = csg.C(null, new ml9(this, 2));
    public final ece G = csg.C(null, new ml9(this, 3));
    public final ece H = csg.C(null, new ml9(this, 4));
    public final ece I = csg.C(null, new ml9(this, 0));

    public static Object p(fo9 fo9Var) {
        Class clsI = ez1.I(kud.l(fo9Var));
        if (clsI.isArray()) {
            Object objNewInstance = Array.newInstance(clsI.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsI.getSimpleName() + ", because it is not an array type");
    }

    @Override // defpackage.ll9
    public final Object call(Object... objArr) {
        objArr.getClass();
        try {
            return q().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // defpackage.ll9
    public final Object callBy(Map map) throws IllegalCallableAccessException {
        Object objP;
        map.getClass();
        boolean z = false;
        if (u()) {
            List<in9> parameters = getParameters();
            ArrayList arrayList = new ArrayList(x44.y(parameters, 10));
            for (in9 in9Var : parameters) {
                if (map.containsKey(in9Var)) {
                    objP = map.get(in9Var);
                    if (objP == null) {
                        mr9.c(41, in9Var, "Annotation argument value cannot be null (");
                        return null;
                    }
                } else if (in9Var.m()) {
                    objP = null;
                } else {
                    if (!in9Var.o()) {
                        xh6.k("No argument provided for a required parameter: ", in9Var);
                        return null;
                    }
                    objP = p(in9Var.l());
                }
                arrayList.add(objP);
            }
            q92 q92VarS = s();
            if (q92VarS != null) {
                try {
                    return q92VarS.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + t());
        }
        List<in9> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return q().call(isSuspend() ? new tp4[]{null} : new tp4[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.I.a()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (in9 in9Var2 : parameters2) {
            if (map.containsKey(in9Var2)) {
                objArr[in9Var2.i()] = map.get(in9Var2);
            } else if (in9Var2.m()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!in9Var2.o()) {
                xh6.k("No argument provided for a required parameter: ", in9Var2);
                return null;
            }
            if (in9Var2.j() == gn9.G) {
                i++;
            }
        }
        if (!z) {
            try {
                return q().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        q92 q92VarS2 = s();
        if (q92VarS2 != null) {
            try {
                return q92VarS2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + t());
    }

    @Override // defpackage.kl9
    public final List getAnnotations() {
        Object objA = this.E.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // defpackage.ll9
    public final List getParameters() {
        Object objA = this.F.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // defpackage.ll9
    public final eo9 getReturnType() {
        Object objA = this.G.a();
        objA.getClass();
        return (eo9) objA;
    }

    @Override // defpackage.ll9
    public final List getTypeParameters() {
        Object objA = this.H.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // defpackage.ll9
    public final mo9 getVisibility() {
        ow5 visibility = t().getVisibility();
        visibility.getClass();
        ww7 ww7Var = vpi.a;
        if (visibility.equals(q06.e)) {
            return mo9.E;
        }
        if (visibility.equals(q06.c)) {
            return mo9.F;
        }
        if (visibility.equals(q06.d)) {
            return mo9.G;
        }
        if (visibility.equals(q06.a) ? true : visibility.equals(q06.b)) {
            return mo9.H;
        }
        return null;
    }

    @Override // defpackage.ll9
    public final boolean isAbstract() {
        return t().q() == 4;
    }

    @Override // defpackage.ll9
    public final boolean isFinal() {
        return t().q() == 1;
    }

    @Override // defpackage.ll9
    public final boolean isOpen() {
        return t().q() == 3;
    }

    public abstract q92 q();

    public abstract im9 r();

    public abstract q92 s();

    public abstract e92 t();

    public final boolean u() {
        return x44.r(getName(), "<init>") && r().a().isAnnotation();
    }

    public abstract boolean v();
}
