package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.models.organization.configtypes.MessageComposeInputDescriptions;
import com.anthropic.claude.tool.model.MessageComposeV0Input;
import com.anthropic.claude.tool.model.MessageComposeV0InputKind;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lfb extends dxh {
    public final String e;
    public final ie5 f;
    public MessageComposeV0InputKind g;
    public final String h;
    public final ewh i;

    public lfb(MessageComposeInputDescriptions messageComposeInputDescriptions, String str, mwh mwhVar, ie5 ie5Var) {
        super(mwhVar, MessageComposeV0Input.Companion.serializer(), srg.a);
        this.e = str;
        this.f = ie5Var;
        this.h = hxh.e;
        this.i = new ewh(messageComposeInputDescriptions != null ? new Tool.CustomTool("message_compose_v0", str, messageComposeInputDescriptions.getTool_description(), new InputSchema("object", sta.h0(new cpc("body", new StringProperty(messageComposeInputDescriptions.getBody(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc(VerifyResponse.AuthenticationState.DISCRIMINATOR, new StringProperty(messageComposeInputDescriptions.getKind(), x44.X("email", "textMessage", "other"), (String) null, (Integer) null, (Integer) null, 28, (mq5) null)), new cpc("subject", new StringProperty(messageComposeInputDescriptions.getSubject(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null)), new cpc("summary_title", new StringProperty(messageComposeInputDescriptions.getSummary_title(), (List) null, (String) null, (Integer) null, (Integer) null, 30, (mq5) null))), x44.X("body", VerifyResponse.AuthenticationState.DISCRIMINATOR))) : null, new efe(20, this));
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        int i3;
        boolean z4;
        MessageComposeV0InputKind kind;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-354593058);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.h(this) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347795 & i2) != 38347794)) {
            MessageComposeV0Input messageComposeV0Input = (MessageComposeV0Input) dlbVar.a();
            MessageComposeV0InputKind kind2 = messageComposeV0Input != null ? messageComposeV0Input.getKind() : null;
            boolean zD = e18Var.d(kind2 == null ? -1 : kind2.ordinal());
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zD || objN == lz1Var) {
                MessageComposeV0Input messageComposeV0Input2 = (MessageComposeV0Input) dlbVar.a();
                objN = new zeb(messageComposeV0Input2 != null ? messageComposeV0Input2.getKind() : null);
                e18Var.k0(objN);
            }
            zeb zebVar = (zeb) objN;
            MessageComposeV0Input messageComposeV0Input3 = (MessageComposeV0Input) dlbVar.a();
            int iP = p();
            if (z3 || (z2 && messageComposeV0Input3 == null)) {
                i3 = i2;
                z4 = true;
            } else {
                i3 = i2;
                z4 = false;
            }
            List listW = messageComposeV0Input3 != null ? x44.W(new rd4("Default", messageComposeV0Input3.getBody(), messageComposeV0Input3.getSubject())) : null;
            qhb qhbVarG = (messageComposeV0Input3 == null || (kind = messageComposeV0Input3.getKind()) == null) ? null : rrk.g(kind);
            boolean zH = e18Var.h(this) | ((i3 & 57344) == 16384 || ((i3 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(lvhVar)));
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new lpa(this, 8, lvhVar);
                e18Var.k0(objN2);
            }
            yeb.c(zebVar, str, str2, this.h, iP, z2, z4, listW, qhbVarG, (pz7) objN2, lvhVar, iqbVar, e18Var, ((i3 << 3) & 1008) | (i3 & 458752), ((i3 >> 12) & 14) | ((i3 >> 18) & 112));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 14);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.i;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        if (this.g == MessageComposeV0InputKind.EMAIL) {
            ud0 ud0Var = ud0.d;
            ud0 ud0Var2 = ud0.d;
            return R.drawable.anthropicon_email;
        }
        ud0 ud0Var3 = ud0.d;
        ud0 ud0Var4 = ud0.d;
        return R.drawable.anthropicon_chat;
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
