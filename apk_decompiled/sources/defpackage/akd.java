package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class akd implements y3i {
    public final a4f a;
    public final a4f b;
    public final r56 c = new r56();
    public final AtomicReference d = new AtomicReference(zjd.E);

    public akd(a4f a4fVar) {
        this.a = a4fVar;
        this.b = a4fVar;
    }

    @Override // defpackage.y3i
    public final void a(long j, int i, int i2, int i3, x3i x3iVar) {
        h().a(j, i, i2, i3, x3iVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == zjd.F) {
            this.b.q(false);
            atomicReference.set(zjd.G);
        }
    }

    @Override // defpackage.y3i
    public final void b(ssc sscVar, int i, int i2) {
        h().b(sscVar, i, i2);
    }

    @Override // defpackage.y3i
    public final int c(og5 og5Var, int i, boolean z) {
        return h().c(og5Var, i, z);
    }

    @Override // defpackage.y3i
    public final void d(long j) {
    }

    @Override // defpackage.y3i
    public final void e(int i, ssc sscVar) {
        h().e(i, sscVar);
    }

    @Override // defpackage.y3i
    public final int f(og5 og5Var, int i, boolean z) {
        return h().f(og5Var, i, z);
    }

    @Override // defpackage.y3i
    public final void g(jw7 jw7Var) {
        this.a.g(jw7Var);
    }

    public final y3i h() {
        return this.d.get() == zjd.G ? this.c : this.b;
    }
}
