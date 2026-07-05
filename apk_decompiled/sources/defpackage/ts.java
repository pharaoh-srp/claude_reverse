package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.BooleanProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.AlarmCreateInputDescriptions;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts extends dxh {
    public final String e;
    public final ie5 f;
    public final String g;
    public final ewh h;

    public ts(AlarmCreateInputDescriptions alarmCreateInputDescriptions, String str, mwh mwhVar, ie5 ie5Var) {
        super(mwhVar, AlarmCreateV0Input.Companion.serializer(), srg.a);
        this.e = str;
        this.f = ie5Var;
        this.g = hxh.i;
        this.h = new ewh(alarmCreateInputDescriptions != null ? new Tool.CustomTool("alarm_create_v0", str, alarmCreateInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("days", new ArrayProperty(alarmCreateInputDescriptions.getDays(), new IntegerProperty((String) null, (Integer) null, (Integer) null, 7, (mq5) null), (Integer) null, (Integer) null, 12, (mq5) null)), new cpc("hour", new IntegerProperty(alarmCreateInputDescriptions.getHour(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("message", new StringProperty(alarmCreateInputDescriptions.getMessage(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("minute", new IntegerProperty(alarmCreateInputDescriptions.getMinute(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("vibrate", new BooleanProperty(alarmCreateInputDescriptions.getVibrate()))), x44.X("hour", "message", "minute"))) : null, new a5(12, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        e18 e18Var;
        ta4 ta4Var;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1181669556);
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
            z4 = z3;
            i2 |= e18Var2.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z4 = z3;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? 67108864 : 33554432;
        }
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            int i4 = i2;
            tqh tqhVar = tqh.F;
            p();
            ta4 ta4VarQ0 = null;
            if (((AlarmCreateV0Input) dlbVar.a()) == null) {
                e18Var2.a0(-1565202568);
                e18Var2.p(false);
                ta4Var = null;
            } else {
                e18Var2.a0(-1565202567);
                ta4 ta4VarQ02 = fd9.q0(-445137515, new kn(this, i3, lvhVar), e18Var2);
                e18Var2.p(false);
                ta4Var = ta4VarQ02;
            }
            AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input) dlbVar.a();
            if (alarmCreateV0Input == null) {
                e18Var2.a0(-1564726873);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1564726872);
                ta4VarQ0 = fd9.q0(171755265, new ii(this, 4, alarmCreateV0Input), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var2 = ta4VarQ0;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var2.k0(objN);
            }
            int i5 = i4 >> 9;
            e18Var = e18Var2;
            auk.b(tqhVar, R.drawable.anthropicon_notification, z2, z4, (zy7) objN, iqbVar, false, 0L, false, ta4Var, ta4Var2, e18Var, (i5 & 7168) | (i5 & 896) | 1597446 | ((i4 >> 6) & 458752), 0, 384);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 0);
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
        return R.drawable.anthropicon_notification;
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
