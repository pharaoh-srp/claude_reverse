package com.anthropic.claude.bell.assist;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import defpackage.um3;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaudeVoiceInteractionSessionService extends VoiceInteractionSessionService {
    @Override // android.service.voice.VoiceInteractionSessionService
    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        return new um3(this);
    }
}
