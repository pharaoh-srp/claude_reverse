package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.view.KeyEvent;
import com.anthropic.claude.bell.BellModeService;

/* JADX INFO: loaded from: classes2.dex */
public final class dm1 extends MediaSession.Callback {
    public final /* synthetic */ BellModeService a;

    public dm1(BellModeService bellModeService) {
        this.a = bellModeService;
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        tn1 tn1Var;
        tn1 tn1Var2;
        intent.getClass();
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return super.onMediaButtonEvent(intent);
        }
        int action = keyEvent.getAction();
        BellModeService bellModeService = this.a;
        if (action != 0 || keyEvent.getKeyCode() != 85) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79) {
                    tn1 tn1Var3 = bellModeService.E;
                    if (tn1Var3 != null) {
                        tn1Var3.Q();
                    }
                } else if (keyCode == 126) {
                    tn1 tn1Var4 = bellModeService.E;
                    if (tn1Var4 != null && tn1Var4.y() && (tn1Var = bellModeService.E) != null) {
                        tn1Var.Q();
                        return true;
                    }
                } else if (keyCode == 127) {
                    tn1 tn1Var5 = bellModeService.E;
                    if (tn1Var5 != null && !tn1Var5.y() && (tn1Var2 = bellModeService.E) != null) {
                        tn1Var2.Q();
                        return true;
                    }
                }
            }
            return super.onMediaButtonEvent(intent);
        }
        tn1 tn1Var6 = bellModeService.E;
        if (tn1Var6 != null) {
            tn1Var6.Q();
            return true;
        }
        return true;
    }
}
