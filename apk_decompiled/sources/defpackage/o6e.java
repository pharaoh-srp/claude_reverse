package defpackage;

import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.g;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.tts.d;
import com.anthropic.claude.sessions.types.GitHubRepo;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o6e extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6e(phg phgVar, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 23;
        this.H = phgVar;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                o6e o6eVar = new o6e((p6e) obj2, tp4Var, 0);
                o6eVar.G = obj;
                return o6eVar;
            case 1:
                return new o6e((nfe) this.G, (String) obj2, tp4Var, 1);
            case 2:
                return new o6e((String) this.G, (qfe) obj2, tp4Var, 2);
            case 3:
                return new o6e((GitHubRepo) this.G, (xhe) obj2, tp4Var, 3);
            case 4:
                return new o6e((uje) this.G, (pz7) obj2, tp4Var, 4);
            case 5:
                return new o6e((RippleNode) this.G, (mb0) obj2, tp4Var, 5);
            case 6:
                o6e o6eVar2 = new o6e((a80) obj2, tp4Var, 6);
                o6eVar2.G = obj;
                return o6eVar2;
            case 7:
                o6e o6eVar3 = new o6e((a0f) obj2, tp4Var, 7);
                o6eVar3.G = obj;
                return o6eVar3;
            case 8:
                return new o6e((t4f) this.G, (Response) obj2, tp4Var, 8);
            case 9:
                return new o6e((cc6) this.G, (z9f) obj2, tp4Var, 9);
            case 10:
                return new o6e((j9f) this.G, (a80) obj2, tp4Var, 10);
            case 11:
                return new o6e((op3) this.G, (zb0) obj2, tp4Var, 11);
            case 12:
                o6e o6eVar4 = new o6e((jud) obj2, tp4Var, 12);
                o6eVar4.G = obj;
                return o6eVar4;
            case 13:
                return new o6e((g81) this.G, (String) obj2, tp4Var, 13);
            case 14:
                o6e o6eVar5 = new o6e((g81) obj2, tp4Var, 14);
                o6eVar5.G = obj;
                return o6eVar5;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                o6e o6eVar6 = new o6e((wm0) obj2, tp4Var, 15);
                o6eVar6.G = obj;
                return o6eVar6;
            case 16:
                return new o6e((SessionWorker) this.G, (wm0) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                o6e o6eVar7 = new o6e((SessionWorker) obj2, tp4Var, 17);
                o6eVar7.G = obj;
                return o6eVar7;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new o6e((w1g) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new o6e((g2g) this.G, (yig) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new o6e((zub) this.G, (kdg) obj2, tp4Var, 20);
            case 21:
                return new o6e((mag) this.G, (t74) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new o6e((phg) this.G, (Long) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new o6e((phg) obj2, this.G, tp4Var);
            case 24:
                return new o6e((a80) this.G, (nqg) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new o6e((xs5) this.G, (i4d) obj2, tp4Var, 25);
            case 26:
                return new o6e((o0h) this.G, (gf8) obj2, tp4Var, 26);
            case 27:
                o6e o6eVar8 = new o6e((d) obj2, tp4Var, 27);
                o6eVar8.G = obj;
                return o6eVar8;
            case 28:
                return new o6e((lf9) this.G, (mdd) obj2, tp4Var, 28);
            default:
                return new o6e((e8h) this.G, (TaskResponse) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((o6e) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:436:0x087b, code lost:
    
        if (r1.b(r24, r2) == r14) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x089e, code lost:
    
        if (r1.b(r24, r2) == r14) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x08f9, code lost:
    
        if (r1.b(r24, r2) == r14) goto L466;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01d1 -> B:100:0x01d5). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6e(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6e(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }
}
