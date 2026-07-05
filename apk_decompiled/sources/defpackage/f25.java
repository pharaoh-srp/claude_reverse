package defpackage;

import android.content.Intent;
import android.provider.CalendarContract;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseConversion;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.anthropic.claude.tool.model.EventCreateV0Input;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrence;
import com.mikepenz.aboutlibraries.Libs;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f25 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ f25(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((pz7) obj3).invoke(((WebhookRecord) obj2).getToken(), bool);
                break;
            case 1:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                List list = (List) ((wlg) obj3).getValue();
                j0aVar.W(list.size(), new z04(new qy4(4), 13, list), new tq(list, 16), new ta4(802480018, true, new es4(2, (bz7) obj2, list)));
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((pz7) obj3).invoke((McpServer) obj2, bool2);
                break;
            case 3:
                CreateTemplateProjectScreenParams createTemplateProjectScreenParams = (CreateTemplateProjectScreenParams) obj3;
                m7f m7fVar = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                break;
            case 4:
                List list2 = (List) obj;
                Long l = (Long) list2.get(0);
                Long l2 = (Long) list2.get(1);
                Object obj4 = list2.get(2);
                obj4.getClass();
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = list2.get(3);
                obj5.getClass();
                b79 b79Var = new b79(iIntValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list2.get(4);
                obj6.getClass();
                break;
            case 5:
                m7f m7fVar2 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar2 = jce.a;
                break;
            case 6:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                ((kz5) obj3).b.m0(lzeVar, (jz5) obj2);
                break;
            case 7:
                cd6 cd6Var = (cd6) obj3;
                od6 od6Var = (od6) obj2;
                long j = fcc.j(od6Var.s0 ? -1.0f : 1.0f, ((ac6) obj).a);
                ukc ukcVar = od6Var.o0;
                id6 id6Var = nd6.a;
                cd6Var.a(Float.intBitsToFloat((int) (ukcVar == ukc.E ? j & 4294967295L : j >> 32)));
                break;
            case 8:
                CustomInstructionsDialogRoute.EditCustomInstructions editCustomInstructions = (CustomInstructionsDialogRoute.EditCustomInstructions) obj3;
                m7f m7fVar3 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar3 = jce.a;
                break;
            case 9:
                m7f m7fVar4 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar4 = jce.a;
                break;
            case 10:
                xx6 xx6Var = (xx6) obj3;
                EventCreateV0Input eventCreateV0Input = (EventCreateV0Input) obj;
                eventCreateV0Input.getClass();
                ie5 ie5Var = xx6Var.f;
                String str = xx6Var.g;
                gh2 gh2Var = ((lvh) obj2).b;
                ie5Var.getClass();
                str.getClass();
                ie5Var.b.e(new MobileAppUseEvents$MobileAppUseConversion(str), MobileAppUseEvents$MobileAppUseConversion.Companion.serializer());
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setData(CalendarContract.Events.CONTENT_URI);
                intent.setFlags(268435456);
                intent.putExtra("title", eventCreateV0Input.getTitle());
                intent.putExtra("description", eventCreateV0Input.getDescription());
                intent.putExtra("beginTime", eventCreateV0Input.getStart_time().toInstant().toEpochMilli());
                OffsetDateTime end_time = eventCreateV0Input.getEnd_time();
                if (end_time != null) {
                    intent.putExtra("endTime", end_time.toInstant().toEpochMilli());
                }
                String location = eventCreateV0Input.getLocation();
                if (location != null) {
                    intent.putExtra("eventLocation", location);
                }
                EventCreateV0InputRecurrence recurrence = eventCreateV0Input.getRecurrence();
                intent.putExtra("rrule", recurrence != null ? recurrence.getRrule() : null);
                Boolean all_day = eventCreateV0Input.getAll_day();
                if (all_day != null) {
                    intent.putExtra("allDay", all_day.booleanValue());
                }
                try {
                    ie5Var.a.startActivity(intent);
                } catch (Exception e) {
                    SilentException.a(new SilentException("Failed to create calendar event", e), null, false, 3);
                    if (gh2Var != null) {
                        gh2Var.r(new pt6(R.string.event_create_tool_create_event_failed));
                    }
                }
                break;
            case 11:
                jz6 jz6Var = (jz6) obj3;
                File file = (File) obj2;
                String str2 = (String) obj;
                str2.getClass();
                try {
                } catch (Exception e2) {
                    jz6Var.H.a("Failed to parse event line in " + file.getName(), e2);
                    return null;
                }
                break;
            case 12:
                break;
            case 13:
                zy1 zy1Var = (zy1) obj2;
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    zy1Var.r(ieiVar);
                }
                break;
            case 14:
                GroveEvents$GroveLocation groveEvents$GroveLocation = (GroveEvents$GroveLocation) obj3;
                m7f m7fVar5 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar5 = jce.a;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar6 = (m7f) obj3;
                ((swe) obj).getClass();
                kce kceVar6 = jce.a;
                break;
            case 16:
                hsc hscVar = (hsc) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                lf9 lf9Var = (lf9) ((nwb) obj3).getValue();
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                hscVar.i(hscVar.h() + fFloatValue);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ylg ylgVar = (ylg) obj3;
                m7f m7fVar7 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar7 = jce.a;
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                cv9 cv9Var = (cv9) obj;
                cv9Var.a();
                a80 a80Var = ((k19) obj2).b0;
                a80Var.getClass();
                xd6.Y0(cv9Var, (c40) obj3, new eeg(((d54) a80Var.e()).a), MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                wtc wtcVar = (wtc) obj2;
                iv7 iv7VarB = ((ix9) obj3).b(((Integer) obj).intValue());
                int i5 = iv7VarB.a;
                List list3 = iv7VarB.b;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                int i6 = 0;
                while (i3 < size) {
                    int i7 = (int) ((za8) list3.get(i3)).a;
                    arrayList.add(new cpc(Integer.valueOf(i5), new rl4(wtcVar.c(i6, i7))));
                    i5++;
                    i6 += i7;
                    i3++;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                wtc wtcVar2 = (wtc) obj3;
                bx9 bx9Var = (bx9) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                ix9 ix9Var = (ix9) wtcVar2.e;
                int i8 = ix9Var.i;
                int iE = ix9Var.e(iIntValue2);
                break;
            case 21:
                i4g i4gVar = (i4g) obj2;
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                ((pz7) obj3).invoke(j0aVar2, i4gVar.a);
                j0aVar2.U(jc9.E, gc9.E, new ta4(-1109130262, true, new k1a(i4gVar, i3)));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                j0a j0aVar3 = (j0a) obj;
                j0aVar3.getClass();
                mz8 libraries = ((Libs) obj3).getLibraries();
                j0aVar3.W(libraries.size(), null, new u3a(i4, libraries), new ta4(802480018, true, new fr0(libraries, i2, (eli) obj2)));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((jp9) obj).getClass();
                ((poa) obj3).O(((MagicLinkSentConfig) obj2).m764getEmailZiuLfiY());
                break;
            case 24:
                ((swe) obj).getClass();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                oh3Var.a("key", ((KSerializer) obj3).getDescriptor());
                oh3Var.a(ExperienceToggle.DEFAULT_PARAM_KEY, ((KSerializer) obj2).getDescriptor());
                break;
            case 26:
                isc iscVar = (isc) obj3;
                nwb nwbVar = (nwb) obj2;
                JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
                if (jsonPrimitive != null) {
                    Integer numG = ch9.g(jsonPrimitive);
                    int iH = iscVar.h();
                    if (numG != null && numG.intValue() == iH && !((Boolean) nwbVar.getValue()).booleanValue()) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj7 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj7)).getClass();
                                arrayList2.add(obj7);
                            }
                            if (!arrayList2.isEmpty()) {
                                zfa.a.getClass();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfa.INFO, "McpAppViewHost", "Teardown response received");
                                }
                            }
                        }
                        nwbVar.setValue(Boolean.TRUE);
                    }
                }
                break;
            case 27:
                ctc ctcVar = (ctc) obj2;
                String str3 = (String) obj;
                str3.getClass();
                pz7 pz7Var = ((m83) obj3).D;
                if (pz7Var != null) {
                    pz7Var.invoke(ctcVar, str3);
                }
                break;
            case 28:
                z4b z4bVar = (z4b) obj;
                z4bVar.getClass();
                ((pz7) obj3).invoke((McpTool) obj2, z4bVar);
                break;
            default:
                y3b y3bVar = (y3b) obj3;
                z4b z4bVar2 = (z4b) obj;
                z4bVar2.getClass();
                gb9.D(y3bVar.a, null, null, new ba9(y3bVar, (McpServer) obj2, z4bVar2, null, 5), 3);
                break;
        }
        return ieiVar;
    }
}
