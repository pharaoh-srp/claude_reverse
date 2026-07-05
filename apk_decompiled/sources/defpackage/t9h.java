package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.tasks.ui.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t9h implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ t9h(String str, Tool.CustomTool customTool, zy7 zy7Var, iqb iqbVar, String str2, int i, int i2) {
        this.E = 2;
        this.G = str;
        this.H = customTool;
        this.I = zy7Var;
        this.K = iqbVar;
        this.J = str2;
        this.F = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q.e((TaskResponse) obj7, (bz7) obj6, (bz7) obj5, (e5h) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ltk.i((String) obj7, (String) obj6, (String) obj5, (String) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pwh.d((String) obj7, (Tool.CustomTool) obj6, (zy7) obj5, (iqb) obj3, (String) obj4, (ld4) obj, x44.p0(385), this.F);
                break;
            case 3:
                ((Integer) obj2).getClass();
                yjk.i((String) obj7, (String) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                i4j.b((VoiceSessionSummary) obj7, (zy7) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ t9h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.F = i;
    }
}
