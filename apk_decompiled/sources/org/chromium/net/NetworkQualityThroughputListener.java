package org.chromium.net;

import defpackage.sz6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkQualityThroughputListener {
    private final Executor mExecutor;

    public NetworkQualityThroughputListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            sz6.j("Executor must not be null");
            throw null;
        }
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onThroughputObservation(int i, long j, int i2);
}
