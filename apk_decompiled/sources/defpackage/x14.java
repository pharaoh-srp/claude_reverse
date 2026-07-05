package defpackage;

import com.anthropic.claude.sessions.types.BridgeSpawnMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x14 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeSpawnMode.values().length];
        try {
            iArr[BridgeSpawnMode.Worktree.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeSpawnMode.SameDir.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
