package defpackage;

import com.anthropic.claude.firebase.fcm.AnthropicFirebaseMessagingService;

/* JADX INFO: loaded from: classes3.dex */
public final class rd0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ AnthropicFirebaseMessagingService F;

    public /* synthetic */ rd0(AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, int i) {
        this.E = i;
        this.F = anthropicFirebaseMessagingService;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        AnthropicFirebaseMessagingService anthropicFirebaseMessagingService = this.F;
        switch (i) {
            case 0:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(bj0.class), null, null);
            case 1:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(qi3.class), null, null);
            case 2:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(om2.class), null, null);
            case 3:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(ql3.class), null, null);
            case 4:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(ul7.class), null, null);
            default:
                return eve.z(anthropicFirebaseMessagingService).a(jce.a.b(fk0.class), null, null);
        }
    }
}
