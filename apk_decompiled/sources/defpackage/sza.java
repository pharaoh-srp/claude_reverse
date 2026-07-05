package defpackage;

import android.content.MutableContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class sza extends WebView implements aya {
    public final lya E;
    public final u39 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sza(MutableContextWrapper mutableContextWrapper, mp4 mp4Var, HostContext hostContext, McpServerCapabilities mcpServerCapabilities, bg9 bg9Var, n3f n3fVar) {
        super(mutableContextWrapper);
        bg9Var.getClass();
        n3fVar.getClass();
        final int i = 0;
        this.E = new lya(mp4Var, new kxa((fza) null, (fza) null, (gza) null, (pz7) null, (f7) null, (f25) null, (ny4) null, (pz7) null, (gza) null, (pz7) null, (bz7) null, (h9a) null, (pz7) null, 16383), hostContext, mcpServerCapabilities, bg9Var, new ty4(1, this, sza.class, "sendMessage", "sendMessage(Ljava/lang/String;)V", 0, 25), new bz7(this) { // from class: oza
            public final /* synthetic */ sza F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i2 = i;
                sza szaVar = this.F;
                switch (i2) {
                    case 0:
                        zy7 zy7Var = (zy7) obj;
                        zy7Var.getClass();
                        szaVar.post(new b60(4, zy7Var));
                        return iei.a;
                    default:
                        return Boolean.valueOf(sza.e(szaVar, (MotionEvent) obj));
                }
            }
        });
        setWebViewClient(new qza(this, n3fVar.a(WebViewEvents$WebViewKind.MCP_APP)));
        WebSettings settings = getSettings();
        final int i2 = 1;
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        setLayerType(2, null);
        setWebChromeClient(new dya(new pza(i, this)));
        Set setF0 = sf5.f0("*");
        if (q7j.a("WEB_MESSAGE_LISTENER")) {
            j7j.a(this, "mcpAppBridge", setF0, new ro6(12, this));
        } else {
            addJavascriptInterface(new rza(this), "mcpAppBridge");
        }
        this.F = new u39(this, new bz7(this) { // from class: oza
            public final /* synthetic */ sza F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i22 = i2;
                sza szaVar = this.F;
                switch (i22) {
                    case 0:
                        zy7 zy7Var = (zy7) obj;
                        zy7Var.getClass();
                        szaVar.post(new b60(4, zy7Var));
                        return iei.a;
                    default:
                        return Boolean.valueOf(sza.e(szaVar, (MotionEvent) obj));
                }
            }
        });
    }

    public static boolean e(sza szaVar, MotionEvent motionEvent) {
        motionEvent.getClass();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.aya
    public final View a() {
        return this;
    }

    @Override // defpackage.aya
    public final void b() {
        bok.h(this);
    }

    @Override // defpackage.aya
    public final void c() {
        post(new bya(this, 1));
    }

    @Override // defpackage.aya
    public final void d(String str, JsonObject jsonObject) {
        this.E.d(str, jsonObject);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.F.f(motionEvent);
    }

    @Override // defpackage.aya
    public kxa getCallbacks() {
        return this.E.b;
    }

    @Override // defpackage.aya
    public void setCallbacks(kxa kxaVar) {
        kxaVar.getClass();
        lya lyaVar = this.E;
        lyaVar.getClass();
        lyaVar.b = kxaVar;
    }

    @Override // defpackage.aya
    public void setFullscreen(boolean z) {
        this.F.c = z;
    }
}
