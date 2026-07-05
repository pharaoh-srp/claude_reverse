package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gu implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lu F;

    public /* synthetic */ gu(lu luVar, int i) {
        this.E = i;
        this.F = luVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        List list;
        qdf qdfVar;
        int i = this.E;
        boolean z = false;
        um6 um6Var = um6.E;
        Object[] objArr = 0;
        iei ieiVar = iei.a;
        lu luVar = this.F;
        switch (i) {
            case 0:
                if (((Boolean) luVar.b.y.getValue()).booleanValue() && ((List) luVar.A.getValue()).isEmpty() && luVar.w.d().G.length() == 0) {
                    z = true;
                }
                break;
            case 1:
                break;
            case 2:
                pa3 pa3Var = (pa3) luVar.l.getValue();
                break;
            case 3:
                CharSequence charSequence = luVar.w.d().G;
                vd3 vd3Var = luVar.d;
                Map map = (Map) vd3Var.o.getValue();
                if (charSequence.length() == 0) {
                    int iOrdinal = ((by2) luVar.n.getValue()).ordinal();
                    if (iOrdinal == 0) {
                        list = (List) vd3Var.l.getValue();
                    } else if (iOrdinal != 1) {
                        wg6.i();
                    } else {
                        list = (List) vd3Var.m.getValue();
                    }
                } else {
                    list = (List) vd3Var.n.getValue();
                }
                List<ChatConversationWithProjectReference> list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                for (ChatConversationWithProjectReference chatConversationWithProjectReference : list2) {
                    ChatConversation chatConversationK = nkk.k(chatConversationWithProjectReference);
                    ProjectReference project = chatConversationWithProjectReference.getProject();
                    if (charSequence.length() == 0) {
                        qdfVar = null;
                    } else {
                        qdfVar = (qdf) map.get(ChatId.m978boximpl(chatConversationWithProjectReference.m209getUuidRjYBDck()));
                        if (qdfVar == null) {
                            qdfVar = qdf.d;
                        }
                    }
                    arrayList.add(new sx2(chatConversationK, project, qdfVar));
                }
                break;
            case 4:
                luVar.f.a();
                if (!luVar.b.K() && okc.a(luVar.c)) {
                    z = true;
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                luVar.o();
                break;
            case 8:
                luVar.o.setValue(Boolean.TRUE);
                luVar.p.setValue(um6Var);
                break;
            case 9:
                luVar.o.setValue(Boolean.FALSE);
                luVar.p.setValue(um6Var);
                break;
            case 10:
                luVar.o();
                break;
            case 11:
                gb9.D(luVar.a, null, null, new hu(luVar, objArr == true ? 1 : 0, 3), 3);
                break;
            default:
                luVar.o.setValue(Boolean.FALSE);
                luVar.p.setValue(um6Var);
                break;
        }
        return ieiVar;
    }
}
