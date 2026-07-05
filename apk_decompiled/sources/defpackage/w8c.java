package defpackage;

import com.anthropic.claude.api.notification.NotificationPreferencesSchema;

/* JADX INFO: loaded from: classes2.dex */
public final class w8c implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ NotificationPreferencesSchema F;

    public /* synthetic */ w8c(NotificationPreferencesSchema notificationPreferencesSchema, int i) {
        this.E = i;
        this.F = notificationPreferencesSchema;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                break;
            default:
                break;
        }
        return this.F.getPreferences();
    }
}
