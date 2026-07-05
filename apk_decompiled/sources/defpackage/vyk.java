package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class vyk extends qzk {
    public final /* synthetic */ int F;
    public final /* synthetic */ j5h G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyk(m3l m3lVar, j5h j5hVar, String str, j5h j5hVar2) {
        super(j5hVar);
        this.F = 0;
        this.I = m3lVar;
        this.H = str;
        this.G = j5hVar2;
    }

    @Override // defpackage.qzk
    public final void a() {
        switch (this.F) {
            case 0:
                j5h j5hVar = this.G;
                m3l m3lVar = (m3l) this.I;
                String str = (String) this.H;
                try {
                    m3lVar.a.m.k(m3lVar.b, m3l.a(m3lVar, str), new n2l(m3lVar, j5hVar, str));
                    return;
                } catch (RemoteException e) {
                    m3l.e.b(e, "requestUpdateInfo(%s)", str);
                    j5hVar.c(new RuntimeException(e));
                    return;
                }
            case 1:
                j5h j5hVar2 = this.G;
                m3l m3lVar2 = (m3l) this.I;
                try {
                    m3lVar2.a.m.m(m3lVar2.b, m3l.b(), new q1l(m3lVar2, new sqb("OnCompleteUpdateCallback"), j5hVar2));
                    return;
                } catch (RemoteException e2) {
                    m3l.e.b(e2, "completeUpdate(%s)", (String) this.H);
                    j5hVar2.c(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((u5l) this.I).f) {
                    try {
                        u5l u5lVar = (u5l) this.I;
                        j5h j5hVar3 = this.G;
                        u5lVar.e.add(j5hVar3);
                        j5hVar3.a.h(new mvd(u5lVar, 18, j5hVar3));
                        if (((u5l) this.I).k.getAndIncrement() > 0) {
                            ((u5l) this.I).b.c("Already connected to the service.", new Object[0]);
                        }
                        u5l.b((u5l) this.I, (qzk) this.H);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vyk(Object obj, j5h j5hVar, j5h j5hVar2, Object obj2, int i) {
        super(j5hVar);
        this.F = i;
        this.I = obj;
        this.G = j5hVar2;
        this.H = obj2;
    }
}
