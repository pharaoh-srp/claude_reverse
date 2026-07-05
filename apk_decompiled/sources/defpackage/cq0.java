package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    public /* synthetic */ cq0(Context context, int i) {
        this.E = i;
        this.F = context;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.F;
        switch (i) {
            case 0:
                Toast.makeText(context, R.string.artifact_export_failed, 0).show();
                break;
            case 1:
                Toast.makeText(context, R.string.artifact_print_failed, 0).show();
                break;
            case 2:
                context.getClass();
                vjk.f(context);
                break;
            case 3:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://claude.ai/report")));
                break;
            case 4:
                Toast.makeText(context, R.string.artifact_export_failed, 0).show();
                break;
            case 5:
                vjk.f(context);
                break;
            case 6:
                context.getClass();
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.setFlags(268435456);
                context.startActivity(intent);
                break;
            default:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("market://details?id=com.anthropic.claude"));
                intent2.setPackage("com.android.vending");
                try {
                    context.startActivity(intent2);
                } catch (Exception unused) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.anthropic.claude"));
                    context.startActivity(intent3);
                }
                break;
        }
        return ieiVar;
    }
}
