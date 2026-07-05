package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* JADX INFO: loaded from: classes2.dex */
public final class um3 extends VoiceInteractionSession {
    @Override // android.service.voice.VoiceInteractionSession
    public final void onShow(Bundle bundle, int i) {
        Intent intent = new Intent("android.intent.action.ASSIST");
        intent.setClassName(getContext(), "com.anthropic.claude.mainactivity.AssistantOverlayActivity");
        intent.addFlags(268435456);
        getContext().startActivity(intent);
        finish();
    }
}
