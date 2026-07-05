package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripAttached;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class je implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Comparable J;
    public final /* synthetic */ Object K;

    public /* synthetic */ je(f03 f03Var, int i, hw2 hw2Var, Uri uri, t4g t4gVar, nwb nwbVar) {
        this.H = f03Var;
        this.F = i;
        this.I = hw2Var;
        this.J = uri;
        this.K = t4gVar;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.K;
        nwb nwbVar = this.G;
        Comparable comparable = this.J;
        Object obj2 = this.I;
        int i2 = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                f03 f03Var = (f03) obj3;
                hw2 hw2Var = (hw2) obj2;
                Uri uri = (Uri) comparable;
                t4g t4gVar = (t4g) obj;
                if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    nwbVar.setValue(Boolean.TRUE);
                    f03Var.c.e(new ChatEvents$RecentPhotosStripAttached(1, x44.W(Integer.valueOf(i2))), ChatEvents$RecentPhotosStripAttached.Companion.serializer());
                    hw2Var.P(x44.W(uri), ChatEvents$AttachmentSource.LIBRARY_RECENT);
                    t4gVar.a();
                }
                break;
            default:
                Context context = (Context) obj3;
                String str = (String) obj2;
                String str2 = (String) comparable;
                jsc jscVar = (jsc) obj;
                if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    jscVar.i((((long) i2) * 1000) + System.currentTimeMillis());
                    nwbVar.setValue(Boolean.TRUE);
                    ide ideVar = k7e.a;
                    context.getClass();
                    Intent intent = new Intent("android.intent.action.SET_TIMER");
                    intent.putExtra("android.intent.extra.alarm.LENGTH", i2);
                    intent.putExtra("android.intent.extra.alarm.MESSAGE", str + " - " + str2);
                    intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                    intent.addFlags(268435456);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        Toast.makeText(context, context.getString(R.string.recipe_timer_no_clock_app), 0).show();
                    } catch (Exception unused2) {
                        Toast.makeText(context, context.getString(R.string.recipe_timer_failed), 0).show();
                    }
                } else {
                    nwbVar.setValue(Boolean.FALSE);
                    ide ideVar2 = k7e.a;
                    context.getClass();
                    Intent intent2 = new Intent("android.intent.action.SHOW_TIMERS");
                    intent2.addFlags(268435456);
                    try {
                        context.startActivity(intent2);
                    } catch (ActivityNotFoundException unused3) {
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ je(Context context, int i, String str, String str2, nwb nwbVar, jsc jscVar) {
        this.H = context;
        this.F = i;
        this.I = str;
        this.J = str2;
        this.G = nwbVar;
        this.K = jscVar;
    }
}
