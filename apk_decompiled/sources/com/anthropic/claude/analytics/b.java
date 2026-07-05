package com.anthropic.claude.analytics;

import com.anthropic.claude.analytics.events.AnalyticsEvent;
import com.anthropic.claude.analytics.screens.AnalyticsScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatListScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatScreen;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.ch9;
import defpackage.cx;
import defpackage.e45;
import defpackage.el5;
import defpackage.gb9;
import defpackage.grc;
import defpackage.gx;
import defpackage.ij0;
import defpackage.kj5;
import defpackage.kxk;
import defpackage.m0;
import defpackage.mp4;
import defpackage.mr9;
import defpackage.pvg;
import defpackage.qi3;
import defpackage.qk5;
import defpackage.sx;
import defpackage.tp4;
import defpackage.v40;
import defpackage.vb7;
import defpackage.wmi;
import defpackage.xah;
import defpackage.znf;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements qi3 {
    public final gx a;
    public final bg9 b;
    public final qk5 c;

    public b(gx gxVar, bg9 bg9Var, qk5 qk5Var) {
        this.a = gxVar;
        this.b = bg9Var;
        this.c = qk5Var;
    }

    @Override // defpackage.qi3
    public final void a(sx sxVar) {
        sxVar.getClass();
        String str = sxVar.E;
        gx.d(this.a, str, null, 14);
        List list = xah.a;
        xah.e(4, "📱".concat(str), "Analytics Screen", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.qi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, defpackage.pvg r19, defpackage.tp4 r20) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.analytics.b.b(java.lang.String, pvg, tp4):java.lang.Object");
    }

    @Override // defpackage.qi3
    public final void c(AnalyticsScreen analyticsScreen) {
        boolean z = analyticsScreen instanceof AnalyticsScreens$ChatScreen;
        gx gxVar = this.a;
        bg9 bg9Var = this.b;
        if (z) {
            AnalyticsScreens$ChatScreen analyticsScreens$ChatScreen = (AnalyticsScreens$ChatScreen) analyticsScreen;
            gx.d(gxVar, analyticsScreens$ChatScreen.getScreenName(), ch9.i(bg9Var.c(new ChatScreenAnalyticsProperties(analyticsScreens$ChatScreen.getOrganization_uuid(), analyticsScreens$ChatScreen.getConversation_uuid()), ChatScreenAnalyticsProperties.Companion.serializer())), 12);
        } else if (!(analyticsScreen instanceof AnalyticsScreens$ChatListScreen)) {
            mr9.b();
        } else {
            AnalyticsScreens$ChatListScreen analyticsScreens$ChatListScreen = (AnalyticsScreens$ChatListScreen) analyticsScreen;
            gx.d(gxVar, analyticsScreens$ChatListScreen.getScreenName(), ch9.i(bg9Var.c(new ChatListScreenAnalyticsProperties(analyticsScreens$ChatListScreen.getOrganization_uuid()), ChatListScreenAnalyticsProperties.Companion.serializer())), 12);
        }
    }

    @Override // defpackage.qi3
    public final void d(String str, String str2, String str3, pvg pvgVar) {
        grc.B(str, str2, str3);
        tp4 tp4Var = null;
        ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = new ClaudeAnalyticsImpl$Traits(str, str2, str3, pvgVar != null ? pvgVar.E : null, null);
        KSerializer kSerializerSerializer = ClaudeAnalyticsImpl$Traits.Companion.serializer();
        kSerializerSerializer.getClass();
        ag9 ag9Var = bg9.d;
        ag9Var.getClass();
        JsonObject jsonObjectI = ch9.i(v40.S(ag9Var, claudeAnalyticsImpl$Traits, kSerializerSerializer));
        gx gxVar = this.a;
        el5 el5Var = gxVar.F;
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new cx(gxVar, str, jsonObjectI, tp4Var, 0), 2);
        gxVar.c(new IdentifyEvent(str, jsonObjectI), null);
        qk5.a(this.c, str, str2, str3, pvgVar != null ? pvgVar.E : null);
    }

    @Override // defpackage.qi3
    public final void e(AnalyticsEvent analyticsEvent, znf znfVar) {
        znfVar.getClass();
        JsonObject jsonObjectI = ch9.i(v40.S(this.b, analyticsEvent, znfVar));
        List list = xah.a;
        xah.d(ij0.i("📊 ", analyticsEvent.getEventName()), "Analytics Event", kxk.M(jsonObjectI));
        gx.e(this.a, analyticsEvent.getEventName(), jsonObjectI, 4);
    }

    @Override // defpackage.qi3
    public final void reset() {
        String strI = vb7.i();
        wmi wmiVar = new wmi(strI, null, null);
        gx gxVar = this.a;
        gxVar.I = wmiVar;
        el5 el5Var = gxVar.F;
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new m0(gxVar, strI, null, 12), 2);
        if (kj5.b()) {
            kj5.a(null).b();
        }
    }
}
