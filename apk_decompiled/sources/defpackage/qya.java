package defpackage;

import android.content.MutableContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class qya extends t4f implements aya {
    public final mp4 b0;
    public final lya c0;
    public final u39 d0;

    static {
        JsonObject jsonObject = lya.j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qya(MutableContextWrapper mutableContextWrapper, mp4 mp4Var, HostContext hostContext, McpServerCapabilities mcpServerCapabilities, bg9 bg9Var, String str, ze0 ze0Var, String str2, x4f x4fVar, h86 h86Var, prb prbVar, n3f n3fVar) {
        String string = mutableContextWrapper.getString(R.string.mcp_app_page_title);
        string.getClass();
        super(mutableContextWrapper, str, ze0Var, str2, x4fVar, string, h86Var, prbVar, n3fVar, WebViewEvents$WebViewKind.MCP_APP_RUNTIME, false);
        this.b0 = mp4Var;
        final int i = 0;
        this.c0 = new lya(mp4Var, new kxa((fza) null, (fza) null, (gza) null, (pz7) null, (f7) null, (f25) null, (ny4) null, (pz7) null, (gza) null, (pz7) null, (bz7) null, (h9a) null, (pz7) null, 16383), hostContext, mcpServerCapabilities, bg9Var, new ty4(1, this, qya.class, "sendBridgeToSandbox", "sendBridgeToSandbox(Ljava/lang/String;)V", 0, 24), new bz7(this) { // from class: nya
            public final /* synthetic */ qya F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i2 = i;
                iei ieiVar = iei.a;
                qya qyaVar = this.F;
                switch (i2) {
                    case 0:
                        zy7 zy7Var = (zy7) obj;
                        zy7Var.getClass();
                        qyaVar.post(new b60(3, zy7Var));
                        return ieiVar;
                    case 1:
                        return Boolean.valueOf(qya.j(qyaVar, (MotionEvent) obj));
                    default:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        bz7 bz7Var = qyaVar.getCallbacks().h;
                        if (bz7Var != null) {
                            bz7Var.invoke(bool);
                        }
                        return ieiVar;
                }
            }
        });
        final int i2 = 1;
        this.d0 = new u39(this, new bz7(this) { // from class: nya
            public final /* synthetic */ qya F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i22 = i2;
                iei ieiVar = iei.a;
                qya qyaVar = this.F;
                switch (i22) {
                    case 0:
                        zy7 zy7Var = (zy7) obj;
                        zy7Var.getClass();
                        qyaVar.post(new b60(3, zy7Var));
                        return ieiVar;
                    case 1:
                        return Boolean.valueOf(qya.j(qyaVar, (MotionEvent) obj));
                    default:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        bz7 bz7Var = qyaVar.getCallbacks().h;
                        if (bz7Var != null) {
                            bz7Var.invoke(bool);
                        }
                        return ieiVar;
                }
            }
        });
        final int i3 = 2;
        setLayerType(2, null);
        setWebChromeClient(new dya(new xi4(29, this)));
        setRenderProcessGoneListener(new bz7(this) { // from class: nya
            public final /* synthetic */ qya F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i22 = i3;
                iei ieiVar = iei.a;
                qya qyaVar = this.F;
                switch (i22) {
                    case 0:
                        zy7 zy7Var = (zy7) obj;
                        zy7Var.getClass();
                        qyaVar.post(new b60(3, zy7Var));
                        return ieiVar;
                    case 1:
                        return Boolean.valueOf(qya.j(qyaVar, (MotionEvent) obj));
                    default:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        bz7 bz7Var = qyaVar.getCallbacks().h;
                        if (bz7Var != null) {
                            bz7Var.invoke(bool);
                        }
                        return ieiVar;
                }
            }
        });
        setSandboxLoadErrorListener(new lca(i3, this));
        setClientRpcListener(new ax5(21, this));
    }

    public static boolean j(qya qyaVar, MotionEvent motionEvent) {
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
        this.c0.d(str, jsonObject);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.d0.f(motionEvent);
    }

    @Override // defpackage.aya
    public kxa getCallbacks() {
        return this.c0.b;
    }

    @Override // defpackage.aya
    public void setCallbacks(kxa kxaVar) {
        kxaVar.getClass();
        lya lyaVar = this.c0;
        lyaVar.getClass();
        lyaVar.b = kxaVar;
    }

    @Override // defpackage.aya
    public void setFullscreen(boolean z) {
        this.d0.c = z;
    }
}
