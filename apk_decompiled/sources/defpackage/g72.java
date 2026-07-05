package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.BooleanProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.EventSearchInputDescriptions;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.EventSearchV0Input;
import com.anthropic.claude.tool.model.EventSearchV0Output;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g72 extends dxh {
    public final String e;
    public final mc f;
    public final v72 g;
    public final String h;
    public final ewh i;

    public g72(mwh mwhVar, EventSearchInputDescriptions eventSearchInputDescriptions, String str, mc mcVar, v72 v72Var) {
        super(mwhVar, EventSearchV0Input.Companion.serializer(), EventSearchV0Output.Companion.serializer());
        this.e = str;
        this.f = mcVar;
        this.g = v72Var;
        this.h = hxh.p;
        this.i = new ewh(eventSearchInputDescriptions != null ? new Tool.CustomTool("event_search_v0", str, eventSearchInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("calendar_id", new StringProperty(eventSearchInputDescriptions.getCalendar_id(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("end_time", new StringProperty(eventSearchInputDescriptions.getEnd_time(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("include_all_day", new BooleanProperty(eventSearchInputDescriptions.getInclude_all_day())), new cpc("limit", new IntegerProperty(eventSearchInputDescriptions.getLimit(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("start_time", new StringProperty(eventSearchInputDescriptions.getStart_time(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), (List) null, 4, (mq5) null)) : null, new tk5(5, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(857500876);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z4 = z3;
            i2 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z4 = z3;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            boolean zF = e18Var.f((EventSearchV0Output) dlbVar.b());
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new h72((EventSearchV0Output) dlbVar.b());
                e18Var.k0(objN);
            }
            h72 h72Var = (h72) objN;
            p();
            Object objB = dlbVar.b();
            EventSearchV0OutputEventSearchError eventSearchV0OutputEventSearchError = objB instanceof EventSearchV0OutputEventSearchError ? (EventSearchV0OutputEventSearchError) objB : null;
            int i3 = i2 >> 6;
            qvj.a(false, h72Var, z2, z4, (eventSearchV0OutputEventSearchError != null ? eventSearchV0OutputEventSearchError.getError_type() : null) == EventSearchV0OutputEventSearchErrorErrorType.SYSTEM_PERMISSION_DENIED, lvhVar.d, iqbVar, e18Var, (i3 & 57344) | (i3 & 7168) | 6 | (i2 & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 5);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        return new EventSearchV0OutputEventSearchError(EventSearchV0OutputEventSearchErrorErrorType.APP_PERMISSION_DENIED, "User denied calendar access in app.");
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        EventSearchV0Output eventSearchV0Output = (EventSearchV0Output) obj;
        eventSearchV0Output.getClass();
        if (!(eventSearchV0Output instanceof EventSearchV0OutputEventSearchError)) {
            return null;
        }
        EventSearchV0OutputEventSearchError eventSearchV0OutputEventSearchError = (EventSearchV0OutputEventSearchError) eventSearchV0Output;
        return new bxh(eventSearchV0OutputEventSearchError.getError_type().getLoggingName(), eventSearchV0OutputEventSearchError.getMessage());
    }

    @Override // defpackage.dxh
    public final rok l() {
        return xxh.F;
    }

    @Override // defpackage.dxh
    public final Object m(tp4 tp4Var, Context context, String str) {
        ud0 ud0Var = ud0.d;
        String string = context.getString(R.string.calendar_tool_preview_label);
        string.getClass();
        String string2 = context.getString(R.string.calendar_tool_search_preview_description);
        string2.getClass();
        return new MobileAppToolPreviewInfo(R.drawable.anthropicon_calendar, string, string2, CalendarSearchPreviewData.INSTANCE);
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.i;
    }

    @Override // defpackage.dxh
    public final int p() {
        ud0 ud0Var = ud0.d;
        ud0 ud0Var2 = ud0.d;
        return R.drawable.anthropicon_calendar;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.h;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
