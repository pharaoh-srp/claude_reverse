package defpackage;

import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class mv8 extends ov8 {
    @Override // defpackage.ov8
    public final long b() {
        return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE) + 1;
    }
}
