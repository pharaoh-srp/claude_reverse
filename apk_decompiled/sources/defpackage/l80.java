package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressedSource;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import com.anthropic.claude.analytics.events.ProUpsellEvents$UpsellButtonTapped;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import com.anthropic.claude.chat.menu.b;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.ProjectId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l80 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ l80(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.E;
        int i2 = 12;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ((gh2) obj2).r(obj);
                return ieiVar;
            case 1:
                m9j m9jVar = (m9j) obj2;
                m9jVar.v.setValue(null);
                String str = ((q9j) obj).a;
                str.getClass();
                gb9.D(m9jVar.a, null, null, new k9j(m9jVar, str, null), 3);
                return ieiVar;
            case 2:
                m9j m9jVar2 = (m9j) obj2;
                Context context = (Context) obj;
                context.getClass();
                m9jVar2.q.setValue(Boolean.TRUE);
                gb9.D(m9jVar2.a, null, null, new v2h(m9jVar2, context, z ? 1 : 0, i2), 3);
                return ieiVar;
            case 3:
                ((nc4) obj2).c = (zy7) obj;
                return ieiVar;
            case 4:
                cc1 cc1Var = (cc1) obj2;
                cv9 cv9Var = (cv9) obj;
                cc1Var.a0 = cc1Var.V.a(cv9Var.E.g(), cv9Var.getLayoutDirection(), cv9Var);
                return ieiVar;
            case 5:
                cjh cjhVar = (cjh) obj2;
                nwb nwbVar = (nwb) obj;
                if (!kkh.c(cjhVar.b, ((cjh) nwbVar.getValue()).b) || !x44.r(cjhVar.c, ((cjh) nwbVar.getValue()).c)) {
                    nwbVar.setValue(cjhVar);
                }
                return ieiVar;
            case 6:
                dkh dkhVar = (dkh) obj2;
                zb0 zb0Var = (zb0) obj;
                if (dkhVar == null) {
                    return zb0Var;
                }
                kdg kdgVar = dkhVar.c;
                boolean zIsEmpty = kdgVar.isEmpty();
                zb0 zb0Var2 = dkhVar.b;
                if (!zIsEmpty) {
                    ldh ldhVar = new ldh(zb0Var2);
                    int size = kdgVar.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((bz7) kdgVar.get(i3)).invoke(ldhVar);
                    }
                    zb0Var2 = ldhVar.b;
                }
                dkhVar.b = zb0Var2;
                return zb0Var2 == null ? zb0Var : zb0Var2;
            case 7:
                eu1 eu1Var = (eu1) obj2;
                return Boolean.valueOf(eu1Var.a.b() && eu1Var.b.containsKey(OrganizationId.m1065boximpl((String) obj)));
            case 8:
                ((b) obj2).a.E.m(new fv(10, new ChatItemMenuDialogDestination[]{ChatItemMenuDialogDestination.Dismissed.INSTANCE}), new a2g(21));
                ((zy7) obj).a();
                return ieiVar;
            case 9:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                ArrayList arrayList = new ArrayList();
                kdg kdgVar2 = ((t53) obj2).X0;
                ListIterator listIterator = kdgVar2.listIterator();
                int i4 = 0;
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        return arrayList;
                    }
                    Object next = c8aVar.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        x44.n0();
                        throw null;
                    }
                    whd whdVar = (whd) next;
                    if (whdVar instanceof uhd) {
                        uhd uhdVar = (uhd) whdVar;
                        if (linkedHashSet.contains(MessageId.m1051boximpl(uhdVar.c()))) {
                            continue;
                        } else {
                            boolean z4 = false;
                            int i6 = 0;
                            for (Object obj3 : uhdVar.i()) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    x44.n0();
                                    throw null;
                                }
                                mtc mtcVar = (mtc) obj3;
                                if (mtcVar instanceof gtc) {
                                    if (((gtc) mtcVar).b() != null) {
                                        arrayList.add(new gme(i4, i6));
                                    }
                                    z4 = true;
                                }
                                i6 = i7;
                                z4 = z4;
                            }
                            if (!z4 && i4 != x44.M(kdgVar2)) {
                                linkedHashSet.add(MessageId.m1051boximpl(uhdVar.c()));
                            }
                        }
                    }
                    i4 = i5;
                }
                break;
            case 10:
                l4h l4hVar = (l4h) obj;
                ((t4g) obj2).a();
                if (l4hVar != null) {
                    l4hVar.a();
                }
                return ieiVar;
            case 11:
                ((nwb) obj2).setValue(Boolean.FALSE);
                ((ps7) obj).b(false);
                return ieiVar;
            case 12:
                ((nwb) obj2).setValue(u4g.F);
                ((t4g) obj).d(ChatOptionsBottomSheetDestination.SelectProject.INSTANCE);
                return ieiVar;
            case 13:
                t53 t53Var = (t53) obj2;
                zy7 zy7Var = (zy7) obj;
                qi3 qi3Var = t53Var.w;
                String str2 = t53Var.d.e;
                ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource = ChatEvents$NewChatButtonPressedSource.CHAT;
                skd skdVarQ0 = t53Var.Q0();
                qi3Var.e(new ChatEvents$NewChatButtonPressed(str2, chatEvents$NewChatButtonPressedSource, skdVarQ0 != null ? skdVarQ0.a : null), ChatEvents$NewChatButtonPressed.Companion.serializer());
                zy7Var.a();
                return ieiVar;
            case 14:
                t53 t53Var2 = (t53) obj2;
                String str3 = (String) obj;
                ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource = ChatEvents$ContinueChatButtonPressedSource.DISCLAIMER;
                str3.getClass();
                chatEvents$ContinueChatButtonPressedSource.getClass();
                t53Var2.w.e(new ChatEvents$ContinueChatButtonPressed(t53Var2.d.e, t53Var2.L0, chatEvents$ContinueChatButtonPressedSource, Boolean.valueOf(t53Var2.a1())), ChatEvents$ContinueChatButtonPressed.Companion.serializer());
                dlf dlfVar = new dlf(InputMode.TEXT);
                lm6 lm6Var = lm6.E;
                t53Var2.r1(str3, lm6Var, lm6Var, dlfVar, false);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((nwb) obj2).setValue(Boolean.TRUE);
                bt7.a((bt7) obj);
                return ieiVar;
            case 16:
                ((bz7) obj2).invoke(ProjectId.m1079boximpl(((skd) obj).a));
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((bz7) obj2).invoke((String) obj);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(((vd3) obj2).e.t((String) obj) != null);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                iv1.F((zqc) obj2, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) obj, 14, (mq5) null)));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                iv1.F((zqc) obj2, new ClaudeAppDestination.Detail.ProjectKnowledge(new ProjectKnowledgeScreenParams(((ProjectDetailsScreenParams) obj).m789getProjectId5pmjbU(), z2 ? 1 : 0)));
                return ieiVar;
            case 21:
                ((nwb) obj2).setValue(Boolean.FALSE);
                ((zy7) ((nwb) obj).getValue()).a();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Toast.makeText((Context) obj2, (String) obj, 0).show();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ml3 ml3Var = (ml3) obj2;
                ml3Var.d.a();
                gb9.D((l45) obj, null, null, new cj(ml3Var, z3 ? 1 : 0, i2), 3);
                return ieiVar;
            case 24:
                return x44.W(new cpc((fh7) obj2, (pl9) obj));
            case BuildConfig.VERSION_CODE /* 25 */:
                ((qi3) obj2).e(new ProUpsellEvents$UpsellButtonTapped("new_chat"), ProUpsellEvents$UpsellButtonTapped.Companion.serializer());
                ((zy7) obj).a();
                return ieiVar;
            case 26:
                lq6 lq6Var = (lq6) obj2;
                String str4 = (String) obj;
                eq6 eq6Var = (eq6) lq6Var.c;
                if (eq6Var == null) {
                    Enum[] enumArr = (Enum[]) lq6Var.b;
                    eq6Var = new eq6(str4, enumArr.length);
                    for (Enum r0 : enumArr) {
                        eq6Var.j(r0.name(), false);
                    }
                }
                return eq6Var;
            case 27:
                ((HashMap) ((nyj) obj2).G).remove((v3a) obj);
                return ieiVar;
            case 28:
                return Boolean.valueOf(((qf7) obj2).b((Feature) obj));
            default:
                ((dae) obj2).E = yb5.o((pt7) obj, y2d.a);
                return ieiVar;
        }
    }
}
