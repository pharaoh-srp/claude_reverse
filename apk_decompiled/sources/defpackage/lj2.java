package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$MarkdownNodeKind;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.CodeEvents$RadioClosed;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItemPointsItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonPrimitive;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lj2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ lj2(List list, nwb nwbVar) {
        this.E = 22;
        this.G = list;
        this.F = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Double dValueOf;
        Double dValueOf2;
        int i = this.E;
        int i2 = 3;
        int i3 = 2;
        ChatEvents$MarkdownNodeKind chatEvents$MarkdownNodeKind = null;
        int i4 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                ChartDisplayV0InputStyle chartDisplayV0InputStyle = (ChartDisplayV0InputStyle) obj3;
                final List list = (List) obj2;
                fd2 fd2Var = (fd2) obj;
                yl4 yl4Var = pj2.a;
                fd2Var.getClass();
                ArrayList arrayList2 = fd2Var.a;
                chartDisplayV0InputStyle.getClass();
                list.getClass();
                int i5 = oj2.a[chartDisplayV0InputStyle.ordinal()];
                lm6 lm6Var = lm6.E;
                if (i5 == 1 || i5 == 2) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List<Double> values = ((ChartDisplayV0InputSeriesItem) it.next()).getValues();
                        if (values == null) {
                            values = lm6Var;
                        }
                        b54.t0(arrayList, values);
                    }
                } else {
                    if (i5 != 3) {
                        wg6.i();
                        return null;
                    }
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        List<ChartDisplayV0InputSeriesItemPointsItem> points = ((ChartDisplayV0InputSeriesItem) it2.next()).getPoints();
                        if (points == null) {
                            points = lm6Var;
                        }
                        List<ChartDisplayV0InputSeriesItemPointsItem> list2 = points;
                        ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Double.valueOf(((ChartDisplayV0InputSeriesItemPointsItem) it3.next()).getY()));
                        }
                        b54.t0(arrayList, arrayList3);
                    }
                }
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    double dDoubleValue = ((Number) it4.next()).doubleValue();
                    while (it4.hasNext()) {
                        dDoubleValue = Math.min(dDoubleValue, ((Number) it4.next()).doubleValue());
                    }
                    dValueOf = Double.valueOf(dDoubleValue);
                } else {
                    dValueOf = null;
                }
                double dDoubleValue2 = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                Iterator it5 = arrayList.iterator();
                if (it5.hasNext()) {
                    double dDoubleValue3 = ((Number) it5.next()).doubleValue();
                    while (it5.hasNext()) {
                        dDoubleValue3 = Math.max(dDoubleValue3, ((Number) it5.next()).doubleValue());
                    }
                    dValueOf2 = Double.valueOf(dDoubleValue3);
                } else {
                    dValueOf2 = null;
                }
                double dDoubleValue4 = dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d;
                if (!list.isEmpty()) {
                    int i6 = oj2.a[chartDisplayV0InputStyle.ordinal()];
                    if (i6 == 1) {
                        hj2 hj2Var = new hj2(list, i4);
                        t5a t5aVar = new t5a();
                        hj2Var.invoke(t5aVar);
                        arrayList2.add(new v5a(t5aVar.a));
                    } else if (i6 == 2) {
                        hj2 hj2Var2 = new hj2(list, 0);
                        j64 j64Var = new j64();
                        hj2Var2.invoke(j64Var);
                        arrayList2.add(new l64(j64Var.a));
                    } else {
                        if (i6 != 3) {
                            wg6.i();
                            return null;
                        }
                        hj2 hj2Var3 = new hj2(list, i3);
                        t5a t5aVar2 = new t5a();
                        hj2Var3.invoke(t5aVar2);
                        arrayList2.add(new v5a(t5aVar2.a));
                    }
                }
                final double d = dDoubleValue2;
                final double d2 = dDoubleValue4;
                new bz7() { // from class: ij2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v3, types: [lm6] */
                    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        Object arrayList4;
                        uub uubVar = (uub) obj4;
                        uubVar.getClass();
                        List list3 = list;
                        boolean z = false;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it6 = list3.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                if (((ChartDisplayV0InputSeriesItem) it6.next()).getName() != null) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        yl4 yl4Var2 = pj2.a;
                        if (z) {
                            arrayList4 = new ArrayList(x44.y(list3, 10));
                            Iterator it7 = list3.iterator();
                            while (it7.hasNext()) {
                                String name = ((ChartDisplayV0InputSeriesItem) it7.next()).getName();
                                if (name == null) {
                                    name = "";
                                }
                                arrayList4.add(name);
                            }
                        } else {
                            arrayList4 = lm6.E;
                        }
                        uubVar.b(yl4Var2, arrayList4);
                        yl4 yl4Var3 = pj2.b;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            String color = ((ChartDisplayV0InputSeriesItem) it8.next()).getColor();
                            if (color != null) {
                                arrayList5.add(color);
                            }
                        }
                        uubVar.b(yl4Var3, arrayList5);
                        uubVar.b(pj2.c, new cpc(Double.valueOf(d), Double.valueOf(d2)));
                        return iei.a;
                    }
                }.invoke(fd2Var.b);
                return ieiVar;
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                nz0 nz0Var = (nz0) obj;
                nz0Var.getClass();
                ((em2) obj3).getClass();
                if (nz0Var instanceof xy0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.FENCED_CODE;
                } else if (nz0Var instanceof dz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.INDENTED_CODE;
                } else if (nz0Var instanceof sy0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.INLINE_CODE;
                } else if (nz0Var instanceof xz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.TABLE;
                } else if (nz0Var instanceof zy0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.HEADING;
                } else if (nz0Var instanceof ry0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.BLOCK_QUOTE;
                } else if (nz0Var instanceof oz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.ORDERED_LIST;
                } else if (nz0Var instanceof b01) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.UNORDERED_LIST;
                } else if (nz0Var instanceof pz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.PARAGRAPH;
                } else if (nz0Var instanceof a01) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.THEMATIC_BREAK;
                } else if (nz0Var instanceof az0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.HTML_BLOCK;
                } else if (nz0Var instanceof ez0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.INLINE_MATH;
                } else if (nz0Var instanceof uy0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.DISPLAY_MATH;
                } else if (nz0Var instanceof cz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.IMAGE;
                } else if (nz0Var instanceof gz0) {
                    chatEvents$MarkdownNodeKind = ChatEvents$MarkdownNodeKind.LINK;
                }
                if (chatEvents$MarkdownNodeKind != null) {
                    String strF = ChatEvents$MarkdownNodeKind.Companion.serializer().getDescriptor().f(chatEvents$MarkdownNodeKind.ordinal());
                    yl2 yl2Var = yl2.E;
                    linkedHashMap.merge(strF, 1, new jl2(0));
                }
                return ieiVar;
            case 2:
                ft2 ft2Var = (ft2) obj3;
                String str = (String) obj2;
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tze tzeVarL0 = lzeVar.L0("DELETE FROM chatIdListEntries WHERE source = ? AND chat_uuid = ?");
                try {
                    tzeVarL0.N(1, vz8.F(ft2Var));
                    tzeVarL0.N(2, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                    tzeVarL0.close();
                }
            case 3:
                Map map = (Map) obj3;
                StreamSmoothingConfig streamSmoothingConfig = (StreamSmoothingConfig) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                if (map == null) {
                    return null;
                }
                Object obj4 = map.get(num);
                Object obj5 = obj4;
                if (obj4 == null) {
                    pr1 pr1Var = new pr1(streamSmoothingConfig.getMin_markdown_group_size_chars());
                    map.put(num, pr1Var);
                    obj5 = pr1Var;
                }
                return (pr1) obj5;
            case 4:
                ChatConversation chatConversation = (ChatConversation) obj;
                chatConversation.getClass();
                ChatConversationSettings settings = chatConversation.getSettings();
                ChatConversationSettings settings2 = chatConversation.getSettings();
                settings2.getClass();
                return ChatConversation.m167copytBaNr2I$default(chatConversation, null, null, null, null, null, null, (ChatConversationSettings) ((pz7) obj3).invoke(settings, ((bz7) obj2).invoke(new UpdatableChatConversationSettings(settings2.getEnabled_mcp_tools(), settings2.getEnabled_web_search(), settings2.getEnabled_monkeys_in_a_barrel(), settings2.m184getCompass_modevlYN4T0(), settings2.m186getPaprika_modeKLP3kNA(), settings2.m188getTool_search_modeOP4DWQA(), settings2.m187getThinking_modeKLP3kNA(), settings2.m185getEffort_level_couWBU(), null))), false, null, false, null, 1983, null);
            case 5:
                View view = (View) obj3;
                v77 v77Var = (v77) obj2;
                ((w86) obj).getClass();
                qm3 qm3Var = new qm3(view, v77Var);
                if (v77Var.m() && (v77Var.n() == 2 || v77Var.n() == 3)) {
                    z = true;
                }
                view.setKeepScreenOn(z);
                v77Var.m.a(qm3Var);
                return new o6(v77Var, qm3Var, view, i4);
            case 6:
                z9e z9eVar = (z9e) obj2;
                z = z9eVar.E || ((d38) obj).H((m19) obj3);
                z9eVar.E = z;
                return Boolean.valueOf(!z);
            case 7:
                z9e z9eVar2 = (z9e) obj2;
                z = z9eVar2.E || ((d38) obj).i0((z7d) obj3);
                z9eVar2.E = z;
                return Boolean.valueOf(!z);
            case 8:
                nwb nwbVar = (nwb) obj3;
                zub zubVar = (zub) obj2;
                ft7 ft7Var = (ft7) obj;
                ft7Var.getClass();
                if (!ft7Var.b()) {
                    odd oddVar = (odd) nwbVar.getValue();
                    if (oddVar != null) {
                        zubVar.c(new ndd(oddVar));
                    }
                    nwbVar.setValue(null);
                }
                return ieiVar;
            case 9:
                c cVar = (c) obj3;
                ((r4a) obj).getClass();
                if (((Boolean) ((wlg) obj2).getValue()).booleanValue()) {
                    cVar.d0(true);
                }
                return new le(20);
            case 10:
                i iVar = (i) obj3;
                iVar.x1(ne5.h((SessionResource) obj, iVar.D0()));
                ((zy7) obj2).a();
                return ieiVar;
            case 11:
                i iVar2 = (i) obj3;
                iVar2.x1(ne5.h((SessionResource) obj, iVar2.D0()));
                ((ei) obj2).a();
                return ieiVar;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                return (jz0) ((mdg) ((i) obj3).x2.F).get(((leb) ((zpf) obj2)).a + "_" + iIntValue);
            case 13:
                i iVar3 = (i) obj3;
                Boolean bool = (Boolean) obj;
                ((nwb) obj2).setValue(Boolean.FALSE);
                qi3 qi3Var = iVar3.l;
                String str2 = iVar3.m;
                String strE0 = iVar3.E0();
                qi3Var.e(new CodeEvents$RadioClosed(str2, strE0 != null ? strE0 : null, bool), CodeEvents$RadioClosed.Companion.serializer());
                return ieiVar;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                ((i) obj3).B1(CodeEvents$PullRequestOpenEntryPoint.PILL);
                ((Context) obj2).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                yih yihVar = (yih) obj3;
                i iVar4 = (i) obj2;
                aig aigVar = (aig) obj;
                aigVar.getClass();
                if (aigVar instanceof zhg) {
                    cpk.u(yihVar, ((zhg) aigVar).a);
                } else if (aigVar instanceof yhg) {
                    cpk.u(yihVar, ((yhg) aigVar).a);
                } else if (!(aigVar instanceof xhg)) {
                    wg6.i();
                    return null;
                }
                iVar4.i1.setValue(Boolean.FALSE);
                return ieiVar;
            case 16:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                ((bz7) obj3).invoke(knowledgeSource);
                ((bz7) obj2).invoke(knowledgeSource);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                LocalDate localDate = (LocalDate) obj3;
                nwb nwbVar2 = (nwb) obj2;
                ft7 ft7Var2 = (ft7) obj;
                ft7Var2.getClass();
                if (ft7Var2.b() && localDate == null) {
                    nwbVar2.setValue(Boolean.TRUE);
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                eyh eyhVar = (eyh) obj;
                eyhVar.getClass();
                ((pz7) obj3).invoke(((vg4) obj2).a, eyhVar);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                eyh eyhVar2 = (eyh) obj;
                eyhVar2.getClass();
                ((pz7) obj3).invoke((String) obj2, eyhVar2);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                mz8 mz8Var = (mz8) obj3;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0aVar.W(mz8Var.size(), new z04(new fc4(5), i2, mz8Var), new tq(mz8Var, 8), new ta4(802480018, true, new fr0(mz8Var, i3, (String) obj2)));
                return ieiVar;
            case 21:
                n56 n56Var = (n56) obj3;
                n56 n56Var2 = (n56) obj2;
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.t(ekfVar, n56Var == n56Var2);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                nwb nwbVar3 = (nwb) obj3;
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                if (!((List) obj2).isEmpty()) {
                    if (((Boolean) nwbVar3.getValue()).booleanValue()) {
                        ckf.a(ekfVar2, new vi4(10, nwbVar3));
                    } else {
                        ckf.c(ekfVar2, new vi4(11, nwbVar3));
                    }
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((w86) obj).getClass();
                return new rm3((hi6) obj3, i4, (npg) obj2);
            case 24:
                nwb nwbVar4 = (nwb) obj2;
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                if (!((vpg) obj3).a.b.isEmpty()) {
                    if (((Boolean) nwbVar4.getValue()).booleanValue()) {
                        ckf.a(ekfVar3, new vi4(21, nwbVar4));
                    } else {
                        ckf.c(ekfVar3, new vi4(22, nwbVar4));
                    }
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                rh9 rh9Var = (rh9) obj;
                rh9Var.getClass();
                mpk.U(rh9Var, "type", "object");
                mpk.W(rh9Var, "properties", new t8(4, (Map) obj3));
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = ((List) obj2).iterator();
                while (it6.hasNext()) {
                    JsonPrimitive jsonPrimitiveC = ch9.c((String) it6.next());
                    jsonPrimitiveC.getClass();
                    arrayList4.add(jsonPrimitiveC);
                }
                rh9Var.b("required", new JsonArray(arrayList4));
                return ieiVar;
            case 26:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((pz7) obj3).invoke(((HeartbeatRecord) obj2).getName(), bool2);
                return ieiVar;
            case 27:
                f fVar = (f) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String clientName = ((StreamMessage.ClientPermissionRequest) ((StreamMessage) obj2)).getClientName();
                tp4 tp4Var = null;
                ((amg) fVar.x.E).m(null);
                b0 b0VarQ0 = fVar.q0();
                if (b0VarQ0 != null) {
                    gb9.D(fVar.a, null, null, new ku(b0VarQ0, clientName, zBooleanValue, tp4Var, 11), 3);
                }
                return ieiVar;
            case 28:
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                List list3 = ((bz4) obj3).b;
                j0aVar2.W(list3.size(), new z04(new lc4(13), 12, list3), new tq(list3, 14), new ta4(2039820996, true, new es4(i4, (bz7) obj2, list3)));
                return ieiVar;
            default:
                v84 v84Var = (v84) obj2;
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                ((w15) obj3).a.m(null);
                if (!v84Var.Z()) {
                    v84Var.c0(bool3);
                }
                return ieiVar;
        }
    }

    public /* synthetic */ lj2(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ lj2(zs2 zs2Var, ft2 ft2Var, String str) {
        this.E = 2;
        this.F = ft2Var;
        this.G = str;
    }
}
