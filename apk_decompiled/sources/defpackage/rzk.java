package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rzk extends brk {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ rzk(int i, Object obj) {
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.brk
    public final void a() {
        switch (this.F) {
            case 0:
                synchronized (((s4l) this.G).f) {
                    try {
                        if (((s4l) this.G).k.get() > 0 && ((s4l) this.G).k.decrementAndGet() > 0) {
                            ((s4l) this.G).b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        s4l s4lVar = (s4l) this.G;
                        if (s4lVar.m != null) {
                            s4lVar.b.f("Unbind from service.", new Object[0]);
                            s4l s4lVar2 = (s4l) this.G;
                            s4lVar2.a.unbindService(s4lVar2.l);
                            s4l s4lVar3 = (s4l) this.G;
                            s4lVar3.g = false;
                            s4lVar3.m = null;
                            s4lVar3.l = null;
                        }
                        ((s4l) this.G).c();
                        return;
                    } finally {
                    }
                }
            default:
                s4l s4lVar4 = (s4l) ((lj1) this.G).F;
                s4lVar4.b.f("unlinkToDeath", new Object[0]);
                s4lVar4.m.asBinder().unlinkToDeath(s4lVar4.j, 0);
                s4lVar4.m = null;
                s4lVar4.g = false;
                return;
        }
    }
}
