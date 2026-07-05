package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class md1 implements m51 {
    public i51 b;
    public i51 c;
    public i51 d;
    public i51 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public md1() {
        ByteBuffer byteBuffer = m51.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        i51 i51Var = i51.e;
        this.d = i51Var;
        this.e = i51Var;
        this.b = i51Var;
        this.c = i51Var;
    }

    public abstract i51 a(i51 i51Var);

    public void b() {
    }

    @Override // defpackage.m51
    public boolean c() {
        return this.e != i51.e;
    }

    @Override // defpackage.m51
    public boolean d() {
        return this.h && this.g == m51.a;
    }

    @Override // defpackage.m51
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.g;
        this.g = m51.a;
        return byteBuffer;
    }

    @Override // defpackage.m51
    public final void f(j51 j51Var) {
        this.g = m51.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.m51
    public final i51 h(i51 i51Var) {
        this.d = i51Var;
        this.e = a(i51Var);
        return c() ? this.e : i51.e;
    }

    @Override // defpackage.m51
    public final void i() {
        this.h = true;
        k();
    }

    public void k() {
    }

    public void l() {
    }

    public final ByteBuffer m(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.m51
    public final void reset() {
        ByteBuffer byteBuffer = m51.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        i51 i51Var = i51.e;
        this.d = i51Var;
        this.e = i51Var;
        this.b = i51Var;
        this.c = i51Var;
        l();
    }
}
