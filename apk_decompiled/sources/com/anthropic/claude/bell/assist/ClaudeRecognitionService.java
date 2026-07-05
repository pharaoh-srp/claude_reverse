package com.anthropic.claude.bell.assist;

import android.content.Intent;
import android.os.RemoteException;
import android.speech.RecognitionService;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaudeRecognitionService extends RecognitionService {
    @Override // android.speech.RecognitionService
    public final void onCancel(RecognitionService.Callback callback) {
    }

    @Override // android.speech.RecognitionService
    public final void onStartListening(Intent intent, RecognitionService.Callback callback) throws RemoteException {
        if (callback != null) {
            callback.error(5);
        }
    }

    @Override // android.speech.RecognitionService
    public final void onStopListening(RecognitionService.Callback callback) {
    }
}
