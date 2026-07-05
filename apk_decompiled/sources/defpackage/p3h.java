package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p3h implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ p3h(int i, int i2, qz7 qz7Var, iqb iqbVar, Object obj, Object obj2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = qz7Var;
        this.F = iqbVar;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s3h.a((cte) obj6, (iqb) obj3, (bz7) obj5, (bz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i5h.b((ta4) obj6, (zy7) obj5, (iqb) obj3, (ta4) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p5h.j((TaskResponse) obj6, (e8h) obj5, (pz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                huk.i((KnowledgeSource) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                nuk.f((ta4) obj6, (String) obj5, (iqb) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                jvk.e((yo6) obj6, (zy7) obj3, (zy7) obj5, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                wjk.g((ChatFeedbackType) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                xjk.g((s64) obj6, (zy7) obj3, (zy7) obj5, (mnc) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zjk.b((VoiceSessionSummary) obj6, (zy7) obj3, (zy7) obj5, (qi3) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                bij.b((rvh) obj6, (dc1) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ p3h(ta4 ta4Var, Object obj, iqb iqbVar, pz7 pz7Var, int i, int i2) {
        this.E = i2;
        this.H = ta4Var;
        this.I = obj;
        this.F = iqbVar;
        this.J = pz7Var;
        this.G = i;
    }

    public /* synthetic */ p3h(Object obj, Object obj2, qz7 qz7Var, Object obj3, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = obj2;
        this.I = qz7Var;
        this.J = obj3;
        this.G = i;
    }
}
