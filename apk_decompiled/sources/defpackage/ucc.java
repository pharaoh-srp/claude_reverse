package defpackage;

import android.content.IntentSender;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ucc implements iw1, qg5, hn0 {
    public static final byte[] H = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] I = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int E;
    public int F;
    public Object G;

    public ucc(IntentSender intentSender) {
        intentSender.getClass();
        this.G = intentSender;
    }

    public static void q(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(nv1.c(i2));
    }

    @Override // defpackage.hn0
    public void a(int i, Object obj) {
        ((hn0) this.G).a(i + (this.F == 0 ? this.E : 0), obj);
    }

    @Override // defpackage.hn0
    public void b(Object obj) {
        this.F++;
        ((hn0) this.G).b(obj);
    }

    @Override // defpackage.hn0
    public void c() {
        ((hn0) this.G).c();
    }

    @Override // defpackage.hn0
    public void d(int i, int i2, int i3) {
        int i4 = this.F == 0 ? this.E : 0;
        ((hn0) this.G).d(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.hn0
    public void e(int i, int i2) {
        ((hn0) this.G).e(i + (this.F == 0 ? this.E : 0), i2);
    }

    @Override // defpackage.iw1
    public int f() {
        return this.E;
    }

    @Override // defpackage.hn0
    public void g() {
        if (this.F <= 0) {
            pd4.a("OffsetApplier up called with no corresponding down");
        }
        this.F--;
        ((hn0) this.G).g();
    }

    @Override // defpackage.hn0
    public void h(int i, Object obj) {
        ((hn0) this.G).h(i + (this.F == 0 ? this.E : 0), obj);
    }

    @Override // defpackage.hn0
    public Object j() {
        return ((hn0) this.G).j();
    }

    @Override // defpackage.hn0
    public void k(pz7 pz7Var, Object obj) {
        ((hn0) this.G).k(pz7Var, obj);
    }

    @Override // defpackage.iw1
    public int l() {
        return this.F;
    }

    @Override // defpackage.iw1
    public int m() {
        int i = this.E;
        return i == -1 ? ((ssc) this.G).D() : i;
    }

    @Override // defpackage.qg5
    public tg5 n() {
        return new rr5(this.E, this.F, (epk) this.G);
    }

    public u79 o() {
        return new u79((IntentSender) this.G, null, this.E, this.F);
    }

    public void p(int i, int i2) {
        this.F = i;
        this.E = i2;
    }
}
