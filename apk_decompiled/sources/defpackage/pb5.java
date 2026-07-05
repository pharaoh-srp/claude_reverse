package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$InitializationFailed;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$InitializationSucceeded;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pb5 {
    public final qi3 a;

    public pb5(qi3 qi3Var) {
        this.a = qi3Var;
    }

    public final void a(ob5 ob5Var, String str) {
        String str2 = ob5Var.E;
        this.a.e(new CronetAnalyticsEvents$InitializationFailed(str2, str), CronetAnalyticsEvents$InitializationFailed.Companion.serializer());
        List list = xah.a;
        xah.e(6, "Cronet initialization failed: ".concat(str2), null, null);
    }

    public final void b(String str) {
        this.a.e(new CronetAnalyticsEvents$InitializationSucceeded(str), CronetAnalyticsEvents$InitializationSucceeded.Companion.serializer());
        List list = xah.a;
        xah.e(6, "Cronet engine initialized with provider: ".concat(str), null, null);
    }
}
