package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n3l extends qzk {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ n3l(int i, Object obj) {
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.qzk
    public final void a() {
        switch (this.F) {
            case 0:
                synchronized (((u5l) this.G).f) {
                    try {
                        if (((u5l) this.G).k.get() > 0 && ((u5l) this.G).k.decrementAndGet() > 0) {
                            ((u5l) this.G).b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        u5l u5lVar = (u5l) this.G;
                        if (u5lVar.m != null) {
                            u5lVar.b.c("Unbind from service.", new Object[0]);
                            u5l u5lVar2 = (u5l) this.G;
                            u5lVar2.a.unbindService(u5lVar2.l);
                            u5l u5lVar3 = (u5l) this.G;
                            u5lVar3.g = false;
                            u5lVar3.m = null;
                            u5lVar3.l = null;
                        }
                        ((u5l) this.G).e();
                        return;
                    } finally {
                    }
                }
            default:
                u5l u5lVar4 = (u5l) ((lj1) this.G).F;
                u5lVar4.b.c("unlinkToDeath", new Object[0]);
                u5lVar4.m.asBinder().unlinkToDeath(u5lVar4.j, 0);
                u5lVar4.m = null;
                u5lVar4.g = false;
                return;
        }
    }
}
