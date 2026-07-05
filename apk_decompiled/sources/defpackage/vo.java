package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class vo extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(zy7 zy7Var, to toVar, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.H = zy7Var;
        this.I = toVar;
        this.J = nwbVar;
        this.K = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                return new vo((zy7) this.H, (to) this.I, (nwb) this.J, (nwb) obj2, tp4Var);
            case 1:
                return new vo((t53) obj2, tp4Var);
            case 2:
                vo voVar = new vo((f) this.J, this.G, (b0) obj2, tp4Var);
                voVar.I = obj;
                return voVar;
            case 3:
                vo voVar2 = new vo((ClaudeAppWidgetReceiver) this.I, (Context) this.J, this.G, (Bundle) obj2, tp4Var, 3);
                voVar2.H = obj;
                return voVar2;
            case 4:
                vo voVar3 = new vo((ClaudeAppWidgetReceiver) this.I, (Context) this.J, this.G, (String) obj2, tp4Var, 4);
                voVar3.H = obj;
                return voVar3;
            default:
                vo voVar4 = new vo((wqd) this.J, (String) obj2, tp4Var);
                voVar4.I = obj;
                return voVar4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((vo) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0232, code lost:
    
        if (r1 == r7) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0592 -> B:228:0x0596). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(t53 t53Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.K = t53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(wqd wqdVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 5;
        this.J = wqdVar;
        this.K = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(f fVar, int i, b0 b0Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.J = fVar;
        this.G = i;
        this.K = b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo(ClaudeAppWidgetReceiver claudeAppWidgetReceiver, Context context, int i, Object obj, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.I = claudeAppWidgetReceiver;
        this.J = context;
        this.G = i;
        this.K = obj;
    }
}
