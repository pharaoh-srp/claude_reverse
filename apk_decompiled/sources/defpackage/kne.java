package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kne {
    public static final jne a = new jne();

    static {
        int i = d54.i;
        int i2 = d54.i;
        int i3 = d54.i;
        int i4 = d5i.c;
        dlh[] dlhVarArr = clh.b;
        eve.B(14);
        eve.B(0);
        int i5 = d54.i;
        int i6 = dv7.J.E;
    }

    public static final jy1 a(jy1 jy1Var, long j, jy1 jy1Var2, long j2, float f) {
        if (jy1Var == null && jy1Var2 == null) {
            return null;
        }
        if (jy1Var == null) {
            jy1Var = new eeg(j);
        } else if (jy1Var2 == null) {
            jy1Var2 = new eeg(j2);
        }
        Object objC = tqh.C(jy1Var, jy1Var2, f);
        if (objC instanceof jy1) {
            return (jy1) objC;
        }
        return null;
    }

    public static final Object b(Object obj, Object obj2, float f) {
        Object[] objArr;
        Object[] objArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return ysj.q(obj instanceof tzf ? (tzf) obj : null, obj2 instanceof tzf ? (tzf) obj2 : null, f);
        }
        if (z) {
            objArr = (tzf[]) obj;
        } else {
            obj.getClass();
            objArr = new tzf[]{obj};
        }
        if (z2) {
            objArr2 = (tzf[]) obj2;
        } else {
            obj2.getClass();
            objArr2 = new tzf[]{obj2};
        }
        int iMax = Math.max(objArr.length, objArr2.length);
        tzf[] tzfVarArr = new tzf[iMax];
        for (int i = 0; i < iMax; i++) {
            tzfVarArr[i] = null;
        }
        for (int i2 = 0; i2 < iMax; i2++) {
            tzfVarArr[i2] = ysj.q((tzf) mp0.I0(i2, objArr), (tzf) mp0.I0(i2, objArr2), f);
        }
        return tzfVarArr;
    }
}
