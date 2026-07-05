package androidx.sqlite.driver.bundled;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0082 \u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0082 ¨\u0006\u0007"}, d2 = {"nativeThreadSafeMode", "", "nativeOpen", "", "name", "", "openFlags", "sqlite-bundled"}, k = 2, mv = {2, 1, 0}, xi = mdj.f)
public final class BundledSQLiteDriverKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeOpen(String str, int i);

    private static final native int nativeThreadSafeMode();
}
