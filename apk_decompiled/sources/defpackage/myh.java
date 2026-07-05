package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.models.organization.configtypes.AlarmCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventDeleteInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventSearchInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectDataTypesInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MapDisplayInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MessageComposeInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MobileAppUseToolConfig;
import com.anthropic.claude.models.organization.configtypes.TimerCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.UserLocationInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.UserTimeToolDescriptions;
import com.anthropic.claude.tool.model.HealthToolsConfig;
import com.anthropic.claude.tool.model.ToolInvocationResult$Report;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class myh {
    public final Context a;
    public final rc8 b;
    public final mwh c;
    public final mc d;
    public final v72 e;
    public final dyh f;
    public final qi3 g;
    public final faj h;
    public final oi8 i;
    public final gw8 j;
    public final fk0 k;
    public final ie5 l;
    public final k1d m;
    public final kah n;
    public final dnh o;
    public final wz5 p;
    public final wz5 q;
    public final wz5 r;
    public final wz5 s;
    public final wz5 t;
    public final wz5 u;
    public final wz5 v;
    public final mdg w;

    public myh(Context context, rc8 rc8Var, mwh mwhVar, mc mcVar, v72 v72Var, dyh dyhVar, qi3 qi3Var, faj fajVar, oi8 oi8Var, gw8 gw8Var, fk0 fk0Var, ie5 ie5Var, k1d k1dVar, kah kahVar, dnh dnhVar) {
        this.a = context;
        this.b = rc8Var;
        this.c = mwhVar;
        this.d = mcVar;
        this.e = v72Var;
        this.f = dyhVar;
        this.g = qi3Var;
        this.h = fajVar;
        this.i = oi8Var;
        this.j = gw8Var;
        this.k = fk0Var;
        this.l = ie5Var;
        this.m = k1dVar;
        this.n = kahVar;
        this.o = dnhVar;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.p = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i2 = i;
                myh myhVar = this.F;
                switch (i2) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i2 = 1;
        this.q = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i2;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i3 = 2;
        this.r = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i3;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i4 = 3;
        this.s = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i4;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i5 = 4;
        this.t = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i5;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i6 = 5;
        this.u = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i6;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        final int i7 = 6;
        this.v = mpk.w(new zy7(this) { // from class: hyh
            public final /* synthetic */ myh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                pwf pwfVar;
                int i22 = i7;
                myh myhVar = this.F;
                switch (i22) {
                    case 0:
                        oi8 oi8Var2 = myhVar.i;
                        gw8 gw8Var2 = myhVar.j;
                        v72 v72Var2 = myhVar.e;
                        mc mcVar2 = myhVar.d;
                        pwf pwfVar2 = new pwf();
                        rc8 rc8Var2 = myhVar.b;
                        k1d k1dVar2 = myhVar.m;
                        qi3 qi3Var2 = myhVar.g;
                        faj fajVar2 = myhVar.h;
                        ie5 ie5Var2 = myhVar.l;
                        mwh mwhVar2 = myhVar.c;
                        Context context2 = myhVar.a;
                        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) rc8Var2.f("mobile_app_use_tools", MobileAppUseToolConfig.Companion.serializer()).getValue();
                        MessageComposeInputDescriptions message_compose_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMessage_compose_v0() : null;
                        if (((Boolean) fajVar2.d.getValue()).booleanValue()) {
                            message_compose_v0 = null;
                        }
                        String string = context2.getString(R.string.tool_title_message_compose);
                        string.getClass();
                        pwfVar2.add(new lfb(message_compose_v0, string, mwhVar2, ie5Var2));
                        String string2 = context2.getString(R.string.tool_title_message_compose);
                        string2.getClass();
                        pwfVar2.add(new nfb(string2, mwhVar2, ie5Var2));
                        MapDisplayInputDescriptions map_display_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getMap_display_v0() : null;
                        if (((Boolean) fajVar2.e.getValue()).booleanValue()) {
                            map_display_v0 = null;
                        }
                        String string3 = context2.getString(R.string.tool_title_map_display);
                        string3.getClass();
                        pwfVar2.add(new nra(map_display_v0, string3, mwhVar2));
                        String string4 = context2.getString(R.string.tool_title_ask_user_input);
                        string4.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string4, 0));
                        String string5 = context2.getString(R.string.tool_title_browser_takeover);
                        string5.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string5, 4));
                        String string6 = context2.getString(R.string.tool_title_form_input);
                        string6.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string6, 5));
                        String string7 = context2.getString(R.string.tool_title_map_display);
                        string7.getClass();
                        pwfVar2.add(new tv0(mwhVar2, string7, 2));
                        EventCreateInputDescriptions event_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v0() : null;
                        String string8 = context2.getString(R.string.tool_title_event_create);
                        string8.getClass();
                        pwfVar2.add(new xx6(event_create_v0, string8, mwhVar2, ie5Var2));
                        UserTimeToolDescriptions user_time_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_time_v0() : null;
                        String string9 = context2.getString(R.string.tool_title_user_time);
                        string9.getClass();
                        pwfVar2.add(new soi(user_time_v0, string9, mwhVar2));
                        AlarmCreateInputDescriptions alarm_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getAlarm_create_v0() : null;
                        String string10 = context2.getString(R.string.tool_title_alarm_create);
                        string10.getClass();
                        pwfVar2.add(new ts(alarm_create_v0, string10, mwhVar2, ie5Var2));
                        TimerCreateInputDescriptions timer_create_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getTimer_create_v0() : null;
                        String string11 = context2.getString(R.string.tool_title_timer_create);
                        string11.getClass();
                        pwfVar2.add(new crh(timer_create_v0, string11, mwhVar2, ie5Var2));
                        UserLocationInputDescriptions user_location_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getUser_location_v0() : null;
                        String string12 = context2.getString(R.string.tool_title_user_location);
                        string12.getClass();
                        pwfVar2.add(new cni(user_location_v0, string12, mcVar2, mwhVar2));
                        String string13 = context2.getString(R.string.tool_title_calendar_search);
                        string13.getClass();
                        pwfVar2.add(new k72(mwhVar2, string13, mcVar2, mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getCalendar_search_v0() : null, v72Var2));
                        EventSearchInputDescriptions event_search_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_search_v0() : null;
                        String string14 = context2.getString(R.string.tool_title_event_search);
                        string14.getClass();
                        pwfVar2.add(new g72(mwhVar2, event_search_v0, string14, mcVar2, v72Var2));
                        EventCreateV1InputDescriptions event_create_v1 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_create_v1() : null;
                        String string15 = context2.getString(R.string.tool_title_event_create_v1);
                        string15.getClass();
                        pwfVar2.add(new v62(event_create_v1, string15, mwhVar2, mcVar2, v72Var2));
                        EventDeleteInputDescriptions event_delete_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_delete_v0() : null;
                        String string16 = context2.getString(R.string.tool_title_event_delete);
                        string16.getClass();
                        pwfVar2.add(new z62(event_delete_v0, string16, mwhVar2, mcVar2, v72Var2));
                        EventUpdateInputDescriptions event_update_v0 = mobileAppUseToolConfig != null ? mobileAppUseToolConfig.getEvent_update_v0() : null;
                        String string17 = context2.getString(R.string.tool_title_event_update);
                        string17.getClass();
                        pwfVar2.add(new d72(event_update_v0, mwhVar2, string17, mcVar2, v72Var2));
                        String string18 = context2.getString(R.string.tool_title_image_search);
                        string18.getClass();
                        pwfVar2.add(new gy8(string18, mwhVar2, gw8Var2, rc8Var2, qi3Var2));
                        String string19 = context2.getString(R.string.tool_title_present_files);
                        string19.getClass();
                        pwfVar2.add(new tv0(string19, mwhVar2, 3));
                        String string20 = context2.getString(R.string.tool_title_create_file);
                        string20.getClass();
                        pwfVar2.add(new tv0(string20, mwhVar2, 1));
                        String string21 = context2.getString(R.string.tool_title_suggest_connectors);
                        string21.getClass();
                        pwfVar2.add(new ief(mwhVar2, string21, qi3Var2, 1));
                        String string22 = context2.getString(R.string.tool_title_search_mcp_registry);
                        string22.getClass();
                        pwfVar2.add(new ief(mwhVar2, string22, qi3Var2, 0));
                        String string23 = context2.getString(R.string.tool_title_phone_use);
                        string23.getClass();
                        pwfVar2.add(new p0d(string23, mwhVar2, k1dVar2, 1));
                        String string24 = context2.getString(R.string.tool_title_phone_call_completed);
                        string24.getClass();
                        pwfVar2.add(new p0d(string24, mwhVar2, k1dVar2, 0));
                        String string25 = context2.getString(R.string.tool_title_task_propose);
                        string25.getClass();
                        pwfVar2.add(new nfb(string25, myhVar.n, mwhVar2));
                        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) rc8Var2.f("mobile_app_use_chart_display_tool", ChartDisplayInputDescriptions.Companion.serializer()).getValue();
                        String string26 = context2.getString(R.string.tool_title_chart_display);
                        string26.getClass();
                        pwfVar2.add(new ak2(chartDisplayInputDescriptions, string26, mwhVar2));
                        String string27 = context2.getString(R.string.tool_title_recipe_display);
                        string27.getClass();
                        pwfVar2.add(new gy8(mwhVar2, gw8Var2, rc8Var2, qi3Var2, string27));
                        int iU = ql8.u(oi8Var2.a, "com.google.android.apps.healthdata");
                        if (iU == 2 || iU == 3) {
                            HealthToolsConfig healthToolsConfig = (HealthToolsConfig) rc8Var2.f("mobile_app_use_health_connect_tools", HealthToolsConfig.Companion.serializer()).getValue();
                            HealthConnectDataTypesInputDescriptions health_connect_data_types_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_data_types_v0() : null;
                            String string28 = context2.getString(R.string.tool_title_health_connect_query_types);
                            string28.getClass();
                            pwfVar2.add(new wh8(health_connect_data_types_v0, string28, mwhVar2, myhVar.k));
                            pwfVar = pwfVar2;
                            HealthConnectQueryInputDescriptions health_connect_query_v0 = healthToolsConfig != null ? healthToolsConfig.getHealth_connect_query_v0() : null;
                            String string29 = context2.getString(R.string.tool_title_health_connect_query_data);
                            string29.getClass();
                            pwfVar.add(new cj8(health_connect_query_v0, context2, string29, mwhVar2, mcVar2, oi8Var2));
                        } else {
                            pwfVar = pwfVar2;
                        }
                        pwfVar.addAll((List) myhVar.o.m.getValue());
                        return sf5.k(pwfVar);
                    case 1:
                        Set set = (Set) myhVar.p.getValue();
                        int iD0 = tta.d0(x44.y(set, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        for (Object obj : set) {
                            linkedHashMap.put(((dxh) obj).r(), obj);
                        }
                        return linkedHashMap;
                    case 2:
                        Set set2 = (Set) myhVar.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((dxh) obj2).n().a()) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 3:
                        Set set3 = (Set) myhVar.p.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : set3) {
                            rok rokVarL = ((dxh) obj3).l();
                            if (rokVarL != null ? myhVar.f.b(rokVarL).a() : true) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                    case 4:
                        List list = (List) myhVar.s.getValue();
                        ArrayList arrayList3 = new ArrayList(x44.y(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((dxh) it.next()).n());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof ewh) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Tool.CustomTool customTool = ((ewh) it2.next()).a;
                            if (customTool != null) {
                                arrayList5.add(customTool);
                            }
                        }
                        return arrayList5;
                    case 5:
                        dyh dyhVar2 = myhVar.f;
                        List list2 = (List) myhVar.s.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            dxh dxhVar = (dxh) obj5;
                            if (((dxhVar instanceof ts) || (dxhVar instanceof v62) || (dxhVar instanceof z62) || (dxhVar instanceof d72) || (dxhVar instanceof g72) || (dxhVar instanceof k72) || (dxhVar instanceof crh) || (dxhVar instanceof cni) || (dxhVar instanceof soi)) ? true : dxhVar instanceof xmh ? ((Boolean) myhVar.o.k.getValue()).booleanValue() : false) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList6) {
                            rok rokVarL2 = ((dxh) obj6).l();
                            if (rokVarL2 == null || (dyhVar2.b(rokVarL2).a() && dyhVar2.b(rokVarL2).a())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(x44.y(arrayList7, 10));
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            arrayList8.add(((dxh) it3.next()).n());
                        }
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj7 : arrayList8) {
                            if (obj7 instanceof ewh) {
                                arrayList9.add(obj7);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = arrayList9.iterator();
                        while (it4.hasNext()) {
                            Tool.CustomTool customTool2 = ((ewh) it4.next()).a;
                            if (customTool2 != null) {
                                arrayList10.add(customTool2);
                            }
                        }
                        return arrayList10;
                    default:
                        Set<dxh> set4 = (Set) myhVar.p.getValue();
                        ArrayList arrayList11 = new ArrayList(x44.y(set4, 10));
                        for (dxh dxhVar2 : set4) {
                            String strR = dxhVar2.r();
                            String strS = dxhVar2.s();
                            int iP = dxhVar2.p();
                            d54 d54VarQ = dxhVar2.q();
                            boolean z2 = dxhVar2.n() instanceof ewh;
                            fwh fwhVarN = dxhVar2.n();
                            ewh ewhVar = fwhVarN instanceof ewh ? (ewh) fwhVarN : null;
                            arrayList11.add(new iyh(strR, strS, iP, d54VarQ, z2, ewhVar != null ? ewhVar.a : null));
                        }
                        return arrayList11;
                }
            }
        });
        cpc cpcVar = new cpc(xxh.F, Boolean.valueOf(c("android.permission.READ_CALENDAR")));
        if (c("android.permission.READ_CALENDAR") && c("android.permission.WRITE_CALENDAR")) {
            z = true;
        }
        cpc[] cpcVarArr = {cpcVar, new cpc(yxh.F, Boolean.valueOf(z)), new cpc(ayh.F, Boolean.valueOf(c("android.permission.ACCESS_COARSE_LOCATION"))), new cpc(zxh.F, Boolean.TRUE)};
        mdg mdgVar = new mdg();
        mdgVar.putAll(sta.r0(cpcVarArr));
        this.w = mdgVar;
    }

    public final void a(String str, String str2, dlb dlbVar, boolean z, e5h e5hVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z2;
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1206479499);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(false) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? e18Var.f(e5hVar) : e18Var.h(e5hVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.h(this) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            dxh dxhVar = (dxh) h().get(str);
            if (dxhVar == null) {
                e18Var.a0(1944715569);
                e18Var.p(false);
            } else {
                e18Var.a0(-214361904);
                int i3 = i2 >> 3;
                dxhVar.b(str2, dlbVar, z2, e5hVar, iqbVar, e18Var, (i3 & 458752) | (i3 & 8190) | FreeTypeConstants.FT_LOAD_NO_AUTOHINT | (57344 & i3));
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(this, str, str2, dlbVar, z, e5hVar, iqbVar, i);
        }
    }

    public final void b(String str, String str2, String str3, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        iqb iqbVar2;
        ozf ozfVar;
        iei ieiVar;
        str.getClass();
        str2.getClass();
        str3.getClass();
        dlbVar.getClass();
        lvhVar.getClass();
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1030343115);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            z4 = z;
            i2 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z4 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z5 = z2;
            i2 |= e18Var.g(z5) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z5 = z2;
        }
        if ((12582912 & i) == 0) {
            z6 = z3;
            i2 |= e18Var.g(z6) ? 8388608 : 4194304;
        } else {
            z6 = z3;
        }
        if ((100663296 & i) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? 67108864 : 33554432;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var.h(this) ? 536870912 : 268435456;
        }
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            dxh dxhVar = (dxh) h().get(str);
            if (dxhVar == null) {
                e18Var.a0(-1179182717);
                e18Var.p(false);
                ozfVar = null;
                ieiVar = null;
            } else {
                e18Var.a0(-1977700802);
                int i3 = i2 >> 6;
                int i4 = ((i2 >> 3) & 8190) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | ((i2 << 6) & 29360128);
                ozfVar = null;
                dxhVar.d(str2, str3, z4, dlbVar, z5, z6, iqbVar2, lvhVar, e18Var, i4);
                e18Var.p(false);
                ieiVar = iei.a;
            }
            if (ieiVar == null) {
                SilentException.a(new SilentException("Unsupported tool payload type: ".concat(dlb.class.getSimpleName())), ozfVar, false, 3);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qmb(this, str, str2, str3, z, dlbVar, lvhVar, z2, z3, iqbVar, i);
        }
    }

    public final boolean c(String str) {
        return x44.x(this.a, str) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.jyh
            if (r0 == 0) goto L13
            r0 = r13
            jyh r0 = (defpackage.jyh) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            jyh r0 = new jyh
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r13)
            goto L65
        L26:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r2
        L2c:
            defpackage.sf5.h0(r13)
            java.util.Map r11 = r11.h()
            java.lang.Object r11 = r11.get(r12)
            dxh r11 = (defpackage.dxh) r11
            if (r11 == 0) goto L6b
            r0.G = r3
            java.lang.Object r7 = r11.g()
            if (r7 != 0) goto L45
            r13 = r2
            goto L60
        L45:
            mwh r5 = r11.a
            java.lang.String r8 = r11.r()
            kotlinx.serialization.KSerializer r6 = r11.c
            h86 r11 = r5.b
            e45 r11 = r11.getDefault()
            qq0 r4 = new qq0
            r9 = 0
            r10 = 23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r11 = defpackage.gb9.c0(r11, r4, r0)
            r13 = r11
        L60:
            m45 r11 = defpackage.m45.E
            if (r13 != r11) goto L65
            return r11
        L65:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L6a
            goto L6b
        L6a:
            return r13
        L6b:
            java.lang.String r11 = "Tool use denied by user."
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myh.d(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.kyh
            if (r0 == 0) goto L13
            r0 = r7
            kyh r0 = (defpackage.kyh) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            kyh r0 = new kyh
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r7)
            goto L46
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2c:
            defpackage.sf5.h0(r7)
            java.util.Map r4 = r4.h()
            java.lang.Object r4 = r4.get(r5)
            dxh r4 = (defpackage.dxh) r4
            if (r4 == 0) goto L4e
            r0.G = r2
            java.lang.Object r7 = r4.u(r6, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L46
            return r4
        L46:
            if (r7 == 0) goto L4e
            dlb r4 = new dlb
            r4.<init>(r7, r3)
            return r4
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myh.e(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.dlb r6, java.util.List r7, kotlinx.serialization.json.JsonObject r8, defpackage.vp4 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.lyh
            if (r0 == 0) goto L13
            r0 = r9
            lyh r0 = (defpackage.lyh) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            lyh r0 = new lyh
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dlb r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L4a
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r9)
            java.util.Map r4 = r4.h()
            java.lang.Object r4 = r4.get(r5)
            dxh r4 = (defpackage.dxh) r4
            if (r4 == 0) goto L56
            r0.E = r6
            r0.H = r2
            java.lang.Object r9 = r4.i(r7, r8, r0)
            m45 r4 = defpackage.m45.E
            if (r9 != r4) goto L4a
            return r4
        L4a:
            if (r9 == 0) goto L56
            dlb r4 = new dlb
            java.lang.Object r5 = r6.a()
            r4.<init>(r5, r9)
            return r4
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myh.f(java.lang.String, dlb, java.util.List, kotlinx.serialization.json.JsonObject, vp4):java.lang.Object");
    }

    public final Object g(String str, String str2, wwh wwhVar, xzg xzgVar) {
        dxh dxhVar = (dxh) h().get(str);
        return dxhVar == null ? new ToolInvocationResult$Report(ij0.i("Tool not found: ", str), false) : dxhVar.v(this.a, str2, wwhVar, this.g, xzgVar);
    }

    public final Map h() {
        return (Map) this.q.getValue();
    }

    public final String i(String str, dlb dlbVar, boolean z, boolean z2) {
        str.getClass();
        dxh dxhVar = (dxh) h().get(str);
        if (dxhVar == null) {
            return null;
        }
        if (dlbVar == null) {
            dlbVar = null;
        }
        return dxhVar.f(this.a, dlbVar, z, z2);
    }

    public final boolean j() {
        List list = (List) this.r.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((dxh) it.next()).l() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(String str) {
        str.getClass();
        List list = (List) this.u.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (x44.r(((Tool.CustomTool) it.next()).getName(), str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(rok rokVar) {
        return n(rokVar) && this.f.b(rokVar).a();
    }

    public final boolean m(rok rokVar) {
        List list = (List) this.r.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (x44.r(((dxh) it.next()).l(), rokVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(rok rokVar) {
        Object objValueOf = this.w.get(rokVar);
        if (objValueOf == null) {
            objValueOf = Boolean.valueOf(rokVar instanceof byh);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean o(String str) {
        rok rokVarL;
        str.getClass();
        dxh dxhVar = (dxh) h().get(str);
        return dxhVar == null || (rokVarL = dxhVar.l()) == null || this.f.b(rokVarL) == eyh.G;
    }

    public final void p() {
        if (j()) {
            Boolean boolValueOf = Boolean.valueOf(c("android.permission.READ_CALENDAR"));
            mdg mdgVar = this.w;
            mdgVar.put(xxh.F, boolValueOf);
            mdgVar.put(yxh.F, Boolean.valueOf(c("android.permission.READ_CALENDAR") && c("android.permission.WRITE_CALENDAR")));
            mdgVar.put(ayh.F, Boolean.valueOf(c("android.permission.ACCESS_COARSE_LOCATION")));
            mdgVar.put(zxh.F, Boolean.TRUE);
        }
    }

    public final void q(boolean z) {
        dyh dyhVar = this.f;
        if (z) {
            dyhVar.b.put("health_connect", eyh.F);
            kgh.t(dyhVar.a, "health_connect", "ASK");
        } else {
            dyhVar.b.put("health_connect", eyh.E);
            kgh.t(dyhVar.a, "health_connect", "NEVER");
        }
    }
}
