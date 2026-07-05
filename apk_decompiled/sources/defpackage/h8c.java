package defpackage;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h8c {
    public static final Set a = mp0.Z0(new String[]{"claude.ai", "claude-ai.staging.ant.dev"});

    public static boolean a(Uri uri) {
        return x44.r(uri.getScheme(), "https") && w44.G0(a, uri.getHost());
    }
}
