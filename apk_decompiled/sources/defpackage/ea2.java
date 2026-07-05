package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ea2 extends aa2 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea2(Method method) {
        super(method, false, 6);
        this.g = 0;
        method.getClass();
    }

    @Override // defpackage.aa2, defpackage.q92
    public final Object call(Object[] objArr) {
        int i = this.g;
        objArr.getClass();
        switch (i) {
            case 0:
                tvj.b(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : mp0.y0(objArr, 1, objArr.length));
            case 1:
                tvj.b(this, objArr);
                d(mp0.E0(objArr));
                return e(null, objArr.length <= 1 ? new Object[0] : mp0.y0(objArr, 1, objArr.length));
            default:
                tvj.b(this, objArr);
                return e(null, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea2(int i, int i2, Method method, boolean z) {
        super(method, z, i);
        this.g = i2;
    }
}
