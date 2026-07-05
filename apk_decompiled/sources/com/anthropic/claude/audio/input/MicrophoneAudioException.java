package com.anthropic.claude.audio.input;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/audio/input/MicrophoneAudioException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Claude:audio"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class MicrophoneAudioException extends RuntimeException {
    public final boolean E;

    public MicrophoneAudioException(Exception exc) {
        super(exc);
        this.E = false;
    }

    public MicrophoneAudioException(Exception exc, boolean z) {
        super(exc);
        this.E = z;
    }
}
