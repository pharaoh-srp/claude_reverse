package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lm9 extends ol9 implements a08, jm9, zy7, bz7, az7, cz7, dz7, ez7, fz7, gz7, hz7, iz7, jz7, kz7, pz7, mz7, nz7, oz7, rz7, sz7, tz7, uz7, vz7, wz7, xz7 {
    public static final /* synthetic */ wn9[] P;
    public final im9 J;
    public final String K;
    public final Object L;
    public final ece M;
    public final kw9 N;
    public final kw9 O;

    static {
        kce kceVar = jce.a;
        P = new wn9[]{kceVar.g(new mrd(kceVar.b(lm9.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public lm9(im9 im9Var, String str, String str2, h08 h08Var, Object obj) {
        this.J = im9Var;
        this.K = str2;
        this.L = obj;
        this.M = csg.C(h08Var, new xz(this, 14, str));
        km9 km9Var = new km9(this, 0);
        w1a w1aVar = w1a.F;
        this.N = yb5.w(w1aVar, km9Var);
        this.O = yb5.w(w1aVar, new km9(this, 1));
    }

    public static final fa2 w(lm9 lm9Var, Constructor constructor, h08 h08Var, boolean z) {
        Object obj = lm9Var.L;
        Class cls = null;
        if (!z) {
            tg3 tg3Var = h08Var instanceof tg3 ? (tg3) h08Var : null;
            if (tg3Var != null && !q06.e(tg3Var.getVisibility())) {
                qqb qqbVarS = tg3Var.s();
                qqbVarS.getClass();
                if (!g39.a(qqbVarS) && !m06.q(tg3Var.s())) {
                    List listI = tg3Var.I();
                    listI.getClass();
                    List list = listI;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            yr9 type = ((eri) it.next()).getType();
                            type.getClass();
                            if (lvk.e(type)) {
                                if (lm9Var.v()) {
                                    return new r92(constructor, kvk.c(obj, lm9Var.t()), 0);
                                }
                                Class declaringClass = constructor.getDeclaringClass();
                                declaringClass.getClass();
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                genericParameterTypes.getClass();
                                return new s92(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : mp0.y0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                            }
                        }
                    }
                }
            }
        }
        if (lm9Var.v()) {
            return new r92(constructor, kvk.c(obj, lm9Var.t()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        declaringClass2.getClass();
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        genericParameterTypes2.getClass();
        return new s92(constructor, declaringClass2, cls2, genericParameterTypes2, 1);
    }

    @Override // defpackage.zy7
    public final Object a() {
        return call(new Object[0]);
    }

    public final boolean equals(Object obj) {
        lm9 lm9VarB = vpi.b(obj);
        return lm9VarB != null && x44.r(this.J, lm9VarB.J) && getName().equals(lm9VarB.getName()) && x44.r(this.K, lm9VarB.K) && x44.r(this.L, lm9VarB.L);
    }

    @Override // defpackage.a08
    public final int getArity() {
        q92 q92VarQ = q();
        q92VarQ.getClass();
        return q92VarQ.a().size();
    }

    @Override // defpackage.ll9
    public final String getName() {
        String strB = ((co5) t()).getName().b();
        strB.getClass();
        return strB;
    }

    public final int hashCode() {
        return this.K.hashCode() + ((getName().hashCode() + (this.J.hashCode() * 31)) * 31);
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // defpackage.jm9
    public final boolean isExternal() {
        return t().isExternal();
    }

    @Override // defpackage.jm9
    public final boolean isInfix() {
        return t().isInfix();
    }

    @Override // defpackage.jm9
    public final boolean isInline() {
        return t().isInline();
    }

    @Override // defpackage.jm9
    public final boolean isOperator() {
        return t().isOperator();
    }

    @Override // defpackage.ll9
    public final boolean isSuspend() {
        return t().isSuspend();
    }

    @Override // defpackage.wz7
    public final Object j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, e18 e18Var, Integer num) {
        return call(fqb.E, obj, bool, obj2, obj3, obj4, e18Var, num);
    }

    @Override // defpackage.uz7
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.ol9
    public final q92 q() {
        return (q92) this.N.getValue();
    }

    @Override // defpackage.ol9
    public final im9 r() {
        return this.J;
    }

    @Override // defpackage.ol9
    public final q92 s() {
        return (q92) this.O.getValue();
    }

    public final String toString() {
        g06 g06Var = pce.a;
        return pce.b(t());
    }

    @Override // defpackage.ol9
    public final boolean v() {
        return !x44.r(this.L, g92.NO_RECEIVER);
    }

    @Override // defpackage.ol9
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final h08 t() {
        wn9 wn9Var = P[0];
        Object objA = this.M.a();
        objA.getClass();
        return (h08) objA;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lm9(im9 im9Var, String str, String str2, Object obj) {
        this(im9Var, str, str2, null, obj);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public lm9(im9 im9Var, h08 h08Var) {
        h08Var.getClass();
        String strB = ((co5) h08Var).getName().b();
        strB.getClass();
        this(im9Var, strB, jze.c(h08Var).f(), h08Var, g92.NO_RECEIVER);
    }
}
