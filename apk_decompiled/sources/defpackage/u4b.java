package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u4b {
    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(96665648);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            iqbVar2 = iqbVar;
            cv8.b(a.a(ud0.K1, e18Var), d4c.j0(R.string.generic_error_something_went_wrong, e18Var), iqbVar2, gm3.a(e18Var).y, e18Var, 392, 0);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 23, iqbVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ta4 r24, java.lang.String r25, boolean r26, defpackage.zy7 r27, defpackage.iqb r28, boolean r29, boolean r30, defpackage.tkh r31, defpackage.hhd r32, defpackage.ld4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4b.b(ta4, java.lang.String, boolean, zy7, iqb, boolean, boolean, tkh, hhd, ld4, int, int):void");
    }

    public static final void c(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        iqb iqbVar2;
        tkh tkhVarB;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2060338803);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(parsedContentBlock$McpToolInvocation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            iqbVar2 = iqbVar;
        }
        byte b = 0;
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String messageText = parsedContentBlock$McpToolInvocation.getMessageText();
            if (messageText == null) {
                messageText = parsedContentBlock$McpToolInvocation.getToolName();
            }
            String toolName = parsedContentBlock$McpToolInvocation.getToolName();
            if (x44.r(messageText, bsg.e1(toolName, ":", toolName))) {
                e18Var.a0(-175298829);
                tkhVarB = (tkh) ((wk) gm3.c(e18Var).e.F).i;
                e18Var.p(false);
            } else {
                e18Var.a0(-175227808);
                tkhVarB = ihd.b(e18Var);
                e18Var.p(false);
            }
            tkh tkhVar = tkhVarB;
            boolean z2 = !parsedContentBlock$McpToolInvocation.getIsComplete();
            if (parsedContentBlock$McpToolInvocation.getInputDisplayContent() == null && parsedContentBlock$McpToolInvocation.getOutputDisplayContent() == null && parsedContentBlock$McpToolInvocation.getMemorySummary() == null) {
                z = false;
            }
            int i3 = i2 << 6;
            iqb iqbVar3 = iqbVar2;
            b(fd9.q0(-349421750, new s4b(parsedContentBlock$McpToolInvocation, b, b), e18Var), messageText, z2, zy7Var2, iqbVar3, z, parsedContentBlock$McpToolInvocation.isError(), tkhVar, null, e18Var, (i3 & 7168) | 6 | (i3 & 57344), 768);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(parsedContentBlock$McpToolInvocation, i, zy7Var, iqbVar, 15);
        }
    }

    public static final void d(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, ld4 ld4Var, int i) {
        ta4 ta4VarQ0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1571085569);
        int i2 = 2;
        int i3 = (e18Var.f(parsedContentBlock$McpToolInvocation) ? 4 : 2) | i;
        byte b = 0;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            String toolName = parsedContentBlock$McpToolInvocation.getToolName();
            if (x44.r(toolName, "web_fetch")) {
                e18Var.a0(-1015113180);
                ta4VarQ0 = fd9.q0(-1801519737, new s4b(parsedContentBlock$McpToolInvocation, i2, b), e18Var);
                e18Var.p(false);
            } else if (x44.r(toolName, dr9.a.getName())) {
                e18Var.a0(-1014787246);
                ta4VarQ0 = fd9.q0(-1302335824, new s4b(parsedContentBlock$McpToolInvocation, 3, b), e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-1014488655);
                e18Var.p(false);
                ta4VarQ0 = null;
            }
            if (ta4VarQ0 != null) {
                e18Var.a0(-1951399404);
                wtk.c(null, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-887581569, new rx0(ta4VarQ0, 21), e18Var), e18Var, 196608, 31);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-1951311767);
                wtk.d(parsedContentBlock$McpToolInvocation.getIntegrationIconUrl(), parsedContentBlock$McpToolInvocation.getIntegrationName(), null, parsedContentBlock$McpToolInvocation.getIconName(), 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 52);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s4b(parsedContentBlock$McpToolInvocation, i);
        }
    }
}
