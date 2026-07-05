package defpackage;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    public /* synthetic */ i13(t53 t53Var, int i) {
        this.E = i;
        this.F = t53Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_ARTIFACT_VIEWER, str);
                break;
            case 1:
                ctc ctcVar = (ctc) obj;
                ctcVar.getClass();
                t53Var.n0.remove(ctcVar.getId());
                t53Var.b2.remove(ctcVar.getId());
                t53Var.p0.put(ctcVar.getId(), Long.valueOf(System.currentTimeMillis()));
                t53Var.t0(ctcVar);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                Context context = t53Var.c;
                String str3 = t53Var.L0;
                String strI = ij0.i("chat_", str3);
                Icon iconCreateWithResource = Icon.createWithResource(t53Var.c, R.drawable.claude_spark_icon);
                iconCreateWithResource.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("com.anthropic.claude.intent.extra.CHAT_ID", str3);
                mwa.J(context, strI, j5g.H, str2, iconCreateWithResource, bundle);
                break;
            case 3:
                ModelSelection modelSelection = (ModelSelection) obj;
                modelSelection.getClass();
                gb9.D(t53Var.a, null, null, new nn1(t53Var, modelSelection, (tp4) null, 23), 3);
                break;
            default:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                t53Var.F1(knowledgeSource, false);
                break;
        }
        return ieiVar;
    }
}
