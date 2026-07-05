package com.anthropic.claude.mainactivity;

import android.content.Intent;
import com.anthropic.claude.bell.BellModeService;
import defpackage.ba4;
import defpackage.kw9;
import defpackage.oy0;
import defpackage.w1a;
import defpackage.yb5;

/* JADX INFO: loaded from: classes2.dex */
public final class AssistantOverlayActivity extends ba4 {
    public static final /* synthetic */ int d0 = 0;
    public final kw9 Z;
    public final kw9 a0;
    public final kw9 b0;
    public boolean c0;

    public AssistantOverlayActivity() {
        oy0 oy0Var = new oy0(this, 0);
        w1a w1aVar = w1a.E;
        this.Z = yb5.w(w1aVar, oy0Var);
        this.a0 = yb5.w(w1aVar, new oy0(this, 1));
        this.b0 = yb5.w(w1aVar, new oy0(this, 2));
    }

    public final void o() {
        stopService(new Intent(this, (Class<?>) BellModeService.class));
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mainactivity.AssistantOverlayActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isChangingConfigurations() || this.c0) {
            return;
        }
        o();
    }

    public final void p(String str) {
        this.c0 = true;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(335544320);
        if (str != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.START_CHAT_CHAT_ID", str);
            intent.putExtra("com.anthropic.claude.intent.extra.START_CHAT_MODE", "BELL_MODE");
        }
        startActivity(intent);
        finish();
    }
}
