package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cei extends xzg implements sz7 {
    public int E;
    public /* synthetic */ Throwable F;
    public /* synthetic */ long G;

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        cei ceiVar = new cei(4, (tp4) obj4);
        ceiVar.F = (Throwable) obj2;
        ceiVar.G = jLongValue;
        return ceiVar.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            Throwable th = this.F;
            long j = this.G;
            nga.c().b(dei.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, dei.b);
            this.E = 1;
            Object objK = d4c.K(jMin, this);
            m45 m45Var = m45.E;
            if (objK == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return Boolean.TRUE;
    }
}
