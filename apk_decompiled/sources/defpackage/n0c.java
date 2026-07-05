package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n0c extends ud1 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0c(s1c s1cVar, int i) {
        super(s1cVar);
        this.b = i;
        s1cVar.getClass();
        switch (i) {
            case 1:
                super(s1cVar);
                this.c = 7;
                break;
            default:
                this.c = 7;
                break;
        }
    }

    @Override // defpackage.ll4
    public final boolean b(tgj tgjVar) {
        switch (this.b) {
            case 0:
                if (tgjVar.j.a == t1c.F) {
                }
                break;
            default:
                if (tgjVar.j.a == t1c.G) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ud1
    public final int c() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.ud1
    public final boolean d(Object obj) {
        switch (this.b) {
            case 0:
                q1c q1cVar = (q1c) obj;
                q1cVar.getClass();
                if (!q1cVar.e && q1cVar.a && q1cVar.b) {
                    break;
                }
                break;
            default:
                q1c q1cVar2 = (q1c) obj;
                q1cVar2.getClass();
                if (q1cVar2.a && !q1cVar2.c && !q1cVar2.e) {
                    break;
                }
                break;
        }
        return false;
    }
}
