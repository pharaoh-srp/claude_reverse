package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class la9 extends ma9 {
    @Override // defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        tvj.b(this, objArr);
        Object obj = objArr[0];
        Object[] objArrY0 = objArr.length <= 1 ? new Object[0] : mp0.y0(objArr, 1, objArr.length);
        return this.a.invoke(obj, Arrays.copyOf(objArrY0, objArrY0.length));
    }
}
