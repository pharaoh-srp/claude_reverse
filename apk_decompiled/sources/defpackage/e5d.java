package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public class e5d implements c5d {
    public final Magnifier a;

    public e5d(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.c5d
    public void a(float f, long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
