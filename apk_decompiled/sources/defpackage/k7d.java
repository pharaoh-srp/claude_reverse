package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k7d extends vw7 {
    public final kqh c;

    public k7d(mqh mqhVar) {
        super(mqhVar);
        this.c = new kqh();
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        mqh mqhVar = this.b;
        jqh jqhVarF = mqhVar.f(i, jqhVar, z);
        if (mqhVar.m(jqhVarF.c, this.c, 0L).a()) {
            jqhVarF.h(jqhVar.a, jqhVar.b, jqhVar.c, jqhVar.d, jqhVar.e, nd.c, true);
            return jqhVarF;
        }
        jqhVarF.f = true;
        return jqhVarF;
    }
}
