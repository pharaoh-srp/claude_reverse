package defpackage;

import com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig;

/* JADX INFO: loaded from: classes.dex */
public final class gj1 {
    public static final int y = 8;
    public final um1 a;
    public final y31 b;
    public final wlg c;
    public final wlg d;
    public final wlg e;
    public final wlg f;
    public final wlg g;
    public final wlg h;
    public final wlg i;
    public final wlg j;
    public final wlg k;
    public final wlg l;
    public final wlg m;
    public final wlg n;
    public final wlg o;
    public final wlg p;
    public final wlg q;
    public final wlg r;
    public final wlg s;
    public final wlg t;
    public final wlg u;
    public final wlg v;
    public final wlg w;
    public final wlg x;

    public gj1(rc8 rc8Var, um1 um1Var, y31 y31Var) {
        this.a = um1Var;
        this.b = y31Var;
        this.c = rc8Var.m("project_bell_frontend");
        this.d = rc8Var.g("project_bell_frontend_config", BellConfig.Companion.serializer());
        this.e = rc8Var.m("project_bell_android_ptt_enabled");
        this.f = rc8Var.m("project_bell_voice_chat_merge");
        this.g = rc8Var.m("mobile_voice_language_nudge_enabled");
        this.h = rc8Var.m("project_bell_opus_output_enabled");
        this.i = rc8Var.m("project_bell_heads_up_realert_enabled");
        this.j = rc8Var.m("project_bell_feedback_enabled");
        this.k = rc8Var.m("mobile_chat_feedback_ui_enabled");
        this.l = rc8Var.m("voice_mode_request_focus");
        this.m = rc8Var.m("project_bell_hold_websocket_park_enabled");
        this.n = rc8Var.m("android_tts_language_detection_disabled");
        this.o = rc8Var.m("project_bell_assistant_audio_enabled");
        this.p = rc8Var.g(VoiceAdaptiveGainConfig.FEATURE_KEY, VoiceAdaptiveGainConfig.Companion.serializer());
        rc8Var.m("project_bell_async_teardown_enabled");
        this.q = rc8Var.m("voice_client_metrics_ws_reporting");
        this.r = rc8Var.m("project_bell_mic_recreate_on_dead_object");
        this.s = rc8Var.m("project_bell_tts_track_recreate_on_dead_object");
        this.t = rc8Var.f("readaloud_ws_retry_max", e79.a);
        this.u = rc8Var.m("voice_model_selector_enabled");
        this.v = rc8Var.m("mobile_model_picker_v2");
        this.w = rc8Var.m("model_picker_auto_dismiss_enabled");
        this.x = rc8Var.m("project_bell_sound_pool_enabled");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[PHI: r4
      0x0037: PHI (r4v10 java.lang.Float) = (r4v2 java.lang.Float), (r4v4 java.lang.Float) binds: [B:12:0x0035, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[PHI: r5
      0x0057: PHI (r5v10 java.lang.Float) = (r5v2 java.lang.Float), (r5v4 java.lang.Float) binds: [B:21:0x0055, B:26:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[PHI: r6
      0x0077: PHI (r6v10 java.lang.Float) = (r6v2 java.lang.Float), (r6v4 java.lang.Float) binds: [B:30:0x0075, B:35:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017 A[PHI: r2
      0x0017: PHI (r2v9 java.lang.Float) = (r2v2 java.lang.Float), (r2v4 java.lang.Float) binds: [B:3:0x0015, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rd a() {
        /*
            r7 = this;
            wlg r0 = r7.p
            java.lang.Object r0 = r0.getValue()
            com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig r0 = (com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig) r0
            rd r1 = new rd
            um1 r7 = r7.a
            lsc r2 = r7.h
            java.lang.Object r2 = r2.getValue()
            java.lang.Float r2 = (java.lang.Float) r2
            r3 = 0
            if (r2 == 0) goto L1c
        L17:
            float r2 = r2.floatValue()
            goto L2d
        L1c:
            if (r0 == 0) goto L27
            float r2 = r0.getMax_gain()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L28
        L27:
            r2 = r3
        L28:
            if (r2 == 0) goto L2b
            goto L17
        L2b:
            r2 = 1090519040(0x41000000, float:8.0)
        L2d:
            lsc r4 = r7.i
            java.lang.Object r4 = r4.getValue()
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L3c
        L37:
            float r4 = r4.floatValue()
            goto L4d
        L3c:
            if (r0 == 0) goto L47
            float r4 = r0.getTarget_rms()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L48
        L47:
            r4 = r3
        L48:
            if (r4 == 0) goto L4b
            goto L37
        L4b:
            r4 = 1148846080(0x447a0000, float:1000.0)
        L4d:
            lsc r5 = r7.j
            java.lang.Object r5 = r5.getValue()
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 == 0) goto L5c
        L57:
            float r5 = r5.floatValue()
            goto L6d
        L5c:
            if (r0 == 0) goto L67
            float r5 = r0.getNoise_floor_rms()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L68
        L67:
            r5 = r3
        L68:
            if (r5 == 0) goto L6b
            goto L57
        L6b:
            r5 = 1112014848(0x42480000, float:50.0)
        L6d:
            lsc r6 = r7.k
            java.lang.Object r6 = r6.getValue()
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L7c
        L77:
            float r6 = r6.floatValue()
            goto L8e
        L7c:
            if (r0 == 0) goto L87
            float r6 = r0.getAttack()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L88
        L87:
            r6 = r3
        L88:
            if (r6 == 0) goto L8b
            goto L77
        L8b:
            r6 = 1053609165(0x3ecccccd, float:0.4)
        L8e:
            lsc r7 = r7.l
            java.lang.Object r7 = r7.getValue()
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto La1
            float r7 = r7.floatValue()
        L9c:
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            goto Lb6
        La1:
            if (r0 == 0) goto Lab
            float r7 = r0.getRelease()
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
        Lab:
            if (r3 == 0) goto Lb2
            float r7 = r3.floatValue()
            goto L9c
        Lb2:
            r7 = 1058642330(0x3f19999a, float:0.6)
            goto L9c
        Lb6:
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj1.a():rd");
    }

    public final BellConfig b() {
        ((Boolean) this.c.getValue()).getClass();
        return (BellConfig) this.d.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.e.getValue()).booleanValue() && ((Boolean) this.a.e.getValue()).booleanValue();
    }

    public final boolean d() {
        BellConfig bellConfigB = b();
        return ((bellConfigB != null ? x44.r(bellConfigB.getServer_interrupt_enabled(), Boolean.TRUE) : false) || ((Boolean) this.a.b.getValue()).booleanValue()) && !c();
    }
}
