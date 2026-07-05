package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h1c extends ud1 {
    public final int b;

    static {
        nga.e("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1c(s1c s1cVar) {
        super(s1cVar);
        s1cVar.getClass();
        this.b = 7;
    }

    @Override // defpackage.ll4
    public final boolean b(tgj tgjVar) {
        return tgjVar.j.a == t1c.H;
    }

    @Override // defpackage.ud1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.ud1
    public final boolean d(Object obj) {
        q1c q1cVar = (q1c) obj;
        q1cVar.getClass();
        return (q1cVar.a && q1cVar.d && !q1cVar.e) ? false : true;
    }
}
