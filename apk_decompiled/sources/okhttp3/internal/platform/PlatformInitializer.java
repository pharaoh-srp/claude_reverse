package okhttp3.internal.platform;

import android.content.Context;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.s4d;
import defpackage.to4;
import defpackage.u29;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lu29;", "Ls4d;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class PlatformInitializer implements u29 {
    @Override // defpackage.u29
    public final List a() {
        return lm6.E;
    }

    @Override // defpackage.u29
    public final Object b(Context context) {
        context.getClass();
        s4d s4dVar = s4d.a;
        Object obj = s4d.a;
        to4 to4Var = obj != null ? (to4) obj : null;
        if (to4Var != null) {
            to4Var.a(context);
        }
        return s4d.a;
    }
}
