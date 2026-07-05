package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseConversion;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes.dex */
public final class ie5 {
    public final Context a;
    public final qi3 b;

    public ie5(Context context, qi3 qi3Var) {
        this.a = context;
        this.b = qi3Var;
    }

    public final void a(String str, String str2, String str3, gh2 gh2Var) {
        str.getClass();
        str3.getClass();
        this.b.e(new MobileAppUseEvents$MobileAppUseConversion(str3), MobileAppUseEvents$MobileAppUseConversion.Companion.serializer());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        Context context = this.a;
        Intent intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.text_create_tool_send_message));
        intentCreateChooser.setFlags(268435456);
        try {
            context.startActivity(intentCreateChooser);
        } catch (Exception e) {
            SilentException.a(new SilentException("Failed to compose message", e), null, false, 3);
            if (gh2Var != null) {
                gh2Var.r(new pt6(R.string.text_create_tool_compose_failed));
            }
        }
    }
}
