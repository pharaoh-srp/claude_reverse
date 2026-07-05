package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerBrowseResources;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k55 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Context H;

    public /* synthetic */ k55(qi3 qi3Var, String str, Context context, int i) {
        this.E = i;
        this.F = qi3Var;
        this.G = str;
        this.H = context;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.H;
        String str = this.G;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerBrowseResources(str, "cowork"), SelfHarmBannerEvents$SelfHarmBannerBrowseResources.Companion.serializer());
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://claude.findahelpline.com/i/claude")));
                } catch (ActivityNotFoundException unused) {
                }
                break;
            default:
                qi3Var.e(new SelfHarmBannerEvents$SelfHarmBannerBrowseResources(str, (String) null, 2, (mq5) null), iv1.J(jce.b(SelfHarmBannerEvents$SelfHarmBannerBrowseResources.class)));
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://claude.findahelpline.com/i/claude")));
                } catch (ActivityNotFoundException unused2) {
                }
                break;
        }
        return ieiVar;
        return ieiVar;
    }
}
