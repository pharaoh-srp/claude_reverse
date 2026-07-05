package defpackage;

import android.content.ContentResolver;
import androidx.glance.session.SessionWorker;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class py extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.I;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new py((ry) obj2, this.H, (sz7) obj, tp4Var, 0);
            case 1:
                return new py((t4g) obj2, (t4g) this.H, (bt7) obj, tp4Var, 1);
            case 2:
                return new py((c) obj2, (SessionResource) this.H, (RequiresActionDetails) obj, tp4Var, 2);
            case 3:
                return new py((kwc) obj2, (q2d) this.H, (ContentResolver) obj, tp4Var, 3);
            case 4:
                return new py((kwc) obj2, (ti7) this.H, (ContentResolver) obj, tp4Var, 4);
            case 5:
                return new py((b) obj2, (String) this.H, (String) obj, tp4Var, 5);
            case 6:
                return new py((gff) obj2, (zo6) this.H, (a6i) obj, tp4Var, 6);
            case 7:
                return new py((SessionWorker) obj2, (drh) obj, tp4Var);
            default:
                return new py((l2i) obj2, (zwb) this.H, (hm) obj, tp4Var, 8);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((py) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (defpackage.iuj.P(1500, r0, r15) == r7) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(SessionWorker sessionWorker, drh drhVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = 7;
        this.G = sessionWorker;
        this.I = drhVar;
    }
}
