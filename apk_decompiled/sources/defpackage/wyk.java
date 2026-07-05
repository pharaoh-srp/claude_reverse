package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wyk extends brk {
    public final /* synthetic */ j5h F;
    public final /* synthetic */ bbk G;
    public final /* synthetic */ s4l H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyk(s4l s4lVar, j5h j5hVar, j5h j5hVar2, bbk bbkVar) {
        super(j5hVar);
        this.F = j5hVar2;
        this.G = bbkVar;
        this.H = s4lVar;
    }

    @Override // defpackage.brk
    public final void a() {
        synchronized (this.H.f) {
            try {
                s4l s4lVar = this.H;
                j5h j5hVar = this.F;
                s4lVar.e.add(j5hVar);
                j5hVar.a.h(new mvd(s4lVar, 17, j5hVar));
                if (this.H.k.getAndIncrement() > 0) {
                    this.H.b.f("Already connected to the service.", new Object[0]);
                }
                s4l.b(this.H, this.G);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
