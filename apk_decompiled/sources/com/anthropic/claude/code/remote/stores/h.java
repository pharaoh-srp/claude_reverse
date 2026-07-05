package com.anthropic.claude.code.remote.stores;

import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.EnvironmentResource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final EnvironmentResource a(SessionTarget sessionTarget) {
        SessionTarget.Environment environment = sessionTarget instanceof SessionTarget.Environment ? (SessionTarget.Environment) sessionTarget : null;
        if (environment != null) {
            return environment.getEnv();
        }
        return null;
    }
}
