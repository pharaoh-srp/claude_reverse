package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;

/* JADX INFO: loaded from: classes.dex */
public enum c implements m2 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).w(ordinal());
    }
}
