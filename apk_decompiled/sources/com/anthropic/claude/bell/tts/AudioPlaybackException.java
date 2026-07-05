package com.anthropic.claude.bell.tts;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/tts/AudioPlaybackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class AudioPlaybackException extends Exception {
    public final boolean E;

    public AudioPlaybackException(Exception exc, boolean z) {
        super(exc);
        this.E = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getE() {
        return this.E;
    }
}
