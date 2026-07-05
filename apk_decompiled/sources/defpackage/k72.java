package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.CalendarSearchToolDescriptions;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.CalendarSearchV0Output;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k72 extends dxh {
    public final String e;
    public final mc f;
    public final v72 g;
    public final String h;
    public final ewh i;

    public k72(mwh mwhVar, String str, mc mcVar, CalendarSearchToolDescriptions calendarSearchToolDescriptions, v72 v72Var) {
        super(mwhVar, kei.b, CalendarSearchV0Output.Companion.serializer());
        this.e = str;
        this.f = mcVar;
        this.g = v72Var;
        this.h = hxh.o;
        this.i = new ewh(calendarSearchToolDescriptions != null ? new Tool.CustomTool("calendar_search_v0", str, calendarSearchToolDescriptions.getTool_description(), new InputSchema("object", (Map) null, (List) null, 6, (mq5) null)) : null, new n78(7, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2064321516);
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
            boolean zF = e18Var.f((CalendarSearchV0Output) dlbVar.b());
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new l72((CalendarSearchV0Output) dlbVar.b());
                e18Var.k0(objN);
            }
            l72 l72Var = (l72) objN;
            p();
            Object objB = dlbVar.b();
            CalendarSearchV0OutputCalendarSearchError calendarSearchV0OutputCalendarSearchError = objB instanceof CalendarSearchV0OutputCalendarSearchError ? (CalendarSearchV0OutputCalendarSearchError) objB : null;
            int i3 = i2 >> 6;
            qvj.a(false, l72Var, z2, z4, (calendarSearchV0OutputCalendarSearchError != null ? calendarSearchV0OutputCalendarSearchError.getError_type() : null) == CalendarSearchV0OutputCalendarSearchErrorErrorType.SYSTEM_PERMISSION_DENIED, lvhVar.d, iqbVar, e18Var, (i3 & 57344) | (i3 & 7168) | 6 | (i2 & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 6);
        }
    }

    @Override // defpackage.dxh
    public final Object g() {
        return new CalendarSearchV0OutputCalendarSearchError(CalendarSearchV0OutputCalendarSearchErrorErrorType.APP_PERMISSION_DENIED, "User denied calendar access in app.");
    }

    @Override // defpackage.dxh
    public final bxh k(Object obj) {
        CalendarSearchV0Output calendarSearchV0Output = (CalendarSearchV0Output) obj;
        calendarSearchV0Output.getClass();
        if (!(calendarSearchV0Output instanceof CalendarSearchV0OutputCalendarSearchError)) {
            return null;
        }
        CalendarSearchV0OutputCalendarSearchError calendarSearchV0OutputCalendarSearchError = (CalendarSearchV0OutputCalendarSearchError) calendarSearchV0Output;
        return new bxh(calendarSearchV0OutputCalendarSearchError.getError_type().getLoggingName(), calendarSearchV0OutputCalendarSearchError.getMessage());
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
