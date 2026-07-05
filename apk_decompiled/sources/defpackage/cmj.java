package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cmj extends amj {
    public final /* synthetic */ j5h F;
    public final /* synthetic */ jlj G;
    public final /* synthetic */ flj H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmj(flj fljVar, j5h j5hVar, j5h j5hVar2, jlj jljVar) {
        super(j5hVar);
        this.F = j5hVar2;
        this.G = jljVar;
        Objects.requireNonNull(fljVar);
        this.H = fljVar;
    }

    @Override // defpackage.amj
    public final void b() {
        flj fljVar = this.H;
        synchronized (fljVar.f) {
            try {
                j5h j5hVar = this.F;
                fljVar.e.add(j5hVar);
                j5hVar.a.h(new mvd(fljVar, 9, j5hVar));
                if (fljVar.l.getAndIncrement() > 0) {
                    fljVar.b.a("Already connected to the service.", new Object[0]);
                }
                flj.b(fljVar, this.G);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
