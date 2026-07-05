package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ie1 implements he1 {
    public final List E;
    public rp9 G = null;
    public float H = -1.0f;
    public rp9 F = a(MTTypesetterKt.kLineSkipLimitMultiplier);

    public ie1(List list) {
        this.E = list;
    }

    public final rp9 a(float f) {
        List list = this.E;
        rp9 rp9Var = (rp9) list.get(list.size() - 1);
        if (f >= rp9Var.b()) {
            return rp9Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            rp9 rp9Var2 = (rp9) list.get(size);
            if (this.F != rp9Var2 && f >= rp9Var2.b() && f < rp9Var2.a()) {
                return rp9Var2;
            }
        }
        return (rp9) list.get(0);
    }

    @Override // defpackage.he1
    public final boolean i(float f) {
        rp9 rp9Var = this.G;
        rp9 rp9Var2 = this.F;
        if (rp9Var == rp9Var2 && this.H == f) {
            return true;
        }
        this.G = rp9Var2;
        this.H = f;
        return false;
    }

    @Override // defpackage.he1
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.he1
    public final rp9 k() {
        return this.F;
    }

    @Override // defpackage.he1
    public final boolean l(float f) {
        rp9 rp9Var = this.F;
        if (f >= rp9Var.b() && f < rp9Var.a()) {
            return !this.F.c();
        }
        this.F = a(f);
        return true;
    }

    @Override // defpackage.he1
    public final float q() {
        return ((rp9) this.E.get(r1.size() - 1)).a();
    }

    @Override // defpackage.he1
    public final float r() {
        return ((rp9) this.E.get(0)).b();
    }
}
