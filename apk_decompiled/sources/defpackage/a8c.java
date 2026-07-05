package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a8c extends f8c {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public uzc g;
    public CharSequence h;
    public Boolean i;

    public a8c(uzc uzcVar) {
        if (TextUtils.isEmpty(uzcVar.a)) {
            sz6.p("User's name must not be empty.");
            throw null;
        }
        this.g = uzcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.a8c f(android.app.Notification r6) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8c.f(android.app.Notification):a8c");
    }

    @Override // defpackage.f8c
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.g.a);
        bundle.putBundle("android.messagingStyleUser", this.g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z7c.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z7c.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        Notification.MessagingStyle messagingStyleB;
        o7c o7cVar = this.a;
        boolean zBooleanValue = false;
        if (o7cVar == null || o7cVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        }
        this.i = Boolean.valueOf(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        uzc uzcVar = this.g;
        if (i >= 28) {
            uzcVar.getClass();
            messagingStyleB = w7c.a(ke0.q(uzcVar));
        } else {
            messagingStyleB = u7c.b(uzcVar.a);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            u7c.a(messagingStyleB, ((z7c) it.next()).c());
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            v7c.a(messagingStyleB, ((z7c) it2.next()).c());
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            u7c.c(messagingStyleB, this.h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            w7c.b(messagingStyleB, this.i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) c61Var.G);
    }

    @Override // defpackage.f8c
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.f8c
    public final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.g = uzc.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            uzc uzcVar = new uzc();
            uzcVar.a = string;
            uzcVar.b = null;
            uzcVar.c = null;
            uzcVar.d = null;
            uzcVar.e = false;
            uzcVar.f = false;
            this.g = uzcVar;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.h = charSequence;
        if (charSequence == null) {
            this.h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(z7c.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f.addAll(z7c.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void e(z7c z7cVar) {
        if (z7cVar != null) {
            ArrayList arrayList = this.e;
            arrayList.add(z7cVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
        }
    }

    public a8c() {
    }
}
