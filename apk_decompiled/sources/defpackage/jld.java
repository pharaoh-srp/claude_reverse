package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.ui.components.error.a;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jld implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ild F;

    public /* synthetic */ jld(ild ildVar, int i) {
        this.E = i;
        this.F = ildVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ild ildVar = this.F;
        switch (i) {
            case 0:
                ((r4a) obj).getClass();
                ildVar.getClass();
                ildVar.x.setValue(new Date());
                vn5 vn5Var = ildVar.i;
                long j = ild.z;
                vn5Var.getClass();
                if (vn5Var.a.a() - vn5Var.b > j) {
                    ildVar.o();
                }
                break;
            case 1:
                ChatConversation chatConversation = (ChatConversation) obj;
                chatConversation.getClass();
                String strM176getUuidRjYBDck = chatConversation.m176getUuidRjYBDck();
                boolean z = !chatConversation.is_starred();
                strM176getUuidRjYBDck.getClass();
                ild ildVar2 = this.F;
                gb9.D(ildVar2.a, null, null, new ku(ildVar2, strM176getUuidRjYBDck, z, (tp4) null, 16), 3);
                break;
            default:
                vt6 vt6Var = (vt6) obj;
                vt6Var.getClass();
                a.a(vt6Var, ildVar.m);
                break;
        }
        return ieiVar;
    }
}
