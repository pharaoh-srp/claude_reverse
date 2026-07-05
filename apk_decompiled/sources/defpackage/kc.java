package defpackage;

import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ProjectReference;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class kc implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ kc(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        boolean z = true;
        iei ieiVar = iei.a;
        int i2 = 0;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                Set set = (Set) obj;
                set.getClass();
                ua2 ua2Var = (ua2) obj4;
                Map map = (Map) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (Set) obj3) {
                    if (w44.G0(set, map.get((pl9) obj5))) {
                        arrayList.add(obj5);
                    }
                }
                ua2Var.resumeWith(new txc(w44.t1(arrayList), set.contains("android.permission.health.READ_HEALTH_DATA_HISTORY")));
                return ieiVar;
            case 1:
                KeyEvent keyEvent = ((so9) obj).a;
                nwb nwbVar = (nwb) obj3;
                l2i l2iVar = (l2i) obj4;
                if (!l2iVar.b()) {
                    nwbVar.setValue(Boolean.FALSE);
                } else if (ssj.j(keyEvent) == 2 && no9.a(zsj.b(keyEvent.getKeyCode()), no9.u)) {
                    ((nwb) obj2).setValue(Boolean.FALSE);
                    l2iVar.a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                ChatId chatId = (ChatId) obj;
                String strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                t53 t53Var = (t53) obj4;
                if (strM984unboximpl != null) {
                    gb9.D(t53Var.a, null, null, new h43(t53Var, objArr == true ? 1 : 0, 5), 3);
                    r93 r93Var = t53Var.g0;
                    uz7 uz7Var = (uz7) obj3;
                    ChatId chatIdM978boximpl = ChatId.m978boximpl(strM984unboximpl);
                    skd skdVarQ0 = t53Var.Q0();
                    String str = skdVarQ0 != null ? skdVarQ0.a : null;
                    ProjectId projectIdM1079boximpl = str != null ? ProjectId.m1079boximpl(str) : null;
                    String strE = r93Var.e();
                    ModelId modelIdM1058boximpl = strE != null ? ModelId.m1058boximpl(strE) : null;
                    String strG = r93Var.g();
                    ThinkingEffort thinkingEffortM1135boximpl = strG != null ? ThinkingEffort.m1135boximpl(strG) : null;
                    String strD = r93Var.d();
                    uz7Var.l(chatIdM978boximpl, projectIdM1079boximpl, modelIdM1058boximpl, thinkingEffortM1135boximpl, strD != null ? ThinkingMode.m1142boximpl(strD) : null, Boolean.valueOf(t53Var.a1()));
                } else {
                    ((zy7) ((nwb) obj2).getValue()).a();
                }
                return ieiVar;
            case 3:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference.getClass();
                ((dae) obj4).E = chatConversationWithProjectReference.m208getProject_uuidvfJkQ();
                return ChatConversationWithProjectReference.m200copyu2nbJzk$default(chatConversationWithProjectReference, null, null, null, null, null, null, null, false, (String) obj3, (ProjectReference) obj2, false, null, 3327, null);
            case 4:
                ChatConversationWithProjectReference chatConversationWithProjectReference2 = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference2.getClass();
                ((dae) obj4).E = chatConversationWithProjectReference2.m208getProject_uuidvfJkQ();
                return ChatConversationWithProjectReference.m200copyu2nbJzk$default(chatConversationWithProjectReference2, null, null, null, null, null, null, null, false, ((Project) obj3).m404getUuid5pmjbU(), (ProjectReference) obj2, false, null, 3327, null);
            case 5:
                l45 l45Var = (l45) obj2;
                ps7 ps7Var = (ps7) obj3;
                KeyEvent keyEvent2 = ((so9) obj).a;
                x0a x0aVar = (x0a) obj4;
                keyEvent2.getClass();
                if (ssj.j(keyEvent2) == 2 && no9.a(zsj.b(keyEvent2.getKeyCode()), no9.e)) {
                    if (x0aVar.d()) {
                        gb9.D(l45Var, null, null, new jf5(x0aVar, 200.0f, objArr3 == true ? 1 : 0, i2), 3);
                    } else {
                        ps7Var.a(1);
                    }
                } else if (ssj.j(keyEvent2) != 2 || !no9.a(zsj.b(keyEvent2.getKeyCode()), no9.d)) {
                    z = false;
                } else if (x0aVar.b()) {
                    gb9.D(l45Var, null, null, new jf5(x0aVar, -200.0f, objArr2 == true ? 1 : 0, i2), 3);
                } else {
                    ps7Var.a(2);
                }
                return Boolean.valueOf(z);
            case 6:
                x5a x5aVar = (x5a) obj;
                x5aVar.getClass();
                String str2 = x5aVar.a;
                kdg kdgVar = (kdg) ((ii7) obj4).h.get(Long.valueOf(((n36) obj3).a()));
                if (kdgVar != null) {
                    kdgVar.remove(x5aVar);
                }
                bz7 bz7Var = (bz7) obj2;
                if (bz7Var != null) {
                    bz7Var.invoke(str2);
                }
                return ieiVar;
            case 7:
                n0h n0hVar = (n0h) obj;
                n0hVar.getClass();
                int iOrdinal = n0hVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ((s2g) obj4).m.setValue((ChatSnapshotSummaryWithChatId) obj3);
                    ((nwb) obj2).setValue(n0hVar);
                }
                return Boolean.FALSE;
            default:
                if (((AtomicBoolean) obj4).compareAndSet(false, true)) {
                    ((Handler) obj3).post(new a8j((WebView) obj2, 0));
                }
                return ieiVar;
        }
    }
}
