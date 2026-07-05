package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.BooleanProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.EventCreateInputDescriptions;
import com.anthropic.claude.tool.model.EventCreateV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xx6 extends dxh {
    public final String e;
    public final ie5 f;
    public final String g;
    public final ewh h;

    public xx6(EventCreateInputDescriptions eventCreateInputDescriptions, String str, mwh mwhVar, ie5 ie5Var) {
        super(mwhVar, EventCreateV0Input.Companion.serializer(), srg.a);
        this.e = str;
        this.f = ie5Var;
        this.g = hxh.d;
        this.h = new ewh(eventCreateInputDescriptions != null ? new Tool.CustomTool("event_create_v0", str, eventCreateInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("all_day", new BooleanProperty(eventCreateInputDescriptions.getAll_day())), new cpc("description", new StringProperty(eventCreateInputDescriptions.getDescription(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("end_time", new StringProperty(eventCreateInputDescriptions.getEnd_time(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("location", new StringProperty(eventCreateInputDescriptions.getLocation(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("recurrence", new ObjectProperty(eventCreateInputDescriptions.getRecurrence().getDescription(), sta.h0(new cpc("day_of_month", new IntegerProperty(eventCreateInputDescriptions.getRecurrence().getDay_of_month(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("days_of_week", new ArrayProperty(eventCreateInputDescriptions.getRecurrence().getDays_of_week(), new StringProperty((String) null, (List) null, (String) null, (Integer) null, (Integer) null, 31, (mq5) null), (Integer) null, (Integer) null, 12, (mq5) null)), new cpc("end", new ObjectProperty(eventCreateInputDescriptions.getRecurrence().getEnd().getDescription(), sta.h0(new cpc("count", new IntegerProperty(eventCreateInputDescriptions.getRecurrence().getEnd().getCount(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("type", new StringProperty(eventCreateInputDescriptions.getRecurrence().getEnd().getType(), x44.X("count", "until"), (String) null, (Integer) null, (Integer) null, 28, (mq5) null)), new cpc("until", new StringProperty(eventCreateInputDescriptions.getRecurrence().getEnd().getUntil(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.W("type"))), new cpc("frequency", new StringProperty(eventCreateInputDescriptions.getRecurrence().getFrequency(), x44.X("daily", "weekly", "monthly", "yearly"), (String) null, (Integer) null, (Integer) null, 28, (mq5) null)), new cpc("human_readable_frequency", new StringProperty(eventCreateInputDescriptions.getRecurrence().getHuman_readable_frequency(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("interval", new IntegerProperty(eventCreateInputDescriptions.getRecurrence().getInterval(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("months", new ArrayProperty(eventCreateInputDescriptions.getRecurrence().getMonths(), new IntegerProperty((String) null, (Integer) null, (Integer) null, 7, (mq5) null), (Integer) null, (Integer) null, 12, (mq5) null)), new cpc("position", new IntegerProperty(eventCreateInputDescriptions.getRecurrence().getPosition(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("rrule", new StringProperty(eventCreateInputDescriptions.getRecurrence().getRrule(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.X("frequency", "human_readable_frequency", "rrule"))), new cpc("start_time", new StringProperty(eventCreateInputDescriptions.getStart_time(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("title", new StringProperty(eventCreateInputDescriptions.getTitle(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.X("start_time", "title"))) : null, new ql8(18));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        ta4 ta4VarQ0;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(773750188);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var2.f(lvhVar) : e18Var2.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? 67108864 : 33554432;
        }
        boolean z4 = true;
        if (e18Var2.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            EventCreateV0Input eventCreateV0Input = (EventCreateV0Input) dlbVar.a();
            hj6 hj6Var = hj6.J;
            p();
            if (!z3 && (!z2 || eventCreateV0Input != null)) {
                z4 = false;
            }
            if (eventCreateV0Input != null) {
                e18Var2.a0(-296951990);
                ta4VarQ0 = fd9.q0(1017788358, new xg4(eventCreateV0Input, this, lvhVar, 13), e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-296410606);
                e18Var2.p(false);
                ta4VarQ0 = null;
            }
            ta4 ta4Var = ta4VarQ0;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            auk.b(hj6Var, R.drawable.anthropicon_calendar, z2, z4, (zy7) objN, iqbVar, false, 0L, false, null, ta4Var, e18Var, ((i2 >> 9) & 896) | 1597446 | ((i2 >> 6) & 458752), 0, 896);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 9);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.h;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        ud0 ud0Var = ud0.d;
        ud0 ud0Var2 = ud0.d;
        return R.drawable.anthropicon_calendar;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.g;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
