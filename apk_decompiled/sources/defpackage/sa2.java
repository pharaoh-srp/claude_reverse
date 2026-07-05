package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa2 implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ bgj F;
    public final /* synthetic */ String G;

    public /* synthetic */ sa2(bgj bgjVar, String str) {
        this.F = bgjVar;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 28;
        String str = this.G;
        bgj bgjVar = this.F;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = bgjVar.c;
                workDatabase.getClass();
                workDatabase.o(new dg8(i2, new ra2(workDatabase, str, bgjVar, 0)));
                b7f.b(bgjVar.b, workDatabase, bgjVar.e);
                break;
            default:
                WorkDatabase workDatabase2 = bgjVar.c;
                workDatabase2.getClass();
                workDatabase2.o(new dg8(i2, new ra2(workDatabase2, str, bgjVar, 1)));
                b7f.b(bgjVar.b, workDatabase2, bgjVar.e);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sa2(String str, bgj bgjVar) {
        this.G = str;
        this.F = bgjVar;
    }
}
