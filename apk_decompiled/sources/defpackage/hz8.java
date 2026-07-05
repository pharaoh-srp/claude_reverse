package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hz8 extends bz8 {
    @Override // defpackage.bz8
    public final bz8 a(Object obj) {
        b(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        bvk.e(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final vde g() {
        this.c = true;
        return nz8.m(this.b, this.a);
    }
}
