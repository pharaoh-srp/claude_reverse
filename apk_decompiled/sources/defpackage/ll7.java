package defpackage;

import android.os.Bundle;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class ll7 implements id {
    public final FirebaseAnalytics a;
    public final am0 b;

    public ll7(FirebaseAnalytics firebaseAnalytics, am0 am0Var) {
        this.a = firebaseAnalytics;
        this.b = am0Var;
    }

    @Override // defpackage.id
    public final void a(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        long j = i;
        bundle.putLong("message_number", j);
        long j2 = i2;
        bundle.putLong("document_attachment_count", j2);
        long j3 = i3;
        bundle.putLong("image_attachment_count", j3);
        j6k j6kVar = this.a.a;
        j6kVar.getClass();
        j6kVar.c(new sbk(j6kVar, null, "message_sent", bundle, false));
        if (i == 1 || i == 2 || i == 5 || i == 10 || i == 20 || i == 50 || i == 100) {
            String strP = grc.p(i, "message_sent_");
            Bundle bundle2 = new Bundle();
            bundle2.putLong("message_number", j);
            bundle2.putLong("document_attachment_count", j2);
            bundle2.putLong("image_attachment_count", j3);
            j6kVar.getClass();
            j6kVar.c(new sbk(j6kVar, null, strP, bundle2, false));
        }
    }

    @Override // defpackage.id
    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putLong("creation_count", this.b.b.h());
        j6k j6kVar = this.a.a;
        j6kVar.getClass();
        j6kVar.c(new sbk(j6kVar, null, "app_open", bundle, false));
    }

    @Override // defpackage.id
    public final void c(hd hdVar) {
        Bundle bundle = new Bundle();
        bundle.putString(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, hdVar.getId());
        j6k j6kVar = this.a.a;
        j6kVar.getClass();
        j6kVar.c(new sbk(j6kVar, null, "login", bundle, false));
    }

    @Override // defpackage.id
    public final void d() {
        Bundle bundle = new Bundle();
        j6k j6kVar = this.a.a;
        j6kVar.getClass();
        j6kVar.c(new sbk(j6kVar, null, "app_resume", bundle, false));
    }
}
