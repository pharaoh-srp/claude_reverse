package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.models.organization.configtypes.UserTimeToolDescriptions;
import com.anthropic.claude.tool.model.UserTimeV0Output;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class soi extends dxh {
    public final UserTimeToolDescriptions e;
    public final String f;
    public final String g;

    public soi(UserTimeToolDescriptions userTimeToolDescriptions, String str, mwh mwhVar) {
        super(mwhVar, kei.b, UserTimeV0Output.Companion.serializer());
        this.e = userTimeToolDescriptions;
        this.f = str;
        this.g = hxh.h;
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        boolean z4;
        int i2;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2081479276);
        if ((i & 196608) == 0) {
            z4 = z2;
            i2 = i | (e18Var.g(z4) ? 131072 : 65536);
        } else {
            z4 = z2;
            i2 = i;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38338561 & i2) != 38338560)) {
            hj6 hj6Var = hj6.V;
            p();
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var.k0(objN);
            }
            int i3 = i2 >> 9;
            auk.b(hj6Var, R.drawable.anthropicon_clock, z4, z3, (zy7) objN, iqbVar, false, 0L, false, null, null, e18Var, (i3 & 7168) | (i3 & 896) | 1597446 | ((i2 >> 6) & 458752), 0, 1920);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 24);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        Tool.CustomTool customTool;
        UserTimeToolDescriptions userTimeToolDescriptions = this.e;
        if (userTimeToolDescriptions != null) {
            String str = this.f;
            str.getClass();
            customTool = new Tool.CustomTool("user_time_v0", str, userTimeToolDescriptions.getTool_description(), new InputSchema("object", (Map) null, (List) null, 6, (mq5) null));
        } else {
            customTool = null;
        }
        return new ewh(customTool, new roi(0));
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
        return this.f;
    }
}
