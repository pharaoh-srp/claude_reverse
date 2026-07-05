package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vx9 extends xg3 {
    public final el5 K;
    public final vd9 L;
    public final qqb M;
    public final el5 N;
    public final u0h O;
    public final int P;
    public final int Q;
    public final kzi R;
    public final boolean S;
    public final ux9 T;
    public final zx9 U;
    public final y7f V;
    public final x39 W;
    public final ny9 X;
    public final sx9 Y;
    public final dfa Z;

    static {
        mp0.Z0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vx9(defpackage.el5 r12, defpackage.bo5 r13, defpackage.vd9 r14, defpackage.qqb r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx9.<init>(el5, bo5, vd9, qqb):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, lm6] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // defpackage.qqb
    public final Collection O() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        ?? arrayList = lm6.E;
        if (this.Q != 2) {
            return arrayList;
        }
        Object obj = null;
        ze9 ze9VarJ = oyk.j(2, false, null, 7);
        Class cls = ((jbe) this.L).a;
        cls.getClass();
        c61 c61Var = wwk.j;
        if (c61Var == null) {
            try {
                c61Var = new c61(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 14);
            } catch (NoSuchMethodException unused) {
                c61Var = new c61(obj, obj, obj, obj, 14);
            }
            wwk.j = c61Var;
        }
        Method method = (Method) c61Var.G;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new mbe(cls2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            xh3 xh3VarA = ((fj0) this.N.I).Q((mbe) it.next(), ze9VarJ).O().a();
            qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
            if (qqbVar != null) {
                arrayList2.add(qqbVar);
            }
        }
        return w44.i1(arrayList2, new g67(13));
    }

    @Override // defpackage.qqb
    public final fab b0() {
        return this.X;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        return this.Y;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.a;
        kzi kziVar = this.R;
        if (!x44.r(kziVar, p06Var) || ((jbe) this.L).g() != null) {
            return ztj.j(kziVar);
        }
        be9 be9Var = ce9.a;
        be9Var.getClass();
        return be9Var;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        return (List) this.Z.a();
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.i0, defpackage.qqb
    public final fab k0() {
        return this.W;
    }

    @Override // defpackage.i0, defpackage.qqb
    public final fab l0() {
        return (zx9) super.l0();
    }

    @Override // defpackage.qqb
    public final int m() {
        return this.P;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        y7f y7fVar = this.V;
        i0 i0Var = y7fVar.a;
        int i = o06.a;
        m06.d(i0Var).getClass();
        return (zx9) ((fab) wd6.s0(y7fVar.c, y7f.e[0]));
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return null;
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        return null;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        return this.T;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        return this.Q;
    }

    @Override // defpackage.qqb
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean r0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = o06.a;
        xw7 xw7VarG = m06.g(this);
        xw7VarG.getClass();
        sb.append(xw7VarG);
        return sb.toString();
    }

    @Override // defpackage.qqb
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final List j() {
        return (List) this.U.q.a();
    }

    public final List w0() {
        return (List) this.O.getValue();
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    public final zx9 x0() {
        return (zx9) super.l0();
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return this.S;
    }

    public /* synthetic */ vx9(el5 el5Var, bo5 bo5Var, vd9 vd9Var) {
        this(el5Var, bo5Var, vd9Var, null);
    }
}
