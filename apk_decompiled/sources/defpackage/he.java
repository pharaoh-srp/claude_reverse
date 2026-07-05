package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionViewed;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionAction;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.sessions.types.GheSource;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class he implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ he(l45 l45Var, nwb nwbVar, String str, op3 op3Var) {
        this.E = 29;
        this.F = l45Var;
        this.I = nwbVar;
        this.G = str;
        this.H = op3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        rd4 rd4VarO;
        String str;
        GitHubRepo gitHubRepo;
        GheSource ghe;
        int i = this.E;
        int i2 = 2;
        char c = 1;
        char c2 = 1;
        int i3 = 0;
        Object obj = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i4 = 3;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.I;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                xpa xpaVar = (xpa) obj3;
                q2d q2dVar = (q2d) obj2;
                nwb nwbVar = (nwb) obj4;
                if (!((Boolean) ((hw2) obj5).k.g.getValue()).booleanValue() || ((Boolean) nwbVar.getValue()).booleanValue()) {
                    q2dVar.a();
                } else {
                    int i5 = Build.VERSION.SDK_INT;
                    xpaVar.t(i5 >= 34 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : i5 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
                }
                return ieiVar;
            case 1:
                gb9.D((l45) obj5, null, null, new o0((jw) obj3, (List) obj2, (ybg) obj4, null, 6), 3);
                return ieiVar;
            case 2:
                ((zy7) obj5).a();
                gb9.D((l45) obj3, null, null, new m0((op3) obj2, (tp0) obj4, objArr == true ? 1 : 0, 19), 3);
                return ieiVar;
            case 3:
                kdg kdgVar = (kdg) obj3;
                ((nwb) obj4).setValue(null);
                ((hsc) obj2).i(MTTypesetterKt.kLineSkipLimitMultiplier);
                kdgVar.getClass();
                ((bz7) obj5).invoke(oq5.C(kdgVar).c);
                return ieiVar;
            case 4:
                v4g v4gVar = (v4g) obj5;
                l45 l45Var = (l45) obj3;
                a80 a80Var = (a80) obj2;
                zy7 zy7Var = (zy7) obj4;
                if (v4gVar.c() == b5g.F && v4gVar.d()) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, objArr4 == true ? 1 : 0, i2), 3);
                    gb9.D(l45Var, null, null, new dv1(a80Var, objArr3 == true ? 1 : 0, i3), 3);
                } else {
                    gb9.D(l45Var, null, null, new my0(v4gVar, objArr2 == true ? 1 : 0, i4), 3).D0(new xu1(v4gVar, zy7Var, 0));
                }
                return ieiVar;
            case 5:
                gb9.D((l45) obj5, null, null, new pb2((ja8) obj3, (Context) obj2, (qi3) obj4, null, 6), 3);
                return ieiVar;
            case 6:
                gb9.D((l45) obj5, null, null, new jy2((vd3) obj3, (ChatConversationWithProjectReference) obj2, (zy7) obj4, null, 0), 3);
                return ieiVar;
            case 7:
                i iVar = (i) obj3;
                eli eliVar = (eli) obj2;
                t4g t4gVar = (t4g) obj4;
                jtf jtfVar = (jtf) w44.g1((List) obj5);
                if (jtfVar != null) {
                    iVar.B1(CodeEvents$PullRequestOpenEntryPoint.HEADER);
                    eliVar.a(jtfVar.e);
                } else {
                    t4gVar.d(CodeRemoteBottomSheetDestination.SessionPullRequests.a);
                }
                return ieiVar;
            case 8:
                i iVar2 = (i) obj5;
                kl1 kl1Var = new kl1(9, (zy7) obj3);
                b04 b04Var = new b04((l45) obj2, (ybg) obj4, c == true ? 1 : 0);
                String strE0 = iVar2.E0();
                if (strE0 == null) {
                    String string = iVar2.o.getString(R.string.ccr_error_unknown);
                    string.getClass();
                    b04Var.invoke(string);
                } else {
                    gb9.D(iVar2.a, null, null, new w14(iVar2, strE0, b04Var, kl1Var, null, 0), 3);
                }
                return ieiVar;
            case 9:
                gb9.D((l45) obj5, null, null, new pb2((i) obj3, (t4g) obj2, (Context) obj4, null, 27), 3);
                return ieiVar;
            case 10:
                ((uj4) obj5).P((DirectoryServer) obj3, (hi4) obj2, (Context) obj4);
                return ieiVar;
            case 11:
                fs4.b((l45) obj3, (nwb) obj4, (bz7) obj2, (bz7) obj5);
                return ieiVar;
            case 12:
                gb9.D((l45) obj5, null, null, new t74((p05) obj3, (ConwayExtensionMeta) obj2, (Context) obj4, null, 11), 3);
                return ieiVar;
            case 13:
                bz7 bz7Var = (bz7) obj3;
                gb9.D((l45) obj5, null, null, new ja7((ha7) obj2, objArr5 == true ? 1 : 0, c2 == true ? 1 : 0), 3);
                Object obj6 = (oa7) ((nwb) obj4).getValue();
                if (obj6 == null) {
                    obj6 = la7.a;
                }
                bz7Var.invoke(obj6);
                return ieiVar;
            case 14:
                gw8 gw8Var = (gw8) obj5;
                l45 l45Var2 = (l45) obj3;
                nwb nwbVar2 = (nwb) obj4;
                zy7 zy7Var2 = (zy7) obj2;
                if (!((Boolean) nwbVar2.getValue()).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    nwbVar2.setValue(bool);
                    gw8Var.d.setValue(bool);
                    gb9.D(l45Var2, null, null, new rd2(zy7Var2, objArr6 == true ? 1 : 0, i2), 3);
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ca9 ca9Var = (ca9) obj5;
                fe feVar = new fe(obj3, obj2, obj4, (Object) ca9Var, 23, false);
                j8i j8iVar = ca9Var.d;
                j8iVar.c.a();
                j8iVar.d.a();
                j8iVar.f.e();
                j8iVar.l();
                gb9.D(ca9Var.a, null, null, new t74((Object) feVar, (Object) ca9Var, (tp4) (objArr7 == true ? 1 : 0), 29), 3);
                return ieiVar;
            case 16:
                zy7 zy7Var3 = (zy7) obj5;
                zy7 zy7Var4 = (zy7) obj3;
                r4g r4gVar = (r4g) obj2;
                String str2 = (String) ((nwb) obj4).getValue();
                if (x44.r(str2, "pause")) {
                    zy7Var3.a();
                } else if (x44.r(str2, "reset")) {
                    zy7Var4.a();
                }
                r4gVar.a();
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                seb sebVar = (seb) obj5;
                String str3 = (String) obj3;
                lvh lvhVar = (lvh) obj2;
                String str4 = (String) obj4;
                if (sebVar == null || (rd4VarO = sebVar.O()) == null || (str = (String) rd4VarO.b.getValue()) == null) {
                    SilentException.a(new SilentException(ij0.i("Attempted to copy message body but it was null for tool use: ", ToolUseId.m1162toStringimpl(str3))), null, false, 3);
                } else {
                    lvhVar.c.invoke(str, MessageId.m1051boximpl(str4));
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                c cVar = (c) obj3;
                u3c u3cVar = (u3c) obj2;
                nwb nwbVar3 = (nwb) obj4;
                lhf lhfVar = (lhf) w44.N0((List) obj5);
                if (lhfVar != null && (gitHubRepo = lhfVar.a) != null) {
                    Iterator it = cVar.g.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (x44.r(((RepoWithStatus) next).getRepo().getId(), gitHubRepo.getId())) {
                                obj = next;
                            }
                        }
                    }
                    RepoWithStatus repoWithStatus = (RepoWithStatus) obj;
                    u3cVar.f.h(new xw1(gitHubRepo.getOwner().getLogin(), gitHubRepo.getName(), (repoWithStatus == null || (ghe = repoWithStatus.getGhe()) == null) ? gitHubRepo.getGheConfigurationId() : Integer.valueOf(ghe.getConfiguration_id())));
                }
                nwbVar3.setValue(Boolean.TRUE);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                u3c u3cVar2 = (u3c) obj2;
                return Boolean.valueOf(((Boolean) ((wlg) obj5).getValue()).booleanValue() && ((Boolean) ((b1i) obj3).v.getValue()).booleanValue() && !((Boolean) u3cVar2.i.getValue()).booleanValue() && u3cVar2.c() == PermissionMode.Default && x44.r((s71) ((wlg) obj4).getValue(), n71.b));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                jkc jkcVar = (jkc) obj3;
                String str5 = (String) obj2;
                Context context = (Context) obj4;
                ((zy7) obj5).a();
                jkcVar.e.b(str5);
                Toast.makeText(context, context.getString(R.string.identity_switching_account_toast, jkcVar.O(str5)), 0).show();
                return ieiVar;
            case 21:
                ((qi3) obj5).e(new ChatEvents$NewChatButtonPressed(((ild) obj3).c.e, ChatEvents$NewChatButtonPressedSource.PROJECT, ((ProjectDetailsScreenParams) obj2).m789getProjectId5pmjbU()), ChatEvents$NewChatButtonPressed.Companion.serializer());
                ((zy7) obj4).a();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                isc iscVar = (isc) obj4;
                ((bz7) obj5).invoke((String) obj3);
                iscVar.i(Math.min(((List) obj2).size() - 1, iscVar.h() + 1));
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                f03 f03Var = (f03) obj5;
                gb9.D(f03Var.a, null, null, new e03((String) obj3, f03Var, ((ToolSearchModeConfig) obj2).m732getValueOP4DWQA(), (tp4) null), 3);
                ((t4g) obj4).c();
                return ieiVar;
            case 24:
                ((cji) obj5).Q((Context) obj3, (gwg) obj2, (zy7) obj4);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((cji) obj5).Q((Context) obj3, (dwg) obj2, (zy7) obj4);
                return ieiVar;
            case 26:
                ((ief) obj5).g.e(new McpEvents$McpSuggestionViewed((String) obj3, (String) obj2, ((List) obj4).size()), McpEvents$McpSuggestionViewed.Companion.serializer());
                return ieiVar;
            case 27:
                ief.x((ief) obj3, (String) obj2, (String) obj4, McpEvents$SuggestionAction.DECLINE, null);
                ((lvh) obj5).h.invoke("Don't use a connector");
                return ieiVar;
            case 28:
                return new m0h((n0h) obj5, (cz5) obj3, (bz7) obj2, (bz7) obj4);
            default:
                nwb nwbVar4 = (nwb) obj4;
                nwbVar4.setValue(Boolean.TRUE);
                gb9.D((l45) obj5, null, null, new ba9((String) obj3, (op3) obj2, nwbVar4, null, 29), 3);
                return ieiVar;
        }
    }

    public /* synthetic */ he(int i, nwb nwbVar, Object obj, Object obj2, Object obj3) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.I = nwbVar;
        this.H = obj3;
    }

    public /* synthetic */ he(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }
}
