package defpackage;

import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dp3 {
    public static BellApiClientMessage.ClientMetrics a(boolean z, Long l, Integer num, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if (z) {
            return new BellApiClientMessage.ClientMetrics(new BellApiClientMessage.ClientMetrics.Data(l, num));
        }
        return null;
    }
}
