package androidx.sqlite.driver.bundled;

import com.anthropic.claude.api.experience.ExperienceToggle;
import dalvik.annotation.optimization.FastNative;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\n\u0010\u000b\u001a(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u000f\u0010\u0010\u001a \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017\u001a \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b\u001e\u0010\u001f\u001a \u0010 \u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b \u0010\u001d\u001a \u0010!\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\b!\u0010\"\u001a\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0082 ¢\u0006\u0004\b#\u0010$\u001a\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b%\u0010$\u001a\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0083 ¢\u0006\u0004\b&\u0010$¨\u0006'"}, d2 = {"", "pointer", "", "index", "", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "nativeBindBlob", "(JI[B)V", "", "nativeBindDouble", "(JID)V", "nativeBindLong", "(JIJ)V", "", "nativeBindText", "(JILjava/lang/String;)V", "nativeBindNull", "(JI)V", "", "nativeStep", "(J)Z", "nativeGetBlob", "(JI)[B", "nativeGetDouble", "(JI)D", "nativeGetLong", "(JI)J", "nativeGetText", "(JI)Ljava/lang/String;", "nativeGetColumnCount", "(J)I", "nativeGetColumnName", "nativeGetColumnType", "(JI)I", "nativeReset", "(J)V", "nativeClearBindings", "nativeClose", "sqlite-bundled"}, k = 2, mv = {2, 1, 0}, xi = mdj.f)
public final class BundledSQLiteStatementKt {
    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeBindBlob(long j, int i, byte[] bArr);

    @FastNative
    private static final native void nativeBindDouble(long j, int i, double d);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeBindLong(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeBindNull(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeBindText(long j, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeClearBindings(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeClose(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native byte[] nativeGetBlob(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetColumnCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native String nativeGetColumnName(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetColumnType(long j, int i);

    @FastNative
    private static final native double nativeGetDouble(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native long nativeGetLong(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native String nativeGetText(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeStep(long j);
}
