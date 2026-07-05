package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dp0 extends ap0 {
    public Object[] E = new Object[20];
    public int F = 0;

    @Override // defpackage.ap0
    public final int a() {
        return this.F;
    }

    @Override // defpackage.ap0
    public final void e(int i, Object obj) {
        obj.getClass();
        Object[] objArr = this.E;
        if (objArr.length <= i) {
            this.E = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.E;
        if (objArr2[i] == null) {
            this.F++;
        }
        objArr2[i] = obj;
    }

    @Override // defpackage.ap0
    public final Object get(int i) {
        return mp0.I0(i, this.E);
    }

    @Override // defpackage.ap0, java.lang.Iterable
    public final Iterator iterator() {
        return new cp0(this);
    }
}
