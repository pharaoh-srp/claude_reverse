package defpackage;

import androidx.work.impl.WorkDatabase;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fui implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ fui(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                zjj zjjVar = (zjj) obj3;
                zjj zjjVar2 = (zjj) obj2;
                zjj zjjVar3 = (zjj) obj;
                zjjVar.getClass();
                zjjVar2.getClass();
                zjjVar3.getClass();
                return new eui(zjjVar, zjjVar2, zjjVar3, MTTypesetterKt.kLineSkipLimitMultiplier, false);
            case 1:
                ((bz7) obj3).invoke((g4j) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 2:
                ((pz7) obj3).invoke((g4j) ((nwb) obj2).getValue(), ((cjh) ((nwb) obj).getValue()).a.F);
                return ieiVar;
            default:
                mgj mgjVar = (mgj) obj3;
                UUID uuid = (UUID) obj2;
                pf5 pf5Var = (pf5) obj;
                mgjVar.getClass();
                String str = mgj.c;
                String string = uuid.toString();
                nga ngaVarC = nga.c();
                uuid.toString();
                Objects.toString(pf5Var);
                ngaVarC.getClass();
                WorkDatabase workDatabase = mgjVar.a;
                workDatabase.b();
                try {
                    tgj tgjVarD = workDatabase.w().d(string);
                    if (tgjVarD == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (tgjVarD.b == zfj.F) {
                        kgj kgjVar = new kgj(string, pf5Var);
                        lgj lgjVarV = workDatabase.v();
                        lgjVarV.getClass();
                        u00.E(lgjVarV.a, false, true, new nif(lgjVarV, 20, kgjVar));
                    } else {
                        nga.c().f(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    workDatabase.f();
                    return null;
                } finally {
                }
        }
    }
}
