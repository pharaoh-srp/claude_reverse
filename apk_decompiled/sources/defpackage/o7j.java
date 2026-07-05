package defpackage;

import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewRenderProcessGone;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o7j implements w28 {
    public static final o7j a;
    private static final SerialDescriptor descriptor;

    static {
        o7j o7jVar = new o7j();
        a = o7jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_webview_render_process_gone", o7jVar, 4);
        pluginGeneratedSerialDescriptor.j("webview_kind", false);
        pluginGeneratedSerialDescriptor.j("did_crash", false);
        pluginGeneratedSerialDescriptor.j("renderer_priority", true);
        pluginGeneratedSerialDescriptor.j("is_foreground", false);
        pluginGeneratedSerialDescriptor.k(new xmb(21));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{WebViewEvents$WebViewRenderProcessGone.$childSerializers[0].getValue(), zt1Var, d4c.S(e79.a), zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = WebViewEvents$WebViewRenderProcessGone.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        WebViewEvents$WebViewKind webViewEvents$WebViewKind = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                webViewEvents$WebViewKind = (WebViewEvents$WebViewKind) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), webViewEvents$WebViewKind);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU2 = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WebViewEvents$WebViewRenderProcessGone(i, webViewEvents$WebViewKind, zU, num, zU2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WebViewEvents$WebViewRenderProcessGone webViewEvents$WebViewRenderProcessGone = (WebViewEvents$WebViewRenderProcessGone) obj;
        encoder.getClass();
        webViewEvents$WebViewRenderProcessGone.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WebViewEvents$WebViewRenderProcessGone.write$Self$analytics(webViewEvents$WebViewRenderProcessGone, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
