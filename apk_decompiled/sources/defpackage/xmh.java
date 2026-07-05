package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.tool.ToolIdentifier;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xmh extends dxh {
    public static final ide o = new ide("^[a-zA-Z0-9_-]+$");
    public static final ide p = new ide("[^a-zA-Z0-9_-]");
    public final String e;
    public final String f;
    public final Tool.CustomTool g;
    public final h86 h;
    public final qi3 i;
    public final mn5 j;
    public final String k;
    public final String l;
    public final uwh m;
    public final ewh n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmh(String str, String str2, Tool.CustomTool customTool, h86 h86Var, qi3 qi3Var, mn5 mn5Var, mwh mwhVar) {
        super(mwhVar, JsonObject.INSTANCE.serializer(), srg.a);
        str.getClass();
        str2.getClass();
        customTool.getClass();
        this.e = str;
        this.f = str2;
        this.g = customTool;
        this.h = h86Var;
        this.i = qi3Var;
        this.j = mn5Var;
        String strM913constructorimpl = ToolIdentifier.m913constructorimpl(xrk.c(str, customTool.getName()));
        this.k = strM913constructorimpl;
        this.l = customTool.getTitle();
        this.m = new uwh(false);
        this.n = new ewh(Tool.CustomTool.copy$default(customTool, strM913constructorimpl, null, null, null, 14, null), new wmh(this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1040613142);
        if ((i & 196608) == 0) {
            i2 = i | (e18Var.g(z2) ? 131072 : 65536);
        } else {
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
        boolean z4 = false;
        if (e18Var.Q(i2 & 1, (38338561 & i2) != 38338560)) {
            Context context = (Context) e18Var.j(w00.b);
            String str3 = this.f;
            str3.getClass();
            context.getClass();
            String string = context.getString(z3 ? R.string.third_party_app_tool_status_failed : z2 ? R.string.third_party_app_tool_status_finished : R.string.third_party_app_tool_status_running, str3);
            string.getClass();
            if (!z2 && !z3) {
                z4 = true;
            }
            yrk.d(this.e, str3, string, z4, z3, iqbVar, e18Var, (i2 >> 6) & 516096);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 20);
        }
    }

    @Override // defpackage.dxh
    public final String f(Context context, dlb dlbVar, boolean z, boolean z2) {
        String string = context.getString(R.string.tool_title_third_party_app, this.f);
        string.getClass();
        return string;
    }

    @Override // defpackage.dxh
    public final Object g() {
        return ij0.j("User declined to allow ", this.f, " to run this tool.");
    }

    @Override // defpackage.dxh
    public final rok l() {
        return new byh(this.k);
    }

    @Override // defpackage.dxh
    public final Object m(tp4 tp4Var, Context context, String str) {
        ud0 ud0Var = ud0.d;
        String string = context.getString(R.string.third_party_tool_approval_label, this.f);
        string.getClass();
        return new MobileAppToolPreviewInfo(R.drawable.anthropicon_tool, string, this.g.getDescription(), null);
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.n;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return this.m;
    }

    @Override // defpackage.dxh
    public final int p() {
        ud0 ud0Var = ud0.d;
        ud0 ud0Var2 = ud0.d;
        return R.drawable.anthropicon_tool;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.k;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.l;
    }

    public final String x() {
        return this.e;
    }
}
