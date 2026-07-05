package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.ThinkingState;
import defpackage.mr9;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String a(ThinkingState thinkingState) {
        thinkingState.getClass();
        if (thinkingState instanceof ThinkingState.EffortAndMode) {
            return ((ThinkingState.EffortAndMode) thinkingState).m395getEffortRIwV3po();
        }
        if (thinkingState instanceof ThinkingState.Effort) {
            return ((ThinkingState.Effort) thinkingState).m390getEffortRIwV3po();
        }
        if (!(thinkingState instanceof ThinkingState.Mode) && !thinkingState.equals(ThinkingState.Unknown.INSTANCE)) {
            mr9.b();
        }
        return null;
    }

    public static final String b(ThinkingState thinkingState) {
        thinkingState.getClass();
        if (thinkingState instanceof ThinkingState.EffortAndMode) {
            return ((ThinkingState.EffortAndMode) thinkingState).m396getModegcx3iIA();
        }
        if (thinkingState instanceof ThinkingState.Mode) {
            return ((ThinkingState.Mode) thinkingState).m400getModegcx3iIA();
        }
        if (!(thinkingState instanceof ThinkingState.Effort) && !thinkingState.equals(ThinkingState.Unknown.INSTANCE)) {
            mr9.b();
        }
        return null;
    }
}
