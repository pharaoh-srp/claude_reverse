package defpackage;

import com.anthropic.claude.analytics.events.WebViewEvents$WebViewErrorStateShown;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l7j implements w28 {
    public static final l7j a;
    private static final SerialDescriptor descriptor;

    static {
        l7j l7jVar = new l7j();
        a = l7jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.webview.error_state.viewed", l7jVar, 2);
        pluginGeneratedSerialDescriptor.j("webview_kind", false);
        pluginGeneratedSerialDescriptor.j("did_crash", false);
        pluginGeneratedSerialDescriptor.k(new xmb(21));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{WebViewEvents$WebViewErrorStateShown.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = WebViewEvents$WebViewErrorStateShown.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        WebViewEvents$WebViewKind webViewEvents$WebViewKind = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                webViewEvents$WebViewKind = (WebViewEvents$WebViewKind) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), webViewEvents$WebViewKind);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WebViewEvents$WebViewErrorStateShown(i, webViewEvents$WebViewKind, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WebViewEvents$WebViewErrorStateShown webViewEvents$WebViewErrorStateShown = (WebViewEvents$WebViewErrorStateShown) obj;
        encoder.getClass();
        webViewEvents$WebViewErrorStateShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WebViewEvents$WebViewErrorStateShown.write$Self$analytics(webViewEvents$WebViewErrorStateShown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
