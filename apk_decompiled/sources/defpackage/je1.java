package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class je1 implements he1 {
    public final rp9 E;
    public float F = -1.0f;

    public je1(List list) {
        this.E = (rp9) list.get(0);
    }

    @Override // defpackage.he1
    public final boolean i(float f) {
        if (this.F == f) {
            return true;
        }
        this.F = f;
        return false;
    }

    @Override // defpackage.he1
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.he1
    public final rp9 k() {
        return this.E;
    }

    @Override // defpackage.he1
    public final boolean l(float f) {
        return !this.E.c();
    }

    @Override // defpackage.he1
    public final float q() {
        return this.E.a();
    }

    @Override // defpackage.he1
    public final float r() {
        return this.E.b();
    }
}
