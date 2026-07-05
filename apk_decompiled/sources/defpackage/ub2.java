package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseShown;
import com.anthropic.claude.analytics.events.SearchEvents$InlineSourcesSheetSeen;
import com.anthropic.claude.analytics.events.SearchEvents$SearchType;
import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.sessions.types.SessionFileAttachment;
import com.anthropic.claude.tool.ToolIdentifier;
import com.anthropic.claude.types.strings.ForkId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub2 extends m08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(int i, Object obj) {
        super(1, 0, t53.class, obj, "trackToolShown", "trackToolShown(Ljava/lang/String;)V");
        this.E = i;
        switch (i) {
            case 6:
                super(1, 0, t53.class, obj, "fetchMcpAppHtmlIfNeeded", "fetchMcpAppHtmlIfNeeded(Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpAppInvocation;)V");
                break;
            case 7:
                super(1, 0, t53.class, obj, "recordMcpAppSessionStart", "recordMcpAppSessionStart(Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpAppInvocation;)V");
                break;
            case 8:
                super(1, 0, t53.class, obj, "setVoiceAwaitingResponse", "setVoiceAwaitingResponse$chat(Z)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        fm3 fm3Var;
        Object value;
        b0 b0VarQ0;
        Object value2;
        Object value3;
        int i = this.E;
        int i2 = 0;
        int i3 = 1;
        int i4 = 3;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qb2 qb2Var = (qb2) this.receiver;
                if (zBooleanValue != ((Boolean) qb2Var.d.m.getValue()).booleanValue()) {
                    gb9.D(qb2Var.a, null, null, new ob2(qb2Var, zBooleanValue, objArr == true ? 1 : 0, 8), 3);
                }
                return ieiVar;
            case 1:
                hcb hcbVar = (hcb) obj;
                hcbVar.getClass();
                qb2 qb2Var2 = (qb2) this.receiver;
                qb2Var2.getClass();
                wbb wbbVar = qb2Var2.h;
                MemoryMode memoryMode = (MemoryMode) wbbVar.a.getValue();
                am4 am4Var = hcb.E;
                am4Var.getClass();
                if (hcbVar != am4.s(memoryMode) && !((Boolean) qb2Var2.v.getValue()).booleanValue()) {
                    MemoryMode memoryMode2 = (MemoryMode) wbbVar.a.getValue();
                    am4Var.getClass();
                    boolean z = am4.s(memoryMode2) == hcb.H;
                    qb2Var2.V(true);
                    gb9.D(qb2Var2.a, null, null, new ku(qb2Var2, hcbVar, z, (tp4) null, 4), 3);
                }
                return ieiVar;
            case 2:
                ToolSearchMode toolSearchMode = (ToolSearchMode) obj;
                String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                qb2 qb2Var3 = (qb2) this.receiver;
                gb9.D(qb2Var3.a, null, null, new nn1((Object) qb2Var3, (Object) strM1156unboximpl, (tp4) (objArr2 == true ? 1 : 0), 7), 3);
                return ieiVar;
            case 3:
                Project project = (Project) obj;
                project.getClass();
                ah2 ah2Var = (ah2) this.receiver;
                ah2Var.getClass();
                lsc lscVar = ah2Var.f;
                if (!((Boolean) lscVar.getValue()).booleanValue()) {
                    lscVar.setValue(Boolean.TRUE);
                    gb9.D(ah2Var.a, null, null, new pb2(ah2Var, project, objArr3 == true ? 1 : 0, i4), 3);
                }
                return ieiVar;
            case 4:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(((hw2) this.receiver).Q(str));
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                t53 t53Var = (t53) this.receiver;
                t53Var.getClass();
                t53Var.w.e(new MobileAppUseEvents$MobileAppUseShown(str2), MobileAppUseEvents$MobileAppUseShown.Companion.serializer());
                return ieiVar;
            case 6:
                ctc ctcVar = (ctc) obj;
                ctcVar.getClass();
                ((t53) this.receiver).t0(ctcVar);
                return ieiVar;
            case 7:
                ctc ctcVar2 = (ctc) obj;
                ctcVar2.getClass();
                t53 t53Var2 = (t53) this.receiver;
                t53Var2.getClass();
                fj0 fj0Var = t53Var2.s0;
                String str3 = ctcVar2.c;
                fj0Var.getClass();
                str3.getClass();
                vza vzaVar = (vza) ((LinkedHashMap) fj0Var.F).get(str3);
                if (vzaVar == null || !vzaVar.b()) {
                    t53Var2.p0.put(ctcVar2.a, Long.valueOf(System.currentTimeMillis()));
                }
                return ieiVar;
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                t53 t53Var3 = (t53) this.receiver;
                if (zBooleanValue2) {
                    t53Var3.getClass();
                    fm3Var = fm3.F;
                } else {
                    fm3Var = t53Var3.e1() ? fm3.H : fm3.E;
                }
                t53Var3.A0.setValue(fm3Var);
                return ieiVar;
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                t53 t53Var4 = (t53) this.receiver;
                gb9.D(t53Var4.a, null, null, new u43(t53Var4, zBooleanValue3, objArr4 == true ? 1 : 0, i2), 3);
                return ieiVar;
            case 10:
                ParsedContentBlockId parsedContentBlockId = (ParsedContentBlockId) obj;
                parsedContentBlockId.getClass();
                t53 t53Var5 = (t53) this.receiver;
                t53Var5.getClass();
                return (ParsedContentBlock$McpToolInvocation) ((LinkedHashMap) t53Var5.z0().d()).get(parsedContentBlockId);
            case 11:
                ParsedContentBlockId parsedContentBlockId2 = (ParsedContentBlockId) obj;
                parsedContentBlockId2.getClass();
                t53 t53Var6 = (t53) this.receiver;
                t53Var6.getClass();
                return (ParsedContentBlock$Thinking) t53Var6.z0().e.get(parsedContentBlockId2);
            case 12:
                int iIntValue = ((Number) obj).intValue();
                t53 t53Var7 = (t53) this.receiver;
                t53Var7.w.e(new SearchEvents$InlineSourcesSheetSeen(t53Var7.d.e, SearchEvents$SearchType.WEB, iIntValue), SearchEvents$InlineSourcesSheetSeen.Companion.serializer());
                return ieiVar;
            case 13:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                db3 db3Var = (db3) this.receiver;
                x3g x3gVar = (x3g) db3Var.n.getValue();
                db3Var.S(true);
                gb9.D(db3Var.a, null, null, new ku(zBooleanValue4, db3Var, x3gVar, (tp4) null, 7), 3);
                return ieiVar;
            case 14:
                return MessageId.m1051boximpl(((xc3) this.receiver).d(((Number) obj).intValue()));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                y5e y5eVar = (y5e) obj;
                y5eVar.getClass();
                ((j8i) this.receiver).h(y5eVar);
                return ieiVar;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                n9g n9gVar = (n9g) this.receiver;
                yih yihVar = n9gVar.a;
                b79 b79Var = (b79) n9gVar.d.getValue();
                if (b79Var != null) {
                    CharSequence charSequence = yihVar.d().G;
                    int i5 = b79Var.F + 1;
                    while (i5 < charSequence.length() && !gb9.B(charSequence.charAt(i5))) {
                        i5++;
                    }
                    while (i5 < charSequence.length() && gb9.B(charSequence.charAt(i5))) {
                        i5++;
                    }
                    dfh dfhVarG = yihVar.g();
                    try {
                        dfhVarG.c(b79Var.E, i5, "/" + str4 + " ");
                        yihVar.b(dfhVarG);
                        yihVar.c();
                        n9gVar.c.setValue(null);
                    } catch (Throwable th) {
                        yihVar.c();
                        throw th;
                    }
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                y5e y5eVar2 = (y5e) obj;
                y5eVar2.getClass();
                ((j8i) this.receiver).h(y5eVar2);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                SessionFileAttachment sessionFileAttachment = (SessionFileAttachment) obj;
                sessionFileAttachment.getClass();
                i iVar = (i) this.receiver;
                iVar.getClass();
                if (sessionFileAttachment.is_image()) {
                    return iVar.Z(sessionFileAttachment.getFile_uuid());
                }
                return null;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                SessionFileAttachment sessionFileAttachment2 = (SessionFileAttachment) obj;
                sessionFileAttachment2.getClass();
                i iVar2 = (i) this.receiver;
                iVar2.getClass();
                if (sessionFileAttachment2.is_image()) {
                    return iVar2.Z(sessionFileAttachment2.getFile_uuid());
                }
                return null;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                String str5 = (String) obj;
                str5.getClass();
                wg4 wg4Var = (wg4) this.receiver;
                wg4Var.getClass();
                dnh dnhVar = wg4Var.b;
                dnhVar.getClass();
                dyh dyhVar = dnhVar.e;
                String strM913constructorimpl = ToolIdentifier.m913constructorimpl(str5);
                strM913constructorimpl.getClass();
                String strConcat = "third_party__".concat(strM913constructorimpl);
                mdg mdgVar = dyhVar.b;
                Object obj3 = mdgVar.get(strConcat);
                if (obj3 == null) {
                    String string = dyhVar.a.getString(strConcat, "NEVER");
                    Iterator<E> it = eyh.I.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (x44.r(((eyh) next).name(), string)) {
                                obj2 = next;
                            }
                        }
                    }
                    eyh eyhVar = (eyh) obj2;
                    obj3 = eyhVar == null ? eyh.E : eyhVar;
                    mdgVar.put(strConcat, obj3);
                }
                return (eyh) obj3;
            case 21:
                DirectoryServer directoryServer = (DirectoryServer) obj;
                directoryServer.getClass();
                return ((uj4) this.receiver).O(directoryServer);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                f56 f56Var = (f56) obj;
                f56Var.getClass();
                uj4 uj4Var = (uj4) this.receiver;
                uj4Var.getClass();
                amg amgVar = uj4Var.h;
                do {
                    value = amgVar.getValue();
                } while (!amgVar.l(value, ((f56) value) == f56Var ? null : f56Var));
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                kk4 kk4Var = (kk4) this.receiver;
                gb9.D(kk4Var.a, null, null, new m61((Object) kk4Var, zBooleanValue5, (tp4) (objArr5 == true ? 1 : 0), 5), 3);
                return ieiVar;
            case 24:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                kk4 kk4Var2 = (kk4) this.receiver;
                kk4Var2.getClass();
                return Integer.valueOf(kk4Var2.b.E.f(null, mcpServer.m346getUuidowoRr7k()));
            case BuildConfig.VERSION_CODE /* 25 */:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                f03 f03Var = (f03) this.receiver;
                gb9.D(f03Var.a, null, null, new m61((Object) f03Var, zBooleanValue6, (tp4) (objArr6 == true ? 1 : 0), i3), 3);
                return ieiVar;
            case 26:
                String strM1028unboximpl = ((ForkId) obj).m1028unboximpl();
                strM1028unboximpl.getClass();
                f fVar = (f) this.receiver;
                fVar.getClass();
                if (!ForkId.m1026isMainimpl(strM1028unboximpl) && (b0VarQ0 = fVar.q0()) != null && fVar.O.add(ForkId.m1021boximpl(strM1028unboximpl))) {
                    if (ForkId.m1024equalsimpl0(strM1028unboximpl, ((dw4) fVar.I.getValue()).b)) {
                        ForkId.Companion.getClass();
                        fVar.J0(ForkId.MAIN, true);
                    }
                    gb9.D(fVar.a, null, null, new rx4(b0VarQ0, strM1028unboximpl, fVar, null, 0), 3);
                }
                return ieiVar;
            case 27:
                String str6 = (String) obj;
                str6.getClass();
                f fVar2 = (f) this.receiver;
                fVar2.getClass();
                amg amgVar2 = fVar2.P;
                do {
                    value2 = amgVar2.getValue();
                } while (!amgVar2.l(value2, bz4.a((bz4) value2, str6, null, false, null, 14)));
                fkg fkgVar = fVar2.T;
                tp4 tp4Var = null;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                if (bsg.I0(str6)) {
                    amgVar2.n(null, new bz4());
                } else {
                    b0 b0VarQ02 = fVar2.q0();
                    if (b0VarQ02 == null) {
                        do {
                            value3 = amgVar2.getValue();
                        } while (!amgVar2.l(value3, bz4.a((bz4) value3, null, lm6.E, false, fVar2.b.getString(R.string.conway_search_not_connected), 1)));
                    } else {
                        while (true) {
                            Object value4 = amgVar2.getValue();
                            if (amgVar2.l(value4, bz4.a((bz4) value4, null, null, true, null, 3))) {
                                f fVar3 = fVar2;
                                fVar3.T = gb9.D(fVar2.a, null, null, new rx4(b0VarQ02, str6, fVar3, tp4Var, 2), 3);
                            } else {
                                fVar2 = fVar2;
                            }
                        }
                    }
                }
                return ieiVar;
            case 28:
                List list = (List) obj;
                list.getClass();
                ((f) this.receiver).K0(list);
                return ieiVar;
            default:
                String str7 = (String) obj;
                str7.getClass();
                f fVar4 = (f) this.receiver;
                fVar4.getClass();
                lf9 lf9Var = (lf9) fVar4.p0.remove(str7);
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                amg amgVar3 = fVar4.n0;
                Iterable iterable = (Iterable) amgVar3.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (!((ckg) obj4).c.equals(str7)) {
                        arrayList.add(obj4);
                    }
                }
                amgVar3.n(null, arrayList);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(t53 t53Var, int i) {
        super(1, 0, t53.class, t53Var, "getMcpToolInvocation", "getMcpToolInvocation(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpToolInvocation;");
        this.E = i;
        switch (i) {
            case 11:
                super(1, 0, t53.class, t53Var, "getThinkingBlock", "getThinkingBlock(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)Lcom/anthropic/claude/chat/parse/ParsedContentBlock$Thinking;");
                break;
            case 12:
                super(1, 0, t53.class, t53Var, "trackSearchSourcesSheetSeen", "trackSearchSourcesSheetSeen(I)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(j8i j8iVar) {
        super(1, 0, j8i.class, j8iVar, "onReattestPromptResult", "onReattestPromptResult(Lcom/anthropic/claude/api/trusteddevice/ReattestPromptResult;)V");
        this.E = 17;
    }
}
