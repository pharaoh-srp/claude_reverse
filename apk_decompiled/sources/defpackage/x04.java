package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class x04 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ x04(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String validatedSlackUrl;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.I;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj;
                c cVar = (c) obj2;
                SessionResource sessionResource = (SessionResource) obj4;
                SessionExternalMetadata external_metadata = sessionResource.getExternal_metadata();
                String str = null;
                if (external_metadata != null && (validatedSlackUrl = external_metadata.getValidatedSlackUrl()) != null && ((Boolean) cVar.k.B.getValue()).booleanValue()) {
                    str = validatedSlackUrl;
                }
                if (str == null) {
                    zy7Var.a();
                } else {
                    try {
                        ((Context) obj3).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        cVar.e0(sessionResource);
                    } catch (ActivityNotFoundException unused) {
                        zy7Var.a();
                    }
                }
                break;
            case 1:
                jta jtaVar = (jta) obj4;
                break;
            case 2:
                ((pz7) obj3).invoke((sih) obj2, (ieh) obj);
                rrk.i((hp4) obj4);
                break;
            default:
                t5h.d((AtomicBoolean) obj4, (Handler) obj3, (ua2) obj2, (WebView) obj, true);
                break;
        }
        return ieiVar;
        return ieiVar;
    }
}
