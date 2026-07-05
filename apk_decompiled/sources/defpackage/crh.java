package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.TimerCreateInputDescriptions;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class crh extends dxh {
    public final String e;
    public final ie5 f;
    public final String g;
    public final ewh h;

    /* JADX WARN: Multi-variable type inference failed */
    public crh(TimerCreateInputDescriptions timerCreateInputDescriptions, String str, mwh mwhVar, ie5 ie5Var) {
        Tool.CustomTool customTool;
        super(mwhVar, TimerCreateV0Input.Companion.serializer(), srg.a);
        this.e = str;
        this.f = ie5Var;
        this.g = hxh.j;
        if (timerCreateInputDescriptions != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            customTool = new Tool.CustomTool("timer_create_v0", str, timerCreateInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("duration_seconds", new IntegerProperty(timerCreateInputDescriptions.getDuration_seconds(), (Integer) null, (Integer) null, 6, (mq5) null)), new cpc("message", new StringProperty(timerCreateInputDescriptions.getMessage(), (List) objArr, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.X("duration_seconds", "message")));
        } else {
            customTool = null;
        }
        this.h = new ewh(customTool, new k2e(this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        e18 e18Var;
        ta4 ta4Var;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1703387444);
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
        if (e18Var2.Q(i2 & 1, (38347777 & i2) != 38347776)) {
            int i3 = i2;
            lyk lykVar = lyk.X;
            p();
            ta4 ta4VarQ0 = null;
            if (((TimerCreateV0Input) dlbVar.a()) == null) {
                e18Var2.a0(-576160744);
                e18Var2.p(false);
                ta4Var = null;
            } else {
                e18Var2.a0(-576160743);
                ta4 ta4VarQ02 = fd9.q0(627902369, new ufe(this, 27, lvhVar), e18Var2);
                e18Var2.p(false);
                ta4Var = ta4VarQ02;
            }
            TimerCreateV0Input timerCreateV0Input = (TimerCreateV0Input) dlbVar.a();
            if (timerCreateV0Input == null) {
                e18Var2.a0(-575685080);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-575685079);
                ta4VarQ0 = fd9.q0(411953933, new u3e(this, 15, timerCreateV0Input), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var2 = ta4VarQ0;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var2.k0(objN);
            }
            int i4 = i3 >> 9;
            e18Var = e18Var2;
            auk.b(lykVar, R.drawable.anthropicon_clock, z2, z4, (zy7) objN, iqbVar, false, 0L, false, ta4Var, ta4Var2, e18Var, (i4 & 7168) | (i4 & 896) | 1597446 | ((i3 >> 6) & 458752), 0, 384);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 21);
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
        return R.drawable.anthropicon_clock;
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
