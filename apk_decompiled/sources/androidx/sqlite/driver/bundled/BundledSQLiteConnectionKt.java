package androidx.sqlite.driver.bundled;

import dalvik.annotation.optimization.FastNative;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0082 ¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "pointer", "", "nativeInTransaction", "(J)Z", "", "sql", "nativePrepare", "(JLjava/lang/String;)J", "fileName", "entryPoint", "Liei;", "nativeLoadExtension", "(JLjava/lang/String;Ljava/lang/String;)V", "nativeClose", "(J)V", "sqlite-bundled"}, k = 2, mv = {2, 1, 0}, xi = mdj.f)
public final class BundledSQLiteConnectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeClose(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native boolean nativeInTransaction(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeLoadExtension(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativePrepare(long j, String str);
}
